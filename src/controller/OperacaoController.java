package controller;


public class OperacaoController {
	
	public int maiorValor (Pilha p) throws Exception {
		if (p.vazia())
			throw new Exception ("Pilha vazia");
		Pilha p2 = new Pilha();
		int a[] = new int[p.tamanho()];
		for (int x = 0; x < a.length; x++) {
			 a[x] = p.pop();
		}
		for (int x = 0; x < a.length; x++) {
			 p.push(a[x]);
			 p2.push(a[x]);
		}
		while (p2.tamanho() != 1) {
			int b = p2.pop();
			int c = p2.pop();
			if (b > c)
				p2.push(b);
			else
				p2.push(c);
		}
		return p2.topo();
	}
}
