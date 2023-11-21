public class DVD extends Article{
    private int prix;
    private int duree;
    private Personne personne;

    public DVD(int reference, String designation, int prix, int duree, Personne personne) {
        super(reference, designation, prix);
        this.prix=prix;
        this.duree=duree;
        this.personne=personne;
    }

    @Override
    public int getPrix() {
        return prix;
    }

    @Override
    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "prix=" + prix +
                ", duree=" + duree +
                ", personne=" + personne +
                '}';
    }
}
