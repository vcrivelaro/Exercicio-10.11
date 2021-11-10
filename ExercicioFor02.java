package Familia38;

import java.util.Scanner;

public class ExercicioFor02 {
	
	public static void main(String[] args) {
		
		int x,numero,par,impar,contPar=0,contImpar=0;
		
		Scanner ler = new Scanner (System.in);
		
		for (x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um numero: ");
			numero = ler.nextInt();
			
			if(numero%2 ==0)
			{
				par=numero;
				contPar++;
			}
			else
			{
				impar=numero;
				contImpar++;
			}
			
		
		}
		System.out.println("\nForam digitados " +contPar+" numeros pares e "+contImpar+" numeros impares");
	}

}
