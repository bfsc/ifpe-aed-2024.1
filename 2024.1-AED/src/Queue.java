
public interface Queue {

//	Adiciona um elemento atrás da fila
	public void offer(int element);
	
//	Obtém o elemento da frente, sem retirá-lo
	public int peek();
	
//	Obtém o elemento da frente e retira-o
	public int poll();
		
//	Obtém o tamanho da fila
	public int getSize();
	
}
