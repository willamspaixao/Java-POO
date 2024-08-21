public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
        this.limite = 0;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double valor) {
        this.limite = valor;
    }
    @Override
    public double getSaldo()
    {
        return super.getSaldo()+getLimite();//o saldo de uma conta corrente é o saldo + o seu limite
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    /*
    PRESENTE NA VERSÃO ANTERIOR
    public void transferir(Conta b, double val)
    {
        if(debitarValor2(val))
        {
            //a.debitarValor(val);
            b.creditar(val);
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


     */
}
