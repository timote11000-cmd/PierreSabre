package personnages;

public class Humain {
    private String nom;
    private String BoissonPreferee;
    private int QuantiteArgent;
    
    public Humain(String nom, String boissonPreferee, int quantiteArgent) {
        this.nom = nom;
        this.BoissonPreferee = boissonPreferee;
        this.QuantiteArgent = quantiteArgent;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getBoisson() {
        return BoissonPreferee;
    }
    public void setBoisson(String boisson) {
        BoissonPreferee = boisson;
    }
    public int getQuantiteArgent() {
        return QuantiteArgent;
    }
    public void setQuantiteArgent(int quantiteArgent) {
        QuantiteArgent = quantiteArgent;
    }
    
    protected void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }
    

    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + BoissonPreferee + ".");
    }


    public void boire() {
        parler("Mmmm, un bon verre de " + BoissonPreferee + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (QuantiteArgent >= prix) {
            parler("J'ai " + QuantiteArgent + " sous en poche. Je vais pouvoir m'offrir " 
                   + bien + " à " + prix + " sous");
            perdreArgent(prix);
        } else {
            parler("Je n'ai plus que " + QuantiteArgent 
                   + " sous en poche. Je ne peux même pas m'offrir " 
                   + bien + " à " + prix + " sous.");
        }
    }
    
    protected void gagnerArgent(int gain) {
        QuantiteArgent += gain;
    }
    
    protected void perdreArgent(int perte) {
        QuantiteArgent -= perte; 
    }
}
