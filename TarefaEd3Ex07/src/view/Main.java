package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX06;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX06 m = new TarefaEd3EX06();
		int num = 0;
		int quant = 0;
		int resp =0;
	

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para somar seus algarismos"));
		quant = m.Ex07(num,0);
		
		int[] vet = new int[quant];
		
		resp = m.CarregaVet(vet,0,num);
		
		
		
		
		System.out.println(resp);
	}
}