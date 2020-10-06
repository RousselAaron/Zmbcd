package Core;

public class Joueurs {

    private int HP = 4;

    private int Action = 2;

    private Object MainDroite = null;

    private Object MainGauche = null;

    private Object Speciale = null;

    private int XP = 0;

    private Object Inventaire = null;

    public Joueurs(int HP, int action, Object mainDroite, Object mainGauche, Object speciale, int XP, Object inventaire) {
        this.HP = HP;
        Action = action;
        MainDroite = mainDroite;
        MainGauche = mainGauche;
        Speciale = speciale;
        this.XP = XP;
        Inventaire = inventaire;
    }

    public Joueurs() {
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAction() {
        return Action;
    }

    public void setAction(int action) {
        Action = action;
    }

    public Object getMainDroite() {
        return MainDroite;
    }

    public void setMainDroite(Object mainDroite) {
        MainDroite = mainDroite;
    }

    public Object getMainGauche() {
        return MainGauche;
    }

    public void setMainGauche(Object mainGauche) {
        MainGauche = mainGauche;
    }

    public Object getSpeciale() {
        return Speciale;
    }

    public void setSpeciale(Object speciale) {
        Speciale = speciale;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public Object getInventaire() {
        return Inventaire;
    }

    public void setInventaire(Object inventaire) {
        Inventaire = inventaire;
    }
}
