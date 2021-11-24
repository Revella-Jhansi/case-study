package com.example.demo;

import java.util.List;

public interface TaskInterface {
	public int save(Object object);
	public List<Task> getAllTasks();
	public int setpriority(int taskid, String Priority);
	public int setNotes(int Taskid,String Notes);
	public int setBookmarked(int Taskid,Boolean Bookmarked);
	
}