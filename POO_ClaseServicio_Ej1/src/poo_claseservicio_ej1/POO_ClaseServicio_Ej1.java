package poo_claseservicio_ej1;

import Entitys.CuentaBancaria;
import Services.CuentaBancariaService;

public class POO_ClaseServicio_Ej1 {
    
    
    public static void main(String[] args) {
        CuentaBancariaService CBS = new CuentaBancariaService();
        CuentaBancaria cuenta1 = CBS.crearCuenta();
        CBS.consultarDatos(cuenta1);
    }
    
}
