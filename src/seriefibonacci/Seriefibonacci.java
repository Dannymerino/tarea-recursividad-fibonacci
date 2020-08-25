
package seriefibonacci;

/**
 *
 * @author Danny
 */
public class Seriefibonacci {

     int fibonacci(int n){
    
     if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  
    }
    else if (n==1) {  
        return 1;
    }
    else if (n==0){  
        return 0;
    }
    else{ 
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    }
    
    
    }
    public static void main(String[] args) {
          Seriefibonacci r = new Seriefibonacci();
        int respuesta = r.fibonacci(5);
        
        System.out.println("Elfactorial es: "+respuesta);
        
    }
    
}
