import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        
        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

       
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        
        submitBtn.setOnAction(e -> {

            String rollText = rollField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

          
            try {
                int rollNo = Integer.parseInt(rollText);
                int age = Integer.parseInt(ageText);

                if (!email.contains("@") || !email.contains(".")) {
                    throw new IllegalArgumentException("Invalid Email format!");
                }

               
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

                
                saveToFile(rollNo, name, age, email);

            } catch (NumberFormatException ex) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Input Error");
                error.setHeaderText("Invalid Number Format");
                error.setContentText("Roll No and Age must be integers.");
                error.showAndWait();

            } catch (IllegalArgumentException ex) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Email Error");
                error.setHeaderText("Invalid Email");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Student Registration Form");
        stage.setScene(scene);
        stage.show();
    }

   
    private void saveToFile(int roll, String name, int age, String email) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true))) {

            bw.write(roll + " " + name + " " + age + " " + email);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}