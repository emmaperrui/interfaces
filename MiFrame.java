package graficos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Ejercicio MiFrame para poder usar las interfaces gráficas.
 * @author dinai
 *
 */
@SuppressWarnings("serial")
public class MiFrame extends Frame {
	
	/**
	 * Método para inicalizar la clase.
	 * @param titulo
	 * @param ancho
	 * @param alto
	 * @param x
	 * @param y
	 */
    public MiFrame(String titulo, int ancho, int alto, int x, int y) {
        this.setSize(ancho, alto);
        this.setTitle(titulo);
        this.setVisible(true);
        this.setLocation(x, y);

        //Añadida funcionalidad para cerrar ventana
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    
    /**
     * Método para crear frame.
     * @param titulo
     * @param ancho
     * @param alto
     */
    public MiFrame(String titulo, int ancho, int alto) {
        this(titulo, ancho, alto, 0, 0);
    }
    
    /**
     * Método para crear frame.
     * @param titulo
     */
    public MiFrame(String titulo) {
        this(titulo, 400, 200);
    }
    
    /**
     * Método para crear frame.
     */
    public MiFrame() {
        this("Ventana", 400, 200);
    }

}