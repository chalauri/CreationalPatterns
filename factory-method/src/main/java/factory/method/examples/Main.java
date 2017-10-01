package main.java.factory.method.examples;

/**
 * Created by Chalauri-G on 10/1/2017.
 */
public class Main {

    public static void main(String[] args) {
        ClientPolymorphic client = new ClientPolymorphic();
        client.readShapes(mockFile());

        client.drawAllShapes();
    }


    private static String[] mockFile(){

        return new String[]{
                "#rect 1,2,100,200",
                "#oval 1,1,100,100",
                "#rect 100,200,1,1"
        };
    }
}
