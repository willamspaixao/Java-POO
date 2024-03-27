public class App {
    public static void main(String[] args) throws Exception {
    Carro carro1 = new Carro();
    carro1.registraAno(2004);
    carro1.registraCor("branco");
    carro1.registraModelo("Palio");
    carro1.registraVelocidade(111);
    /*
    carro1.ligar();
    carro1.desligar();
    carro1.acelerar();
    carro1.frear();
    carro1.mostrarDados();
    System.out.println(carro1);
*/
    Conta conta1 = new Conta ();
	Conta conta2 = new Conta ();

	conta1.inserirDados ("Willams", "123", 1000, 1500);
	conta2.inserirDados ("Jessica", "456", 5000, 4500);
    
    conta1.creditarValor(5000);
    conta1.obterSaldo();
    
    conta1.alterarLimite(3000);
    conta1.transferir(conta2, 2000);
    
    conta1.exibirDados();
    conta2.exibirDados();

    }
}
