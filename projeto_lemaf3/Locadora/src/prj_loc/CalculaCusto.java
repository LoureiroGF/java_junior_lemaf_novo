package prj_loc;








import prj_loc.Locadora;
import prj_loc.ClienteFidelidade;
import prj_loc.ClienteRegular;
import prj_loc.DataSemana;


public class CalculaCusto {
	
	/**
	 * @classe CalculaCusto, é a classe que fica responsável por determinar o menor custo de acordo com os valores pré determinados por via da classe Cliente Regular e Cliente Fidelidade
bem como os dados obtidos a partir da capacidade dos carros na classe Carros e na classe Locadora que detem 
os dados dos carros que trabalham.
	 */
	
	
	private float valor=0;
	private String plano;
	private String veiculo;
	private String loca;
	
	public CalculaCusto(String DataIni, String DataFim, boolean cod_fid, int numPas){
		
		//Parte que verifica quantos dias da semana se tem no intervalo de locação e quantos dias de final de semana.	
		DataSemana dia = new DataSemana(DataIni, DataFim);
		ClienteFidelidade vf = new ClienteFidelidade();
		ClienteRegular vr = new ClienteRegular();
		Locadora loc = new Locadora();
		
		
		int np [] = new int [4];
		
		int ds = dia.getNumDiasSem(); //Quantidade de dias da semana e dias de final de semana
		int fs = dia.getNumDiasFS();
		
		float vds[] = new float[4]; //Variáveis que armazenam o custo para dias de semana e para final de semana
		float vfs[] = new float[4];
		
		//Com base nos dias de semana e finais de semana, tem-se o cálculo baseado nas diárias cadastradas 
		//no cliente Fidelidade e no cliente regular.
		if (cod_fid == true){
			for (int i=1; i<=3; i++){ // código da locadora: 1 - SouthCar, 2 - WestCar e 3 - NorthCar 
				vds[i] = vf.ClienteFidelidadeDiaSemana(i) * ds; //Calcula o custo de cada carro para o cliente fidelidade
				vfs[i] = vf.ClienteFidelidadeFimSemana(i) * fs;
				
			}
		} else{
			for (int i=1; i<=3; i++){
				vds[i] = vr.ClienteRegularDiaSemana(i) * ds; //Calcula o custo de cada carro para o cliente regular
				vfs[i] = vr.ClienteRegularFimSemana(i) * fs;
				
			}		
		}
			np[1] = loc.SouthCar(); //Preenche o vetor de número de passageiros com o número de passageiros de cada carro que é oferecido pela locadora
			np[2] = loc.WestCar();
			np[3] = loc.NorthCar();
			
			
			
			float comp_valor = 99999999;
			
			int k=0; 
			for (int i=1; i<=3; i++){
				if (numPas<= np[i]){
					if (comp_valor> vds[i]+vfs[i]){
						comp_valor = vds[i]+vfs[i];
						k = i;
					}
				}
				
			}
			setValor(comp_valor);
			
			if (cod_fid == true){
				setPlano("fidelizacao");
			}else{
				setPlano("regular");
			}
			
			switch(k) //Cada código simboliza um modelo de carro oferecido por cada locadora 
			{
			case 1: setVeiculo("Compacto"); break;
			case 2: setVeiculo("Esportivo"); break;
			case 3: setVeiculo("SUV"); break;
			default: setVeiculo("-1"); break;
			}
			
			switch(k) //Código de cada locadora  
			{
			case 1: setLoca("SouthCar"); break;
			case 2: setLoca("WestCar"); break;
			case 3: setLoca("NorthCar"); break;
			default: setLoca("-1"); break;
			}
			
			
		}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getPlano() {
		return plano;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setLoca(String loca) {
		this.loca = loca;
	}

	public String getLoca() {
		return loca;
	}
		
		
		
		
		
}
	
	
	
	
	
	
	

