package graficos;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 * Ejercicio 2 interfaz gr�fica.
 * @author dinai
 *
 */
public class dos extends MiFrame{
	
	private Label lblTitulo;
	
	/**
	 * M�todo para la clase 2.
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
	 * M�todo main del ejercicio 2.
	 * @param args
	 */
	public static void main(String[] args) {

			
		dos app = new dos();
	    
	}
}
