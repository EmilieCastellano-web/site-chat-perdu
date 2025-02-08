package fr.chat.sitechatperdu.bll;

import fr.chat.sitechatperdu.bo.ChatPerdu;
import fr.chat.sitechatperdu.bo.ChatTrouve;

import java.util.List;

public interface ChatService {

    //************************  CHATS PERDUS    *****************************************

     List<ChatPerdu> afficherChatPerdu();

    ChatPerdu afficherChatPById(long id);

     ServiceResponse<ChatPerdu> addChatP(ChatPerdu chat );

     ServiceResponse<ChatPerdu> removeChats(ChatPerdu chat );

     List<ChatPerdu> chercherChatPerduCouleur();

     List<ChatPerdu> chercherChatPerduRace();

     List<ChatPerdu> chercherChatPerduDate();

    //************************  CHATS TROUVES    *****************************************

     List<ChatTrouve> afficherChatTrouve();

     ServiceResponse<ChatTrouve> addChatT(ChatTrouve chat );

     ServiceResponse<ChatTrouve> removeChats(ChatTrouve chat );

     List<ChatTrouve> chercherChatTrouveCouleur();

     List<ChatTrouve> chercherChatTrouveRace();

     List<ChatTrouve> chercherChatTrouveDate();

    ChatTrouve afficherChatTById(long id);
}
