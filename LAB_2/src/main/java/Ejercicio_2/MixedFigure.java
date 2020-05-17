package Ejercicio_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class MixedFigure implements CompositeMixedFigure, Figure {

    List<Figure> internalFigures;

    public MixedFigure() {
        internalFigures = new ArrayList<>();
    }

    @Override
    public void addFigure(Figure figure) {
        this.internalFigures.add(figure);
    }

    @Override
    public Object copyFigure() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CircleFigure.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;

    }

    public String print() {
        String row = "";
        Iterator<Figure> it = internalFigures.iterator();
        while (it.hasNext()) {
            row += it.next().print();
        }

        return "\nFigura mixta contiene(" + row + ")";
    }

    @Override
    public Figure build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
