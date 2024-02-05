import java.util.Scanner;

public class Act2RepasoArrays {
public static Scanner teclado= new Scanner(System.in);
public static int MAXIMO_PALABRAS_ARRAY=8;
public static String[] COLORES= {"VERDE","ROJO","BLANCO", "NEGRO", "AZUL","AMARILLO", "ROSA"};
	public static void main(String[] args) {
		String[] palabras=new String[MAXIMO_PALABRAS_ARRAY];
		solicitarpalabrasYMeterlasEnArray(palabras);
		mostrarArray(ordenarArrayPorColores(palabras));
	}
	
	public static void solicitarpalabrasYMeterlasEnArray(String[] palabras) {
		System.out.println("Escribe la primera palabra");
		
		for(int i=0;i<palabras.length;i++) {
			System.out.println("Escribe una palabra (" + (i+1) + "/" + MAXIMO_PALABRAS_ARRAY + "): ");
			palabras[i]=teclado.nextLine().toUpperCase();
		}
	}
	
	public static void mostrarArray(String[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	
//	public static String[] prueba(String[] array) {
//		String[] auxiliar=new String[MAXIMO_PALABRAS_ARRAY];
//		boolean esIgual=false;
//		int contadorArrayAuxiliar=0;
//		
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<COLORES.length && esIgual==false;j++) {
//				if(COLORES[j].equals(array[i])) {
//					esIgual=true;
//					auxiliar[contadorArrayAuxiliar]=array[i];
//					contadorArrayAuxiliar++;
//				}
//			}
//			esIgual=false;
//		}
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<COLORES.length && esIgual==false;j++) {
//				if(COLORES[j].equals(array[i])) {
//					esIgual=true;
//				}
//			}
//			if(esIgual==false) {
//				auxiliar[contadorArrayAuxiliar]=array[i];
//				contadorArrayAuxiliar++;
//			}else {
//				esIgual=false;
//			}
//		}
//		return auxiliar;
//		
//	}
	
	public static String[] ordenarArrayPorColores(String[] array) {
		String[] auxiliar=new String[MAXIMO_PALABRAS_ARRAY];
		boolean esIgual=false;
		int contadorArrayOriginal=0;
		int contadorArrayAuxiliar=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<COLORES.length && esIgual==false;j++) {
				if(COLORES[j].equals(array[i])) {
					esIgual=true;
					array[contadorArrayOriginal]=array[i];
					contadorArrayOriginal++;
				}
			}
			if(esIgual==false) {
				auxiliar[contadorArrayAuxiliar]=array[i];
				contadorArrayAuxiliar++;
			}
			esIgual=false;
		}
		for(int i=0;contadorArrayOriginal<array.length;i++,contadorArrayOriginal++) {
			array[contadorArrayOriginal]=auxiliar[i];
		}
		return array;
	}
}
