package es.kolbit.jpa.ej06_herencia_single;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "figuras01")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_figura", discriminatorType = DiscriminatorType.STRING)
public abstract class Figura implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfigura")
	protected int idFigura;
	protected double x;
	protected double y;
	
	public Figura() {
		super();
	}
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static void saludaFigura() {
		System.out.println("Soy la clase figura");
	}
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public double distancia(Figura otra) {
		return Math.sqrt(Math.pow(this.x - otra.x, 2) + Math.pow(this.y - otra.y, 2));
	}
	
	public int getIdFigura() {
		return idFigura;
	}

	public void setIdFigura(int idFigura) {
		this.idFigura = idFigura;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Figura otra = (Figura)o;
		return this.x == otra.x && this.y == otra.y;
	}
}
