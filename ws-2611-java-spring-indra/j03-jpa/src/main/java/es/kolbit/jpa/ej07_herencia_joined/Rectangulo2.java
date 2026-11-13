package es.kolbit.jpa.ej07_herencia_joined;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rectangulo_02")
public class Rectangulo2 extends Figura2 {
	private static final long serialVersionUID = 1L;

	@Column(name = "l1")
	private double lado1;
	
	@Column(name = "l2")
	private double lado2;
	
	public Rectangulo2() {
	}
	
	public Rectangulo2(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double area() {
		return lado1 * lado2;
	}
	
	public double perimetro() {
		return 2 * (lado1 + lado2);
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String toString() {
		return "Rect[" + x + ", " + y + ", " + lado1 + ", " + lado2 + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Rectangulo2 otro = (Rectangulo2) o;
		return this.lado1 == otro.lado1 && this.lado2 == otro.lado2 ||
			   this.lado1 == otro.lado2 && this.lado2 == otro.lado1 ;
	}
}
