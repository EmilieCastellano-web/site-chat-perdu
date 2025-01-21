package fr.chat.sitechatperdu.bo;

import java.util.Date;

public class ChatPerdu extends Chat{

    private int age;
    private String gender;
    private String description;
    private Date datePerdu;

    public ChatPerdu(String nom, String couleur, Date datePerdu, String description, String gender, int age) {
        super(nom, couleur);
        this.datePerdu = datePerdu;
        this.description = description;
        this.gender = gender;
        this.age = age;
    }

    public ChatPerdu(String nom, String race, String couleur, Date datePerdu, String description, String gender, int age) {
        super(nom, race, couleur);
        this.datePerdu = datePerdu;
        this.description = description;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chat Perdu : ");
        sb.append("age : ").append(age);
        sb.append(", gender : '").append(gender).append('\'');
        sb.append(", description : '").append(description).append('\'');
        sb.append(", datePerdu : ").append(datePerdu);
        return sb.toString();
    }

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

    public Date getDatePerdu() {
        return datePerdu;
    }

    public void setDatePerdu(Date datePerdu) {
        this.datePerdu = datePerdu;
    }
}
