import java.util.Scanner;

public class Act1RepasoArrays {
	public static Scanner teclado=new Scanner(System.in);
	public static final String[] DIAS_SEMANA= {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};

	public static void main(String[] args) {
		
		mostrarSiDiaSemanaEsValido(solicitarDiaSemana());
	}
	
	public static String solicitarDiaSemana() {
		String diaSemana;
		System.out.println("Introduzca un día de la semana: ");
		diaSemana=teclado.nextLine();
		return diaSemana;
	}
	public static void mostrarSiDiaSemanaEsValido(String diaSemana) {
		
		if(comprobarDiaSemana(diaSemana)) {
			System.out.println("El día " + diaSemana + " es válido.");
		}else {
			System.out.println("El día " + diaSemana + " no es válido.");
		}
	}
	public static boolean comprobarDiaSemana(String diaSemana) {
		boolean esValido=false;
		
		for(int i=0;i<DIAS_SEMANA.length && esValido==false;i++) {
			if(DIAS_SEMANA[i].equalsIgnoreCase(diaSemana)) {
				esValido=true;
			}
		}
		return esValido;
	}

}
