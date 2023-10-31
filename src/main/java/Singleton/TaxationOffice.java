/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author danie
 */

public class TaxationOffice {

    // Instancia estatica privada de la clase
    private static TaxationOffice instance;

    // Contructor privado para prevenir la instanciación por otras clases
    private TaxationOffice() {
    }

    // Metodo publico para acceder al punto global desde cualquier clase
    public static TaxationOffice getInstance() {
        //Si la instancia es null crea una nueva
        if (instance == null) {
            instance = new TaxationOffice();
        }
        // Retorna la instancia existente
        return instance;
    }

    // Metodo para calcular impuestos
    public void collectTaxes(double amount) {
        System.out.println("Collected taxes: $" + amount);
        //relleno
    }
}
