package com.irene.project.controller;

import com.irene.project.model.Character;
import com.irene.project.service.GotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class GotRestController {

    @Autowired
    private GotService gotService;

    @GetMapping
    public List<Character> getAllCharacters() {
        return gotService.getCharacters();
    }

    @GetMapping("/{id}")
    public Optional<Character> getCharacterById(@PathVariable long id) {
        return gotService.getCharacterById(id);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createCharacter(@ModelAttribute Character character) {
        gotService.createCharacter(character);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> changeCharacter(@ModelAttribute Character character) {
        gotService.changeCharacter(character);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/kill")
    public ResponseEntity<HttpStatus> killCharacter(@RequestParam String name) {
        gotService.killCharacter(name);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/slaughter")
    public ResponseEntity<HttpStatus> exterminateHouse(@RequestParam String house) {
        gotService.slaughterHouse(house);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
