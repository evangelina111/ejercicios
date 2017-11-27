package oo01;

import java.util.Arrays;
import java.util.Scanner;

public class OO01 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        
        System.out.println("cantidad de lados: " + (circulo.getlados()));
        System.out.println("valor de pi: " + (circulo.getpi()));
        System.out.println("letra: " + (circulo.getletra()));
        System.out.println("recto: " + (circulo.getrecto()));
        System.out.println("tamaño de radios: " + (Arrays.toString(circulo.getradios())));
        
         
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.print("cantidad de lados: " + cuadrado.cantLados + "\n");
        System.out.print("color" + cuadrado.color + "\n");
        System.out.print("rectilineo " + cuadrado.recto + "\n");
        System.out.print("tamaño de los lados: " + (Arrays.toString(cuadrado.tamaño)) + "\n");
        

       Circulo circunferencia = new Circulo();
        
       int radio;         
        Scanner entrada = new Scanner( System.in );
        
        System.out.print( "Digite el radio del círculo: ");
        radio = entrada.nextInt();
        
        System.out.printf( "La circunferencia del círculo es: %f.", ( 2 * Math.PI * radio ) );
                
        }    
        
        //La clase triangulo, debe poder construirse pasandole los 6 paramentros. O sea, el contructor de la clase debe poder recibir 6 paramentro.
        
        //Crear los setter y getter en Circulo. (comentar donde se imprimen las propiedades directamente).
        //Crear otra instancia de circulo.
        //Crear un metodo Circunferencia en Circulo, que retorne la Circunferencia del Objeto circulo (dos veces el radio (r) por π).
        //setiar el radio de los circulos en 10 y 20 (Ambos radios en cada circulo).
        
}
    

