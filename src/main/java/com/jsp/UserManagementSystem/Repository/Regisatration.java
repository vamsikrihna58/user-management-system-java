package com.jsp.UserManagementSystem.Repository;

import java.util.List;
import java.util.Optional;

import com.jsp.UserManagementSystem.Entity.Task;
import com.jsp.UserManagementSystem.Entity.UserEntity;

public interface Regisatration {
	void saveDetails(UserEntity u);
	UserEntity login(String name,String password);
	List<UserEntity> AllUsers();
	 String saveTask(Task s) ;
	 String UpdateTask(String title,String dec,String due,String ast,String st,int id);
	 Task getById(int id);  
	 String delete(int id);
	 List<Task> byName(String name);
	 List<Task> byDes(String des);
	 List<Task> byAssin(String Assin);
	 List<Task> All();
	 
	

}
