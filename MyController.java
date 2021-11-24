package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.impl.TaskDaoImpl;

public class MyController {
	@Autowired
	TaskDaoImpl dao;
	
	@Autowired
	Task task1;
	@RequestMapping("/created")
	public String createTask(@RequestParam("taskid") int taskid,@RequestParam("ownerid") int ownerid, 
			                 @RequestParam("creatorid") int creatorid, @RequestParam("name") String name, 
			                 @RequestParam("desc") String desc, @RequestParam("status") String status, 
			                 @RequestParam("priority") String priority, @RequestParam("notes") String notes, 
			                 @RequestParam("isbookmarked") boolean bookmarked, @RequestParam("createdon") String createdon, 
			                 @RequestParam("changedon") String changedon, Model model) {
		
		model.addAttribute("taskid", taskid);
		model.addAttribute("taskname", name);
		
		model.addAttribute("desc", desc);
		model.addAttribute("status", status);
		model.addAttribute("priority", priority);
		model.addAttribute("notes", notes);
		model.addAttribute("isbookmarked", bookmarked);
		model.addAttribute("creatorid", creatorid);
		model.addAttribute("ownerid", ownerid);
		model.addAttribute("createdon", createdon);
		model.addAttribute("changedon", changedon);
		task1.setTaskid(taskid);
		task1.setName(name);
		task1.setDescription(desc);
		task1.setStatus(status);
		task1.setPriority(priority);
		task1.setNotes(notes);
		task1.setIsbookmarked(bookmarked);
		task1.setOwnerid(ownerid);
		task1.setCreatorid(creatorid);
		task1.setCreatedon(createdon);
		task1.setStatuschangedon(changedon);
		int row = dao.save(task1);
		if(row == 1)
		   return "Task is created succesfully";
		else
			return "Task is not created";
		}
	

}

