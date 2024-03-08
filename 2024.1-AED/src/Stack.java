public interface Stack {

	// Adiciona um elemento no topo
	public void push(int element);
	
	// Obtém o elemento do topo, sem retirá-lo
	public int peek();
	
	// Obtém o elemento do topo e retira-o
	public int pop();
	
	// Obtém o número de elementos da pilha
	public int getSize();
	
}
