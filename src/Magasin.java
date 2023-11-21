import java.util.ArrayList;
import java.util.Date;

public class Magasin {

    private ArrayList<Article> arts;
    private int nbrarticles=20;

    public Magasin() {
        arts = new ArrayList<Article>();
        for (int i = 0; i < (nbrarticles - 1); i++) {
            arts.add(new DVD(1 + i, "DVD ", 50 + i, 60 + i, new Realisateur("Duval", "Pierre", new Date())));
            arts.add(new Livre(1 + i, "Livre", 50 + i, 100 + i, 33 + i, new Auteur("Henry", "Jean", new Date())));
        }
    }

    public ArrayList<Article> getListAuteur() {
        ArrayList<Article> arrayList = new ArrayList<Article>();
        for (Article art : arts) {
            if (art instanceof Livre) {
                arrayList.add(art);
            }
        }
        return arrayList;
    }
    public ArrayList<Article> getListRealis() {
        ArrayList<Article> arrayList = new ArrayList<Article>();
        for (Article art : arts) {
            if (art instanceof DVD) {
                arrayList.add(art);
            }
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "arts=" + arts +
                ", nbrarticles=" + nbrarticles +
                '}';
    }
}
