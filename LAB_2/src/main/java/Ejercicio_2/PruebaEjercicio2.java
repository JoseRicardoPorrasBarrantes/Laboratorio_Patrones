package Ejercicio_2;

/**
 *
 * @author USER
 */
public class PruebaEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguresFactory fabrica = new FiguresFactory();//creation of a factory
     
        CircleFigure circulo = (CircleFigure) fabrica.addFigure("circulo");//creation of a circle through the factory
        
        circulo.setX(5);
        circulo.setY(9);
        circulo.setRadio(10);
        
        RectangleFigure rectangulo = (RectangleFigure) fabrica.addFigure("rectangulo");
        MixedFigure figuraMixta = (MixedFigure) fabrica.addFigure("mixta");
        MixedFigure figuraMixta2 = (MixedFigure) fabrica.addFigure("mixta");
        
        
        figuraMixta.addFigure(circulo);
        figuraMixta.addFigure(rectangulo);
        figuraMixta.addFigure(circulo);
        
        
        figuraMixta2.addFigure(circulo);
        figuraMixta2.addFigure(rectangulo);
        figuraMixta2.addFigure(circulo);
        
        figuraMixta.addFigure(figuraMixta2);
        
        Mural mural = new Mural();
        
        mural.addFigure(circulo);
        mural.addFigure(rectangulo);
       mural.addFigure(figuraMixta);
        

       System.out.println(mural.print());
        
        
    }
    
}
