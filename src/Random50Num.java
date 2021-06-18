import java.util.Scanner;
import java.util.Random;
public class Random50Num {

	public static void main (String[] args){	
	Scanner leitor = new Scanner(System.in);
	Random random = new Random();
	int qtd[]=new int[50];
	int qtdnpar=0;
	int qtdnimpar=0;
	int qtdnM3=0;
	int num3e7=0;
	int i=0;
	for (i=0;i<50;i++){
		qtd[i]=random.nextInt(9);
		System.out.println("Numero ramdomico n "+i+" : "+qtd[i]);
	}
	for (i=0;i<50;i++){	
		if ((qtd[i]<=7)&&(qtd[i]>=3)){
			num3e7= num3e7 +1;}
	}
	for (i=0;i<50;i++){	
		if ((qtd[i]%2==0)&&(qtd[i]!=0)){
			qtdnpar= qtdnpar +1;
		}}
	for (i=0;i<50;i++){	
		if ((qtd[i]%2!=0)){
			qtdnimpar= qtdnimpar +1;
			}}
	for (i=0;i<50;i++){	
		if ((qtd[i]<3)){
			qtdnM3= qtdnM3 +1;
			}}
	System.out.println("Numeros entre 3 e 7 :"+num3e7);
	System.out.println("Numeros pares :"+qtdnpar);
	System.out.println("Numeros impares :"+qtdnimpar);
	System.out.println("Numeros menor que 3 :"+qtdnM3);
	
}}
