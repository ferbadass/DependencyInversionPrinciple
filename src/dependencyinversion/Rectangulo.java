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
public class Rectangulo extends Figura implements IOperacionFigura {
	//declara los datos de la figura
    
	private double base;
	private Double altura;
        
	public Rectangulo(String nombre, double base, Double altura) {
		super(nombre);
		this.base=base;
		this.altura=altura;
	}	
        //sobreescribe el metodo CalcularArea a la de un rectangulo
	@Override
	public double calcularArea() {
		return (base*altura);
	}
        //Se obtienen los datos y se inicializan para su encapsulamiento
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
        //Sobreescribo el método de la figura de la interfaz
	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}
