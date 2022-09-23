import java.util.Scanner;
public class ExercicioD {
	   public static void main (String args []) {
		   Scanner ler = new Scanner(System.in);
			int v1,v2, pj1=0,pj2=0,p=0,i=0;
			System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
			do {
			System.out.println("Pedra = 0 ");
			System.out.println("Papel = 1  ");
			System.out.println("Tesoura = 2");
			
			System.out.println("Jogador 1: ");
			v1 = ler.nextInt();
			System.out.println("Jogador 2: ");
			v2 = ler.nextInt();
			switch (v1){
			
				case 0: 
					
					switch (v2){
						case 0:
							System.out.println("Empate");

							break;
						case 1:
							System.out.println("Jogador 2 ganhou");
							pj2++;

							break;
						case 2:
							System.out.println("Jogador 1 ganhou");
							pj1++;

							break;
							default: 
								System.out.println ("Inválido - Fim de jogo");

					} break;
				case 1:
					switch(v2) {
						case 0: 
							System.out.println("Jogador 1 ganhou");
							pj1++;

							break;
						case 1:
							System.out.println(" Empatou");

							break;
						case 2:
							System.out.println("Jogador 2 ganhou");
							pj2++;

							break;
						default: 
							System.out.println ("Inválido - Fim de jogo");

					} break;
				case 2:
					switch(v2) {
							case 0:
								System.out.println("Jogador 2 ganhou");
								pj2++;

								break;
							case 1:
								System.out.println("Jogador 1 ganhou");
								pj1++;
								break;
							case 2:
								System.out.println("Empate");
								break;
							default: 
					            System.out.println ("Inválido - Fim de jogo");
					            
					} break;
				default: 
					System.out.println ("Inválido - Fim de jogo");
			}
			p++;
		if (p==3) {
			System.out.println ("Fim de da partida Jogador 1 = "+pj1+" pontos!");
			System.out.println ("Fim de da partida Jogador 2 = "+pj2+" pontos!");
		}
			}while(i<2);
		}
	}