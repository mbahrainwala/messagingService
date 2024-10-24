package ca.mustafa.behrainwala.messagingService.controllers.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class MessagingApiController {

    @GetMapping(value={"", "/"})
    public ResponseEntity<List<String>> getMessages(){
        List<String> retList = new ArrayList<>();

        retList.add("Item1");
        retList.add("Item2");
        retList.add("Item3");

        return ResponseEntity.ok(retList);
    }
}
