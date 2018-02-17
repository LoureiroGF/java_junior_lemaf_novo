
package prj_loc;




import java.io.*; 
import javax.swing.JOptionPane;

import prj_loc.CalculaCusto;



	
		 
    





public class LocadoraPrincipal {

	/**
	 * @classe principal, responsável por rodar o programa
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataIn="0";//Data Início da Locação
		String dataFim="0";//Data Final da Locação
		int codFid=0; //código de fidelização 0-para cliente fidelizado e 1-para cliente regular
		int numPas=0; //Número de passageiros
		boolean fid = false;
				
		String carros;
		String locado;
		String valores;
		String planos;
		
		
		
		try{
			String nome;
			nome = "C:/dados_loc.txt";
			BufferedReader br = new BufferedReader(new FileReader(nome));
			dataIn = br.readLine();
			dataFim = br.readLine();
			numPas = Integer.parseInt(br.readLine());
			codFid = Integer.parseInt(br.readLine());		
			br.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
				
		
		if (numPas>7 || numPas < 1){
			JOptionPane.showMessageDialog(null,"Erro! Não temos carros disponíveis para a quantidade de passageiros desejada:");		
		}
		
		if (codFid == 0){
			fid = true;
		}else if (codFid == 1) {
			fid = false;
		}
		
		
		
		CalculaCusto custo = new CalculaCusto(dataIn, dataFim, fid, numPas);
		carros = String.valueOf(custo.getVeiculo());
		locado = String.valueOf(custo.getLoca());
		valores = String.valueOf(custo.getValor());
		planos = String.valueOf(custo.getPlano());
		
		System.out.println("Menor valor" + "\n" +"Veículo:" + carros + " Locadora: " + locado + " Valor: " + valores + " Plano:" + planos);
		
	}
		
}
