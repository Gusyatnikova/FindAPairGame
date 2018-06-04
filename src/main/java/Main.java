import controllers.CardController;
import models.Model;
import views.MatchingGameView;

public class Main {
    public static void main(String[] args) {
        Model model = new Model(12);
        CardController controller = new CardController(model);
        MatchingGameView instance = new MatchingGameView(model, controller);
        model.setView(instance);
        controller.setView(instance);
        instance.newGame();
    }
}
