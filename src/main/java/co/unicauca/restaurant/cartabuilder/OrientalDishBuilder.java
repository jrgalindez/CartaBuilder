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
public class OrientalDishBuilder extends DishBuilder{

    /*@Override
    public DishBuilder setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DishBuilder setDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DishBuilder setImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DishBuilder setPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public DishBuilder setSize() {
        this.getDish().setSize(EnumSize.ALL);
        return this;
    }

    @Override
    public DishBuilder setCore() {
        this.setDish(new OrientalDish("Arroz oriental",
                "Arroz con estilo oriental, añadiendo ingredientes con sabores "
                        + "orientales como la soja, las verduras y las gambas",
                "",56000,EnumSize.ALL,"East rice"));
        return this;
    }

    @Override
    public DishBuilder addParts(){
        
        this.getDish().addPart(new OrientalDish("Pollo Kung Pao","Es un plato salteado "
                + "y deliciosamente picante que se prepara con pollo, maní y chiles, "
                + "al cual a veces se le agregan verduras",
                "",35000,EnumSize.ALL,"Kung Pao chicken"));
        
        this.getDish().addPart(new OrientalDish("chop suey","en carnes, cocinado rápidamente "
                + "en un wok con verduras como apio, pimientos, judías verdes, entre otros",
                "",15000,EnumSize.ALL,"chapsui"));
        return this;
    }
    
}
