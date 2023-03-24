public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CriarCarro carro1 = new CriarCarro ();
		CriarCarro carro2 = new CriarCarro ();
		CriarCarro carro3 = new CriarCarro ();
		CriarCarro carro4 = new CriarCarro ();
		CriarCarro carro5 = new CriarCarro ();
		
		carro1.marcaVeiculo ="Fiat";
		carro1.modeloVeiculo ="Palio";
		carro2.marcaVeiculo ="BMW";
		carro1.modeloVeiculo ="320";
	
		carro1.ligar();
		carro2.desligar();
		carro2.acelerar();
		carro2.pesoVeiculo = 500;
	

		System.out.println("Marca -> +carro1.marca.Veiculo");
		System.out.println("Marca -> +carro1.marca.Veiculo");
		System.out.println("Marca -> +carro2.marca.Veiculo");
		System.out.println("Marca -> +carro4.marca.Veiculo");
		System.out.println("Quantidade gasolina: "+
		          carro1.quantidadeCombustivel() +"litros");
		      

	}

}
