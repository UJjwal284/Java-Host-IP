package com.example.tfappapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServerInfoController {

    final ServerInfoService serverInfoService;

    public ServerInfoController(ServerInfoService serverInfoService) {
        this.serverInfoService = serverInfoService;
    }

    @GetMapping("/server-ip")
    public String getServerIP() {
        return serverInfoService.getIpAddress();
    }
}
