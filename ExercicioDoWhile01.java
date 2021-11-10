package Familia38;

import java.util.Scanner;

public class ExercicioDoWhile01 {
	
	public static void main(String[] args) {
		
		int numero,somaNumero=0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("\nEntre com um numero: ");
			numero = ler.nextInt();
			
			somaNumero += numero;
			
			
		}while(numero !=0);
		
		System.out.println("\n Soma dos numeros digitados: "+somaNumero);
	}

}
