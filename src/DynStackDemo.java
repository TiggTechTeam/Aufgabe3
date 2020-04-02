import java.util.Random;

public class DynStackDemo {
	
	public static void main(String[] args) {
		DynStack<Integer> popo = new DynStack<>();
		DynStack<Day> hello = new DynStack<>();
		
		System.out.println(popo.contains(3));
		System.out.println(popo.amountOf(3));
		System.out.println(popo.isEmpty());
		System.out.println(popo.size());
		
		hello.push(new Day("regen", 15));
		hello.push(new Day("sonnig", 25));
		hello.push(new Day("nebelig", 10));
		popo.push(1);
		popo.push(2);
		popo.push(3);
		
		System.out.println(popo.amountOf(2));
		System.out.println(popo.contains(5));
		System.out.println(popo.contains(1));
		
		popo.pop();
		popo.pop();
		popo.pop();
		hello.pop();
		hello.pop();
		hello.pop();
		
		for(int i = 0; i < 1000; i++) {
			popo.push(new Random().nextInt(1000));
		}
		System.out.println(popo.toString());
		for(int i = 0; i < 1000; i++) {
			int n = new Random().nextInt(5);
			if(n >= 3) {
				popo.push(new Random().nextInt(1000));
				System.out.println("push wird ausgeführt.");
			}
			if(n >= 1 && n < 3) {
				popo.pop();
				System.out.println("pop wird ausgeführt.");
			}
			if(n == 0) {
				popo.peek();
				System.out.println("peek wird ausgeführt.");
			}
		}
		System.out.println(popo.toString());
		System.out.println(popo.size());
		System.out.println(popo.pop());
		System.out.println(popo.pop());
		System.out.println(popo.pop());
	}

}
