package prj_loc;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;



public class DataSemana {
	
	/**
	 * @classe Classe que calcula quantos dias de semana e quantos dias de final de semana tem-se no per�odo 
de loca��o. Os dados de data foram baseados na fun��o get.Time que calcula em milesegundos quantto tempo
tem-se de 01/01/1970 at� a data a ser calculada. Com base nisso, tem-se a subtra��o da data final da loca��o
para a data inicial de loca��o calculado em milesegundos e convertido para dias.
� verificado ent�o os dias de semana e os dias de final de semana em incrementado nas vari�veis diasSem para dias de semana 
e diasFS para dias de final de semana.
 
	 */

	
	
	private int NumDiasSem;
	private int NumDiasFS;
	
	
	
	
	public DataSemana(String dataIni, String dataFim){ // Inicia o m�todo com a data inicio e a data fim da loca��o e cod indicando que se for verdadeiro retorna os dias da semana, se for falso, retorna o fim de semana  
	
		
		int diasSem=0;
		int diasFS=0;
				
		//M�todo respons�vel por determinar quantos dias de semana ou finais de semana se passaram a partir da data in�cio da loca��o pretendida at� a data fim. 
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date inicio = sdf.parse(dataIni); //Vari�vel que converte o valor String de data inicial para a inst�ncia Data
			Date fim = sdf.parse(dataFim); //Vari�vel que converte o valor String final para a inst�ncia Data
			int nuDiasExecutados = (int) ((fim.getTime() - inicio.getTime()) / 86400000)+1;
		    Calendar cal  = Calendar.getInstance();
		    cal.setTime(inicio);
		    for (int i = 1; i<= nuDiasExecutados ; i++){
		        //Incrementa o valor de um dia de semana
		        //Verifica se o dia � dia de semana
		    	//Se o c�digo for verdadeiro est� solicitando ao m�todo que some dias de semana, se for falso os finais de semana
		        if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
		            diasSem +=1;
		        }else{
		        	diasFS +=1;
		        }
		        cal.add(Calendar.DATE, 1);
		    }
		} catch (java.text.ParseException e){
			e.printStackTrace();
		}
			
			setNumDiasSem(diasSem);
			setNumDiasFS(diasFS);

	}




	public void setNumDiasSem(int numDiasSem) {
		NumDiasSem = numDiasSem;
	}




	public int getNumDiasSem() {
		return NumDiasSem;
	}




	public void setNumDiasFS(int numDiasFS) {
		NumDiasFS = numDiasFS;
	}




	public int getNumDiasFS() {
		return NumDiasFS;
	}

}

	