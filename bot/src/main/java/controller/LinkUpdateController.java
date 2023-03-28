package controller;

import dto.ApiErrorResponse;
import dto.LinkUpdate;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LinkUpdateController {
    @PostMapping("/updates")
    public ResponseEntity<Void> updatesPost(@RequestBody LinkUpdate body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
