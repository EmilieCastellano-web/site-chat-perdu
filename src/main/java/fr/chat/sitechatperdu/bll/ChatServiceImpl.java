package fr.chat.sitechatperdu.bll;

import fr.chat.sitechatperdu.bo.ChatPerdu;
import fr.chat.sitechatperdu.bo.ChatTrouve;
import fr.chat.sitechatperdu.dao.ChatDAOBouchon;
import fr.chat.sitechatperdu.dao.DAOFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    //**********************    CHATS PERDUS    ********************************************

    @Override
    public ChatPerdu afficherChatPById(long id) {
    ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();

        return chatDAOBouchon.selectPerduById(id);
    }

    @Override
    public List<ChatPerdu> afficherChatPerdu() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        return chatDAOBouchon.selectAllPerdus();
    }

    @Override
    public ServiceResponse<ChatPerdu> addChatP(ChatPerdu chat) {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        ChatPerdu foundPerdu = chatDAOBouchon.selectPerduById(chat.getId());
        if (foundPerdu != null) {
            ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse<>(
                    "703",
                    "Impossible d'ajouter un chat déjà existant, l 'id existe déjà",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAOBouchon.addChat(chat);
        ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse<>(
                "200", "Chat ajouté avec succès", chat);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public ServiceResponse<ChatPerdu> removeChats(ChatPerdu chat) {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        ChatPerdu perdu = chatDAOBouchon.selectPerduById(chat.getId());
        if (perdu == null) {
            ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse(
                    "702",
                    " Impossible de supprimer un chat inexistant",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAOBouchon.removeChatsPerdus(chat.getId());
        ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse(
                "200",
                "Chat supprimé avec succès",
                perdu);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public List<ChatPerdu> chercherChatPerduCouleur() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAOBouchon.selectAllPerdus();
        return List.of();
    }

    @Override
    public List<ChatPerdu> chercherChatPerduRace() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAOBouchon.selectAllPerdus();
        return List.of();
    }

    @Override
    public List<ChatPerdu> chercherChatPerduDate() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAOBouchon.selectAllPerdus();
        return List.of();
    }


    //**********************    CHATS TROUVES    ********************************************


    @Override
    public List<ChatTrouve> afficherChatTrouve() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAOBouchon.selectAllTrouves();
        return chatTrouves;
    }

    @Override
    public ServiceResponse<ChatTrouve> addChatT(ChatTrouve chat) {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        ChatTrouve foundTrouve = chatDAOBouchon.selectTrouveById(chat.getId());
        if (foundTrouve != null) {
            ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                    "703",
                    "Impossible d'ajouter un chat déjà existant, l'id existe déjà",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAOBouchon.addChat(chat);
        ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                "200", "Chat ajouté avec succès", chat);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public ServiceResponse<ChatTrouve> removeChats(ChatTrouve chat) {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        ChatTrouve foundTrouve = chatDAOBouchon.selectTrouveById(chat.getId());
        if (foundTrouve == null) {
            ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                    "703",
                    "Impossible de supprimer un chat inexistant",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAOBouchon.removeChatsTrouve(chat.getId());
        ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                "200", "Chat supprimer avec succès", chat);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public List<ChatTrouve> chercherChatTrouveCouleur() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAOBouchon.selectAllTrouves();
        return List.of();
    }

    @Override
    public List<ChatTrouve> chercherChatTrouveRace() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAOBouchon.selectAllTrouves();
        return List.of();
    }

    @Override
    public List<ChatTrouve> chercherChatTrouveDate() {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAOBouchon.selectAllTrouves();
        return List.of();
    }

    @Override
    public ChatTrouve afficherChatTById(long id) {
        ChatDAOBouchon chatDAOBouchon = DAOFactory.getChatDAO();
        ChatTrouve t = chatDAOBouchon.selectTrouveById(id);
        return t;
    }
}
