

public class Cont
{
  protected String nome, numeroConta;
  protected double saldo, limite, limiteEspecial;
  
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
  public double getLimiteEspecial()
  {
      return limiteEspecial;
  }
  public void setLimiteEspecial(double a)
  {
      this.limiteEspecial=a;
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
  public void alterarLimite(double limite)
  {
    setLimite(limite);
  }
  public void transferir(Conta a, Conta b, double val)
  {
	     if(a.debitarValor(val))
        {
            //a.debitarValor(val);
            b.creditarValor (val);
            System.out.println("Transferẽncia efetuada.");
        }   
	  System.out.println("Transferência não realizada");
	
  }
  public boolean debitarValor (double x)
  {
    if(x<=(limite+saldo))
    {
	    if(x>saldo)
        {
            limite-=(x-saldo);
            saldo=0;
            System.out.println("Debitado");
            return true;
        }
        saldo-= x;
        System.out.println("Debitado");
        return true;
    }
    else
        System.out.println("Limite excedido");
        return false;
         
  }
  public void creditarValor (double x)
  {
	this.saldo += x;
  }
  public void inserirDados (String nome, String numero, double saldo, double limite)
  {
	this.nome = nome;
	this.numeroConta = numero;
	this.saldo = saldo;
	this.limite = limite;
  }
  public void exibirDados ()
  {

	System.out.println ("\nNúmero da conta: " + getNumero());
	System.out.println ("Nome: " + getNome());
	System.out.println ("Saldo: R$ " + getSaldo());
	System.out.println ("Limite: R$ " + getLimite());
  }

  public static void main (String[]args)
  {
	

	Conta conta1 = new Conta ("Willams", "123", 2000, 1500,1500);
	Conta conta2 = new Conta ();

	
	conta2.inserirDados ("Jessica", "456", 5000, 4500,2000);
	conta1.transferir(conta2, 1000);

	//  conta1.retornaNome("123");
	conta1.exibirDados ();
	conta2.exibirDados ();
  }
}
