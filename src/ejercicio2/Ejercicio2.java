package ejercicio2;

public class Ejercicio2 {
    
    private double saldo;
    private char nivelCuenta;
    
    public Ejercicio2(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
        
    public void actualizarSaldo(double otraCantidad, int signo){   
        saldo += (otraCantidad * signo); 
    }
    
    private void actualizarNivelCuenta(){
        if(saldo >= 1500){
            nivelCuenta = 'C';
        }
        else{
            nivelCuenta = 'B';
        }
    }
    
    @Override
    public String toString(){
        actualizarNivelCuenta();
        return "Su nivel de cuenta es: " + nivelCuenta + "\nSu saldo actual es: "
                + saldo;
    }
    
}
