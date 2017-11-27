package oo01;

import java.awt.Color;

public class Cuadrado {
    int cantLados;
    Color color;
    char letra;
    boolean rectilineo;
    int tamaño[];   

    public Cuadrado(){
    cantLados = 4;
    color = Color.blue;
    letra = 'e';
    rectilineo = false;
    tamaño = new int[4]; 
    tamaño[0] = 10;
    tamaño[1] = 10;
    tamaño[2] = 10;
    tamaño[3] = 10;
    }
        
    public void setcantLados(int cantLados){
       this.cantLados =cantLados;
    }
    
    public int getcantLados(){
        return cantLados;
    }
    
    public void setpi(float pi){
       //this.pi = pi;
    }
         
    public float getpi(){
        return 0;
        //return pi;
    }
    
    public void setletra(char letra){
       this.letra = letra;
    }
    
    public char getletra(){
        return letra;
    }
      
    public void setrectilineo(boolean rectilineo){
       this.rectilineo = rectilineo;
    }
    
    public boolean getrectilineo(){
        return rectilineo;
    }  
    
    public void setradios(int[] radios){
       //this.radios = radios;
    }
    
    public int getradios(){
        return 0;
        //return radios[2];
    } 
    }

