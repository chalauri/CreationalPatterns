package main.java.factory.method.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chalauri-G on 10/1/2017.
 */
public class Client {

    private List<Shape> shapes;

    public Client() {
        this.shapes = new ArrayList<>();
    }

    public void readShapes(String[] shapesAsText) {
        Arrays.asList(shapesAsText).forEach(
                element -> shapes.add(Shape.create(element))
        );
    }


    public void drawAllShapes() {
        shapes.forEach(
                shape -> shape.draw()
        );
    }
}
