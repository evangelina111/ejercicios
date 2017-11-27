/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class OO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
        System.out.print("cantidad de Lados: " + circulo.cantLados + "\n");
        System.out.print("valor de pi" + circulo.pi + "\n");
        System.out.print("rectilineo " + circulo.recto + "\n");
        System.out.print("tamaño del arreglo: " + (Arrays.toString(circulo.radios)) + "\n");
        
        //circulo.cantLados = 5;
        int h = circulo.getCantLados();
        
        
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.print("cantidad de Lados: " + cuadrado.cantLados + "\n");
        System.out.print("color" + cuadrado.color + "\n");
        System.out.print("rectilineo " + cuadrado.recto + "\n");
        System.out.print("tamaño de los lados: " + (Arrays.toString(cuadrado.tamaño)) + "\n");
        
       
        
        
        
        //La clase triangulo, debe poder construirse pasandole los 6 paramentros. O sea, el contructor de la clase debe poder recibir 6 paramentro.
        
        //Crear los setter y getter en Circulo. (comentar donde se imprimen las propiedades directamente).
        //Crear otra instancia de circulo.
        //Crear un metodo Circunferencia en Circulo, que retorne la Circunferencia del Objeto circulo (dos veces el radio (r) por π).
        //setiar el radio de los circulos en 10 y 20 (Ambos radios en cada circulo).
        
    }
    
}
