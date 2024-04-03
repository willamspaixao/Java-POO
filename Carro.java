public class Carro {
  private int anoFabricacao;
  private String cor, modelo;
  private double velocidade;

  public Carro()
  {

  }
  public Carro(int anoFabricacao, String cor, String modelo,double velocidade)
  {
    this.anoFabricacao= anoFabricacao;
    this.cor=cor;
    this.modelo=modelo;
    this.velocidade=velocidade;
  }
  
  public int getAnoFabricacao()
  {
    return this.anoFabricacao;
  }
  public void setAnoFabricacao(int anoFabricacao)
  {
    this.anoFabricacao= anoFabricacao;
  }


  public String geCor()
  {
    return this.cor;
  }
  public void setCor(String cor)
  {
    this.cor= cor;
  }

  public String getModelo()
  {
    return this.modelo;
  }
  public void setModelo(String modelo)
  {
    this.modelo= modelo;
  }
  public double getVelocidade()
  {
    return this.velocidade;
  }
  public void setVelocidade(double velocidade)
  {
    this.velocidade= velocidade;
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
    System.out.println("\nO carro "+geCor()+", "+getModelo()+", ano "+getAnoFabricacao()+" está com velocidade de "+getVelocidade()+" km/h.");
  }
  
  public static void main(String[] args) {
    
    Carro carro1 = new Carro();
   //carro1.setAnoFabricacao(2004);
    //carro1.setCor("branco");
    //carro1.setModelo("Palio");
    //carro1.setVelocidade(111);
   
    carro1.mostrarDados();


  }

}
