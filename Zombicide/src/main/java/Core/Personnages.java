package Core;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Personnages extends Joueurs{

    JSONParser jsonP = new JSONParser();

    JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader("Personnages.json"));

    private String Nom;

    private  String Descriptions;

    private String[] Capacitée1;

    private String[] Capacitée2;

    private String[] Capacitée3;

    private String[] Capacitée4;

    private Object CapacitéeSpéciale;

    public Personnages(int HP, int action, Object mainDroite, Object mainGauche, Object speciale, int XP, Object inventaire, String nom, String descriptions, String[] capacitée1, String[] capacitée2, String[] capacitée3, String[] capacitée4, Object capacitéeSpéciale) throws IOException, ParseException {
        super(HP, action, mainDroite, mainGauche, speciale, XP, inventaire);
        Nom = (String) jsonO.get("nom");
        Descriptions = (String) jsonO.get("descriptions");
        Capacitée1 = (String[]) jsonO.get("capacitée1");
        Capacitée2 = (String[]) jsonO.get("capacitée2");
        Capacitée3 = (String[]) jsonO.get("capacitée3");
        Capacitée4 = (String[]) jsonO.get("capacitée4");
        CapacitéeSpéciale = jsonO.get("capacitéeSpéciale");
    }

    public Personnages() throws IOException, ParseException {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public String[] getCapacitée1() {
        return Capacitée1;
    }

    public void setCapacitée1(String[] capacitée1) {
        Capacitée1 = capacitée1;
    }

    public String[] getCapacitée2() {
        return Capacitée2;
    }

    public void setCapacitée2(String[] capacitée2) {
        Capacitée2 = capacitée2;
    }

    public String[] getCapacitée3() {
        return Capacitée3;
    }

    public void setCapacitée3(String[] capacitée3) {
        Capacitée3 = capacitée3;
    }

    public String[] getCapacitée4() {
        return Capacitée4;
    }

    public void setCapacitée4(String[] capacitée4) {
        Capacitée4 = capacitée4;
    }

    public Object getCapacitéeSpéciale() {
        return CapacitéeSpéciale;
    }

    public void setCapacitéeSpéciale(Object capacitéeSpéciale) {
        CapacitéeSpéciale = capacitéeSpéciale;
    }
}
