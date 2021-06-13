package graficos;

import java.awt.*;
import java.awt.event.*;

/**
 * Ejercicio 6 interfaces gráficas.
 * @author dinai
 *
 */
public class siete extends MiFrame {

	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private Button btnCount2;
	private int count = 0;
	
	/**
	 * Método para la clase 7.
	 */
	public siete() {
		setLayout(new FlowLayout());
		
		lblCount = new Label("Counter");
		add(lblCount);
		
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		btnCount2 = new Button("Count2");
		add(btnCount2);
		
		BtnCountListener listener = new BtnCountListener();
		btnCount.addActionListener(listener);
		
		BtnCountListener listener2 = new BtnCountListener();
		btnCount2.addActionListener(listener2);
		
		setTitle("Contador con dos botones");
		setSize(300, 100);
		
		setVisible(true);
	}

	/**Método main del ejercicio 7.
	 * @param args
	 */
	public static void main(String[] args) {
		siete app = new siete();

	}

	private class BtnCountListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			++count;
			
			tfCount.setText(count + "");
			
		}
	
    }
	
}