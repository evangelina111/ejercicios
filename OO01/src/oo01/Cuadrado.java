/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

import java.awt.Color;




/**
 *
 * @author cecla
 */
public class Cuadrado {
    int cantLados;
    Color color;
    String letra;
    boolean recto;
    int tamaño[];   

    public Cuadrado(){
    cantLados = 4;
    color = Color.blue;
    letra = "e";
    recto = false;
    tamaño = new int[4]; //tamaño del arreglo es 3 elementos
    tamaño[0] = 10;
    tamaño[1] = 10;
    tamaño[2] = 10;
    tamaño[3] = 10;
    }
}