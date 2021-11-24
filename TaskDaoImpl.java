package com.example.demo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

public class TaskDaoImpl {
	@Autowired
	DbConnection db;
	
	int row = 0;
	
	@Autowired
	Task task = null;

	public int save(Object object) {
		
		try {
			 task = (Task) object;
			 PreparedStatement ps = db.getConnection().prepareStatement("Insert into task values(?,?,?,?,?,?,?,?,?,?,?)");
			 ps.setInt(1, task.getTaskid());
			
			 ps.setString(2, task.getName());
			 ps.setString(3, task.getDescription());
			 ps.setString(4, task.getStatus());
			 ps.setString(5, task.getPriority());
			 ps.setString(6, task.getNotes());
			 ps.setBoolean(7, task.isIsbookmarked());
			 ps.setInt(8, task.getOwnerid());
			 ps.setInt(9, task.getCreatorid());
			 ps.setString(10, task.getCreatedon());
			 ps.setString(11, task.getStatus());
			 ps.setString(12, task.getStatuschangedon());
			 row = ps.executeUpdate();
			 db.closeConnection();
}catch(SQLException e) 
		{
	System.out.println(e);
	}
		
		return row;
	}

}

		