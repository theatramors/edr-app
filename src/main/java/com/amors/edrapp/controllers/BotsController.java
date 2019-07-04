package com.amors.edrapp.controllers;

import com.amors.edrapp.dto.Bot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bots")
public class BotsController {

    @GetMapping
    public List<Bot> getBots() {
        ArrayList<Bot> bots = new ArrayList<>();
        bots.add(Bot.builder().id("12345678").name("NotifyBot").url("edr.local/notify-bot").build());
        bots.add(Bot.builder().id("53489651").name("Botany").url("edr.local/botany").build());
        return bots;
    }
}
