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

public class Cuadrado extends Figura implements IOperacionFigura {
	
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}	

	@Override
	public double calcularArea() {
		return Math.pow(lado,2);
	}

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}
