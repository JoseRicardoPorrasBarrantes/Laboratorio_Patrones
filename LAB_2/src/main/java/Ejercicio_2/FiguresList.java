package Ejercicio_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author USER
 */
public class FiguresList {
 
    List<Figure> figureList;
 
    
    
    public FiguresList() {
        this.figureList = new ArrayList<>();
    }
    
    public void addFigure(Figure figure){
     figureList.add(figure);
    }

    public List<Figure> getFigureList(){
        return figureList;
    }
    
    public void deleteFigure (int index){
    figureList.remove(index);
    }
    
    public String print() {
        String row = "";
     Iterator<Figure> it = figureList.iterator();
      while(it.hasNext()){
      row += it.next().print();
      }  
      
    return "El mural contiene : \n"+row;    
    }
    
    public void clonar(int indice){
    
    }
    
    
    
}
