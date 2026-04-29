import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage stage) {

        
        double scale = 3; // 1% = 3 pixels

        
        VBox projects = createBar("Projects - 20%", 20 * scale, Color.RED);
        VBox quizzes = createBar("Quizzes - 10%", 10 * scale, Color.BLUE);
        VBox midterm = createBar("Midterm - 30%", 30 * scale, Color.GREEN);
        VBox finalExam = createBar("Final Exam - 40%", 40 * scale, Color.ORANGE);

        
        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(projects, quizzes, midterm, finalExam);

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    
    private VBox createBar(String label, double height, Color color) {

        Rectangle bar = new Rectangle(50, height);
        bar.setFill(color);

        Text text = new Text(label);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, text);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}