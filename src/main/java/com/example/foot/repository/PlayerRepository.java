package com.example.foot.repository;

import com.example.foot.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerModel, Integer>{
}
