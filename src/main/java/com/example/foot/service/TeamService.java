package com.example.foot.service;

import com.example.foot.model.TeamModel;
import com.example.foot.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamModel> getTeams() {
        return repository.findAll();
    }
}
