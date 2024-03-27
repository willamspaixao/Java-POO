public class Carro {
  int anoFabricacao;
  String cor, modelo;
  double velocidade;

  void registraAno(int anoNovo)
  {
    anoFabricacao= anoNovo;
  }

  void registraCor(String a)
  {
    cor= a;
  }

  void registraModelo(String a)
  {
    modelo= a;
  }
  void registraVelocidade(double a)
  {
    velocidade= a;
  }

  void ligar()
  {
    System.out.println("\nCarro ligado!");
  }
  void desligar()
  {
    System.out.println("\nCarro desligado!");
  }
  void acelerar()
  {
    System.out.println("\nCarro teve sua velocidade aumentada!");
  }
  void frear()
  {
    System.out.println("\nCarro teve sua velocidade reduzida!");
  }
  void mostrarDados()
  {
    System.out.println("\nO carro "+cor+", "+modelo+", ano "+anoFabricacao+" está com velocidade de "+velocidade+" km/h.");
  }
  
  public static void main(String[] args) {
    
    Carro carro1 = new Carro();
    carro1.registraAno(2004);
    carro1.registraCor("branco");
    carro1.registraModelo("Palio");
    carro1.registraVelocidade(111);

    
    carro1.mostrarDados();

    

  }

}
