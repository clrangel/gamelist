package com.clrdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clrdev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
