package fr.chat.sitechatperdu.controller;


import fr.chat.sitechatperdu.bll.ChatService;
import fr.chat.sitechatperdu.bo.ChatPerdu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ChatController {

    private ChatService chatService;


    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/affichage")
    public String afficherChat(Model model) {
        ChatPerdu chat1 = chatService.afficherChatTest();
        model.addAttribute("affichageChat", chat1);
        return "test";
    }
}
