



public class MostrarTableroClass {
	

	/**
	 * Tras cada movimiento se actualiza y muestra el estado actual del tablero
	 *
	 * Informacion de entrada:
	 * 		Tablero: una matriz de 3 con numeros comprendidos entre 0 y 2
	 * 
	 */
	public static void mostrarTablero(int tablero[][]) {
		/*
		 *     _________________
		 *    |     |     |     | 0 = en blanco
		 *    |  O  |     |  O  | 1 = O
		 *    |_____|_____|_____| 2 =      	 
		 *    |     |     |     | X 
		 *    |     |  O  |     |
		 *    |_____|_____|_____|
		 *    |     |     |     | 
		 *    |  X  |  X  |  X  |
		 *    |_____|_____|_____|
		 */
		
		System.out.println("  _________________");		
		for (int i = 0; i < tablero.length; i++) 
		{
			System.out.println(" |     |     |     |");
			System.out.print  (" |  ");
			
			for (int j = 0; j < tablero[i].length; j++) 
			{				
				if(tablero[i][j] == 1)
					System.out.print("O  |  ");
				else if (tablero[i][j] == 2) 
					System.out.print("X  |  ");
				else 
					System.out.print("   |  ");				
			}
			System.out.println();
			System.out.println(" |_____|_____|_____|");
		}
	}
	
	public static void main(String[] args) {
		int tablero[][] = new int[3][3];
		 
		
		// Empieza aqui
		
		/*
		 *     _________________
		 *    |     |     |     | 0 = en blanco
		 *    |  O  |     |  O  | 1 = O
		 *    |_____|_____|_____| 2 = X      	 
		 *    |     |     |     | 
		 *    |     |  O  |     |
		 *    |_____|_____|_____|
		 *    |     |     |     | 
		 *    |  X  |  X  |  X  |
		 *    |_____|_____|_____|
		 */
		
		System.out.println("  _________________");		
		for (int i = 0; i < tablero.length; i++) 
		{
			System.out.println(" |     |     |     |");
			System.out.print  (" |  ");
			
			for (int j = 0; j < tablero[i].length; j++) 
			{				
				if(tablero[i][j] == 1)
					System.out.print("O  |  ");
				else if (tablero[i][j] == 2) 
					System.out.print("X  |  ");
				else 
					System.out.print("   |  ");				
			}
			System.out.println();
			System.out.println(" |_____|_____|_____|");
		}
		
		// termina aqui

		/*
		 * ######################################################################
		 * #############  Casos de prueba
		 * ######################################################################
		 */
		
		//Caso uno
		/* 
		 *    Salida Esperada:
		 *     _________________
		 *    |     |     |     | 0 = en blanco
		 *    |  O  |  O  |  O  | 1 = O
		 *    |_____|_____|_____| 2 = X      	 
		 *    |     |     |     | 
		 *    |     |     |  X  |
		 *    |_____|_____|_____|
		 *    |     |     |     | 
		 *    |  X  |     |     |
		 *    |_____|_____|_____|
		 */
		int[][] tableroPruebaUno = { { 0, 0, 0 }, 
									 { 0, 1, 0 },
									 { 0, 0, 0 } };
		System.out.println("  _________________");		
		for (int i = 0; i < tableroPruebaUno.length; i++) 
		{
			System.out.println(" |     |     |     |");
			System.out.print  (" |  ");
			
			for (int j = 0; j < tableroPruebaUno[i].length; j++) 
			{
				if(tableroPruebaUno[i][j] == 0)
					System.out.print("   |  ");
				else if(tableroPruebaUno[i][j] == 1)
					System.out.print("O  |  ");
				else
					System.out.print("X  |  ");
				
			}
			System.out.println();
			System.out.println(" |_____|_____|_____|");
		}
		
		//Caso dos
		/* 
		 *    Que posicion quieres?:
		 *     __________________
		 *    |     |     |     | 0 = en blanco
		 *    |  7  |  8  |  9  | 1 = O
		 *    |_____|_____|_____| 2 = X      	 
		 *    |     |     |     | 
		 *    |  4  |     |  6  |
		 *    |_____|_____|_____|
		 *    |     |     |     | 
		 *    |  1  |  2  |  3  |
		 *    |_____|_____|_____|
		 */
		int[][] tableroPruebaDos = { { 0, 2, 0 }, 
				 					 { 1, 1, 1 },
				 					 { 2, 0, 0 } };
		System.out.println("  _________________");	
		for (int i = 0; i < tableroPruebaDos.length; i++) 
		{
			System.out.println(" |     |     |     |");
			System.out.print  (" |  ");
			
			for (int j = 0; j < tableroPruebaDos[i].length; j++) 
			{
				if(tableroPruebaDos[i][j] == 0)
					System.out.print("   |  ");
				else if(tableroPruebaDos[i][j] == 1)
					System.out.print("O  |  ");
				else
					System.out.print("X  |  ");
				
			}
			System.out.println();
			System.out.println(" |_____|_____|_____|");
		}
	}

}
