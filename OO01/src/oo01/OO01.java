package oo01;

import java.util.Arrays;
//import java.util.Scanner;

public class OO01 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        
        circulo.setlados(5);
        circulo.setletra ('h');
        circulo.setrectilineo(true);
        
        int[] j = new int[2]; 
        j[0] =5;
        j[1] = 5;
        
        circulo.setradios(j);
        
        System.out.println("cantidad de lados: " + circulo.getlados());
        System.out.println("valor de pi: " + circulo.getpi());
        System.out.println("letra: " + circulo.getletra());
        System.out.println("rectilineo: " + circulo.getrectilineo());
        System.out.println("tamaño de radios: " + circulo.getradios()[0]);
        
                  
        Circulo micirculo1 = new Circulo();
        
        int[] l = new int[2]; 
        l[0] = 10;
        l[1] = 10;
        
        micirculo1.setradios(l);
        
        double diametro1 = micirculo1.circunferencia();
                
        System.out.println("el diametro es: " + diametro1);
        
        
                
        Circulo micirculo2 = new Circulo();
        
        int[] g = new int[2]; 
        g[0] = 20;
        g[1] = 20;
        
        micirculo2.setradios(g);
        
        double diametro2 = micirculo2.circunferencia();
                
        System.out.println("el diametro es: " + diametro2);
                   
        }    
     
        
}
    

