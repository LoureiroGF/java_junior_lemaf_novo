package prj_loc;


import prj_loc.CalculaCusto;
import junit.framework.TestCase;

public class TesteLogicaCalculaCusto extends TestCase {
	
	
	/**
	 * @classe Testar a lógica do programa e verificar se o resultado está compatível com o que se espera

O teste baseou na questão das datas de 10/12/2017 a 17/12/2017 
Tem-se nesta data 3 dias de final de semana 10/12/2017, 16/12/2017 e 17/12/2017
Tem-se 5 dias de semana de 11/12/2017 a 15/12/2017
O valor esperado é baseado na questão de que o valor compacto de 4 lugares
é o ideal para a quantidade de passageiros, tendo em vista que o SUV apresenta valores de diárias
maiores. Neste sentido a diária para o cliente regular é 210 para dias de semana
e 200 para finais de semana. Tem-se que 210*5 = 1050 e 200*3 = 600, em que 1050 + 600 = 1650
	 */
	
	public void testeBuscaMelhor(){
		String dataIni = "10/12/2017";
		String dataFim = "17/12/2017";
		int numPas = 4;
		boolean fid = false;
		float valorEsp = 1650;
		float valorFeito = 0;
		
		CalculaCusto custo = new CalculaCusto(dataIni, dataFim, fid, numPas);
		valorFeito = custo.getValor();
		assertEquals(valorEsp,valorFeito,0);
		
		
		
				
		
	}
	
	
}
