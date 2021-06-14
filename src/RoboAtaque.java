import java.util.Scanner;
public class RoboAtaque {
	public static void main (String[] args){	

		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("Entre com a distancia do alvo(CM) :");
		distancia = leitor.nextInt();
		if (distancia <= 70) {
			System.out.println("ATIVADO");
		
		}
		else {
			System.out.println("DESATIVADO");
		}
}
}