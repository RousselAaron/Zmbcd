import Core.Personnages;
import javafx.application.Application;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class App extends Application {

    private String nom;
    private String descriptions;
    private String[] capacitee1;
    private String[] capacitee2;
    private String[] capacitee3;
    private String[] capacitee4;
    private Object capaciteeSpeciale;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, ParseException {

        Personnages Arthur = new Personnages();

        JSONParser jsonP = new JSONParser();

        try {

            Object obj = jsonP.parse(new FileReader("perso.json"));

            JSONObject jsonO = (JSONObject) obj;
            System.out.println(jsonO);

            nom = (String) jsonO.get("Nom");
            descriptions = (String) jsonO.get("Descriptions");
            capacitee1 = (String[]) jsonO.get("Capacitée1");
            capacitee2 = (String[]) jsonO.get("Capacitée2");
            capacitee3 = (String[]) jsonO.get("Capacitée3");
            capacitee4 = (String[]) jsonO.get("Capacitée4");
            capaciteeSpeciale = jsonO.get("CapacitéeSpéciale");

            Arthur.setNom(nom);
            Arthur.setDescriptions(descriptions);
            Arthur.setCapacitee1(capacitee1);
            Arthur.setCapacitee2(capacitee2);
            Arthur.setCapacitee3(capacitee3);
            Arthur.setCapacitee4(capacitee4);
            Arthur.setCapaciteeSpeciale(capaciteeSpeciale);

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(nom);
        System.out.println(descriptions);
        System.out.println(capacitee1);
        System.out.println(capacitee2);
        System.out.println(capacitee3);
        System.out.println(capacitee4);
        System.out.println(capaciteeSpeciale);

        System.out.println(Arthur.getNom());
        System.out.println(Arthur.getDescriptions());
        System.out.println(Arthur.getHP());
        System.out.println(Arthur.getAction());
        System.out.println(Arthur.getCapacitee1());
        System.out.println(Arthur.getCapacitee2());
        System.out.println(Arthur.getCapacitee3());
        System.out.println(Arthur.getCapacitee4());
        System.out.println(Arthur.getCapaciteeSpeciale());
        System.out.println(Arthur.getInventaire());
        System.out.println(Arthur.getMainDroite());
        System.out.println(Arthur.getMainGauche());
        System.out.println(Arthur.getXP());

    }
}
