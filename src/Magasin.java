import java.util.ArrayList;
import java.util.Date;

public class Magasin {

    private ArrayList<Article> arts;
    private int nbrDVD = 10;
    private int nbrLivre = 10;

    public Magasin() {
        arts = new ArrayList<Article>();
        for (int i = 0; i < (nbrDVD - 1); i++) {
            arts.add(new DVD(1 + i, "DVD ", 50 + i, 60 + i, new Realisateur("Duval", "Pierre", new Date())));
        }
        for (int j = nbrDVD; j < (nbrLivre - 1); j++) {
            arts.add(new Livre(1 + j, "Livre", 50 + j, 100 + j, 33 + j, new Auteur("Henry", "Jean", new Date())));
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

    @Override
    public String toString() {
        return "Magasin{" +
                "arts=" + arts +
                ", nbrDVD=" + nbrDVD +
                ", nbrLivre=" + nbrLivre +
                '}';
    }
}
