package com.example.foot.controller.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlayAgainstResponse {
    private int id;
    private LocalDate datetime;
    private String stadium;
    private String team1;
    private String team2;
}
