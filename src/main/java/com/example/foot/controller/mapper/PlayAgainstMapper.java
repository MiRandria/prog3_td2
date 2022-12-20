package com.example.foot.controller.mapper;
import com.example.foot.controller.response.PlayAgainstResponse;
import com.example.foot.model.PlayAgainst;
import org.springframework.stereotype.Component;

@Component
public class PlayAgainstMapper {
    public PlayAgainstResponse toRest(PlayAgainst domain) {
        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .datetime(domain.getDatetime())
                .team1(String.valueOf((domain.getTeam1())))
                .team2(String.valueOf((domain.getTeam2())))
                .build();
    }
}
