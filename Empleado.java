package streams.auxiliar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Empleado {
	private int idEmpleado;
	private String nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Departamento departamento;
	private double salario;
	
	public Empleado(int idEmpleado, String nif, String nombre, String apellido1, String apellido2,
			Departamento departamento, double salario) {
		this.idEmpleado = idEmpleado;
		this.nif = nif;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.departamento = departamento;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

	
	@Override
	public String toString() {
		return "Empleado(" + idEmpleado + ", " + (nif != null ? nif + ", " : "") + (nombre != null ? nombre + ", " : "")
				+ (apellido1 != null ? apellido1 + ", " : "") + (apellido2 != null ? apellido2 + ", " : "") + salario
				+ ")";
	}

	public static List<Empleado> getEmpleados(){
		Map<Integer, Departamento> mapDptos = new HashMap<>();
		mapDptos.put(1, new Departamento(1, "Desarrollo"));
		mapDptos.put(2, new Departamento(2, "Sistemas"));
		mapDptos.put(3, new Departamento(3, "Recursos Humanos"));
		mapDptos.put(4, new Departamento(4, "Contabilidad"));
		mapDptos.put(5, new Departamento(5, "I+D"));
		mapDptos.put(6, new Departamento(6, "Proyectos"));
		mapDptos.put(7, new Departamento(7, "Publicidad"));
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado(1, "32481596F", "Aarón", "Rivero", "Gómez", mapDptos.get(1), 2077));
		listaEmpleados.add(new Empleado(2, "Y5575632D", "Adela", "Salas", "Díaz", mapDptos.get(2), 2180));
		listaEmpleados.add(new Empleado(3, "R6970642B", "Adolfo", "Rubio", "Flores", mapDptos.get(3), 1736));
		listaEmpleados.add(new Empleado(4, "77705545E", "Adrián", "Suárez", null, mapDptos.get(4), 1378));
		listaEmpleados.add(new Empleado(5, "17087203C", "Marcos", "Loyola", "Méndez", mapDptos.get(5), 1532));
		listaEmpleados.add(new Empleado(6, "38382980M", "María", "Santana", "Moreno", mapDptos.get(1), 1889));
		listaEmpleados.add(new Empleado(7, "80576669X", "Pilar", "Ruiz", null, mapDptos.get(2), 1960));
		listaEmpleados.add(new Empleado(8, "71651431Z", "Pepe", "Ruiz", "Santana", mapDptos.get(3), 2259));
		listaEmpleados.add(new Empleado(9, "56399183D", "Juan", "Gómez", "López", mapDptos.get(2), 1826));
		listaEmpleados.add(new Empleado(10, "46384486H", "Diego", "Flores", "Salas", mapDptos.get(5), 2148));
		listaEmpleados.add(new Empleado(11, "67389283A", "Marta", "Herrera", "Gil", mapDptos.get(1), 2138));
		listaEmpleados.add(new Empleado(12, "41234836R", "Irene", "Salas", "Flores", mapDptos.get(7), 1808));
		listaEmpleados.add(new Empleado(13, "82635162B", "Juan Antonio", "Sáez", "Guerrero", mapDptos.get(3), 2276));
		return listaEmpleados;
	}
}
