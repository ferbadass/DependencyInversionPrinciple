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
public class Figura  {
	//nombre es el unico atributo que comparten todas las figuras que haremos
    //asi que se heredara de la clase padre figura
	private String nombre;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
