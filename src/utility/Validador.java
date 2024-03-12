package utility;

import Mensajes.CodigosError;
import Mensajes.MensajesError;

import java.util.Scanner;

public class Validador {
    Scanner scanner = new Scanner(System.in);

    MensajesError error = new MensajesError();
    String valIn;
    //Validar formato de entrada
    public String validarFormato(){
        do{
            System.out.print("Bienvenido al comercio galactico, porfavor ingresa el valor que quieres convetir: ");
            valIn = scanner.nextLine();
        } while (!isFormatoValido(valIn));

        return valIn;
    }

    public boolean isFormatoValido(String val){
        //Valida que contenga los caracteres permitidos
        if (!val.matches("[IVXLCDM]+")){
            error.mensajeError(CodigosError.VALOR_INVALIDO);
            return false;
        }

        // Valida que 'D', 'L' y 'V' no se repitan
        if(val.matches(".*[DLV]{2,}.*")){
            error.mensajeError(CodigosError.FORMATO_INVALIDO);
            return false;
        }

        //Valida que 'I', 'X', 'C' y 'M' no se repitan mas de 3 veces seguidas
        if(val.matches(".*[IXCM]{4,}.*")){
            error.mensajeError(CodigosError.FORMATO_INVALIDO);
            return false;
        }

        //Valida que 'I', 'X' y 'C' no se repitan mas de una vez si estan seguidos
        if(val.matches(".*I{2,}(?!V|X).*|.*X{2,}(?!L|C).*|.*C{2,}(?!D|M).*")){
            error.mensajeError(CodigosError.FORMATO_INVALIDO);
            return false;
        }

        return true;
    }
}
