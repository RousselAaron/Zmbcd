package Core;

public class Armes extends Items{

    private int degats;

    private int porté;

    private int nombresDeLancer;

    private int valeurDeReussite;

    private boolean ouvrePorte;

    private int valeurOuvrePorte;

    private boolean bruitOuvrePorte;

    private  boolean bruitAttaque;

    public Armes() {
    }

    public Armes(String nom, String descriptions, String typeItem, String typeEmplacement, int palier, String rareté, int degats, int porté, int nombresDeLancer, int valeurDeReussite, boolean ouvrePorte, int valeurOuvrePorte, boolean bruitOuvrePorte, boolean bruitAttaque) {
        super(nom, descriptions, typeItem, typeEmplacement, palier, rareté);
        this.degats = degats;
        this.porté = porté;
        this.nombresDeLancer = nombresDeLancer;
        this.valeurDeReussite = valeurDeReussite;
        this.ouvrePorte = ouvrePorte;
        this.valeurOuvrePorte = valeurOuvrePorte;
        this.bruitOuvrePorte = bruitOuvrePorte;
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

    public boolean isOuvrePorte() {
        return ouvrePorte;
    }

    public void setOuvrePorte(boolean ouvrePorte) {
        this.ouvrePorte = ouvrePorte;
    }

    public int getValeurOuvrePorte() {
        return valeurOuvrePorte;
    }

    public void setValeurOuvrePorte(int valeurOuvrePorte) {
        this.valeurOuvrePorte = valeurOuvrePorte;
    }

    public boolean isBruitOuvrePorte() {
        return bruitOuvrePorte;
    }

    public void setBruitOuvrePorte(boolean bruitOuvrePorte) {
        this.bruitOuvrePorte = bruitOuvrePorte;
    }

    public boolean isBruitAttaque() {
        return bruitAttaque;
    }

    public void setBruitAttaque(boolean bruitAttaque) {
        this.bruitAttaque = bruitAttaque;
    }
}
