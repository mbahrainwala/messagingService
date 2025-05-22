package ca.mustafa.behrainwala.messagingService.controllers.rest;

import ca.mustafa.behrainwala.messagingService.database.dbo.Items;
import ca.mustafa.behrainwala.messagingService.database.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class MessagingApiController {
    @Autowired
    private ItemsService itemsService;

    @GetMapping(value={"", "/"})
    public ResponseEntity<List<Items>> getMessages(){
        return ResponseEntity.ok(itemsService.getItems());
    }
}
