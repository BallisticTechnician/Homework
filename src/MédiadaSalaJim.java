import java.util.Scanner;
public class MédiadaSalaJim {

	public static void main (String[] args){	
	Scanner leitor = new Scanner(System.in);
	int nota[] = new int[50];
	int total;
	double media;
	total = 0;
	int i=0;
		for (i=0;i<50;i++)
		{
		System.out.println("Digite a nota do aluno "+i+" :");
		nota[i] = leitor.nextInt();
		total = total + nota[i];
		}
	
	media = total/50;
	System.out.println("Média : "+media);
		for (i=0;i<50;i++){
			if (nota[i]<media) {
				System.out.println("Aluno "+i+" se apresente com o professor");
			}
	}}}

