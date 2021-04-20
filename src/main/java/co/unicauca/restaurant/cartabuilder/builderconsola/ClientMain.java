/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.cartabuilder.builderconsola;

import co.unicauca.restaurant.cartabuilder.Dish;
import co.unicauca.restaurant.cartabuilder.DishBuilder;
import co.unicauca.restaurant.cartabuilder.DishDirector;
import co.unicauca.restaurant.cartabuilder.OrientalDishBuilder;
import co.unicauca.restaurant.cartabuilder.ItalianDishBuilder;

/**
 *
 * @author YAQUE
 */
public class ClientMain {
    public static void main(String[] args) {
        DishDirector director = new DishDirector();
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        director.setDishBuilder(orientalBuilder);
        director.buildDish();
        
        Dish dish1 = director.getDish();
        System.out.println("Oriental dish: \n"+dish1);
        System.out.println("Adicionalmente: "+dish1.getPartes().toString());
        System.out.println("Precio de las partes "+dish1.calculatePriceParts());
        
        DishBuilder italianBuilder = new ItalianDishBuilder();
        director.setDishBuilder(italianBuilder);
        director.buildDish();
        
        Dish dish2 = director.getDish();
        System.out.println("Italian dish: \n"+dish2);
        System.out.println("Adicionalmente: "+dish2.getPartes().toString());
        System.out.println("Precio de las partes "+dish2.calculatePriceParts());
        
        
    }
}
