package com.ieseljust.edd.calc;
import com.ieseljust.edd.calc.Calculadora;

public class Calcula{
    private static float operando1;
    private static float operando2;
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("\nSintaxis incorrecta, necesito 2 números:");
            System.exit(-1);
        }

        operando1 = Float.parseFloat(args[0]);
        operando2 = Float.parseFloat(args[1]);
        Calculadora calc = new Calculadora();
        
        
        System.out.println("La suma entre " + operando1 + " y " + operando2 + " es: " + calc.suma(operando1, operando2));
        System.out.println("La resta entre " + operando1 + " y " + operando2 + " es: " + calc.resta(operando1, operando2));
        System.out.println("La multiplicación entre " + operando1 + " y " + operando2 + " es: " + calc.multiplica(operando1, operando2));
        System.out.println("La división entre " + operando1 + " y " + operando2 + " es: " + calc.divide(operando1, operando2));

    }
}