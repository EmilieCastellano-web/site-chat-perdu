package fr.chat.sitechatperdu.bo;

abstract class Chat {

    private String nom;
    private String couleur;

    Race race;


    public Chat() {
    }


    public Chat(String nom, Race race, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
        this.race = race;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Chat ");
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

    public Race getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = getRace();
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
