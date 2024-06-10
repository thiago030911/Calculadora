package calculadora2;

import java.awt.event.*;

public abstract class Vista {

    private final Modelo m;

    public Modelo getM() {
        return m;
    }

    public Vista(Modelo m) {
        this.m = m;
        this.m.addExceptionListener(new ExceptionListener());
    }

    public abstract void mostrar();

    public abstract Object leerDividendo();

    public abstract Object leerDivisor();

    public abstract void mostrarCociente(Object cociente);

    public abstract void mostrarException(String exception);

    public abstract void addCalcularListener(ActionListener al);

    private class ExceptionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            mostrarException(event.getActionCommand());
        }
    }
}
