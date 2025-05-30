import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T506 extends Application {

    private TextField guessField = new TextField();
    private Label storyLabel = new Label();
    private Label resultLabel = new Label();
    private int counter = 0;

    @Override
    public void start(Stage primaryStage) {
        guessField.setPromptText("Welcome to the Game!");

        Button startButton = new Button("Start The Game");
        startButton.setOnAction(actionEvent -> gameSetup());

        Button choiceButton = new Button("Enter choice");
        choiceButton.setOnAction(actionEvent -> gamePlay());

        VBox root = new VBox(8, startButton, storyLabel, guessField, choiceButton, resultLabel);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 650, 550);

        primaryStage.setTitle("T506");
        primaryStage.setScene(scene);
        primaryStage.show();

        startButton.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void gameSetup() {
        storyLabel.setText("Once upon a time in a far away land lived three pig brothers always bothered by a wolf,\n" +
                "      in which the wolf would always do things that can harm the pig brothers. So they\n" +
                "  decided to build a house. The eldest brother wants to build his home with sticks but the\n" +
                "  other brothers argue with him. However, the eldest brother is stubborn. So the second\n" +
                "   brother wants to live in a separate house. The second brother used stone to build the\n" +
                "       house. It has a nice foundation but the youngest brother wants to build a more\n" +
                "  impenetrable house. So the youngest brother decided to build his house using bricks.\n\n" +
                "                                   In which house would you prefer to live?\n" +
                "                                             1. Pick the Eldest Brother\n" +
                "                                             2. Pick the Second Brother\n" +
                "                                             3. Pick the Youngest Brother");
    }

    public void gamePlay() {
        try {
            int guess = Integer.parseInt(guessField.getText());

            switch (guess) {
                case 1:
                    resultLabel.setText("                   You and the eldest pig brother went inside the house when the wolf came to harm them.\n" +
                                        "                     The house seemed reliable with the defense but it only took 1 blow from the wolf and\n" +
                                        "                                      it ruined the house where you and the eldest brother lived.\n\n" +
                                        "After the house was destroyed the wolf successfully harmed you and the eldest brother resulting in a fatal death.");
                    break;
                case 2:
                    resultLabel.setText("               You and the second pig brother went inside the house when the wolf came to harm them.\n" +
                                        "         The house seemed reliable with the defense but it only took 3 blows and 2 stomps from the wolf\n" +
                                        "                                       it ruined the house where you and the eldest brother lived.\n\n" +
                                        "                               After the house was destroyed the wolf successfully harmed you\n" + 
                                        "                            and the eldest brother whereas both of you barely survived the attacks.");
                    break;
                case 3:
                    resultLabel.setText("                You and the youngest pig brother went inside the house when the wolf came to harm them.\n" +
                                        "       The house is reliable with the defense, the house managed to withstand the attacks from the wolf and\n" +
                                        "                                        it ruined the house where you and the eldest brother lived.\n\n" +
                                        "                             Since the house was still standing, the eldest pig brother and the second pig\n" + 
                                        "                            brother stayed at the house too and took shelter from the attacks of the wolf.");

                    break;
                default:
                    resultLabel.setText("Invalid choice! Please enter 1, 2, or 3 only.");
                    break;
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }
}