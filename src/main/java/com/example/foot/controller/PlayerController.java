package com.example.foot.controller;

import com.example.foot.controller.mapper.PlayerMapper;
import com.example.foot.controller.response.PlayerResponse;
import com.example.foot.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers() {
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }
}
