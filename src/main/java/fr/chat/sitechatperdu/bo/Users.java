package fr.chat.sitechatperdu.bo;

public class Users {

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String telephone;

    ChatPerdu chatPerdu;
    ChatTrouve chatTrouve;

    /**
     * Constructeur qui permet d'instancier un utilisateur
     * @param nom
     * @param prenom
     * @param email
     * @param password
     * @param telephone
     */
    public Users(String nom, String prenom, String email, String password, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }


    //********************************* GETTERS & SETTERS*************************************************
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
