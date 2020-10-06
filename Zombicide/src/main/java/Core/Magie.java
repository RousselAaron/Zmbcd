package Core;

public class Magie extends Items{

    private int degats;

    private int porté;

    private int nombresDeLancer;

    private int valeurDeReussite;

    private  boolean bruitAttaque;

    public Magie() {
    }

    public Magie(String nom, String descriptions, String typeItem, String typeEmplacement, int palier, String rareté, int degats, int porté, int nombresDeLancer, int valeurDeReussite, boolean bruitAttaque) {
        super(nom, descriptions, typeItem, typeEmplacement, palier, rareté);
        this.degats = degats;
        this.porté = porté;
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

    public int getPorté() {
        return porté;
    }

    public void setPorté(int porté) {
        this.porté = porté;
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
