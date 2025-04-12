package com.example.lab2_20204205.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab2_20204205.entity.auto;



@Repository
public interface AutoRepository extends JpaRepository<auto, Integer> {

}