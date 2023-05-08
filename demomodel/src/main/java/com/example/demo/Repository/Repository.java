package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.StudentModel.modelclass;

public interface Repository extends JpaRepository<modelclass, Integer> {

}
