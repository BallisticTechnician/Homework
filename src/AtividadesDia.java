import java.util.Scanner;

public class AtividadesDia {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int qtd;
	int forma;
	System.out.println("Digite quantas atividades você fez hoje:");
	qtd = leitor.nextInt();
	String atividade[] = new String [qtd];
	for (int i=0;i<atividade.length;i++) {
		System.out.println("Escreva a atividade que fez hoje :");
		atividade[i] = leitor.nextLine();
	}
	System.out.println("Quer ver as atividades em qual ordem ?\n1-Normal\n2-Trás pra frente.");
	forma = leitor.nextInt();
	if (forma==1) {
		for (int i=0;i<atividade.length;i++) {
		System.out.println(atividade[i]);
		}
		
	}
	else {
	for (int i=0;i<atividade.length;i++) {
		System.out.println(atividade[atividade.length-i-1]);
	}}}}
