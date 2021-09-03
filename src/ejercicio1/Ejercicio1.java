package ejercicio1;

public class Ejercicio1 {
        
    private double base, altura; // Se escribe en una linea dado que tienen mucha relacion entre si
    private double area;
    private boolean esCuadrado;
    private String tipo;
    
    public Ejercicio1(double base, double altura){
        this.base = base;
        this.altura = altura;
        if(base == altura){
            esCuadrado = true;
        }
    }
    
    public void calcularArea(){
        area = base * altura;
    }
    
    public void definirTipo(){
        if(esCuadrado){
            tipo = "Es un cuadrado";
        }
        else{
            tipo = "Es un rectangulo";
        }
    }
    
    @Override
    public String toString(){
        calcularArea();
        definirTipo();
        return "Base: " + base + "\nAltura : " + altura + "\nArea: " + area
                + "\n" + tipo;
    }
    
}
