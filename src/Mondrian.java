// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_3_1
// File Name: Mondrian.java

// Program that creates a Mondrian JavaFX Painting

// imports that I use in this program
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Mondrian extends Application {

    // Objects on the Stage
    public void start(Stage primaryStage) {

        // Rectangles follow the parameters of: 
        // Creates new rectangle with the points (x, y, width, height)
        // Stroke Color Set
        // Stroke Width Set
        // Fill Color Set
        // First rectangle and its properties
        Rectangle rect1 = new Rectangle(0, 0, 250, 120);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(5);
        rect1.setFill(Color.YELLOW);

        // Second rectangle and its properties
        Rectangle rect2 = new Rectangle(0, 0, 250, 750);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(4);
        rect2.setFill(null);

        // Third rectangle and its properties
        Rectangle rect3 = new Rectangle(250, 0, 300, 400);
        rect3.setStroke(Color.BLACK);
        rect3.setStrokeWidth(5);
        rect3.setFill(null);

        // Fourth rectangle and its properties
        Rectangle rect4 = new Rectangle(250, 400, 400, 350);
        rect4.setStroke(Color.BLACK);
        rect4.setStrokeWidth(5);
        rect4.setFill(null);

        // Fifth rectangle and its properties
        Rectangle rect5 = new Rectangle(550, 0, 950, 200);
        rect5.setStroke(Color.BLACK);
        rect5.setStrokeWidth(5);
        rect5.setFill(null);

        
        // Custom color using the color class for 6th rectangle
        Color colorCustom = Color.rgb(24, 45, 245);
        
        // Sixth rectangle and its properties 
        Rectangle rect6 = new Rectangle(550, 200, 950, 50);
        rect6.setStroke(Color.BLACK);
        rect6.setStrokeWidth(5);
        rect6.setFill(colorCustom); //Blue variant using rgb values

        
        // Seventh rectangle and its properties
        Rectangle rect7 = new Rectangle(550, 250, 350, 150);
        rect7.setStroke(Color.BLACK);
        rect7.setStrokeWidth(5);
        rect7.setFill(null);

        // Eighth rectangle and its properties
        Rectangle rect8 = new Rectangle(900, 250, 600, 150);
        rect8.setStroke(Color.BLACK);
        rect8.setStrokeWidth(5);
        rect8.setFill(Color.YELLOW);

        // Ninth rectangle and its properties
        Rectangle rect9 = new Rectangle(550, 400, 100, 350);
        rect9.setStroke(Color.BLACK);
        rect9.setStrokeWidth(5);
        rect9.setFill(null);

        // Tenth rectangle and its properties
        Rectangle rect10 = new Rectangle(650, 400, 200, 350);
        rect10.setStroke(Color.BLACK);
        rect10.setStrokeWidth(5);
        rect10.setFill(Color.RED);

        // Eleventh rectangle and its properties
        Rectangle rect11 = new Rectangle(850, 400, 650, 350);
        rect11.setStroke(Color.BLACK);
        rect11.setStrokeWidth(5);
        rect11.setFill(null);

        //Group root to hold all of the objects that I created
        Group root = new Group(rect1, rect2, rect3, rect4, rect5,
                rect6, rect7, rect8, rect9, rect10, rect11);

        // Creating Scene and Instructions for the Stage and Scene:
        // group root, size, color, name, and showing
        Scene scene = new Scene(root, 1500, 750, Color.WHITE);
        primaryStage.setTitle("Josh's Mondrian JavaFX Painting");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    // Launches the JavaFX application.
    public static void main(String[] args) {
        launch(args);
    }

}
