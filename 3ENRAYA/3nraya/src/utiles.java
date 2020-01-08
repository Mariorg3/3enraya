public class utiles {

	public static void MostrarTableros(int casilla1, int casilla2, int casilla3, int casilla4, int casilla6,
			int casilla7, int casilla8, int casilla9) {
		int[][] tableroPruebaUno = { { casilla7, casilla8, casilla9 }, { casilla4, 1, casilla6 },
				{ casilla1, casilla2, casilla3 } };
		System.out.println("  _________________");
		for (int i = 0; i < tableroPruebaUno.length; i++) {
			System.out.println(" |     |     |     |");
			System.out.print(" |  ");

			for (int j = 0; j < tableroPruebaUno[i].length; j++) {
				if (tableroPruebaUno[i][j] == 0)
					System.out.print("   |  ");
				else if (tableroPruebaUno[i][j] == 1)
					System.out.print("O  |  ");
				else
					System.out.print("X  |  ");

			}
			System.out.println();
			System.out.println(" |_____|_____|_____|");
		}
	}

	public static int pedirPosicion() {
		int matriz[][] = { { 7, 8, 9 }, 
						   { 4, 0, 6 }, 
				           { 1, 2, 3 }  };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
	
		}
		System.out.println("Que posicion quieres?");
		int casilla = Leer.entero();
		return casilla;
//		if (casilla == 1) {
//			casilla1 = turno;
//		}
//		if (casilla == 2) {
//			casilla2 = turno;
//		}
//		if (casilla == 3) {
//			casilla3 = turno;
//		}
//		if (casilla == 4) {
//			casilla4 = turno;
//		}
//		if (casilla == 6) {
//			casilla6 = turno;
//		}
//		if (casilla == 7) {
//			casilla7 = turno;
//		}
//		if (casilla == 8) {
//			casilla8 = turno;
//		}
//		if (casilla == 9) {
//			casilla9 = turno;
//		}
	}

}