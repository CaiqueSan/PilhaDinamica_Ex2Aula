package controller;

public class Pilha {
	
	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean vazia() {
		if (topo == null)
			return true;
		else 
			return false;
		}



	public void push(int a) {
		No elemento = new No();
		elemento.dado = a;
		if (vazia() == true)
			topo = elemento;
		else {
			elemento.proximo = topo;
			topo = elemento;
		}
			
	}

	public int pop() throws Exception {
		if (vazia() == true)
			throw new Exception("Não há elementos para remover");
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public int topo() throws Exception {
		if (vazia() == true)
			throw new Exception("Não há elementos na pilha");
		int valor = topo.dado;
		return valor;
	}

	public int tamanho() {
		int cont = 0;
		if (vazia() == false) {
			No auxiliar =  topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

}
