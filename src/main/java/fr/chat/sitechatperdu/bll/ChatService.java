package fr.chat.sitechatperdu.bll;

import fr.chat.sitechatperdu.bo.ChatPerdu;
import fr.chat.sitechatperdu.bo.ChatTrouve;

import java.util.List;

public interface ChatService {

    public ChatPerdu afficherChatTest();

    public List<ChatPerdu> afficherChatPerdu();

    public List<ChatTrouve> afficherChatTrouve();

    public ServiceResponse<ChatPerdu> addChat(ChatPerdu chat );

    public ServiceResponse<ChatPerdu> removeChats(ChatPerdu chat );

    public ServiceResponse<ChatTrouve> addChat(ChatTrouve chat );

    public ServiceResponse<ChatTrouve> removeChats(ChatTrouve chat );

    public List<ChatPerdu> chercherChatPerduCouleur();

    public List<ChatPerdu> chercherChatPerduRace();

    public List<ChatPerdu> chercherChatPerduDate();

    public List<ChatTrouve> chercherChatTrouveCouleur();

    public List<ChatTrouve> chercherChatTrouveRace();

    public List<ChatTrouve> chercherChatTrouveDate();
}
