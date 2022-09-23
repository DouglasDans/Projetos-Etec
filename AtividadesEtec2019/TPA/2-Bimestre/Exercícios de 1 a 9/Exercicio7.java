import java.util.Scanner;
public class Exercicio7 {
	public static void main (String[] args) {
		int i, id1, id2, id3, id4, id5, maior, menor;
		String nome1, nome2, nome3, nome4, nome5;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite seu nome:");
		nome1=ler.next();
		System.out.print("Digite sua idade:");
		id1=ler.nextInt();
		System.out.println("Digite seu nome:");
		nome2=ler.next();
		System.out.print("Digite sua idade:");
		id2=ler.nextInt();
		System.out.println("Digite seu nome:");
		nome3=ler.next();
		System.out.print("Digite sua idade:");
		id3=ler.nextInt();
		System.out.println("Digite seu nome:");
		nome4=ler.next();
		System.out.print("Digite sua idade:");
		id4=ler.nextInt();
		System.out.println("Digite seu nome:");
		nome5=ler.next();
		System.out.print("Digite sua idade:");
		id5=ler.nextInt();
		//MAIOR//
		if(id1>id2 && id1>id3 && id1>id4 && id1>id5) {
			System.out.print("O mais velho é o (a) "+nome1+", com "+id1+" anos.");
		}
		if(id2>id1 && id2>id3 && id2>id4 && id2>id5) {
			System.out.print("O mais velho é o (a) "+nome2+", com "+id2+" anos.");
		}
		if(id3>id2 && id3>id1 && id3>id4 && id3>id5) {
			System.out.print("O mais velho é o (a) "+nome3+", com "+id3+" anos.");
		}
		if(id4>id2 && id4>id3 && id4>id1 && id4>id5) {
			System.out.print("O mais velho é o (a) "+nome4+", com "+id4+" anos.");
		}
		if(id5>id2 && id5>id3 && id5>id4 && id5>id1) {
			System.out.print("O mais velho é o (a) "+nome5+", com "+id5+" anos.");
		}
		//MENOR//
		if(id1<id2 && id1<id3 && id1<id4 && id1<id5) {
			System.out.print(" O mais novo é o (a) "+nome1+", com "+id1+" anos.");
		}
		if(id2<id1 && id2<id3 && id2<id4 && id2<id5) {
			System.out.print(" O mais novo é o (a) "+nome2+", com "+id2+" anos.");
		}
		if(id3<id2 && id3<id1 && id3<id4 && id3<id5) {
			System.out.print(" O mais novo é o (a) "+nome3+", com "+id3+" anos.");
		}
		if(id4<id2 && id4<id3 && id4<id1 && id4<id5) {
			System.out.print(" O mais novo é o (a) "+nome4+", com "+id4+" anos.");
		}
		if(id5<id2 && id5<id3 && id5<id4 && id5<id1) {
			System.out.print(" O mais novo é o (a) "+nome5+", com "+id5+" anos.");
		}
		
	}
}