
public class Conta
{
  protected String nome, numeroConta;
  protected double saldo, limite, limiteEsp;
  
  public String getNome()
  {
      return nome;
  }
  public void setNome(String a)
  {
      this.nome=a;
  }
  public String getNumero()
  {
      return numeroConta;
  }
  public void setNumero(String a)
  {
      this.numeroConta=a;
  }
  public double getSaldo()
  {
      return saldo;
  }
  public void setSaldo(double a)
  {
      this.saldo=a;
  }
  public double getLimite()
  {
      return limite;
  }
  public void setLimite(double a)
  {
      this.limite=a;
  }
   public double getLimiteEsp()
  {
      return limiteEsp;
  }
  public void setLimiteEsp(double a)
  {
      this.limiteEsp=a;
  }
  public void retornaNome (String x)
  {
	if (x == numeroConta)
	{
		System.out.println ("Nome: " + getNome());
	}
	else
	    System.out.println ("Conta nao encontrada");
  }
  public void obterSaldo ()
  {
	System.out.println ("Saldo: R$  " + getSaldo());
  }
  public void obterNumeroConta ()
  {
	System.out.println ("Número da conta " + getNumero());
  }
  public void obterLimiteEsp()
  {
      System.out.println ("Limite especial R$" + getLimiteEsp());
  }
  public void alterarLimite(double limite)
  {
    setLimite(limite);
  }
  public void transferir(Conta b, double val)
  {
	    if(debitarValor(val))
        {
            //a.debitarValor(val);
            b.creditarValor (val);
            System.out.println("Transferẽncia efetuada.");
        }   
        else
            System.out.println("Transferência não realizada.");
  }
  
   public void transferir2(Conta b, double val)
  {
	    if(debitarValor2(val))
        {
            //a.debitarValor(val);
            b.creditarValor (val);
            System.out.println("Transferẽncia efetuada.");
        }   
        else
            System.out.println("Transferência não realizada.");
  }
  public boolean debitarValor (double x)
  {
    if((x<=limite) && (x <= saldo))
    {
	    saldo-= x;
        System.out.println("Debitado");
        return true;
    }
    if(x>saldo)
    {
        System.out.println("Saldo insuficiente!");
        return false;
    }
     System.out.println("Limite excedido");
     return false;
         
  }
  
  public boolean debitarValor2 (double x)
  {
    if((x<=limite) && (x <= (saldo+limiteEsp)))
    {
        if(x<=saldo)
        {
    	    saldo-= x;
            System.out.println("Debitado");
            return true;
        }
        else
            limiteEsp-= x-saldo;
            saldo=0;
            System.out.println("Debitado");
            return true;
    }
     System.out.println("Limite excedido");
     return false;
         
  }
  public void creditarValor (double x)
  {
	this.saldo += x;
  }
  public void inserirDados (String nome, String numero, double saldo, double limite, double limiteEsp)
  {
	this.nome = nome;
	this.numeroConta = numero;
	this.saldo = saldo;
	this.limite = limite;
	this.limiteEsp = limiteEsp;
  }
  public void exibirDados ()
  {

	System.out.println ("\nNúmero da conta: " + getNumero());
	System.out.println ("Nome: " + getNome());
	System.out.println ("Saldo: R$ " + getSaldo());
	System.out.println ("Limite: R$ " + getLimite());
	System.out.println ("Limite expecial: R$ " + getLimiteEsp());
  }

  public static void main (String[]args)
  {

	Conta conta1 = new Conta ();
	Conta conta2 = new Conta ();

	conta1.inserirDados ("Willams", "123", 1500, 3000, 1000);
	conta2.inserirDados ("Jessica", "456", 5000, 4500,2000);
	//conta1.transferir(conta2, 1000);
    conta1.transferir2(conta2, 2700);
	//  conta1.retornaNome("123");
	conta1.exibirDados ();
	conta2.exibirDados ();
  }
}
