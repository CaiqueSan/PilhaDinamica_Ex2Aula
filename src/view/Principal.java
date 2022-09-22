package view;
import java.util.Random;

import controller.OperacaoController;
import controller.Pilha;

public class Principal {
	
	public static void main (String args [] ) throws Exception {
		Pilha p = new Pilha();
		Random random =  new Random();
		for (int x = 0; x < 15; x ++) {
			int r = random.nextInt(49) + 1;
			p.push(r);
			//System.out.print(r + " ");
		}
		//System.out.println(p.tamanho());
		OperacaoController o = new OperacaoController();
		System.out.println(o.maiorValor(p));
	}
}
