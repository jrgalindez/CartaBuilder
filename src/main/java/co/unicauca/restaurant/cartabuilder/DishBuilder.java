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
public abstract class DishBuilder {
    protected Dish dish;

    public Dish getDish() {
        return this.dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
    public DishBuilder init() {
        this.dish = new Dish();
        return this;
    }
    public abstract DishBuilder setCore();
    public abstract DishBuilder addParts();
    /*public abstract DishBuilder setName();
    public abstract DishBuilder setDescription();
    public abstract DishBuilder setImage();
    public abstract DishBuilder setPrice();*/
    public abstract DishBuilder setSize();
}
