package Services;

import Entitys.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        
        int numeroCuenta;
        long dniCliente;
        double saldoActual;
        
        System.out.println("Ingresar numero de cuenta: ");
        numeroCuenta = Integer.parseInt(leer.nextLine());
        
        System.out.println("Ingresar DNI de cliente: ");
        dniCliente = Long.parseLong(leer.nextLine());
        
        System.out.println("Ingresar Saldo actual: ");
        saldoActual = Double.parseDouble(leer.nextLine());
        
        
        return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
        
    }
    
    public void ingresar(CuentaBancaria cuenta,double ingreso){
        
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }
    
    public void retirar(CuentaBancaria cuenta,double retiro){
        
        if (cuenta.getSaldoActual() < retiro) {
            System.out.println("ERROR: Su cuenta no cuenta con suficiente saldo.");
            System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
            System.out.println("Se retirará lo posible hasta vaciar la cuenta.");
            cuenta.setSaldoActual(0.0);
            System.out.println("Retiro realizado correctamente.");
            System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
            
        } else{
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Retiro realizado correctamente.");
            System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
        }
    }
    public void extraccionRapida(CuentaBancaria cuenta, double retiro){
        
       double porcentajeMaximo = (cuenta.getSaldoActual()*20)/100;
       if (retiro <= porcentajeMaximo) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Retiro realizado correctamente.");
            System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
       } else {
            System.out.println("ERROR: Está intentando retirar más del 20% de su saldo.");
            System.out.println("Saldo máximo a retirar: $"+ porcentajeMaximo);
            System.out.println("Se retirará esta cantidad.");
            cuenta.setSaldoActual(cuenta.getSaldoActual() - porcentajeMaximo);
            System.out.println("Retiro realizado correctamente.");
            System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
       }
       
    }
    
    public double consultarSaldo(CuentaBancaria cuenta){
        return cuenta.getSaldoActual();
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Numero de cuenta: "+ cuenta.getNumeroCuenta());
        System.out.println("DNI del Cliente: "+ cuenta.getDniCliente());
        System.out.println("Saldo Actual: $"+ consultarSaldo(cuenta));
    }
} 
