package com.springproject.courseapi.Controller;


import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.courseapi.DTO.Topic;
import com.springproject.courseapi.serviceInterface.TopicsServiceInterface;

@RestController
public class TopicController {
	@Autowired
	private TopicsServiceInterface topicService;
	@RequestMapping("/topics")
	public List<Topic> topicApi() {
		
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getByTopic(@PathVariable int id) {
		return topicService.getByTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public Topic  addTopic(@RequestBody Topic topic) {
		if(topic.getName().equals("") && topic.getDescription().equals("")) {
			//System.out.println("<><><><><");
			return topicService.addtopics(topic);
		}else {
			//System.out.println("<><><><><1");
			return topicService.addtopics(topic);
		}
		
		
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable int id) {
		topicService.updatetopics(topic,id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteByTopic(@PathVariable int id) {
		 topicService.deleteByTopic(id);
	}
	

}
