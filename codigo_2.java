 package exercicio_2;

import java.util.Scanner;

public class Main_Aplicacao 
{

	public static void main(String[] args) 
	{

		System.out.println( "CONVERSÃO DE INTEIRO PARA BINÁRIO \n" );
		
		// Entrada dos valores:
		Scanner entrada = new Scanner( System.in ); 
		System.out.println( " >Digite o primeiro número: " );
		
		int primeiroNumeroEntrada;
		primeiroNumeroEntrada = entrada.nextInt();
		
		System.out.println( " >Digite o segundo número: " );
		
		int segundoNumeroEntrada;
		segundoNumeroEntrada = entrada.nextInt();
		
		Integer primeiroNumeroBinario = primeiroNumeroEntrada 
		Integer segundoNumeroBinario = segundoNumeroEntrada 
		// Ao compatibilizar valores int para a classe empacotadora Integer
		// permite-se usar funções especiais.

		// Saída dos valores:
		System.out.println("\n" + primeiroNumeroBinario + " = "
				   + Integer.toBinaryString(primeiroNumeroBinario)
				   + " em binário.");

		System.out.println( segundoNumeroBinario + " = " 
				   + Integer.toBinaryString(segundoNumeroBinario)
				   + " em binário.");

	}
}
