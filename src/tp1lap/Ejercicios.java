package tp1lap;

public class Ejercicios {

	/*
	 * Realiza la suma algebraica entre los operadores
	 * 
	 */
	public static int suma(int a, int b) {
		return a + b;
	}

	/*
	 * Devolver el máximo valor
	 */
	public static double maximo(double a, double b) {
		return a > b ? a : b;
	}

	/*
	 * Devolver el máximo valor
	 */
	public static double maximo(double a, double b, double c) {
		double ab = maximo(a, b);
		return ab > c ? ab : c;
	}

	/*
	 * Devolver el máximo valor
	 */
	public static int maximo(int... valores) {
		int max = valores[0];
		for (int i = 1; i < valores.length; i++) {
			max = valores[i] > max ? valores[i] : max;
		}
		return max;
	}

	/*
	 * Devolver el valor absoluto
	 */
	public static float valorAbsoluto(float valor) {
		return valor >= 0 ? valor : -valor;
	}

	/*
	 * Devolver verdadero se el valor es par
	 */
	public static boolean esPar(int valor) {
		return valor % 2 == 0 ? true : false;
	}

	/*
	 * Indicar si el año recibido como paremtro es bisiesto. Son bisisetos los años
	 * divisibles por cuatro que no sean divisibles por cien, los años divisibles
	 * por cuatrocientos son siempre bisiestos.
	 */
	public static boolean esBisiesto(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			return true;
		}
		return false;
	}

	/*
	 * Devolver la cantidad de días que tien cada mes, 28 para el mes de febrero
	 */
	public static int cantidadDias(int mes) {
		int dias;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 2:
			dias = 28;
			break;
		default:
			dias = 0;
			break;
		}
		return dias;
	}

	/*
	 * Convierte temperatura expresada en Fahrenheit a centígrados
	 * 
	 */
	public static float fahrenheitToCelsius(float fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	/*
	 * Convierte temperatura expresada en centígrados a Fahrenheit
	 */
	public static float celsiusToFahrenheit(float celsius) {
		return celsius * 9 / 5 + 32;
	}

	/*
	 * Numero del día de la semana según la norma ISO8601 domingo=7, lunes=1,
	 * martes=2,..., sabado=6 En minúsculas y sin tilde
	 */
	public static String diaSemana(int numeroDia) {
		String dia;
		switch (numeroDia) {
		case 1:
			dia = "lunes";
			break;
		case 2:
			dia = "martes";
			break;
		case 3:
			dia = "miercoles";
			break;
		case 4:
			dia = "jueves";
			break;
		case 5:
			dia = "viernes";
			break;
		case 6:
			dia = "sabado";
			break;
		case 7:
			dia = "domingo";
			break;
		default:
			dia = "";
			break;
		}
		return dia;
	}

	/*
	 * Devuelve la suma acumulada de los números de 1 a n
	 */
	public static int sumaAcumulada(int n) {
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma = suma + i;
		}
		return suma;
	}

	/*
	 * Devuelve el factorial de n
	 */
	public static int factorial(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		return n < 0 ? 0 : fac;
	}

	/*
	 * Devuelve el valor promedio de los números informadoa
	 */
	public static float promedio(int[] valores) {
		int suma = 0;
		for (int i = 0; i < valores.length; i++) {
			suma = suma + valores[i];
		}
		return (float) suma / valores.length;
	}

	/*
	 * Devuelve verdadero si la matriz informada es simétrica
	 */
	public static boolean esSimetrica(int[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if (valores[i][j] != valores[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * Devuelve el enésimo valor de la sucesión de fibonacci
	 */
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n > 1) {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		return 0;
	}

	/*
	 * Recibe una matriz de tres por tres y devuelve verdadero si algun jugador hizo
	 * ta-te-ti, las letras usadas son o y x
	 */
	public static boolean hayTaTeTi(char[][] tablero) {
		int[] o = {0,0,0,0,0,0,0,0}; 
		int[] x = {0,0,0,0,0,0,0,0}; 
		if (tablero[0][0] == 'o') {
			o[0]++;
			o[3]++;
			o[6]++;
		}
		if (tablero[0][1] == 'o') {
			o[0]++;
			o[4]++;			
		}
		if (tablero[0][2] == 'o') {
			o[0]++;
			o[5]++;
			o[7]++;			
		}
		if (tablero[1][0] == 'o') {
			o[1]++;
			o[3]++;
		}
		if (tablero[1][1] == 'o') {
			o[1]++;
			o[4]++;
			o[6]++;
			o[7]++;
		}
		if (tablero[1][2] == 'o') {
			o[1]++;
			o[5]++;
		}
		if (tablero[2][0] == 'o') {
			o[2]++;
			o[3]++;
			o[7]++;
		}
		if (tablero[2][1] == 'o') {
			o[2]++;
			o[4]++;
		}
		if (tablero[2][2] == 'o') {
			o[2]++;
			o[5]++;
			o[6]++;
		}
		for (int i = 0; i < o.length; i++) {
			if (o[i] == 3) {
				return true;
			}			
		}

		if (tablero[0][0] == 'x') {
			x[0]++;
			x[3]++;
			x[6]++;
		}
		if (tablero[0][1] == 'x') {
			x[0]++;
			x[4]++;			
		}
		if (tablero[0][2] == 'x') {
			x[0]++;
			x[5]++;
			x[7]++;			
		}
		if (tablero[1][0] == 'x') {
			x[1]++;
			x[3]++;
		}
		if (tablero[1][1] == 'x') {
			x[1]++;
			x[4]++;
			x[6]++;
			x[7]++;
		}
		if (tablero[1][2] == 'x') {
			x[1]++;
			x[5]++;
		}
		if (tablero[2][0] == 'x') {
			x[2]++;
			x[3]++;
			x[7]++;
		}
		if (tablero[2][1] == 'x') {
			x[2]++;
			x[4]++;
		}
		if (tablero[2][2] == 'x') {
			x[2]++;
			x[5]++;
			x[6]++;
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 3) {
				return true;
			}			
		}		
		return false;
	}

}
