package com.irene.project;

import com.irene.project.dao.CharacterDao;
import com.irene.project.producer.CharacterProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartUpRunner implements ApplicationRunner {

    @Autowired
    CharacterProducer producer;

    @Autowired
    CharacterDao characterDao;

    public void run(ApplicationArguments args) throws Exception {

        for (int i = 1; i <= 10; i++) characterDao.save(producer.produce(i));

    }
}
