package fr.chat.sitechatperdu.bll;

import fr.chat.sitechatperdu.bo.ChatPerdu;
import fr.chat.sitechatperdu.bo.ChatTrouve;
import fr.chat.sitechatperdu.dao.ChatDAO;
import fr.chat.sitechatperdu.dao.DAOFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Override
    public ChatPerdu afficherChatTest() {
        return null;
    }

    @Override
    public List<ChatPerdu> afficherChatPerdu() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAO.selectAllPerdus();
        for (ChatPerdu chatPerdu : chatPerdus) {
            System.out.println(chatPerdu);
        }
        return List.of();
    }

    @Override
    public List<ChatTrouve> afficherChatTrouve() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAO.selectAllTrouves();
        for (ChatTrouve chatTrouve : chatTrouves) {
            System.out.println(chatTrouve);
        }
        return List.of();
    }

    @Override
    public ServiceResponse<ChatPerdu> addChat(ChatPerdu chat) {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        ChatPerdu foundPerdu = chatDAO.selectPerduById(chat.getId());
        if (foundPerdu != null) {
            ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse<>(
                    "703",
                    "Impossible d'ajouter un chat déjà existant, l 'id existe déjà",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAO.addChat(chat);
        ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse<>(
                "200", "Chat ajouté avec succès", chat);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public ServiceResponse<ChatPerdu> removeChats(ChatPerdu chat) {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
       ChatPerdu perdu = chatDAO.selectPerduById(chat.getId());
       if (perdu == null) {
           ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse(
                   "702",
                   " Impossible de supprimer un chat inexistant",
                   null);
           return ServiceHelpers.hookLog(serviceResponse);
       }
       chatDAO.removeChatsPerdus(chat.getId());
        ServiceResponse<ChatPerdu> serviceResponse = new ServiceResponse(
                "200",
                "Chat supprimé avec succès",
                perdu);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public ServiceResponse<ChatTrouve> addChat(ChatTrouve chat) {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        ChatTrouve foundTrouve = chatDAO.selectTrouveById(chat.getId());
        if (foundTrouve != null) {
            ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                    "703",
                    "Impossible d'ajouter un chat déjà existant, l'id existe déjà",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAO.addChat(chat);
        ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                "200", "Chat ajouté avec succès", chat);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public ServiceResponse<ChatTrouve> removeChats(ChatTrouve chat) {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        ChatTrouve foundTrouve = chatDAO.selectTrouveById(chat.getId());
        if (foundTrouve == null) {
            ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                    "703",
                    "Impossible de supprimer un chat inexistant",
                    null);
            return ServiceHelpers.hookLog(serviceResponse);
        }
        chatDAO.removeChatsTrouve(chat.getId());
        ServiceResponse<ChatTrouve> serviceResponse = new ServiceResponse<>(
                "200", "Chat supprimer avec succès", chat);
        return ServiceHelpers.hookLog(serviceResponse);
    }

    @Override
    public List<ChatPerdu> chercherChatPerduCouleur() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAO.selectAllPerdus();
        return List.of();
    }

    @Override
    public List<ChatPerdu> chercherChatPerduRace() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAO.selectAllPerdus();
        return List.of();
    }

    @Override
    public List<ChatPerdu> chercherChatPerduDate() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatPerdu> chatPerdus = chatDAO.selectAllPerdus();
        return List.of();
    }

    @Override
    public List<ChatTrouve> chercherChatTrouveCouleur() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAO.selectAllTrouves();
        return List.of();
    }

    @Override
    public List<ChatTrouve> chercherChatTrouveRace() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAO.selectAllTrouves();
        return List.of();
    }

    @Override
    public List<ChatTrouve> chercherChatTrouveDate() {
        ChatDAO chatDAO = DAOFactory.getChatDAO();
        List<ChatTrouve> chatTrouves = chatDAO.selectAllTrouves();
        return List.of();
    }
}
