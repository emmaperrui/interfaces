package graficos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

import graficos.MiFrame;

/**
 * Ejercicio 1 interfaces gráficas
 * @author dinai
 *
 */
public class uno {
	
	/**
	 * Método main de la clase 1.
	 * @param args
	 */
	public static void main(String[] args) {
			
				MiFrame ventana1 = new MiFrame("Ventana uno", 500, 500, 600, 200);
				
				
				Panel panel3 = new Panel(new GridLayout(4, 5));
				Panel panel2 = new Panel(new GridLayout(2, 2));
				Panel panel1 = new Panel(new GridLayout(1, 2));
				Panel panel = new Panel(new GridLayout(3, 1));
				Panel panel4 = new Panel(new GridLayout(1, 2));
				Panel panel5 = new Panel(new GridLayout(3, 1));
				Panel panel6 = new Panel(new GridLayout(1, 2));
				Panel panel7 = new Panel(new BorderLayout());
				Panel panel8 = new Panel(new GridLayout(1, 2));
				ventana1.add(panel3);

				Button[] botones = new Button[20];
				
				
				
				
				for(int i = 1; i < 21; i++) {
					if(i==1){
						panel3.add(panel2);
				 			panel2.add(new Button("A"));
				 			panel2.add(new Button("B"));
				 			panel2.add(new Button("C"));
				 			panel2.add(new Button("D"));
					}
					else if(i==5){
						panel3.add(panel1);
				 			panel1.add(new Button("A"));
				 			panel1.add(new Button("B"));
					}
					else if(i==7){
						panel3.add(panel);
						panel.add(new Button("A"));
						panel.add(new Button("B"));
						panel.add(new Button("C"));
					}
					else if(i==10){
						panel3.add(panel4);
						panel4.add(new Button("A"));
						panel4.add(new Button("B"));
					}
					else if(i==13){
						panel3.add(panel5);
						panel5.add(new Button("A"));
						panel5.add(new Button("B"));
						panel5.add(new Button("C"));
					}
					else if(i==15){
						panel3.add(panel6);
						panel6.add(new Button("A"));
						panel6.add(new Button("B"));
					}
					else if(i==19){
						panel3.add(panel7);
						panel7.add(new Button("A"), BorderLayout.NORTH);
						panel7.add(new Button("B"), BorderLayout.WEST);
						panel7.add(new Button("C"), BorderLayout.CENTER);
						panel7.add(new Button("D"), BorderLayout.EAST);
						panel7.add(new Button("E"), BorderLayout.SOUTH);
					}
					else if(i==20){
						panel3.add(panel8);
						panel8.add(new Button("A"));
						panel8.add(new Button("B"));
					}
					else {
						panel3.add(botones[i] = new Button("Boton " + i));
					}
		 			
				}
	}
}
