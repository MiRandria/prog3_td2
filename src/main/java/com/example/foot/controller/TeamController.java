package com.example.foot.controller;

import com.example.foot.controller.mapper.TeamMapper;
import com.example.foot.controller.response.TeamResponse;
import com.example.foot.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams() {
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }
}
