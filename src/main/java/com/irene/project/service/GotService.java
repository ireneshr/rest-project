package com.irene.project.service;

import com.irene.project.model.Character;

import java.util.List;
import java.util.Optional;

public interface GotService {

    List<Character> getCharacters();

    Optional<Character> getCharacterById(long id);

    void createCharacter(Character character);

    void changeCharacter(Character character);

    void killCharacter(String name);

    void slaughterHouse(String houseName);

}
