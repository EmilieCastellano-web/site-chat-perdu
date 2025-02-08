package fr.chat.sitechatperdu.controller;


import fr.chat.sitechatperdu.bll.ChatService;
import fr.chat.sitechatperdu.bo.ChatPerdu;
import fr.chat.sitechatperdu.bo.ChatTrouve;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ChatController {

    private final ChatService chatService;


    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chats/perdus")
    public String afficherChatPerdu(Model model) {
        List<ChatPerdu> chatsPerdus = chatService.afficherChatPerdu();
        model.addAttribute("chatsPerdus", chatsPerdus);
        return "view-chats-perdus";
    }

    @GetMapping("/chats/trouves")
    public String afficherChatTrouve(Model model) {
        List<ChatTrouve> chatsTrouves = chatService.afficherChatTrouve();
        model.addAttribute("chatsTrouves", chatsTrouves);
        return "view-chats-trouves";
    }

    @GetMapping("/chats/perdus/detail")
    public String afficherDetailPerdus(@RequestParam("id") long id, Model model) {
        ChatPerdu p = chatService.afficherChatPById(id);
        model.addAttribute("chatPerdu", p);
        System.out.println(p);

        return "view-chat-perdu-detail";
    }

    @GetMapping("/chats/trouves/detail")
    public String afficherDetailTrouve(@RequestParam("id") long id, Model model) {
        ChatTrouve t = chatService.afficherChatTById(id);
        model.addAttribute("chatTrouve", t);
        System.out.println(t);

        return "view-chat-trouve-detail";
    }

    @GetMapping("/chats/perdus/ajouter")
    public String afficherFormulaireAjoutP(Model model) {
        model.addAttribute("chatPerdu", new ChatPerdu());
        return "chat-perdu-add";
    }

    @PostMapping("/chats/perdus/ajouter")
    public String ajouterChatP(@ModelAttribute ChatPerdu chatPerdu) {
        chatService.addChatP(chatPerdu);
        return "redirect:/chats/perdus";
    }

    @GetMapping("/chats/trouves/ajouter")
    public String afficherFormulaireAjoutT(Model model) {
        model.addAttribute("chatTrouve", new ChatTrouve());
        return "chat-trouve-add";
    }

    @PostMapping("/chats/trouves/ajouter")
    public String ajouterChatT(@ModelAttribute ChatTrouve chatTrouve) {
        chatService.addChatT(chatTrouve);
        System.out.println(chatTrouve);
        return "redirect:/chats/trouves";
    }
}
