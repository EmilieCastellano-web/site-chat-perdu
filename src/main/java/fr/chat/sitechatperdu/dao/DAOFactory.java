package fr.chat.sitechatperdu.dao;

public class DAOFactory {

    private static ChatDAO chatDAO = null;

    public static ChatDAO getChatDAO() {

        if (chatDAO == null) {
            chatDAO = new ChatDAO();
        }
        return chatDAO;
    }
}
