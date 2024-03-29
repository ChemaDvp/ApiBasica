package com.JoseManuelMartinez.demo.services;

import com.JoseManuelMartinez.demo.persistence.model.Player;

import java.util.List;

public interface PlayerService {
    List<Player> obtenerJugadores();
    Player obtenerJugadorID(int id);
    Player anadirJugador(Player player);
    Player actualizarJugador(int id, Player player);
    void borrarJugador(int id);
}
