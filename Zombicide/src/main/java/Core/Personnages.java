package Core;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Personnages extends Joueurs{

    private String Nom;

    private  String Descriptions;

    private String[] Capacitee1;

    private String[] Capacitee2;

    private String[] Capacitee3;

    private String[] Capacitee4;

    private Object CapaciteeSpeciale;

    public Personnages(int HP, int action, Object mainDroite, Object mainGauche, Object speciale, int XP, Object inventaire, JSONParser jsonP, String nom, String descriptions, String[] capacitee1, String[] capacitee2, String[] capacitee3, String[] capacitee4, Object capaciteeSpeciale) {
        super(HP, action, mainDroite, mainGauche, speciale, XP, inventaire);
        Nom = nom;
        Descriptions = descriptions;
        Capacitee1 = capacitee1;
        Capacitee2 = capacitee2;
        Capacitee3 = capacitee3;
        Capacitee4 = capacitee4;
        CapaciteeSpeciale = capaciteeSpeciale;
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

    public String[] getCapacitee1() {
        return Capacitee1;
    }

    public void setCapacitee1(String[] capacitee1) {
        Capacitee1 = capacitee1;
    }

    public String[] getCapacitee2() {
        return Capacitee2;
    }

    public void setCapacitee2(String[] capacitee2) {
        Capacitee2 = capacitee2;
    }

    public String[] getCapacitee3() {
        return Capacitee3;
    }

    public void setCapacitee3(String[] capacitee3) {
        Capacitee3 = capacitee3;
    }

    public String[] getCapacitee4() {
        return Capacitee4;
    }

    public void setCapacitee4(String[] capacitee4) {
        Capacitee4 = capacitee4;
    }

    public Object getCapaciteeSpeciale() {
        return CapaciteeSpeciale;
    }

    public void setCapaciteeSpeciale(Object capaciteeSpeciale) {
        CapaciteeSpeciale = capaciteeSpeciale;
    }
}
