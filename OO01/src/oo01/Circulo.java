package oo01;

public class Circulo {    
   
    private int lados;
    private float pi;
    private char letra;
    private boolean rectilineo;
    private int radios[]; 
    
    public Circulo(){
    lados = 0;
    pi = 3.14f;
    letra = 'e';
    rectilineo = false;
    radios = new int[2]; 
    radios[0] =5;
    radios[1] = 5;
    }
    
    public void setlados(int lados){
       this.lados =lados;
    }
    
    public int getlados(){
        return lados;
    }
    
    public void setpi(float pi){
       this.pi = pi;
    }
         
    public float getpi(){
        return pi;
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
    
    public void setradios(int[] r){
       this.radios = r;
    }
    
    public int [] getradios(){
        return radios;
    }
        
    public double circunferencia(){
       return (2*pi*radios[0]);
    }  
        
    
              
      
}




