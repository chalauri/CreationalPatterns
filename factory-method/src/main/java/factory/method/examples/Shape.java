package main.java.factory.method.examples;

import java.util.Arrays;

/**
 * Created by Chalauri-G on 10/1/2017.
 */
public interface Shape {

    void draw();

    static Shape create(String shapeAsText) {
        Shape retValue = null;

        if (shapeAsText.startsWith("#rect")) {
            Rectangle r = new Rectangle();
            retValue = r;
        }

        if (shapeAsText.startsWith("#oval")) {
            Oval o = new Oval();
            retValue = o;
        }

        return retValue;

    }
}
