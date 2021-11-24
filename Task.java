package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Task {
	private int taskid;
	private int creatorid ;
	private int ownerid;
	private String name;
	private String description;
	private String status;
	private String priority;
	private String notes;
	private String createdon;
	private String statuschangedon;
	
	private boolean isbookmarked;

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public int getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(int creatorid) {
		this.creatorid = creatorid;
	}

	public int getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public String getStatuschangedon() {
		return statuschangedon;
	}

	public void setStatuschangedon(String statuschangedon) {
		this.statuschangedon = statuschangedon;
	}

	public boolean isIsbookmarked() {
		return isbookmarked;
	}

	public void setIsbookmarked(boolean isbookmarked) {
		this.isbookmarked = isbookmarked;
	}

	
	
	
	}

	