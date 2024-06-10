package calculadora2;

import javax.swing.*;

public class Main {

    public static void main(String args[]) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Modelo m = null;
        int opcion = JOptionPane.showOptionDialog(
                null, "Que modelo desea usar?", "MVC",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new String[]{"Entero", "Punto flotante", "Salir"}, "Entero");
        switch (opcion) {
            case 0 -> m = new ModeloEntero("Cociente Entero");
            case 1 -> m = new ModeloPuntoFlotante("Cociente Punto flotante");
            case 2 -> System.exit(0);
        }
        Vista v = null;
        opcion = JOptionPane.showOptionDialog(
                null, "Que vista desea usar?", "MVC",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new String[]{"Consola", "Swing", "Salir"}, "Consola");
        switch (opcion) {
            case 0 -> v = new VistaConsola(m);
            case 1 -> v = new VistaSwing(m);
            case 2 -> System.exit(0);
        }
        Controlador c = new Controlador(m, v);
        c.start();
    }
}
