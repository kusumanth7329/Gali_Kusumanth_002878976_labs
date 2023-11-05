/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author archil
 */
public class Feature {
    private Product owner;
    private String name;
    private Object value;
    
    //constractor
    
    // First constractor
    public Feature(Product owner) {
        this.owner = owner;
    }
    // Second Constractor

    public Feature(String name, Object values) {
        this.name = name;
        this.value = values;
    }
    
    
    //Getter and Setter

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object values) {
        this.value = values;
    }
    
    //To resolve the first column issue in the Table
    @Override
    public String toString(){
        return name;
    }
    

}


