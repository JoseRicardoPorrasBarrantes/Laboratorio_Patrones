package Ejercicio_2;

/**
 *
 * @author USER
 */
public class Mural{

   FiguresList figuresList;

    public FiguresList getFiguresList() {
        return figuresList;
    }

    public Mural() {
        figuresList = new FiguresList();
    }
    
   
    public void addFigure(Figure figure){
    figuresList.addFigure(figure);
    }
   
    
    public String print(){
    return figuresList.print();
    }
    
    
    
    
}
