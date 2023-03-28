package controller;

import dto.ListLinksResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ScrapperController {
    @PostMapping("/tg-chat/{id}")
    public ResponseEntity<Void> registerChat(@PathVariable Integer id) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/tg-chat/{id}")
    public ResponseEntity<Void> deleteChat(@PathVariable Integer id) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/links")
    public ListLinksResponse getAllLinks(@PathVariable Integer thChatId) {
        return null;
    }

    @PostMapping("/links")
    public ResponseEntity<Void> addAllLinks(@PathVariable Integer thChatId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/links")
    public ResponseEntity<Void> deleteAllLinks(@PathVariable Integer thChatId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
