package com.jsp.UserManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.UserManagementSystem.Entity.Task;
import com.jsp.UserManagementSystem.Entity.UserEntity;
import com.jsp.UserManagementSystem.Service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class TestController {
	@Autowired
	private UserService se;

	@PostMapping("/save")
	public String save(@RequestBody UserEntity u) {
		se.saveDetails(u);
		System.out.println(u);
		return "data saved";

	}

	@PostMapping("/login")
	public boolean Login(@RequestBody UserEntity u) {
		System.out.println(u);
		UserEntity login = se.login(u.getName(), u.getPassword());
		if (login == null) {
			return false;
		}
		System.out.println(login);
		return true;

	}

	@GetMapping("/get")
	public List<UserEntity> AllDetails() {
		return se.AllUsers();
	}

	@PostMapping("/saveTask")
	public String se(@RequestBody Task s) {
		System.out.println(s);
		return se.sT(s);
	}

	@PostMapping("/updateTask")
	public String UTask(@RequestBody Task s) {
		if (se.get(s.getId()) == null) {

			return "no";
		}
		return se.uptask(s.getTitle(), s.getDescripttion(), s.getDuedate(), s.getAssignedto(), s.getStatus(),
				s.getId());
	}
	@PostMapping("/delete")
	public String deletetask(@RequestBody Task s) {
		return se.del(s.getId());
	}
	@GetMapping("/task")
	public void task(@RequestBody Task s) {
		System.out.println(s);
		System.out.println(se.byTask(s.getTitle()));
	}
	@GetMapping("/des")
	public void des(@RequestBody Task s) {
		System.out.println(se.byDescription(s.getDescripttion()));
	}
	@GetMapping("/assi")
	public void assigned(@RequestBody Task s) {
		System.out.println(se.byAssined(s.getAssignedto()));
	}
	@GetMapping("/alltasks")
	public List<Task> AllTasks() {
		System.out.println(se.ALL());
		return se.ALL()
;	}
}
