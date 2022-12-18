package com.example.foot.repository;

import com.example.foot.model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamModel, Integer> {
}
