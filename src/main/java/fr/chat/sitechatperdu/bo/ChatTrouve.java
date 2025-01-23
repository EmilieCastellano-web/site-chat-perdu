package fr.chat.sitechatperdu.bo;


import java.time.LocalDate;

public class ChatTrouve extends Chat {

    private int age;
    private String gender;
    private String description;
    private LocalDate dateTrouve;
    private long id;
    private long count = 0;
    private static long globalCount = 0;

    /**
     * Constructeur pour instancier un chat trouvé
     * @param nom
     * @param race
     * @param couleur
     * @param dateTrouve
     * @param description
     * @param gender
     * @param age
     */
    public ChatTrouve(String nom, Race race, String couleur, LocalDate dateTrouve, String description, String gender, int age) {
        super(nom, race, couleur);
        this.id = globalCount++;
        this.count = globalCount;
        this.dateTrouve = dateTrouve;
        this.description = description;
        this.gender = gender;
        this.age = age;
    }


    /**
     * Méthode pour définir l'affichage
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chat Trouve : ");
        sb.append("age : ").append(age);
        sb.append(", gender : '").append(gender).append('\'');
        sb.append(", description : '").append(description).append('\'');
        sb.append(", dateTrouve : ").append(dateTrouve);
        return sb.toString();
    }
    //***************************************   GETTERS & SETTERS  ******************************************************
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateTrouve() {
        return dateTrouve;
    }

    public void setDateTrouve(LocalDate dateTrouve) {
        this.dateTrouve = dateTrouve;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
