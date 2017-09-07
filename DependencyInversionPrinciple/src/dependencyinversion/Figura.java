/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
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
