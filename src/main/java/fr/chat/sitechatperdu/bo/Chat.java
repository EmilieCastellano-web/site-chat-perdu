package fr.chat.sitechatperdu.bo;

public class Chat {

    private String nom;
    private String race;
    private String couleur;


    public Chat(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public Chat(String nom, String race, String couleur) {
       this(nom, couleur);
        this.race = race;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chat ");
        sb.append("nom : '").append(nom).append('\'');
        sb.append(", race : '").append(race).append('\'');
        sb.append(", couleur : '").append(couleur).append('\'');
        return sb.toString();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
