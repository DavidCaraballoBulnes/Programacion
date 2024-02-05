import java.util.Random;

public class Act3RepasoArrays {
	public static final int NUMEROS_ARRAY = 15;
	public static final int MAXIMO_NUMERO_ALEATORIO=500;

	public static void main(String[] args) {
		int[] array;
		array=crearArrayAleatorio();
		mostrarArrayEnteros(array);
		cincuerizarArray(array);
		System.out.println();
		mostrarArrayEnteros(array);
	}
	
	public static int[] crearArrayAleatorio(){
		int[] array=new int[NUMEROS_ARRAY];
		Random serieAleatoria=new Random();
		
		for(int i=0;i<array.length;i++){
			array[i]=serieAleatoria.nextInt(MAXIMO_NUMERO_ALEATORIO) + 1;
		}
		
		return array;
	}
	
	public static void cincuerizarArray(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			if(!isNumeroMultiplo5(array[i])) {
					array[i]+=5-(array[i]%5);
			}
		}
	}
	
	public static boolean isNumeroMultiplo5(int numero) {
		return (numero%5==0);
	}
	public static void mostrarArrayEnteros(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
}
