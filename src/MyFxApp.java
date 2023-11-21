import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.FileInputStream;

public class MyFxApp extends Application {

    Image image1;
    Image image2;
    Image image3;
    Image image4;
    Image image5;


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
        primaryStage.setTitle("My First JavaFX App");
        FileInputStream input1 = new FileInputStream("src/YujiroHanma.jpg");
        image1 = new Image(input1);
        FileInputStream input2 = new FileInputStream("src/Jack Hanma.jpeg");
        image2 = new Image(input2);
        FileInputStream input3 = new FileInputStream("src/BiscuitOliva.jpg");
        image3 = new Image(input3);
        FileInputStream input4 = new FileInputStream("src/Baki Manga.jpg");
        image4 = new Image(input4);
        FileInputStream input5 = new FileInputStream("src/Yuichiro.jpeg");
        image5 = new Image(input5);

        ImageView imageView1 = new ImageView(image1);

        MenuItem menuItem1 = new MenuItem("Yujiro");
        MenuItem menuItem2 = new MenuItem("Jack");
        MenuItem menuItem3 = new MenuItem("Biscuit");
        MenuItem menuItem4 = new MenuItem("Baki");
        MenuItem menuItem5 = new MenuItem("Yuichiro");


        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3, menuItem4, menuItem5);

        menuItem1.setOnAction(actionEvent -> {
            imageView1.setImage(image1);
        });

        menuItem2.setOnAction(actionEvent -> {
            imageView1.setImage(image2);
        });
        menuItem3.setOnAction(actionEvent -> {
            imageView1.setImage(image3);
        });
        menuItem4.setOnAction(actionEvent -> {
            imageView1.setImage(image4);
        });
        menuItem5.setOnAction(actionEvent -> {
            imageView1.setImage(image5);
        });


        imageView1.setFitHeight(400);
        imageView1.setFitWidth(400);

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().add("Yujiro");
        choiceBox.getItems().add("Jack");
        choiceBox.getItems().add("Biscuit");
        choiceBox.getItems().add("Baki");
        choiceBox.getItems().add("Yuichiro");


        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("Yujiro");
        comboBox.getItems().add("Jack");
        comboBox.getItems().add("Biscuit");
        comboBox.getItems().add("Baki");
        comboBox.getItems().add("Yuichiro");




        // Write setOnAction methods that are run when Controls are used
        choiceBox.setOnAction((event) -> {
            int selectedChoice = choiceBox.getSelectionModel().getSelectedIndex();
            imageView1.setImage(imageView1.getImage());
            comboBox.getSelectionModel().select(selectedChoice);


        });

        Button myButton = new Button("HI");


        VBox vbox1 = new VBox(imageView1, myButton, menuButton, choiceBox, comboBox);
        Scene myScene1 = new Scene(vbox1, 400, 500);

        // setup scene on the stage and show it
        primaryStage.setTitle("Image Picker");
        primaryStage.setScene(myScene1);
        primaryStage.show();

    }
}