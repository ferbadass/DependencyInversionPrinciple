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
public class Triangulo extends Figura implements IOperacionFigura {
	//declara los datos de la figura
    
	private double base;
	private Double altura;
        
	public Triangulo(String nombre, double base, Double altura) {
		super(nombre);
		this.base=base;
		this.altura=altura;
	}	
        /**
        *Sobreescribe el metodo CalcularArea a la de un triangulo
        */
	@Override
	public double calcularArea() {
		return (base*altura)/2;
	}
        /**
         *Se obtienen los datos y se inicializan para su encapsulamiento
         */
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
        /**
         * Sobreescribo el método de la figura de la interfaz
         */
	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}

