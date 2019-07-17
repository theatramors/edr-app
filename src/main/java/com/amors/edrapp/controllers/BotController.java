package com.amors.edrapp.controllers;

import com.amors.edrapp.dto.Bot;
import com.amors.edrapp.services.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.amors.edrapp.EdrApplication.PREAUTHORIZE_ADMIN;
import static com.amors.edrapp.EdrApplication.PREAUTHORIZE_ADMIN_OR_USER;

@RestController
@RequestMapping("/bots")
public class BotController {

    private final BotService botService;

    @Autowired
    public BotController(BotService botService) {
        this.botService = botService;
    }

    @PostMapping
    @PreAuthorize(PREAUTHORIZE_ADMIN)
    public void add(@RequestBody Bot bot) {
        botService.add(bot);
    }

    @GetMapping
    @PreAuthorize(PREAUTHORIZE_ADMIN_OR_USER)
    public List<Bot> get() {
        return botService.get();
    }

    @GetMapping("/{id}")
    @PreAuthorize(PREAUTHORIZE_ADMIN_OR_USER)
    public Bot get(@PathVariable String id) {
        return botService.get(id);
    }
}
