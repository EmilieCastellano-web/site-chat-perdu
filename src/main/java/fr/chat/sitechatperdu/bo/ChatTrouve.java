package fr.chat.sitechatperdu.bo;

import java.util.Date;

public class ChatTrouve extends Chat {

    private int age;
    private String gender;
    private String description;
    private Date dateTrouve;


    public ChatTrouve(String nom, String couleur, int age, String gender, String description, Date dateTrouve) {
        super(nom, couleur);
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.dateTrouve = dateTrouve;
    }

    public ChatTrouve(String nom, String race, String couleur, int age, String gender, String description, Date dateTrouve) {
        super(nom, race, couleur);
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.dateTrouve = dateTrouve;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chat Trouve : ");
        sb.append("age : ").append(age);
        sb.append(", gender : '").append(gender).append('\'');
        sb.append(", description : '").append(description).append('\'');
        sb.append(", dateTrouve : ").append(dateTrouve);
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

    public Date getDateTrouve() {
        return dateTrouve;
    }

    public void setDateTrouve(Date dateTrouve) {
        this.dateTrouve = dateTrouve;
    }
}
