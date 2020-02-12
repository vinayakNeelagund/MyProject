package com.springproject.courseapi.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.courseapi.DTO.Topic;
import com.springproject.courseapi.Repository.TopicRepository;
import com.springproject.courseapi.serviceInterface.TopicsServiceInterface;
@Service
public class TopicsServiceImpl implements TopicsServiceInterface {
	
	@Autowired
	private TopicRepository topicsRepository;
	
	private  List<Topic> topics=new ArrayList<>( Arrays.asList(
			new Topic(1, "Spring boot course", "First Spring Boot Project"),
			new Topic(2, "Java Script ", "Developing Frist java Script Project"),
			new Topic(3, "MySQl", "Writing First SQL Query")
			
			));
	
	@Override
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics=new ArrayList<>();
		topicsRepository.findAll().forEach(topics::add);
		return topics;
	}

	@Override
	public Topic getByTopic(int id) {
		//List<Topic> topics=new ArrayList<>();
		//return topics.stream().filter(t->t.getId()==(id)).findFirst().get();
		return topicsRepository.findById(id).orElseGet(null);
	}

	@Override
	public Topic addtopics(Topic topic1) {
		
		//topics.add(topic);
		
		return topicsRepository.save(topic1);
	}

	@Override
	public void updatetopics(Topic topic, int id) {
		topicsRepository.save(topic);
	}

	@Override
	public void deleteByTopic(int id) {
		topicsRepository.deleteById(id);
	}

}
