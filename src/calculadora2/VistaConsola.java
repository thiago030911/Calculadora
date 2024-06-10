package calculadora2;

import java.awt.event.*;
import java.util.Scanner;

public class VistaConsola extends Vista {

    private ActionListener al;

    public VistaConsola(Modelo m) {
        super(m);
    }
    private static final Scanner ENTRADA = new Scanner(System.in);

    @Override
    public void mostrar() {
        System.out.println(getM().getNombreAplicacion());
    }

    @Override
    public Object leerDividendo() {
        System.out.print("Dividendo:");
        return ENTRADA.nextLine();
    }

    @Override
    public Object leerDivisor() {
        System.out.print("Divisor:");
        return ENTRADA.nextLine();
    }

    @Override
    public void mostrarCociente(Object cociente) {
        System.out.println("Cociente: " + cociente);
        System.out.print("Mas cuentas? [S/N]: ");
        String st = ENTRADA.nextLine();
        char opc = (st.length() > 0 ? st.charAt(0) : '0');
        if (opc == 'S' || opc == 's') {
            System.out.println();
            mostrar();
            addCalcularListener(al);
        }
    }

    @Override
    public void addCalcularListener(ActionListener al) {
        this.al = al;
        ActionEvent evt = new ActionEvent(this, 0, "Calcular");
        al.actionPerformed(evt);
    }

    @Override
    public void mostrarException(String exception) {
        System.err.println("ERROR: " + exception);
    }
}
