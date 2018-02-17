package prj_loc;



public class ClienteFidelidade {
	
	/**
	 * @classe Classe que detem os valores em reais de cada cliente fidelidade, nos valores de dia de semana e final de semana
	 */
		
	public float ClienteFidelidadeDiaSemana(int codLoc){  //CodLoc é o código da locadora: 1 - SouthCar, 2 - WestCar e 3 - NorthCar 
		float valor;
		
		switch(codLoc) //Retorna os valores em reais para o cliente fidelidade para cada locadora considerando a locação no dia de semana 
		{
		case 1: valor = 150; break;
		case 2: valor = 150; break;
		case 3: valor = 580; break;
		default: valor = -1; break;
		}
		return valor;
		
	}
			
	public float ClienteFidelidadeFimSemana(int codLoc){  //CodLoc é o código da locadora: 1 - SouthCar, 2 - WestCar e 3 - NorthCar 
		float valor;
			
		switch(codLoc) //Retorna os valores em reais para o cliente fidelidade para cada locadora considerando a locação no fim de semana
		{
		case 1: valor = 90; break;
		case 2: valor = 90; break;
		case 3: valor = 590; break;
		default: valor = -1; break;
		}			
			return valor;
	}

	

}
