

public class DynStack <E> {
	
	private Node head;

	//constructor, creats an empty stack
	public DynStack() {
		head = null;
	}
	
	//inserts item at the top of this stack
	public void push(E item) {
		Node p = new Node(item);
		p.next = head;
		head = p;
	}
	
	//returns the top item of this stack and removes it
	//reutrns null, if this stack is empty
	public E pop() {
		if(head == null) {
			return null;
		}else {
			Node p = head;
			head = head.next;
			return p.data;		
		}
	
	}
	//returns the top item of this stack without removing it
	//returns null, if this stack is empty
	public E peek () {
		if(head == null) {
			
			return null;
		}else {
			return head.data;
		}
	}

	//returns true if this stack contains no elements
	public boolean isEmpty() {
		return head == null;
		
	}
	//additional useful methods

	//returns the number of elements in this stack
	
	public int size () {
		int count = 1;
		Node p = head;
		while(p.next != null) {
			count += 1;
			p = p.next;
		}
		return count;
	}
	
	//returns the position of item on this stack, the top positon has count 0 
	//returns -1 if item is not on this stack; compares items with equals!
	public int contains (E item) {
		for(int i = 0; i < this.size(); i++) {
			if(item.equals(i)) {
				return i;
			}
		}
		return -1;
	}

	//returns a String-representation of this stack as
	//[item0, item1, ...] with item0 as the top item
	public String toString () {
		 String s = "[";
		    Node p = head;
		    if (p != null){  //adding first element to s
		      s = s + p.data.toString();
		      p = p.next;
		    }

		    while(p != null){  //adding remaining elements to s
		      s = s + ", " + p.data.toString();
		      p = p.next;
		    }
		    s = s + "]";
		    return s;
		
	}

	//Node ass inner Class
	 private class Node {
		  
		    E data;
		    Node next;
		  
		    Node (E d) {
		      data = d;
		      next = null;
		    }
		 }
	

}
