class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, double saldo)
    {
        super(numero,saldo);
    }

    public ContaPoupanca() {
    }

    public void renderJuros(double taxa) {
        double saldoAtual = getSaldo();
        creditar(saldoAtual*(taxa/100));
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
