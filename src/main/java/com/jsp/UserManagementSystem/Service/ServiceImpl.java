package com.jsp.UserManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.UserManagementSystem.Entity.Task;
import com.jsp.UserManagementSystem.Entity.UserEntity;
import com.jsp.UserManagementSystem.Repository.Regisatration;
@Service
public class ServiceImpl implements UserService{
@Autowired
private Regisatration re;
	@Override
	public void saveDetails(UserEntity u) {
		re.saveDetails(u);
		
	}

	@Override
	public UserEntity login(String name, String password) {
		
		 return re.login(name, password);
		 
	}

	@Override
	public List<UserEntity> AllUsers() {
		
		return re.AllUsers();
	}
	public String sT(Task s) {
		return re.saveTask(s);
		
		
	}

	@Override
	public  String uptask(String title,String dec,String due,String ast,String st,int id) {
		return re.UpdateTask(title, dec, due, ast, st, id);
	}

	@Override
	public Task get(int id) {
		return re.getById(id);
	}

	@Override
	public String del(int id) {
		 return re.delete(id);
		
	}

	@Override
	public List<Task> byTask(String name) {
		
		return re.byName(name);
	}

	@Override
	public List<Task> byDescription(String des) {
		
		return re.byDes(des);
	}

	@Override
	public List<Task> byAssined(String Assin) {
		// TODO Auto-generated method stub
		return re.byAssin(Assin);
	}

	@Override
	public List<Task> ALL() {
		// TODO Auto-generated method stub
		return re.All();
	}

}
