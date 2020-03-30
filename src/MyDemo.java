
import java.util.Random;
import java.util.UUID;

import javax.sound.sampled.Line;
// Demoprogramm fuer DynStack 
// Erzeugt fuer die Typen int  ein Stacks  mit 1000 Elementen
// jener Typen und wendet 1000 zufaellige Operationen auf die Stacks an (push-, pop- und peek-Operationen,
// welche im Schnitt mit einem Verhaeltnis von 2:2:1 angwandt werden)
// Gibt jeweils vor und nach dem Durchlauf der Operationen, die ersten 10 Elemente des Stacks aus
public class MyDemo{
	public static void main(String[] args){
		System.out.println("--------------------");
		System.out.println("Int Demo StackArray");
		System.out.println("--------------------");
		DynStack a1 = new DynStack();
		for(int i = 0; i<=1000; i++){
			Random rand = new Random();
			int  n = rand.nextInt(1000) + 1;
			a1.push(n);
			if(i>990){
				System.out.println(a1.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				Random rand1=new Random();
				int n1=rand1.nextInt(1000)+1;
				a1.push(n1);
			}else if(n==3||n==4){
				a1.pop();
			}else if(n==5){
				a1.peek();
			}
			if(i>990){
				System.out.println(a1.peek());
			}
		}
	
	}
}