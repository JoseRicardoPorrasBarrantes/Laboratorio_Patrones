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
     
        //created with builder
        CircleFigure circle = (CircleFigure) fabrica.addFigure("circulo");//creation of a circle through the factory
        CircleBuilder builder1 = new CircleBuilder();
        circle = (CircleFigure) builder1.withX(5).withY(9).withRadio(10).build();
        

        //created without builder
        RectangleFigure rectangle = (RectangleFigure) fabrica.addFigure("rectangulo");
        MixedFigure mixedFigure = (MixedFigure) fabrica.addFigure("mixta");
        MixedFigure mixedFigure2 = (MixedFigure) fabrica.addFigure("mixta");
        
        
        //composite test
        mixedFigure.addFigure(circle);
        mixedFigure.addFigure(rectangle);
        mixedFigure.addFigure(circle);
        
        
        mixedFigure2.addFigure(circle);
        mixedFigure2.addFigure(rectangle);
        mixedFigure2.addFigure(circle);
        
        mixedFigure.addFigure(mixedFigure2);
        
        //creation of the mural
        Mural mural = new Mural();
        
        //figures added
        mural.addFigure(circle);
        mural.addFigure(rectangle);
       mural.addFigure(mixedFigure);
        
        System.out.println("##########Prueba de un mural con sus figuras internas##########");
        System.out.println("##########(Figuras Mixtas prueba composite)##########");
        System.out.println("##########(Circulo creado con builder)##########");
       System.out.println(mural.print());
        
        
    }
    
}
