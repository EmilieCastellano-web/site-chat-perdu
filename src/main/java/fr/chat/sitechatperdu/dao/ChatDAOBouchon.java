package fr.chat.sitechatperdu.dao;


import fr.chat.sitechatperdu.bo.ChatPerdu;
import fr.chat.sitechatperdu.bo.ChatTrouve;
import fr.chat.sitechatperdu.bo.Race;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ChatDAOBouchon {

    private final List<ChatPerdu> listChatsPerdus = new ArrayList<>();
    private final List<ChatTrouve> listChatsTrouves = new ArrayList<>();

    public ChatDAOBouchon() {

        listChatsPerdus.add(new ChatPerdu( "Simba",
                Race.BENGAL,
                "Doré avec des tâches noires",
                1,
                "Mâle",
                "Très joueur, mais un peu craintif.",
                LocalDate.of(2024, 11, 15)));
        listChatsPerdus.add(new ChatPerdu(
                "Luna",
                Race.SACRE_DE_BIRMANIE,
                "Blanc et marron",
                2,
                "Femelle",
                "Porte un collier rouge.",
                LocalDate.of(2024, 11, 15) // Exemple de date
        ));

        listChatsPerdus.add(new ChatPerdu("Milo",
                Race.MAINE_COON,
                "Gris",
                3,
                "Mâle",
                "Très affectueux, aime les câlins.",
                LocalDate.of(2023, 3, 21)
        ));

        listChatsTrouves.add(new ChatTrouve(
                "Oscar",
                Race.CHARTREUX,
                "Bleu",
                LocalDate.of(2024, 1, 5),
                "Trouvé près d'un parc avec un collier rouge",
                "Mâle",
                4 )
        );

        listChatsTrouves.add(new ChatTrouve(
                "Luna",
                Race.PERSAN,
                "Blanc",
                LocalDate.of(2024, 1, 10),
                "Trouvée près d'une boulangerie, semblait affamée",
                "Femelle",
                2 )
        );

        listChatsTrouves.add(new ChatTrouve(
                "Felix",
                Race.SIBERIEN,
                "Gris tigré",
                LocalDate.of(2024, 1, 15),
                "Trouvé dans une forêt, très sociable",
                "Mâle",
                3 )
        );
    }

    public List<ChatPerdu> selectAllPerdus() {
        return listChatsPerdus;
    }

    public List<ChatTrouve> selectAllTrouves() {
        return listChatsTrouves;
    }

    /**
     * Méthode permettant de retouvé un chat perdu avec son ID
     * @return ChatPerdu
     */
    public ChatPerdu selectPerduById(long id) {
        return listChatsPerdus.stream() .filter(p -> p.getId() == id) .findFirst().orElse(null);
    }

    /**
     * Méthode permettant de retouvé un chat trouve avec son ID
     * @return ChatTrouve
     */
    public ChatTrouve selectTrouveById(long id) {
        return listChatsTrouves.stream() .filter(p -> p.getId() == id) .findFirst().orElse(null);
    }

    /**
     * Ajoute un chat trouvé à la list des chats trouvés
     * @return chat
     */
    public ChatTrouve addChat(ChatTrouve chat) {
        listChatsTrouves.add(chat);
        return chat;
    }

    /**
     * Ajoute un chat perdu à la list des chats perdus
     */
    public void addChat(ChatPerdu chat) {
        listChatsPerdus.add(chat);
    }

    /**
     * Supprimer un chat Perdus avec l'ID associé
     */
    public void removeChatsPerdus(long id) {
        listChatsPerdus.removeIf(p -> p.getId() == id);
    }


    /**
     * Supprimer un chat Trouvé avec l'ID associé
     *
     */
    public void removeChatsTrouve(long id) {
        listChatsTrouves.removeIf(p -> p.getId() == id);
    }
}


