package records;

public class TestRecord {
	public static void main(String[] args) {
		ClienteDto cli = new ClienteDto(175, "Pedro", "Juarez");
		ClienteDto cli2 = new ClienteDto(175, "Pedro", "Juarez");
		
		System.out.println(cli.nombre());
		
		System.out.println(cli);
		
		System.out.println(cli.equals(cli2));
	}
}
