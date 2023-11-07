package com.example.tfappapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    final ServerInfoService serverInfoService;
    final DetailsService detailsService;

    public UIController(DetailsService detailsService, ServerInfoService serverInfoService) {
        this.detailsService = detailsService;
        this.serverInfoService = serverInfoService;
    }

    @GetMapping("/")
    String showDetails(Model model) {
        DetailsEntity detailsEntity = detailsService.getDetails();
        model.addAttribute("name", detailsEntity.getName());
        model.addAttribute("age", detailsEntity.getAge());
        model.addAttribute("email", detailsEntity.getEmail());
        model.addAttribute("ip", serverInfoService.getIpAddress());
        return "home";
    }
}
