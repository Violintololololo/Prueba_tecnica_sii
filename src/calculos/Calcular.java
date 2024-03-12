package calculos;

import constantes.SymbolValue;

public class Calcular {
    public int calcularValor(String roman){
        System.out.println(roman);
        int valTotal = 0;
        int prevVal = 0;

        for (int i = roman.length() - 1; i >= 0; i--){
            int val = SymbolValue.valueOf(String.valueOf(roman.charAt(i))).getVal();

            if(val < prevVal)
                valTotal -= prevVal;
            else
                valTotal += val;

            prevVal = val;
        }
        return valTotal;
    }
}
