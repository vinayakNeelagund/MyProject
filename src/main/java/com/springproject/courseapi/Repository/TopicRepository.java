package com.springproject.courseapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springproject.courseapi.DTO.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>{

}
