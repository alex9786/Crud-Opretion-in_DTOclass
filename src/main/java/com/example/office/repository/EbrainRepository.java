package com.example.office.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.office.entity.Ebrain;


@Repository
public interface EbrainRepository extends JpaRepository<Ebrain, Integer> {

	Optional<Ebrain> findByName(String name);

}
