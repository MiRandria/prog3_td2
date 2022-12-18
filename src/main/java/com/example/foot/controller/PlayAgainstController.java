package com.example.foot.controller;
import com.example.foot.controller.mapper.PlayAgainstMapper;
import com.example.foot.controller.response.PlayAgainstResponse;
import com.example.foot.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final PlayAgainstMapper mapper;

    @GetMapping("/matches")
    public List<PlayAgainstResponse> getMatches() {
        return service.getMatches().stream()
                .map(mapper::toRest)
                .toList();
    }
}
