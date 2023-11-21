public class Livre extends Article{

    private int isbn;
    private int nbrPages;
    private Personne auteur;

    public Livre(int reference, String designation, int prix, int isbn, int nbrPages, Personne auteur) {
        super(reference, designation, prix);
        this.isbn = isbn;
        this.nbrPages = nbrPages;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "isbn=" + isbn +
                ", nbrPages=" + nbrPages +
                ", auteur=" + auteur +
                '}';
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public Personne getAuteur() {
        return auteur;
    }

    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }
}
