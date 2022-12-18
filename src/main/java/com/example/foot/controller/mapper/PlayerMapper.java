package com.example.foot.controller.mapper;

import com.example.foot.controller.response.PlayerResponse;
import com.example.foot.model.PlayerModel;
import org.springframework.stereotype.Component;
@Component
public class PlayerMapper {
    public PlayerResponse toRest(PlayerModel domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
