package com.code4dem.myApp.repository;

import com.code4dem.myApp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
