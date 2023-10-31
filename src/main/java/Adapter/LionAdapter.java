/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author danie
 */
public class LionAdapter implements Animal{
    private Lion lion;

    public LionAdapter(Lion lion) {
        this.lion = lion;
    }
    
    

    @Override
    public void makeSound() {
        //llama al metodo de la clase Lion usando el Adapter
        lion.roar();
    }
    
    
}
