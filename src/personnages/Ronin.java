package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boisson, int argent) {
        super(nom, boisson, argent);
        this.honneur = 0;
    }

    public void donner(Commercant beneficiaire) {
        int don = getArgent() / 10;
        parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
        perdreArgent(don);
        beneficiaire.recevoir(don);
    }
    
    public void provoquer(Yakuza adversaire) {
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");

        if (this.honneur >= adversaire.getReputation()) {
            parler("Je t'ai eu petit yakuza !");
            int gain = adversaire.perdre();
            gagnerArgent(gain);
            this.honneur++;
        } else {
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
            int perte = getArgent();
            adversaire.gagner(perte);
            perdreArgent(perte);
            this.honneur--;
        }
    }
}