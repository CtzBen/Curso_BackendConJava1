package Entitys;

import java.util.Date;

/**
 *
 * @author Costanzo
 */
public class Alquiler {
//    Para cada Alquiler se guarda: el
//nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//amarre y el barco que lo ocupará.
    String nombreCliente;
    long dniCliente;
    Date fechaAlquiler;
    Date fechaDevolucion;
    int posicionAmarre;
    Barco barco;

    public Alquiler() {
    }

    
    public Alquiler(String nombreCliente, long dniCliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
    
}
