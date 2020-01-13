package repositorios;
import java.util.Scanner;
public class repositorio1 {
      public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String cadena;
          int cont=0;
 
          System.out.println("Introduzca una cadena de digitos caracteres y espacios");
            cadena = teclado.nextLine();
            
          
            
                   
            
           for (int i = 0; i < cadena.length(); i++) {
              if(Character.isDigit(cadena.charAt(i))){
                  cont++;
                  System.out.println("Esto es un digito en la posicion\t"+i);
              }else if(Character.isLetter(cadena.charAt(i))){
                    System.out.println("Esto es un numero en la posicion\t"+i);
              }else if(Character.isWhitespace(cadena.charAt(i))){
                    System.out.println("Esto es un espacio en la posicion\t"+i);
              
              }else{
               
              
              }
              
             
          }
           if(cont == cadena.length())
               System.out.println("El numero es\t "+cadena);
   }
}