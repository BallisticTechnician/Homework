import java.util.Scanner;
public class TempoFilme {
	public static void main (String[]args){	
	
Scanner leitor = new Scanner(System.in);
int Tfilme;
int segundos;
double horas;
System.out.println("Entre com o tempo do filme :");
Tfilme = leitor.nextInt();
segundos = Tfilme*60;
horas = Tfilme/60.0;
System.out.println("O filme tem a duração de "+ segundos +" segundos");
System.out.println("O filme tem a duração de "+ horas +" horas");
}
}