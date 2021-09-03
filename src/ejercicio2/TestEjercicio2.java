package ejercicio2;
import java.util.Scanner;

public class TestEjercicio2 {
    
    public static void main(String[] args) {
        
        int option = -1;
        boolean cuentaCreada = false;
        double saldoEnMovimiento = 0;
        Ejercicio2 cuenta = new Ejercicio2(saldoEnMovimiento);
        Scanner entrada = new Scanner(System.in);
        
        while(option != 0){
            System.out.println("QUE DESEA REALIZAR HOY?\n");
            System.out.println("1. CREAR CUENTA\n2. DEPOSITAR FONDOS\n3. RETIRAR"
                    + " FONDOS\n4. CONSULTAR INFORMACION\n0. SALIR");
            
            option  = entrada.nextInt();
            
            switch(option){
                
                case 1:
                    if(!cuentaCreada){
                        System.out.println("INGRESE EL MONTO CON EL QUE DESEA "
                                + "CREAR SU CUENTA");
                        saldoEnMovimiento  = entrada.nextDouble();
                        
                        if(saldoEnMovimiento >= 200){
                            cuenta.actualizarSaldo(saldoEnMovimiento, + 1);
                            cuentaCreada = true;
                        }
                        else{
                            System.out.println("LO SENTIMOS. EL MONTO NO ES "
                                    + "SUFICIENTE PARA CREAR UNA CUENTA. DEBE "
                                    + "INGRESAR AL MENOS $200");
                        }
                    }
                    else{
                        System.out.println("LO SENTIMOS. USTED YA POSEE UNA CUENTA.");
                    }
                    break;
                    
                case 2:
                    if(cuentaCreada){
                        System.out.println("CUANTO DINERO DESEA DEPOSITAR?.");
                        saldoEnMovimiento  = entrada.nextDouble();
                        cuenta.actualizarSaldo(Math.abs(saldoEnMovimiento), + 1);
                    
                    }
                    else{
                        System.out.println("LO SENTIMOS USTED NO POSEE UNA CUENTA.");
                    }
                    break;
                    
                case 3:
                    if(cuentaCreada){
                        System.out.println("CUANTO DINERO DESEA RETIRAR?.");
                        saldoEnMovimiento  = entrada.nextDouble();
                        saldoEnMovimiento = Math.abs(saldoEnMovimiento);
                        
                        if(saldoEnMovimiento > cuenta.getSaldo()){
                            System.out.println("ERROR. EL MONTO INGRESADO SUPERA SU SALDO");
                        }
                        else{
                            cuenta.actualizarSaldo(saldoEnMovimiento,  -1);
                        }                
                    }
                    else{
                        System.out.println("LO SENTIMOS USTED NO POSEE UNA CUENTA.");
                    }
                    break;
                    
                case 4:
                    if(cuentaCreada){
                        System.out.println(cuenta.toString());
                    }
                    else{
                        System.out.println("LO SENTIMOS USTED NO POSEE UNA CUENTA.");
                    }
                    break;
                    
                case 0:
                    System.out.println("CERRANDO SESION. VUELVA PRONTO.");
                    break;
                    
                default:
                    System.out.println("OPCION INGRESADA NO VALIDA. TRATE DE NUEVO.");
                    break;
            }
            
            System.out.println("\n");
        }     
    }
}
