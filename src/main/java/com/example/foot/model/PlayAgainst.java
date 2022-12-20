package com.example.foot.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "match")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PlayAgainst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate datetime;
    private String stadium;

    @ManyToOne
    @JoinColumn(name ="id_team1")
    private TeamModel team1;

    @ManyToOne
    @JoinColumn(name = "id_team2")
    private TeamModel team2;
}
