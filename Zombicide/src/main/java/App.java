import Core.Personnages;
import javafx.application.Application;
import javafx.stage.Stage;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.SQLOutput;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, ParseException {

        Personnages Arthur = new Personnages();

        System.out.println(Arthur.getNom());
        System.out.println(Arthur.getDescriptions());
        System.out.println(Arthur.getHP());
        System.out.println(Arthur.getAction());
        System.out.println(Arthur.getCapacitée1());
        System.out.println(Arthur.getCapacitée2());
        System.out.println(Arthur.getCapacitée3());
        System.out.println(Arthur.getCapacitée4());
        System.out.println(Arthur.getCapacitéeSpéciale());
        System.out.println(Arthur.getInventaire());
        System.out.println(Arthur.getMainDroite());
        System.out.println(Arthur.getMainGauche());
        System.out.println(Arthur.getXP());

    }
}
