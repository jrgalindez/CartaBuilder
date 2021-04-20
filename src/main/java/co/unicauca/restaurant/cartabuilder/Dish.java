/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.cartabuilder;

import java.util.ArrayList;

/**
 *
 * @author YAQUE
 */
public class Dish {
    private String name;
    private String description ;
    private String image;
    private int price;
    private EnumSize size;
    private ArrayList<Dish> parts;

    public Dish(String name, String description, String image, int price, EnumSize size) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.size = size;
        this.parts = new ArrayList();
    }

    public Dish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EnumSize getSize() {
        return size;
    }

    public void setSize(EnumSize size) {
        this.size = size;
    }
    
    public void addPart(Dish dish){
        this.parts.add(dish);
    }

    public ArrayList<Dish> getParts() {
        return parts;
    }
    
    
    
    public int calculatePriceParts(){
        int valor = 0;
        valor += this.getPrice();
        for(int i = 0; i < this.parts.size();i++){
            valor += this.parts.get(i).getPrice();
        }
        if (this.getSize()== EnumSize.HALF){
            valor = valor/2;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Plato:" + "\nNombre: " + name + "\nDescripcion: " + description + "\nUrlimagen: " + image + "\nPrecio Unitario: " + price + "\nTamaño: " + size+ "\n";
    }

    public Object getPartes() {
        return  "\n"+parts;
    }
    
}
