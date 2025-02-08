package fr.chat.sitechatperdu.bo;

public class Users {

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String telephone;
    private long id;
    private String adresse;
    private static long globalCount = 1;

    ChatPerdu chatPerdu;
    ChatTrouve chatTrouve;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ChatPerdu getChatPerdu() {
        return chatPerdu;
    }

    public void setChatPerdu(ChatPerdu chatPerdu) {
        this.chatPerdu = chatPerdu;
    }

    public ChatTrouve getChatTrouve() {
        return chatTrouve;
    }

    public void setChatTrouve(ChatTrouve chatTrouve) {
        this.chatTrouve = chatTrouve;
    }

    /**
     * Constructeur qui permet d'instancier un utilisateur
     * @param nom
     * @param prenom
     * @param email
     * @param password
     * @param telephone
     * @param adresse
     *
     */
    public Users(String nom, String prenom, String email, String password, String telephone, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.id = globalCount++;
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
