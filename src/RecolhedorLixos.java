import java.util.Scanner;
public class RecolhedorLixos {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
	int peso1;
	int peso2;
	int peso3;
	
	System.out.println("Entre com o peso do lixo 1 :");
	peso1 = leitor.nextInt();
	System.out.println("Entre com o peso do lixo 2 :");
	peso2 = leitor.nextInt();
	System.out.println("Entre com o peso do lixo 3 :");
	peso3 = leitor.nextInt();
	System.out.println("Recolher os lixos na seguinte ordem : ");
	if(peso1<=peso2) {
		if(peso1<=peso3) {
			if(peso2<=peso3) {
				System.out.println("1 - lixo 1, 2 - lixo 2 e 3 - lixo 3");
				}
			else {System.out.println("1 - lixo 1, 2 - lixo 3 e 3 - lixo 2");}}
		else {System.out.println("1 - lixo 3, 2 - lixo 1 e 3 - lixo 2");}
		if(peso3<=peso2) {
		System.out.println("1 - lixo 3, 2 - lixo 2 e 3 - lixo 1");}
		else {System.out.println("1 - lixo 2, 2 - lixo 3 e 3 - lixo 1");}
		if (peso3<=peso2){System.out.println("1 - lixo 3, 2 - lixo 2 e 3 - lixo 1");}
	}
	}
	}
