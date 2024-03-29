package com.JoseManuelMartinez.demo.persistence.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "T_PLAYER")
public class Player implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "T_PLAYER_ID")
    private int idPlayer;

    @Column(name = "T_PLAYER_NAME")
    private String name;

    @Column(name = "T_PLAYER_POSITION")
    private String position;

    @Column(name = "T_PLAYER_CLUBNAME")
    private String clubName;

    @Column(name = "T_PLAYER_IMAGEURL")
    private String imageURL;

    public Player(String name, String position, String clubName, String imageURL) {
        this.name = name;
        this.position = position;
        this.clubName = clubName;
        this.imageURL = imageURL;
    }
}
