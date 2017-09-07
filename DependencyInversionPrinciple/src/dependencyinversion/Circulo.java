/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package dependencyinversion;

/**
 *
 * @author Fernanda
 */


public class Circulo extends Figura implements IOperacionFigura {
        /**
        *Declaración de variables
        */
	private double radio;
        
        /**
        *Constructor
        */
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	
        /**
        *Sobreescribe el metodo CalcularArea a la de un circulo
        */
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
        /**
         *Se obtienen los datos y se inicializan para su encapsulamiento
         */
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
        /**
         * Sobreescribo el método de la figura de la interfaz
         */
	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}

