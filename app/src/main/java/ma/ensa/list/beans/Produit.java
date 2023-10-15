package ma.ensa.list.beans;

public class Produit {

    private int id;
    private String nom;

    private int nbrIngredients;

    private int photo;

    private String duree;

    private String detaisIngred;

    private String description;

    private String preparation;




    public Produit(String nom, int nbrIngredients, int photot, String duree, String detaisIngred, String description, String preparation) {

        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photot;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photot) {
        this.photo = photot;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }


}
