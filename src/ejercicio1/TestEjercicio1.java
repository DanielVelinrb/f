package ejercicio1;
import java.util.Scanner;

public class TestEjercicio1 {
    
    public static void main(String[] args) {
        
        double base = 0;
        double altura = 0;
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Ingrese el valor de la base de la figura");
        while(base <= 0){
            base  = entrada.nextDouble();
            
            if(base <= 0){
                System.out.println("ERROR. VALOR NO VALIDO. TRATE DE NUEVO.");
            }
        }
        
        System.out.println("Ingrese el valor de la altura de la figura.");
        while(altura <= 0){
            altura  = entrada.nextDouble();
            
            if(altura <= 0){
                System.out.println("ERROR. VALOR NO VALIDO. TRATE DE NUEVO");
            }
        }
        
        Ejercicio1 rectangulo = new Ejercicio1(base, altura);
        System.out.println(rectangulo.toString());
        
    }
    
}
