import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Application extends javafx.application.Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World in different languages");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        //tego nie tykać kurwa!
        ArrayList<String> language = new ArrayList<String>();
        language.add("polish");
        language.add("Spanish");
        language.add("French");
        language.add("Hungarian");
        language.add("Portugies");
        language.add("Russsian");

        ArrayList<String> answer = new ArrayList<String>();
        answer.add("Witaj Swiecie");
        answer.add("Hola Mundo");
        answer.add("Bonjour le monde");
        answer.add("Helló Világ");
        answer.add("Olá Mundo");
        answer.add("Привет, мир");

        ObservableList<String> languageType = FXCollections.observableArrayList(language);
        ObservableList<String> answerType = FXCollections.observableArrayList(answer);
        //aż dotąd


        //lejbelki
        Label helloLabel1 = new Label("Welcome in my 'HelloWorld' in different lannguages check programe.");
        grid.add(helloLabel1, 0, 0);

        Label tableLabel = new Label("Choose Language:");
        grid.add(tableLabel, 0, 3);
        ComboBox comboBox1 = new ComboBox(languageType);
        grid.add(comboBox1, 0, 4);

        Text result = new Text();

        comboBox1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue ov, Object t, Object t1) {
                switch (t1.toString()) {
                    case "polish":
                        result.setText(answerType.get(0));
                        break;
                    case "Spanish":
                        result.setText(answerType.get(1));
                        break;
                    case "French":
                        result.setText(answerType.get(2));
                        break;
                    case "Hungarian":
                        result.setText(answerType.get(3));
                        break;
                    case "Portugies":
                        result.setText(answerType.get(4));
                        break;
                    case "Russsian":
                        result.setText(answerType.get(5));
                        break;
                }
            }
        });

        grid.add(result, 0, 6);
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.show();

    }
}
