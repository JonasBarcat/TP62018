/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gianpaolo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entero1;
   int entero2;
   int entero3;
   int entero4;
   int entero5;
   float flotante;
   float flotante1;
   float flotante2;
   float flotante3;
   float flotante4;
   float flotante5;
   float promedio1;
   float promedio2;
   float promedio;
   double doble;
   String cadena;
   
   entero1=2;
   entero2=3;
   entero3=4;
   entero4=5;
   entero5=1;
   flotante1=5f;
   flotante2=4f;
   flotante3=3f;
   flotante4=2f;
   flotante5=1f;
   promedio1=0f;
   promedio2=0f;
   promedio=0f;
   
   
   
   flotante= 10f;
   doble= 15;
   cadena="chau";
   
   int vector[]={entero1,entero2,entero3,entero4,entero5};
   float VECTOR[]={flotante1,flotante2,flotante3,flotante4,flotante5};
   
   
   for(int e:vector){
   System.out.println(e);
   }
   
   
   for(float b:VECTOR){
   promedio1=promedio1+b;
   System.out.println(b);
   }
   promedio2=flotante1+flotante2+flotante3+flotante4+flotante5;
   promedio2= promedio2/5;
   
   promedio1=promedio1/5;
   
   System.out.println("El flotante es: "+flotante+" El double es: "+doble+" La cadena e: "+cadena+"");
   System.out.println("El primer flotante es: "+flotante1+" El segundo flotante es: "+flotante2+" El tercer flotante es: "+flotante3+" el cuarto flotante es: "+flotante4+" el quinto flotante es: "+flotante5);
   System.out.println("El promedio calculado en el FOR es: "+promedio1+" el promedio calculado de forma normal es: "+promedio2);
   
   promedio=CalcularPromedio(flotante1,flotante2,flotante3,flotante4,flotante5);
   
   System.out.println("El promedio calculado mediante el metodo es: "+promedio);
   
    }
    
   public static float CalcularPromedio(float flotante1,float flotante2,float flotante3,float flotante4,float flotante5){
   
    float promedio3=0f;
    float VECTOR[]={flotante1,flotante2,flotante3,flotante4,flotante5};
    
     for(float b:VECTOR){
   promedio3=promedio3+b;
   System.out.println(b);
   }
   promedio3=promedio3/5;    
        
    return promedio3;}
    
   
    
}
