package calculadora2;

import java.awt.event.*;

public class Controlador {

    private final Modelo m;
    private final Vista v;

    public Controlador(Modelo m, Vista v) {
        this.m = m;
        this.v = v;
    }

    public void start() {
        m.setNombreAplicacion("MVC - " + m.getNombreAplicacion());
        v.mostrar();
        v.addCalcularListener(new CalcularListener());
    }

    private class CalcularListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Object cociente = m.dividir(v.leerDividendo(), v.leerDivisor());
            if (cociente != null) {
                v.mostrarCociente(cociente);
            }
        }
    }
}
