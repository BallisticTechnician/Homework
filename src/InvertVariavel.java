import java.util.Scanner;
public class InvertVariavel {
	public static void main (String[] args){	

Scanner leitor = new Scanner(System.in);
int a;
int b;
a = 0;
b = 0;
	System.out.println("Entre com a variavel A :");
	a = leitor.nextInt();
	b=b-b+a;
	System.out.println("Variavel B : "+b+"\n");
	System.out.println("Entre com a variavel B :");
	b = leitor.nextInt();
	a=a-a+b;
	System.out.println("Variavel A : "+a+"\n");

	}
	}
