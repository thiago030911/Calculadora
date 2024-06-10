package calculadora2;

public class ModeloEntero extends Modelo {

    public ModeloEntero(String nombre) {
        super(nombre);
    }

    @Override
    public Object dividir(Object dividendo, Object divisor) {
        Integer cociente = null;
        try {
            cociente
                    = Integer.parseInt(dividendo.toString()) / Integer.parseInt(divisor.toString());
        } catch (NumberFormatException e) {
            reportException(e.getMessage());
        }
        return cociente;
    }
}
