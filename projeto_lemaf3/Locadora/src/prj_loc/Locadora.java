package prj_loc;



import prj_loc.Carros;
public class Locadora {
	
	/**
	 * @classe Associa os dados de cada locadora com os carros que tem disponível, bem como a capacidade de cada carro que cada locadora fornece
	 */

	

	Carros carro = new Carros();
	
	public int SouthCar(){ // Retorna a quantidade de passageiros possíveis com carro que a locadora trabalha
		return carro.Compacto();
		
	}
	
	public int WestCar(){
		return carro.Esportivo();
	}
	
	public int NorthCar(){
		return carro.Suv();
		
	}
	
	

}
