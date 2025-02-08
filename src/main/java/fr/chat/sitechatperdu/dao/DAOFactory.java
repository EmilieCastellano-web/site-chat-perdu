package fr.chat.sitechatperdu.dao;

public class DAOFactory {

    private static ChatDAOBouchon chatDAOBouchon = null;

    public static ChatDAOBouchon getChatDAO() {

        if (chatDAOBouchon == null) {
            chatDAOBouchon = new ChatDAOBouchon();
        }
        return chatDAOBouchon;
    }
}
