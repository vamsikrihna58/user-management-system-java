package com.jsp.UserManagementSystem.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.http.HttpStatus;
import com.jsp.UserManagementSystem.Entity.Task;
import com.jsp.UserManagementSystem.Entity.UserEntity;

@Repository
public class RegistrationImpl implements Regisatration{
  @Autowired
  private UserRpository re;
  @Autowired
  private TaskRepository tr;
	@Override
	public void saveDetails(UserEntity u) {
		re.save(u);
		
	}

	@Override
	public UserEntity login(String name, String password) {
		UserEntity entity = re.getUserObject(name, password);
		return entity;
	}

	@Override
	public List<UserEntity> AllUsers() {
		return re.findAll();
	}
  public String saveTask(Task s) {
	  tr.save(s);
	  return "Task saved";
  }
  public String UpdateTask(String title,String dec,String due,String ast,String st,int id) {
	  tr.upt(title, dec, due, ast, st, id);
	  return "updated";
  }

@Override
public Task getById(int id) {
	 
	 Optional<Task> id2 = tr.findById(id);
	 if(id2.isPresent()) return id2.get();
	 else return null;
	
}

@Override
public String delete(int id) {
	Task byId = getById(id);
	if(byId !=null) {
		tr.deleteById(id);
		return "deleted";
	}
	return "no";
}

@Override
public List<Task> byName(String name) {
	
	return tr.findByTitle(name);
}

@Override
public List<Task> byDes(String des) {
	// TODO Auto-generated method stub
	return tr.findByDescripttion(des);
}

@Override
public List<Task> byAssin(String Assin) {
	
	return tr.findByAssignedto(Assin);
}

@Override
public List<Task> All() {
	return tr.findAll();
	 
}
}
