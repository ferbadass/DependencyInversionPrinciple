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

public class Cuadrado extends Figura implements IOperacionFigura {
	/**
        *Declaración de variables
        */
	private double lado;
        
        /**
        *Constructor
        */
	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}	

         /**
        *Sobreescribe el metodo CalcularArea a la de un cuadrado
        */
	@Override
	public double calcularArea() {
		return Math.pow(lado,2);
	}
        /**
         *Se obtienen los datos y se inicializan para su encapsulamiento
         */
        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }
        /**
         * Sobreescribo el método de la figura de la interfaz
         */
	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}
