package oo01;

public class Circulo {    
   
    private int lados;
    private float pi;
    private String letra;
    private boolean recto;
    private int radios[]; 
    
    public Circulo(){
    lados = 0;
    pi = 3.14f;
    letra = "e";
    recto = false;
    radios = new int[2]; 
    radios[0] =5;
    radios[1] = 5;
    }
    
    public int getlados(){
        return lados;
    }
    
      public float getpi(){
        return pi;
    }
      
      public String getletra(){
        return letra;
    }
      
      public boolean getrecto(){
        return recto;
    }  
    
        public int getradios(){
        return radios[2];
    }
        
        
}


