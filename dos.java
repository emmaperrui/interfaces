package graficos;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 * Ejercicio 2 interfaz gráfica.
 * @author dinai
 *
 */
public class dos extends MiFrame{
	
	private Label lblTitulo;
	
	/**
	 * Método para la clase 2.
	 */
	public dos() {
		
		
		setLayout(new FlowLayout());
		
		lblTitulo = new Label("Registration Form");
		add(lblTitulo);		
		setTitle("Numero mayor");
		setSize(300, 200);
		setLocation(400, 300);
		
		setVisible(true);
	}
	
	/**
	 * Método main del ejercicio 2.
	 * @param args
	 */
	public static void main(String[] args) {

			
		dos app = new dos();
	    
	}
}
