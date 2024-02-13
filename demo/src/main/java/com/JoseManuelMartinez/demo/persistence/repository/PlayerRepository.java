package com.JoseManuelMartinez.demo.persistence.repository;

import com.JoseManuelMartinez.demo.persistence.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> { }
