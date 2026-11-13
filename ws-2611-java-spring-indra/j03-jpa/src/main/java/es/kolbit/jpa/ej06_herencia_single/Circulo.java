package es.kolbit.jpa.ej06_herencia_single;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CIRCULO")
public class Circulo extends Figura {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "r")
	private double radio;
	
	public Circulo() {
	}
	
	public Circulo(double x, double y, double radio) {
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
		Circulo otro = (Circulo) o;
		return this.radio == otro.radio;
	}

	@Override
	public String toString() {
		return "Circulo (" + radio + ", " + x + ", " + y + ")";
	}
	
	
}
