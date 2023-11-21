import java.util.Date;

public class Auteur extends Personne{
    public Auteur(String nom, String prenom, Date datenaiss) {
        super(nom, prenom, datenaiss);
    }

    @Override
    public String toString() {
        return "Auteur {"+super.toString()+"}";
    }
}
