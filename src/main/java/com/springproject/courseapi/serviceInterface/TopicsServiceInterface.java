package com.springproject.courseapi.serviceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.courseapi.DTO.Topic;

@Service
public interface TopicsServiceInterface {

	public List<Topic> getAllTopics();

	public Topic getByTopic(int id);

	public Topic addtopics(Topic topic);

	public void updatetopics(Topic topic, int id);

	public void deleteByTopic(int id);
	

}
