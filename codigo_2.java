package exercicio_2;

import java.util.Scanner;

public class Main_Aplicacao 
{

	public static void main(String[] args) 
	
	{
		
		System.out.println( "****************************" );
		System.out.println( " INTEIRO PARA BIN�RIO \n" );
		
		System.out.println( " >Digite o primeiro n�mero: " );
		
		Scanner entrada = new Scanner( System.in ); 
		
		int N1;
		N1 = entrada.nextInt();
		
		System.out.println( " >Digite o segundo n�mero: " );
		
		int N2;
		N2 = entrada.nextInt();
		
		Integer numero1 = N1;
		Integer numero2 = N2;
		
		System.out.println("\n" + numero1 + " = " + Integer.toBinaryString(numero1) + " em bin�"
				+ "rio.");
		System.out.println( numero2 + " = " + Integer.toBinaryString(numero2) + " em bin�rio.");
		System.out.println( "---------------------------" );

	}

	
}
