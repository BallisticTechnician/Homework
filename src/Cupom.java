
import java.util.Scanner;
public class Cupom {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
	double compra;
	String cupom;	
	System.out.println("Entre com o valor da compra :");
	compra = leitor.nextDouble();
	System.out.println("Entre com o cupom, se não tiver digite 0 :");
	cupom = leitor.next();
	if(cupom.equals("confraria")) {
		System.out.println("Valor da compra de R$ "+compra*0.97);
	}
	else {System.out.println("Valor da compra de R$ "+compra);
	}
}}
