package personnages;

public class Yakuzas extends Humain {

    private String clan;
    private int reputation = 0;

    public Yakuzas(String nom, int argent, String clan) {
        super(nom, "whisky", argent);
        this.clan = clan;
    }

    @Override
    public void direBonjour() {
        parler("Bonjour, je m'appelle " + getNom() + ", je suis du clan " + clan + " et j'ai une réputation de " + reputation + ".");
    }

    public void extorquer(Commercant victime) {
        parler("Tiens tiens... " + victime.getNom() + ", donne-moi ton argent !");
        int argentVole = victime.seFaireExtorquer();
        gagnerArgent(argentVole);
        reputation++;
        parler("J'ai gagné " + argentVole + " sous, ma réputation est maintenant de " + reputation + ".");
    }

    public void perdre() {
        parler("J'ai perdu un duel... Honte au clan " + clan + ".");
        reputation--;
        if (reputation < 0) {
        	reputation = 0;
        }
    }

    public void gagner() {
        reputation++;
        parler("Victoire ! Ma réputation augmente à " + reputation + ".");
    }
}
