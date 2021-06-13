package graficos;

import java.awt.*;
import java.awt.event.*;

/**
 * Ejercicio 4 interfaces gráficas.
 * @author dinai
 *
 */
public class cuatro extends MiFrame {

	private Label lblCount;
	private Label lblCount1;
	private Button btnCount;;
	private TextField frstint;
	private TextField scdint;
	private TextField rsltint;
	
	/**
	 * Método para la clase 4.
	 */
	public cuatro() {
		setLayout(new FlowLayout());
		
		lblCount = new Label("Primer numero");
		add(lblCount);
		
		frstint = new TextField(10);
		add(frstint);
		
		frstint.addActionListener(new BtnCountListener());
		
		lblCount1 = new Label("Segundo numero");
		add(lblCount1);
		
		scdint = new TextField(10);
		add(scdint);
		
		scdint.addActionListener(new BtnCountListener());
		
		rsltint = new TextField(10);
		rsltint.setEditable(false);
		add(rsltint);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		BtnCountListener listener = new BtnCountListener();
		btnCount.addActionListener(listener);
		
		setTitle("Numero mayor");
		setSize(300, 200);
		setLocation(400, 300);
		
		setVisible(true);
	}
	
	

	/**
	 * Método main del ejercicio 4.
	 * @param args
	 */
	public static void main(String[] args) {
		cuatro app = new cuatro();

	}

	private class BtnCountListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int numberIn = Integer.parseInt(frstint.getText());
			int numberInt = Integer.parseInt(scdint.getText());
			if(numberIn < numberInt) {
				rsltint.setText(numberInt + "");
			}
			else {
				rsltint.setText(numberIn + "");
			}
			
		}
		public void mouseClicked(MouseEvent evt) {
			int numberInt = Integer.parseInt(scdint.getText());
		    if (evt.getClickCount() == 3) {
		    } else if (evt.getClickCount() == 2) {
		    	rsltint.setText(numberInt + "");
		    }
		}
		
    }
	
}
