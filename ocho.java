package graficos;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ejercicio 8 interfaces gráficas.
 * @author dinai
 *
 */
public class ocho {
	
	/**
	 * Método main del ejercicio 8.
	 * @param args
	 */
    public static void main(String[] args) {
        final Frame f = new Frame("Bloc notas");
        f.setSize(300, 400);
        f.setLocation(400, 300);
        final TextArea ta = new TextArea();
        f.add(ta);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }

        });

        MenuBar mb = new MenuBar();
        Menu archivo = new Menu("Archivo");
        Menu editar = new Menu("Editar");
        MenuItem abrir = new MenuItem("Abrir");
        abrir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(f, "guardar", FileDialog.LOAD);
                fd.setVisible(true);
                String strFile = fd.getDirectory() + fd.getFile();
                FileInputStream fis = null;
                if (strFile != null) {
                    try {
                        fis = new FileInputStream(strFile);
                        byte[] buf = new byte[10 * 1024];
                        int len = fis.read(buf);
                        ta.append(new String(buf, 0, len));

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    } finally {
                        try {
                            fis.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }

            }
        });
        MenuItem guardar2 = new MenuItem("Guardar");
        guardar2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                FileDialog fd = new FileDialog(f, "Español", FileDialog.SAVE);
                fd.setVisible(true);
                String path = fd.getDirectory() + fd.getFile() + ".txt";
                FileOutputStream fos = null;
                DataOutputStream dos = null;
                try {
                    fos = new FileOutputStream(path);
                    String sa = ta.getText();
                    dos = new DataOutputStream(fos);
                    dos.writeUTF(sa);

                } catch (Exception e1) {

                    e1.printStackTrace();
                } finally {
                    try {
                        dos.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }

            }
        });
        MenuItem mi4 = new MenuItem("Exit");
        mi4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        MenuItem mi5 = new MenuItem("Copiar");
        MenuItem mi6 = new MenuItem("Pegar");
        archivo.add(abrir);
        archivo.add(guardar2);
        archivo.add(mi4);
        editar.add(mi5);
        editar.add(mi6);
        mb.add(archivo);
        mb.add(editar);
        f.setMenuBar(mb);

    }
}
