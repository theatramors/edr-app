package com.amors.edrapp.controllers;

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
        bots.add(new Bot("12345678", "NotifyBot", "edr.local/notify-bot"));
        bots.add(new Bot("53489651", "Botany", "edr.local/botany"));
        return bots;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    private static class Bot {
        public String id;
        public String name;
        public String url;

        public Bot() {
        }

        public Bot(String id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url = url;
        }
    }
}
