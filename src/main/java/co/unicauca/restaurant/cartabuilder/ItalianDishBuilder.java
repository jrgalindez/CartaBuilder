/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.cartabuilder;

/**
 *
 * @author joser
 */
public class ItalianDishBuilder extends DishBuilder {

    @Override
    public DishBuilder setCore() {
        this.setDish(new ItalianDish("Espagueti a la carbonara","espagueti con tocino crujiente y "
                + "una salsa cremosa a base de huevos y crema de leche. ",
                "", 30000, EnumSize.ALL, "spaghetti alla carbonara"));
        return this;

    }

    @Override
    public DishBuilder addParts() {

        this.getDish().addPart(new ItalianDish("Queso Edam", "Porcion queso neerlandés que se ha elaborado "
                + "tradicionalmente en forma de bolas o esferas recubiertas de parafina de color rojo o amarillo.",
                "", 15000, EnumSize.ALL, "Mini Edam"));
        
        this.getDish().addPart(new ItalianDish("Pan blanco", "Pan blanco producido en Liguria y elaborado con harina"
                + " de trigo y levadura, de forma alargada, ancha y plana, que posee una corteza crujiente. ",
                "", 10000, EnumSize.ALL, "Ciabatta"));
        
        this.getDish().addPart(new ItalianDish("Botella vino", "Vino Tinto Las Moras Malbec Reserva botella 750ml",
                "", 60000, EnumSize.ALL, "Vino Tinto Las Moras"));
        
        return this;
    }

    @Override
    public DishBuilder setSize() {
        this.getDish().setSize(EnumSize.ALL);
        return this;

    }

}
