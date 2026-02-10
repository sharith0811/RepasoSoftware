/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author shari
 */
public class Main {

    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario("1", "Pepe", "pepe@gmail.com", "Mañana");
        System.out.println(bibliotecario.darEmail());

        Socio socio = new Socio("1", " Juan", "juan@gmail.com", 5);
        socio.registrarPrestamo(2);
    }
}
