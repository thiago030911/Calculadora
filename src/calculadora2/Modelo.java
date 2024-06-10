package calculadora2;

import java.awt.event.*;

public abstract class Modelo {

    private ActionListener listener;
    private String nombreAplicacion;

    public Modelo(String nombre) {
        nombreAplicacion = nombre;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public abstract Object dividir(Object dividendo, Object divisor);

    protected void reportException(String exception) {
        if (listener != null) {
            ActionEvent evt = new ActionEvent(this, 0, exception);
            listener.actionPerformed(evt);
        }
    }

    public void addExceptionListener(ActionListener listener) {
        this.listener = listener;
    }
}
