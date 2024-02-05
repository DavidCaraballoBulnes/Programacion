import java.util.Random;
import java.util.Scanner;

public class Act4RepasoArrays {
	public static final int NUMERO_MINIMO_COMENSALES = 0;
	public static final int NUMERO_MAXIMO_COMENSALES = 4;
	public static Scanner teclado= new Scanner(System.in);
	public static void main(String[] args) {
		int[] comensalesEnMesas;
		int[] mesas;
		int respuestaComensales;
		
		mesas=crearArrayMesas(solicitarNumeroMesas());
		comensalesEnMesas=crearArrayComensalesEnMesas(mesas.length);
		mostrarArrayEnteros(mesas);
		System.out.println();
		mostrarArrayEnteros(comensalesEnMesas);
		System.out.println();
		
		do {
			respuestaComensales=comensalNuevo(comensalesEnMesas);
		}while(respuestaComensales!=-1);
		
		mostrarArrayEnteros(mesas);
		System.out.println();
		mostrarArrayEnteros(comensalesEnMesas);
	}
	public static int solicitarNumeroMesas() {
		int numeroMesas;
		System.out.println("Introduce el número de mesas: ");
		numeroMesas=Integer.parseInt(teclado.nextLine());
		return numeroMesas;
	}
	public static int solicitarNumeroComensales() {
		int numeroComensales;
		do {
			System.out.println("Introduzca el número de comensales: ");
			numeroComensales=Integer.parseInt(teclado.nextLine());
			if(!validarNumeroComensales(numeroComensales)) {
				System.out.println("Lo siento, no admitimos grupos de " +numeroComensales +", haga grupos de "+ NUMERO_MAXIMO_COMENSALES +" personas como máximo e intente de nuevo.");
			}
		}while(!validarNumeroComensales(numeroComensales));
		return numeroComensales;
	}
	public static boolean validarNumeroComensales(int numero) {
		return numero>=NUMERO_MINIMO_COMENSALES&&numero<=NUMERO_MAXIMO_COMENSALES || numero==(-1) ;
	}
	public static int[] crearArrayComensalesEnMesas(int numeroMesas){
		int[] array=new int[numeroMesas];
		Random serieAleatoria=new Random();
		
		for(int i=0;i<array.length;i++){
			array[i]=serieAleatoria.nextInt(NUMERO_MAXIMO_COMENSALES) + 1;
		}
		
		return array;
	}
	public static int[] crearArrayMesas(int numeroMesas) {
		int[] mesas=new int[numeroMesas];
		for(int i=0;i<mesas.length;i++){
			mesas[i]=(i+1);
		}
		return mesas;
	}
	public static void mostrarArrayEnteros(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int comensalNuevo(int[] comensalesEnMesas) {
		int numeroComensales;
		boolean comensalesSentadosCorrectamente=false;
		
		numeroComensales=solicitarNumeroComensales();
		
		if(numeroComensales==-1) {
			System.out.println("Gracias. Hasta pronto.");
		}else {
			for(int i=0;i<comensalesEnMesas.length && comensalesSentadosCorrectamente==false;i++) {
				if(comensalesEnMesas[i]==0) {
					System.out.println("Por favor, siéntense en la mesa número" +(i+1) +".");
					comensalesEnMesas[i]+=numeroComensales;
					comensalesSentadosCorrectamente=true;
				}else {
					if(comensalesEnMesas[i]+numeroComensales<=NUMERO_MAXIMO_COMENSALES) {
						System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " +(i+1) +".");
						comensalesEnMesas[i]+=numeroComensales;
						comensalesSentadosCorrectamente=true;
					}
				}
				
			}
		}
		return numeroComensales;
	}
	

}
