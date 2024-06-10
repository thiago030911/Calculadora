package calculadora2;

import java.awt.event.ActionListener;
import javax.swing.*;

public class VistaSwing extends Vista {

    private final JFrame marco;
    private final JPanel panel;
    private final JTextField dividendo;
    private final JTextField divisor;
    private final JTextField resultado;
    private final JButton botonCalcular;

    public VistaSwing(Modelo m) {
        super(m);
        marco = new JFrame();
        marco.setResizable(false);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dividendo = new JTextField(10);
        divisor = new JTextField(10);
        botonCalcular = new JButton("/");
        resultado = new JTextField(15);
        panel = new JPanel();
        panel.add(dividendo);
        panel.add(divisor);
        panel.add(botonCalcular);
        panel.add(resultado);
    }

    @Override
    public Object leerDividendo() {
        return dividendo.getText();
    }

    @Override
    public Object leerDivisor() {
        return divisor.getText();
    }

    @Override
    public void mostrarCociente(Object cociente) {
        resultado.setText(cociente.toString());
    }

    @Override
    public void addCalcularListener(ActionListener al) {
        botonCalcular.addActionListener(al);
    }

    @Override
    public void mostrarException(String exception) {
        JOptionPane.showMessageDialog(null, "ERROR: " + exception,
                "Vista de Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrar() {
        marco.setTitle(getM().getNombreAplicacion());
        marco.setContentPane(panel);
        marco.pack();
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
}
