package Familia38;

import java.util.Scanner;

public class ExercicioWhile01 {
	
	public static void main(String[] args) {
		
		int idade=0, menos, mais, contMenos=0, contMais=0;
		
		Scanner ler = new Scanner (System.in);
				
		while (idade<=99)
		{
			System.out.println("\nEntre com a sua idade");
			idade = ler.nextInt();
			if (idade<=21)
			{
				menos = idade;
				contMenos++;
			}
			if(idade>=50)
			{
				mais=idade;
				contMais++;
					
			}			
		}
		System.out.println("\n Quantidade de pessoas com menos de 21 anos: "+contMenos);
		System.out.println("\n Quantidade de pessoas com mais de 50 anos:  "+contMais);
	}

}
