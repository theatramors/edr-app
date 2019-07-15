package com.amors.edrapp.services;

import com.amors.edrapp.dto.Bot;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BotService {

    private Map<String, Bot> botsMap;

    @PostConstruct
    public void postConstruct() {
        botsMap = new HashMap<String, Bot>() {{
            put("48651238", Bot.builder().id("48651238").name("NotifyBot").url("edr.local/notify-bot").build());
            put("53489651", Bot.builder().id("53489651").name("Botany").url("edr.local/botany").build());
            put("23545689", Bot.builder().id("23545689").name("SimpleBot").url("edr.local/simple-bot").build());
        }};
    }

    public void add(Bot bot) {
        botsMap.put(bot.getId(), bot);
    }

    public List<Bot> get() {
        return new ArrayList<>(botsMap.values());
    }

    public Bot get(String id) {
        if (botsMap.containsKey(id)) {
            return botsMap.get(id);
        } else {
            throw new EntityNotFoundException(String.format("Bot with id %s not found", id));
        }
    }
}
