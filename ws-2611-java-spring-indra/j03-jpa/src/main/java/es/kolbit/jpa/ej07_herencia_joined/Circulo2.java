package es.kolbit.jpa.ej07_herencia_joined;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "circulo_02")
public class Circulo2 extends Figura2 {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "r")
	private double radio;
	
	public Circulo2() {
	}
	
	public Circulo2(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	@Override
	public double area() {
		return Math.PI * radio * radio;
	}
	
	public double perimetro() {
		return Math.PI * 2 * radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Circulo2 otro = (Circulo2) o;
		return this.radio == otro.radio;
	}

	@Override
	public String toString() {
		return "Circulo (" + radio + ", " + x + ", " + y + ")";
	}
	
	
}
