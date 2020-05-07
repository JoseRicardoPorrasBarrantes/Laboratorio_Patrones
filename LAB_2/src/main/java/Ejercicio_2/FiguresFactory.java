package Ejercicio_2;

/**
 *
 * @author USER
 */
public class FiguresFactory  {
    
    
    public Figure addFigure(String type) {
    
      switch(type.toLowerCase()){
          case "circulo":        
              return new CircleFigure();
          case "rectangulo":
              return new RectangleFigure();
          case "mixta":
              return new MixedFigure();

          default:
              break;
      }
      
      return  null;
    }
    
    
    
}
