package prj_loc;

import junit.framework.TestCase;
import prj_loc.DataSemana;



public class TesteLogicaDataSemana extends TestCase {

	/**
	 * @classe Testar a lógica do programa e verificar se o resultado está compatível com o que se espera
O teste baseou na questão das datas de 10/12/2017 a 17/12/2017 
Tem-se nesta data 3 dias de final de semana 10/12/2017, 16/12/2017 e 17/12/2017
Tem-se 5 dias de semana de 11/12/2017 a 15/12/2017

	 */
			
		public void testeDias(){
			String dataIni = "10/12/2017";
			String dataFim = "17/12/2017";
			int diasSemEsp = 5;
			int diasFSEsp = 3;
			int diasSemFeito;
			int diasFSFeito;
			
		DataSemana dias = new DataSemana(dataIni, dataFim);
		diasSemFeito = dias.getNumDiasSem();
		diasFSFeito = dias.getNumDiasFS();
		
		assertEquals(diasSemEsp,diasSemFeito,0);
		assertEquals(diasFSEsp,diasFSFeito,0);
		
			
			
						
	}

	
	
}
