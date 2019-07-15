package com.irene.project.service;

import com.irene.project.dao.CharacterDao;
import com.irene.project.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class GotServiceImpl implements GotService {

    @Autowired
    private CharacterDao characterDao;

    @Override
    public List<Character> getCharacters() {
        return characterDao.findAll();
    }

    @Override
    public Optional<Character> getCharacterById(long id) {
        return characterDao.findById(id);
    }

    @Override
    public void createCharacter(Character character) {
        characterDao.save(character);
    }

    @Override
    public void changeCharacter(Character character) {
        characterDao.save(character);
    }

    @Override
    public void killCharacter(String name) {
        System.out.println(name);
        characterDao.deleteByName(name);
    }

    @Override
    public void slaughterHouse(String houseName) {
        characterDao.deleteByHouse(houseName);
    }

}
