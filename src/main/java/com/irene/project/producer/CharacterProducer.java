package com.irene.project.producer;

import com.github.javafaker.Faker;
import com.irene.project.model.Character;
import org.springframework.stereotype.Component;

@Component
public class CharacterProducer {

    private Faker faker;

    public CharacterProducer() {
        this.faker = new Faker();
    }

    public Character produce(int id) {
        Character c = new Character(id, faker.gameOfThrones().character(), faker.gameOfThrones().house(), faker.gameOfThrones().city(),
                faker.gameOfThrones().quote());
        return c;
    }


}
