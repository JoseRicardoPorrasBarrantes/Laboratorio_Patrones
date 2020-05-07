package Ejercicio_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public  class RectangleFigure implements Figure{
    
    private int high;
    private int width;
    private int x,y;

    public RectangleFigure(int high, int width, int x, int y) {
        this.high = high;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public RectangleFigure() {
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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


    @Override
    public Object copyFigure() {
           Object objeto = null;
        try {
           objeto = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CircleFigure.class.getName()).log(Level.SEVERE, null, ex);
        }
      return objeto;
        }
    

    @Override
    public String print() {
        return "Rectangulo\n";
    }

   
    
}
