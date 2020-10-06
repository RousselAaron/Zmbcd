package Core;

public class Items {

    private String nom;
    
    private String descriptions;

    private String typeItem;
    
    private String typeEmplacement;

    private  int  palier;

    private String rareté;

    public Items() {
    }

    public Items(String nom, String descriptions, String typeItem, String typeEmplacement, int palier, String rareté) {
        this.nom = nom;
        this.descriptions = descriptions;
        this.typeItem = typeItem;
        this.typeEmplacement = typeEmplacement;
        this.palier = palier;
        this.rareté = rareté;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(String typeItem) {
        this.typeItem = typeItem;
    }

    public String getTypeEmplacement() {
        return typeEmplacement;
    }

    public void setTypeEmplacement(String typeEmplacement) {
        this.typeEmplacement = typeEmplacement;
    }

    public int getPalier() {
        return palier;
    }

    public void setPalier(int palier) {
        this.palier = palier;
    }

    public String getRareté() {
        return rareté;
    }

    public void setRareté(String rareté) {
        this.rareté = rareté;
    }
}
