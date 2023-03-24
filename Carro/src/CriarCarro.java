import java.util.Date;

public class CriarCarro {
	
      String marcaVeiculo;
      String modeloVeiculo;
	  Date dataFabricacaoVeiculo;
	  double pesoVeiculo;
	  int quantidadeMarchaVeiculo;
	  int quantidadePortaVeiculo;
	
       
	  
	  public void ligar() {
		  System.out.println("Ligar o carro ");
		   }
	  
	  public void desligar () {
		  
		  System.out.println("Desligar o carro ");
	  }
	  
	  public void acelerar () {
		  
		  
		  System.out.println("Acelerar o carro ");
	  }
	  
	  public void freiar () {
		  
		  
		  System.out.println("Freia o carro ");
	  }
       
      public int quantidadeCombustivel() {
    	  return 250;
      }
		
}

