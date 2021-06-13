package graficos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

/**
 * Ejercicio 5 interfaces gráficas.
 * @author dinai
 *
 */
public class cinco extends MiFrame {

    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
    /**
     * Método para la clase 5.
     */
    public cinco() {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);

        setTitle("Contador");
        setSize(300, 100);

        setVisible(true);
    }

    /**
     * Método main del ejercicio 5.
     * @param args
     */
    public static void main(String[] args) {
        cinco app = new cinco();

    }

    private class BtnCountListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ++count;

            tfCount.setText(count + "");

        }

    }

}