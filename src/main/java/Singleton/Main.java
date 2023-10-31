/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author danie
 */

public class Main {
    public static void main(String[] args) {
        // Obtiene la instancia 
        TaxationOffice taxationOffice = TaxationOffice.getInstance();

        // cualquiera puede interactuar con la oficina de impuestos
        taxationOffice.collectTaxes(50000.0); // Output: Collected taxes: $50000.0

        // intentos para crear otra instancia harán que se refiera a la ya existente
        TaxationOffice anotherTaxationOffice = TaxationOffice.getInstance();
        anotherTaxationOffice.collectTaxes(30000.0); // Output: Collected taxes: $30000.0
    }
}
