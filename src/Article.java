public class Article {

    private int reference;
    private String designation;
    private int prix;

    public Article(int reference, String designation, int prix) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" +
                "reference=" + reference +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
