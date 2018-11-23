import javafx.event.Event;
import javafx.event.EventHandler;

public class ButtonHandler implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println("What is better LetterKenny or Family Guy?");
    }
}
