package fr.chat.sitechatperdu.bo;

import java.time.LocalDate;


public class ChatPerdu extends Chat{

    private int age;
    private String gender;
    private String description;
    private LocalDate datePerdu;
    private long id;
    private static long globalCount = 1;

    public ChatPerdu() {
    }

    /**
     * Constructeur pour instancier un chat perdus
     */
    public ChatPerdu(String nom, Race race, String couleur, int age, String gender, String description, LocalDate datePerdu) {
        super(nom, race, couleur);
        this.id = globalCount++;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.datePerdu = datePerdu;


    }

    /**
     * Méthode pour définir l'affichage
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Chat Perdu : ");
        sb.append("age : ").append(age);
        sb.append(", gender : '").append(gender).append('\'');
        sb.append(", description : '").append(description).append('\'');
        sb.append(", datePerdu : ").append(datePerdu);
        return sb.toString();
    }
    //********************************  GETTERS & SETTERS   ************************************************
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

    public LocalDate getDatePerdu() {
        return datePerdu;
    }

    public void setDatePerdu(LocalDate datePerdu) {
        this.datePerdu = datePerdu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
