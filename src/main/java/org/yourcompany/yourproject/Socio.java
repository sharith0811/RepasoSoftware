package org.yourcompany.yourproject;

public class Socio extends Usuario{

    private int limiteEjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendiente;

    public Socio(String id, String nombre, String email, int limiteEjemplares){
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        ejemplaresEnPrestamo = 0;
        multasPendiente = 0;
    }
    
    public void registrarPrestamo(int cantidad){
        if(cantidad > (limiteEjemplares - ejemplaresEnPrestamo)){
            throw new IllegalArgumentException("Supera el límite del socio");
        }
        if(multasPendiente > 0){
            throw new IllegalArgumentException("No puede pedir si tiene una multa");
        }
        System.out.println("Se prestaron " + cantidad + " libros");
    }
}
