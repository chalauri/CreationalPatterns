package main.java.factory.method.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chalauri-G on 10/1/2017.
 */
public class ClientPolymorphic {

    private List<Shape> shapes;

    public ClientPolymorphic() {
        this.shapes = new ArrayList<Shape>();
    }

    public void readShapes(String[] shapesAsText) {
        Arrays.asList(shapesAsText).forEach(
                element -> {
                    if (element.startsWith("#rect")) {
                        Rectangle r = new Rectangle();
                        shapes.add(r);
                    }

                    if (element.startsWith("#oval")) {
                        Oval o = new Oval();
                        shapes.add(o);
                    }
                }
        );
    }

    public void drawAllShapes() {
        shapes.forEach(
                shape -> shape.draw()
        );
    }
}
