package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Pane root = new Pane();

    TextField tf1 = new TextField();
    TextField tf2 = new TextField();

    Button plus = new Button("+");
    Button minus = new Button("-");
    Button multiple = new Button("*");
    Button divide = new Button("/");

    final String[] s = {""};

    @Override
    public void start(Stage stage) throws Exception {

        root.setStyle("-fx-background-color: rgb(255,255,255)");

        GridPane pane = new GridPane();
        pane.setStyle("-fx-background-color: rgb(204,204,204)");
        pane.setPadding(new Insets(10,10,10,10));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.setLayoutY(10);
        pane.setLayoutX(10);

        tf1.setStyle("-fx-background-color: rgb(153,204,204)");
        tf2.setStyle("-fx-background-color: rgb(153,204,204)");

        Label label1 = new Label("Number 1");
        label1.setFont(Font.font("Candara", 14));
        Label label2 = new Label("Number 2");
        label2.setFont(Font.font("Candara", 14));

        pane.add(label1,0,0);
        pane.add(tf1,1,0);
        pane.add(label2,0,1);
        pane.add(tf2,1,1);

        root.getChildren().add(pane);

        HBox hbox = new HBox(5);
        hbox.setPadding(new Insets(5,5,5,5));


        plus.setMinSize(30,24);
        minus.setMinSize(30,24);
        multiple.setMinSize(30,24);
        divide.setMinSize(30,24);

        hbox.getChildren().addAll(plus,minus,multiple,divide);
        hbox.setLayoutX(5);
        hbox.setLayoutY(90);

        root.getChildren().add(hbox);

        GridPane Grid = new GridPane();
        Grid.setStyle("-fx-background-color: rgb(102,153,153)");
        Grid.setPadding(new Insets(15,15,15,30));
        Grid.setHgap(5.5);
        Grid.setVgap(5.5);
        Grid.setLayoutY(130);
        Grid.setLayoutX(10);
        Grid.setMinSize(248,50);

        Label label = new Label("Result");
        label.setFont(Font.font("Candara",14));

        Grid.add(label,0,0);

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: rgb(153,204,204)");
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setPadding(new Insets(5,5,5,60));
        grid.setMinSize(160,24);




        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());

                s[0] = Integer.toString(a+b);

                Text text = new Text(20,20, s[0]);
                text.setFont(new Font("맑은고딕",14));
                grid.getChildren().clear();
                grid.add(text,12,0);
            }
        });

        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());

                s[0] = Integer.toString(a-b);

                Text text = new Text(20,20, s[0]);
                text.setFont(new Font("맑은고딕",14));
                grid.getChildren().clear();
                grid.add(text,12,0);
            }
        });

        multiple.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());

                s[0] = Integer.toString(a*b);

                Text text = new Text(20,20, s[0]);
                text.setFont(new Font("맑은고딕",14));
                grid.getChildren().clear();
                grid.add(text,12,0);
            }
        });

        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());

                s[0] = Integer.toString(a/b);


                Text text = new Text(20,20, s[0]);
                text.setFont(new Font("맑은고딕",14));
                grid.getChildren().clear();
                grid.add(text,12,0);
            }
        });

        Text text = new Text(20,20, s[0]);
        text.setFont(new Font("맑은고딕",14));

        grid.add(text,12,0);
        Grid.add(grid,1,0);


        root.getChildren().add(Grid);

        Scene scene = new Scene(root,270,190);
        stage.setScene(scene);
        stage.setTitle("Calc");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}