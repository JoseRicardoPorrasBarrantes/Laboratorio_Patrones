package Ejercicio_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public  class CircleFigure implements Figure{

    private int x,y;
    private int radio;

    public CircleFigure(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public CircleFigure() {
    }
    
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    

    
    @Override
    public Object copyFigure()  {
        Object object = null;
        try {
           object = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CircleFigure.class.getName()).log(Level.SEVERE, null, ex);
        }
      return object;
        }

    @Override
    public String print() {
        return "Circulo, ";
        }

   
    
    
}
