package calculadora2;

public class ModeloPuntoFlotante extends Modelo {

    public ModeloPuntoFlotante(String nombre) {
        super(nombre);
    }

    @Override
    public Object dividir(Object dividendo, Object divisor) {
        Double cociente = null;
        try {
            cociente
                    = Double.parseDouble(dividendo.toString()) / Double.parseDouble(divisor.toString());
        } catch (NumberFormatException e) {
            reportException(e.getMessage());
        }
        return cociente;
    }
}
