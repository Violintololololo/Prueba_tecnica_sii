import asciiArt.Nave;
import calculos.Calcular;
import utility.Limpiarconsola;
import utility.Validador;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Nave nave = new Nave();
    public static Validador validador = new Validador();
    public static Limpiarconsola consola = new Limpiarconsola();
    public static Calcular calcular = new Calcular();
    public static String valIn;

    public static void main(String[] args) throws InterruptedException {
        //Ejecutar animacion
        nave.naveFrame1();
        Thread.sleep(2000);
        consola.borrarConsola();

        //Imprimir texto bienvenida y Validar formato entrada
        valIn = validador.validarFormato();

        //calcular.calcularValor(valIn);
        System.out.println(calcular.calcularValor(valIn));
    }

}