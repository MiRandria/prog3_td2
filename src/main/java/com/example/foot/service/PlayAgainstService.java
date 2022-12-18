package com.example.foot.service;

import com.example.foot.model.PlayAgainst;
import com.example.foot.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository repository;

    public List<PlayAgainst> getMatches() {
        return repository.findAll();
    }
}
