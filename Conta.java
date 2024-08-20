public class Conta
{
    protected String  numero;
    protected double saldo;


    public Conta()
    {

    }
    public Conta(String numero, double saldo)
    {
        this.numero= numero;
        this.saldo= saldo;
    }

    public String getNumero()
    {
        return numero;
    }
    public void setNumero(String numero)
    {
        this.numero =numero;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo=saldo;
    }

    public void creditar(double x)
    {
        this.saldo += x;
    }

    public void debitar(double x)
    {
        this.saldo -= x;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public void mostrarDados()
    {
        System.out.println ("\nNúmero da conta: " + getNumero());
        System.out.println ("Saldo: R$ " + getSaldo());
    }
}
