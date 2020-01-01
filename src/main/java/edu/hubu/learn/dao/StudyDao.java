package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Study;

public interface StudyDao extends JpaRepository<Study, Long> {

}