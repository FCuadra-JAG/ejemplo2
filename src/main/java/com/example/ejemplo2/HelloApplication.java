package com.example.ejemplo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import java.io.IOException;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        root.setPadding(new Insets(30));
        root.setSpacing(10);

        Label lblTitle = new Label("Calculadora");
        Label LbLNumber1 = new Label("Numero 1");
        //root.getChildren().add(lbLNumber1);
        TextField tfNumber1 = new TextField();
        Label LblNumber2 = new Label(  "Numero 2");
        Label IbResultado = new Label( "Resultado");
        TextField tfNumber2 = new TextField();

        Button btnSuma = new Button("+");
        Button btResta = new Button("-");
        Button btnMultiplicacion = new Button( "*");
        Button btnDivision = new Button("/");

        btnSuma.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = num1 + num2;
            IbResultado.setText(String.valueOf(resultado));
        });

        btResta.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = num1 - num2;
            IbResultado.setText(String.valueOf(resultado));
        });

        btnMultiplicacion.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = num1 * num2;
            IbResultado.setText(String.valueOf(resultado));
        });

        btnDivision.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = num1 / num2;
            IbResultado.setText(String.valueOf(resultado));
        });

        HBox buttons = new HBox();
        buttons.setPadding(new Insets(10));
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(
                btnSuma,
                btResta,
                btnMultiplicacion,
                btnDivision
        );

        root.getChildren().addAll(
                lblTitle,
                LbLNumber1,
                tfNumber1,
                LblNumber2,
                tfNumber2,
                buttons,
                IbResultado
        );

        Scene scene = new Scene(root, 400 , 400);
        stage.setTitle("UAM");
        stage.setScene(scene);
        stage.show();

    }
}
