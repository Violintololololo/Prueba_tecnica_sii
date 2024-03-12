package Mensajes;

public class MensajesError {
    public void mensajeError(CodigosError error){
        System.out.println(getError(error));
    }

    public String getError(CodigosError error){

        return switch (error) {
            case VALOR_INVALIDO -> "El valor ingresado es invalido";
            case VALOR_NO_INGRESADO -> "Dato de entrada vacio";
            case FORMATO_INVALIDO -> "El dato ingresado no cumple los parametros";
            case NI_IDEA -> "No tengo idea de que me esta hablando";
            default -> null;
        };
    }
}
