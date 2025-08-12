package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Playlist;

@Repository
public interface PlayListRepository extends JpaRepository<Playlist, Long> {

}
