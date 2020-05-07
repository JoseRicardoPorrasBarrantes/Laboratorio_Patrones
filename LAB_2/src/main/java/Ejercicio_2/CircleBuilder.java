/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Vulkmir
 */
public class CircleBuilder implements IBuilder{

    private int x;
    private int y;
    private int radio;

    public CircleBuilder() {
    }    
    
    public CircleBuilder withX(int x){
        this.x = x;
        return this;
    }
    
    public CircleBuilder withY(int y){
        this.y = y;
        return this;
    }
    
    public CircleBuilder withRadio(int radio){
        this.radio = radio;
        return this;
    }
    
    

    @Override
    public Figure build() {
        CircleFigure circleReturn = new CircleFigure();
        circleReturn.setX(this.x);
        circleReturn.setY(this.y);
        circleReturn.setRadio(this.radio);
        return circleReturn;
    }
    
}
