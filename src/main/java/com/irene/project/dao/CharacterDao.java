package com.irene.project.dao;

import com.irene.project.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends JpaRepository<Character, Long> {

    @Modifying
    @Query("delete from Character c where c.name=:name")
    void deleteByName(@Param("name") String name);

    @Modifying
    @Query("delete from Character c where c.house=:house")
    void deleteByHouse(@Param("house") String house);

}
