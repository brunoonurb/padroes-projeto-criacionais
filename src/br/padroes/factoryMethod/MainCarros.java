package br.padroes.factoryMethod;

public class MainCarros {
	public static void main(String[] args) {

		FabricaDeCarro fabrica = new FabricaChevrolet();
		 Carro carro = fabrica.criarCarro();
		carro.exibirInfo();
		
	}
}
