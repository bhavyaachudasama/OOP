import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class RandomTextFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox(10); // spacing between texts
        vbox.setStyle("-fx-alignment: center;"); 

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {

            Text text = new Text("Text " + i);

           
            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

           
            Color color = Color.color(rand.nextDouble(),
                    rand.nextDouble(),
                    rand.nextDouble());

            
            double opacity = 0.3 + (0.7 * rand.nextDouble());

            text.setFill(color);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Random Styled Texts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}