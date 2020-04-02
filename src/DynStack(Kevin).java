//Jahreiss, Kevin; Karasz, David; Urban, Melanie; 
public class DynStack<E> {

	private Node head;

	public DynStack() {
		head = null;
	}

	public void push(E item) {
		Node p = new Node(item);
		p.next = head;
		head = p;
	}

	public Node pop() {
		if(head == null)
			return null;
		Node p = head;
		head = head.next;
		return p;
	}

	public Node peek() {
		return head;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		int n = 0;
		Node p = head;
		while (p != null) {
			n++;
			p = p.next;
		}
		return n;
	}

	public int contains(E item) {
		int n = 0;
		Node p = head;
		if(p != null) {
			while(p != null && !p.data.equals(item)) {
				n++;
				if(p.data.equals(item))
					return n;
				p = p.next;
			}
		}
		if(p == null)
			n = -1;
		return n;
	}

	public int amountOf(E item) {
		int n = 0;
		Node p = head;
		while (p != null) {
			if (p.data.equals(item))
				n++;
			p = p.next;
		}
		return n;
	}

	public String toString() {
		String s = "[";
		Node p = head;
		if (p != null) {
			s = s + p.toString();
			p = p.next;
		}
		while (p != null) {
			s = s + "," + p.toString();
			p = p.next;
		}
		s = s + "]";
		return s;
	}

}
