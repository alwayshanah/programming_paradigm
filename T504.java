import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T504 extends Application {

    TextField guessField = new TextField();
    Label hintLabel = new Label();
    Label attemptsLabel = new Label();
    int counter = 0, attempts = 0;
    int numberToGuess = -1;    

    @Override
    public void start(Stage primaryStage) {            

        guessField.setPromptText("Press New Game Button!");
        guessField.setMaxWidth(250);

        Button btnNewGame = new Button("New Game");        
        btnNewGame.setOnAction(actionEvent -> {gameSetup();});

        Button btnGuess = new Button("Guess");
        btnGuess.setOnAction(actionEvent -> {gamePlay();});

        VBox root = new VBox();
        root.getChildren().addAll(guessField, btnNewGame, btnGuess, hintLabel, attemptsLabel);
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Guess the Number");
        primaryStage.setScene(scene);
        primaryStage.show();

        btnNewGame.requestFocus();
    }    

    public static void main(String[] args) {
        launch(args);
    }


    public void gameSetup()
    {
        guessField.setPromptText("Enter your guess");//set guessField to zero
        counter = 0; //set counter to zero

        //set numberToGuess to a new random number
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1;
        System.out.println("Number to guess: " + numberToGuess);
        hintLabel.setText("");
        attemptsLabel.setText("");
        
    }

    public void gamePlay()
    {
        int guess = Integer.parseInt(guessField.getText());
        attempts++;

        if(counter == 100)
        {
            hintLabel.setText("Game over! Lozer!");
            guessField.setText("");
        }
        else{
            if(guess == numberToGuess)
            {
                hintLabel.setText("char! " + guess + " is correct!");
                guessField.setText("");
            }
            else if(guess < numberToGuess)
            {
                hintLabel.setText("Gamay ra et, usab!");
                guessField.setText("");
                counter++;
            }
            else 
            {
                hintLabel.setText("Taas ra et, usab!");
                guessField.setText("");
                counter++;
            }         
        }      
        
        attemptsLabel.setText("Attempts: " + counter);  
    }
}