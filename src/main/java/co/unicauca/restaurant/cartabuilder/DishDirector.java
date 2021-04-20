/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.cartabuilder;

/**
 *
 * @author YAQUE
 */
public class DishDirector {

    private DishBuilder builder;

    public DishDirector setDishBuilder(DishBuilder builder) {
        this.builder = builder;
        return this;
    }

    public Dish getDish() {
        return builder.getDish();
    }

    /*
    Primero se le da un nombre (puede ser un nombre simple o puede llevar el sufijo del restaurante)
    Segundo se asocia una multimedia al menú (imagen, video)
    Tercero se le agrega la parte principal
    Cuarto se agrega las partes agregadas (Por ejemplo, puede ser una Base y Acompañantes), 
    Quinto el Plato Completo se agrega al Menú
     */
    public void buildDish() {
        builder
                .init()
                .setCore()
                .addParts()
                .setSize();
    }
}
