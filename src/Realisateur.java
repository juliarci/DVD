import java.util.Date;

public class Realisateur extends Personne{

    public Realisateur(String nom, String prenom, Date datenaiss) {
        super(nom, prenom, datenaiss);
    }

    @Override
    public String toString() {
        return "Realisateur {"+super.toString()+"}";
    }
}
