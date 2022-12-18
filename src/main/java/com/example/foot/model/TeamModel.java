package com.example.foot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Entity
@Table(name = "team")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TeamModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name ="id_player")
    private Set<PlayerModel> player;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name ="id_sponsor")
    private Set<SponsorModel> sponsor;
}
