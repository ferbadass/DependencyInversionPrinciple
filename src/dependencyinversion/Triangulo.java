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
public class Triangulo extends Figura implements IOperacionFigura {
	//declara los datos de la figura
    
	private double base;
	private Double altura;
        
	public Triangulo(String nombre, double base, Double altura) {
		super(nombre);
		this.base=base;
		this.altura=altura;
	}	
        //sobreescribe el metodo Calcular Area a la de un triangulo
	@Override
	public double calcularArea() {
		return (base*altura)/2;
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

