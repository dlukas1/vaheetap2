import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class logo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First try JavaFX");

        Rectangle square = new Rectangle(20,20,80,80);
        square.setFill(Color.GREENYELLOW);
        stack.getChildren().add(square);

        Rectangle square2 = new Rectangle(20,20,80,80);
        square2.setFill(Color.AQUA);
        square2.setRotate(45);
        stack.getChildren().add(square2);




        Circle ring = new Circle(40);
        ring.setFill(Color.ORANGE);
        ring.setOnMouseClicked(event -> {
            System.out.println("Klikk tõõtab");
        });
        stack.getChildren().add(ring);

        primaryStage.show();

    }
}