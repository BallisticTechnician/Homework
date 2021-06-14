import java.util.Scanner;
public class IdadeCalc {
	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);	
int mes;
int dia;
int ano;
		System.out.println("entre com sua data de nascimento");
		System.out.println("dia :");
		dia = leitor.nextInt();
		System.out.println("mes :");
		mes = leitor.nextInt();
		System.out.println("ano :");
		ano = leitor.nextInt();
		dia = 31 - dia;
		mes = 12 - mes;
		ano = 2021 - ano;
		System.out.println("Você tem "+dia+" dias, "+mes+" meses e "+ano+" anos de vida");
		
	
	
	}
		
}
