public class App {
    public static void main(String[] args) throws Exception {
    /*Carro carro1 = new Carro();
    carro1.setAnoFabricacao(2024);
    carro1.setCor("cinza");
    carro1.setModelo("Jeep Renegade");
    carro1.setVelocidade(110);
    Carro carro2 = new Carro(2019,"branco","VW Virtus",145);
    // carro1.ligar();
    // carro1.desligar();
    // carro1.acelerar();
    // carro1.frear();
    carro1.mostrarDados();
    carro2.mostrarDados();
   */
    Conta conta1 = new Conta ("Willams", "123", 1000, 1500);
    Conta conta2 = new Conta ();

    conta2.inserirDados ("Jessica", "456", 5000, 4500);
    
    conta1.creditarValor(5000);
    conta1.obterSaldo();
    
    conta1.alterarLimite(3000);
    conta1.transferir(conta2, 2000);
    
    conta1.exibirDados();
    conta2.exibirDados();

    }
}
