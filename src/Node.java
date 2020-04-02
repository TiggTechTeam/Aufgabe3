
public class Node<E> {
	
	public E data;
	public Node next;
	
	public Node(E data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		String s = data.toString();
		return s;
	}

}
