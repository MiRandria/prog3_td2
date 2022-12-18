package com.example.foot.controller.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlayerResponse {
    private int id;
    private String name;
    private String number;
}
