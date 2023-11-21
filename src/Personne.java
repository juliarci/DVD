import java.util.Date;

public class Personne {
    private String nom;
    private String prenom;
    private Date datenaiss;

    public Personne(String nom, String prenom, Date datenaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = datenaiss;
    }

    @Override
    public String toString() {
        return "Personne {" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", datenaiss=" + datenaiss +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }
}
