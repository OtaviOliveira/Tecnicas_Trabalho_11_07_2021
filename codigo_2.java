 package exercicio_2;

import java.util.Scanner;

public class Main_Aplicacao 
{

	public static void main(String[] args) 
	{

		System.out.println( "CONVERS�O DE INTEIRO PARA BIN�RIO \n" );
		
		// Entrada dos valores:
		Scanner entrada = new Scanner( System.in ); 
		System.out.println( " >Digite o primeiro n�mero: " );
		
		int primeiroNumeroEntrada;
		primeiroNumeroEntrada = entrada.nextInt();
		
		System.out.println( " >Digite o segundo n�mero: " );
		
		int segundoNumeroEntrada;
		segundoNumeroEntrada = entrada.nextInt();
		
		Integer primeiroNumeroBinario = primeiroNumeroEntrada 
		Integer segundoNumeroBinario = segundoNumeroEntrada 
		// Ao compatibilizar valores int para a classe empacotadora Integer
		// permite-se usar fun��es especiais.

		// Sa�da dos valores:
		System.out.println("\n" + primeiroNumeroBinario + " = "
				   + Integer.toBinaryString(primeiroNumeroBinario)
				   + " em bin�rio.");

		System.out.println( segundoNumeroBinario + " = " 
				   + Integer.toBinaryString(segundoNumeroBinario)
				   + " em bin�rio.");

	}
}
