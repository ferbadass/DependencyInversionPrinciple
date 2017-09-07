/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinversion;

/**
 *
 * @author almaangelica
 */


public class Circulo extends Figura implements IOperacionFigura {

	private double radio;

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}

