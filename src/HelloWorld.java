import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button btn2 = new Button("LetterKenny Won without a fight");
        Button btn3 = new Button("MSI vs HP?");
        Button btn4 = new Button("Do pineapples belong on pizza?");
        Button btn5 = new Button("Pineapples belong on pizza!");

        btn.setText("Say 'Hello World'");
        ButtonHandler bh = new ButtonHandler();
        Button2Handler bh2 = new Button2Handler();
        btn.setOnAction(bh);
        btn2.setOnAction(bh2);
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("From an anonymous inner class");
            }
        });
        btn4.setOnAction((event -> System.out.println("lambdas' are kinda slick")));
        btn5.setOnAction((event -> {
            System.out.println("lambdas' are kinda slick");
            System.out.println("Pineapple belongs on Pizza");
            System.out.println("JW's class is more fun that family guy");
        }));

        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

