

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class View {
    public Label result;
    public TextField firstNumber;
    public TextField secondNumber;


    @FXML
    protected void onHelloButtonClick() {

        int A = Integer.parseInt(firstNumber.getText());
        int B = Integer.parseInt(secondNumber.getText());

        if(A > B) {
            int random_int = (int)Math.floor(Math.random()*(A-B+1)+B);
            result.setText("Random value in int from " +B+ " to "+A+ ": " + random_int);
        } else if (B > A) {
            int random_int = (int)Math.floor(Math.random()*(B-A+1)+A);
            result.setText("Random value in int from " +A+ " to "+B+ ": " + random_int);
        } else {
            result.setText("First and second numbers are equal: " +A);
        }

    }
}
