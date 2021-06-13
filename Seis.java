package graficos;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Ejercicio 6 interfaces gráficas.
 * @author dinai
 *
 */
public class Seis extends MiFrame {
	String acumulado = "";
	String nombre = "";
	
	/**
	 * Método para la clase 6.
	 */
	public Seis() {
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(2, 1));
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		add(panel);
		TextField tf = new TextField("", 50);
		panel.add(panel2);
		panel.add(panel1);
		panel2.add(tf);
		panel1.setLayout(new GridLayout(4, 5));

		Button button1 = new Button("7");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "7");

			}
		});

		Button button2 = new Button("8");
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "8");

			}
		});
		Button button3 = new Button("9");
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "9");

			}
		});

		Button button4 = new Button("4");
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "4");

			}
		});

		Button button5 = new Button("5");
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "5");

			}
		});

		Button button6 = new Button("6");
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "6");

			}
		});

		Button button7 = new Button("1");
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "1");

			}
		});

		Button button8 = new Button("2");
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "2");

			}
		});

		Button button9 = new Button("3");
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "3");

			}
		});

		Button button0 = new Button("0");
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acumulado = tf.getText();
				tf.setText(acumulado + "0");

			}
		});

		Button buttonC = new Button("Clear");
		buttonC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");

			}
		});

		Button buttonCall = new Button("Call");
		Button buttonH = new Button("Hang Up");
		buttonCall.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonCall) {
					buttonCall.setVisible(false);
					panel1.add(buttonH);
				}

			}
		});

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(button7);
		panel1.add(button8);
		panel1.add(button9);
		panel1.add(buttonC);
		panel1.add(button0);
		panel1.add(buttonCall);

		setTitle("Telefono");
		setSize(450, 350);
		setLocation(400, 300);
		setVisible(true);

	}
	
	/**
	 * Método main del ejercicio 6.
	 * @param args
	 */
	public static void main(String[] args) {
		Seis app = new Seis();

	}

	private class BtnCountListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}
}
