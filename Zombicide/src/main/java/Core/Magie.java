package Core;

public class Magie extends Items{

    private int degats;

    private int portee;

    private int nombresDeLancer;

    private int valeurDeReussite;

    private  boolean bruitAttaque;

    public Magie() {
    }

    public Magie(String nom, String descriptions, String typeItem, String typeEmplacement, int palier, String rarete, int degats, int portee, int nombresDeLancer, int valeurDeReussite, boolean bruitAttaque) {
        super(nom, descriptions, typeItem, typeEmplacement, palier, rarete);
        this.degats = degats;
        this.portee = portee;
        this.nombresDeLancer = nombresDeLancer;
        this.valeurDeReussite = valeurDeReussite;
        this.bruitAttaque = bruitAttaque;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public int getPortee() {
        return portee;
    }

    public void setPortee(int portee) {
        this.portee = portee;
    }

    public int getNombresDeLancer() {
        return nombresDeLancer;
    }

    public void setNombresDeLancer(int nombresDeLancer) {
        this.nombresDeLancer = nombresDeLancer;
    }

    public int getValeurDeReussite() {
        return valeurDeReussite;
    }

    public void setValeurDeReussite(int valeurDeReussite) {
        this.valeurDeReussite = valeurDeReussite;
    }

    public boolean isBruitAttaque() {
        return bruitAttaque;
    }

    public void setBruitAttaque(boolean bruitAttaque) {
        this.bruitAttaque = bruitAttaque;
    }
}
