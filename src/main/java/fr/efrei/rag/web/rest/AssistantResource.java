package fr.efrei.rag.web.rest;

import fr.efrei.rag.service.AssistanceAiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssistantResource {

    private final Logger log = LoggerFactory.getLogger(AssistantResource.class);

    private final AssistanceAiService assistanceAiService;

    public AssistantResource(AssistanceAiService assistanceAiService) {
        this.assistanceAiService = assistanceAiService;
    }

    @PostMapping("/assistant/chat")
    public String chat(@RequestBody String query) {
        log.info("REST request to chat with assistant : {}", query);
        return assistanceAiService.chat(query);
    }
}
