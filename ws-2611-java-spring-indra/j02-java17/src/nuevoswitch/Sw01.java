package nuevoswitch;

public class Sw01 {
	public static void main(String[] args) {
		
		int nroDia = 3;
		String dia = "";
		
		switch(nroDia) {
		case 1:
			dia = "lunes";
			break;
		case 2:
			dia = "martes";
			break;
		case 3:
			dia = "miercoles";
			break;
		}
		System.out.println(dia);
		
		dia = switch(nroDia) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miercoles";
		default -> "error";
		};
		System.out.println(dia);
		
		
		switch(nroDia) {
		case 1 -> System.out.println("lunes");
		case 2 -> System.out.println("martes");
		case 3 -> System.out.println("miercoles");
		}
	}
}
