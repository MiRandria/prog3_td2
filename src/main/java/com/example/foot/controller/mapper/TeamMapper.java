package com.example.foot.controller.mapper;

import com.example.foot.controller.response.TeamResponse;
import com.example.foot.model.TeamModel;
import org.springframework.stereotype.Component;
@Component
public class TeamMapper {
    public TeamResponse toRest(TeamModel domain) {
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .player(String.valueOf((domain.getPlayer())))
                .sponsor(String.valueOf((domain.getSponsor())))
                .build();
    }
}
