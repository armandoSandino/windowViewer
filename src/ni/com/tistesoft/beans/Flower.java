/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ni.com.tistesoft.beans;

/**
 *
 * @author Armando
 */
public class Flower {
    private String name;
    private String imageUrl;
    
    public Flower(){}
    public Flower(String name, String imageUrl ){
        this.name = name;
        this.imageUrl = imageUrl;
    }
    public Flower(final Flower obj ){}
    
    public void setName(String name ){
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setImageUrl(String p ){
        this.imageUrl =  p;
    }
    
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
