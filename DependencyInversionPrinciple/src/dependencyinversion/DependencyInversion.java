/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package dependencyinversion;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fernanda
 */
public class DependencyInversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IOperacionFigura opeCuadrado = new Cuadrado ("cuadrado",5.0);
        IOperacionFigura opeTriangulo = new Triangulo("triangulo", 4.0, 3.0);
        IOperacionFigura opeRectangulo = new Rectangulo("rectangulo", 4.0, 3.0);
	IOperacionFigura opeCirculo = new Circulo("circulo", 10.0);
        
                
		List<IOperacionFigura> listaOperacion = new ArrayList<IOperacionFigura>();
                listaOperacion.add(opeCuadrado);
		listaOperacion.add(opeTriangulo);
		listaOperacion.add(opeCirculo);
                listaOperacion.add(opeRectangulo);
                
		
		calcularArea(listaOperacion);
	}
	
	public static void calcularArea(List<IOperacionFigura> listaIOperacionFiguras) {
            /**
             * Da un recorrido de los objetos de la lista instaurados en la interfaz
             */
		for (IOperacionFigura opeFigura : listaIOperacionFiguras) {
			
                        System.out.println("O--O--O--O--O--O--O--O--O--O--O--O--O--O--O");
			System.out.println("Nombre de la figura: " + opeFigura.figura().getNombre());
                        System.out.println("Area:  " + opeFigura.calcularArea()+" unidades cuadradas");
                        
                        
		}
                System.out.println("---------------FIGURAS---------------- ");
                System.out.println(" ");
                System.out.println("FIN DEL PROGRAMA");
	}
    }
    
