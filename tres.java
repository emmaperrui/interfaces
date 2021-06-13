package graficos;

import java.awt.*;
import java.awt.event.*;

/**
 * Ejercicio 3 interfaces gráficas.
 * @author dinai
 *
 */
public class tres extends MiFrame {

	
	private TextField tf;
	
	/**
	 * Método para la clase 3.
	 */
	public tres() {
		setLayout(new FlowLayout());
				
		tf = new TextField("", 10);
		tf.setEditable(false);
		add(tf);
		
		 Button A = new Button("A");
		 add(A);
	     Button B = new Button("B");
	     add(B);
	     
	      A.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 tf.setText("Boton A clicado");
	         }
	      });

	      B.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 tf.setText("Boton B clicado");
	         }
	      });
		
		
		setTitle("Que boton pulse");
		setSize(300, 100);
		setLocation(400, 300);	
		setVisible(true);
	}

	/**
	 * Método main para el ejercicio 3.
	 * @param args
	 */
	public static void main(String[] args) {
		tres app = new tres();

	}
	
}
