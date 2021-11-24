package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Task;
import com.example.demo.impl.TaskDaoImpl;



@RestController
public class RESTController {
	@Autowired
	Task tk;
	@Autowired
	UserValidationInterface user;
	@Autowired
	TaskDaoImpl d1;

	@RequestMapping(value = "/tasks", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getTask() {
		return d1.getAllTasks();
	}
	
	@RequestMapping(value="/taskid/{taskid}/priority/{priority}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask(@PathVariable("taskid") int task_id, @PathVariable("priority") String priority, Model model) {
		model.addAttribute("taskid", task_id);
		model.addAttribute("priority", priority);
		int row = d1.setpriority(task_id, priority);
		return d1.getAllTasks();
	}
	
	@PostMapping(value= "/addtask", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task task) throws Exception
	{
	   d1.addTask(task);
	   return task;
	}
	
	@RequestMapping(value="/taskid/{taskid}/notes/{notes}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask1(@PathVariable("taskid") int taskid, @PathVariable("notes") String notes, Model model) {
	model.addAttribute("taskid", taskid);
	model.addAttribute("notes",notes);
	int row = d1.setNotes(taskid, notes);
	return d1.getAllTasks();
	}
	@RequestMapping(value="/taskid/{taskid}/bookmarked/{bookmarked}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTaskl(@PathVariable("task_id") int taskid, @PathVariable("bookmarked") boolean bookmarked, Model model) {
	model.addAttribute("taskid", taskid);
	model.addAttribute("bookmarked", bookmarked);
	int row = d1.setBookmarked(taskid, bookmarked);
	return d1.getAllTasks();
	}
	@PostMapping(value="/adduser",consumes="application/json",produces="appication/json")
	public User adduser(@RequestBody User u) throws Exception
	{
		user.adduser(u);
		return u;
	}
}
