package Core;

public abstract class Armures extends Items {

    private int valeurDeReussite;

    public Armures() {
    }

    public Armures(String nom, String descriptions, String typeItem, String typeEmplacement, int palier, String rarete, int valeurDeReussite) {
        super(nom, descriptions, typeItem, typeEmplacement, palier, rarete);
        this.valeurDeReussite = valeurDeReussite;
    }

    public int getValeurDeReussite() {
        return valeurDeReussite;
    }

    public void setValeurDeReussite(int valeurDeReussite) {
        this.valeurDeReussite = valeurDeReussite;
    }

}
