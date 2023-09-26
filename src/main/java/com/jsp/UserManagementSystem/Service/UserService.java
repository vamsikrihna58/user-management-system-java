package com.jsp.UserManagementSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.UserManagementSystem.Entity.Task;
import com.jsp.UserManagementSystem.Entity.UserEntity;
@Service
public interface UserService {
	void saveDetails(UserEntity u);
	UserEntity login(String name,String password);
	List<UserEntity> AllUsers();
	 String sT(Task s) ;
	 String uptask(String title,String dec,String due,String ast,String st,int i);
	 Task get(int id);
	 String del(int id);
	 List<Task> byTask(String name);
	 List<Task> byDescription(String des);
	 List<Task> byAssined(String Assin);
	 List<Task> ALL();

}
