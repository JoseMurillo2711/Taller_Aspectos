/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author danie
 */
public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion();
        Animal adapter = new LionAdapter(lion);
        adapter.makeSound(); 
    }
}
