package prj_loc;

public class ClienteRegular {
	
	/**
	 * @classe Classe que detem os valores em reais de cada cliente regular, nos valores de dia de semana e final de semana
	 */

	
	
	protected float valor;
	
	
	
	public float ClienteRegularDiaSemana(int codLoc){  //CodLoc é o código da locadora: 1 - SouthCar, 2 - WestCar e 3 - NorthCar 
		
		
		switch(codLoc) //Retorna os valores em reais para o cliente regular para cada locadora considerando a locação no fim de semana
		{
		case 1: valor = 210; break;
		case 2: valor = 530; break;
		case 3: valor = 630; break;
		default: valor = -1; break;
		}
		return valor;
		
	}
			
	public float ClienteRegularFimSemana(int codLoc){  //CodLoc é o código da locadora: 1 - SouthCar, 2 - WestCar e 3 - NorthCar 
		
			
		switch(codLoc) //Retorna os valores em reais para o cliente regular para cada locadora considerando a locação no fim de semana
		{
		case 1: valor = 200; break;
		case 2: valor = 200; break;
		case 3: valor = 600; break;
		default: valor = -1; break;
		}			
		return valor;	
	}

	

}
