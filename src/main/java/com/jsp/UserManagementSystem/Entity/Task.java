package com.jsp.UserManagementSystem.Entity;

import java.io.Serializable;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Task implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	private String title;
	private String descripttion;
	private String duedate;
	private String assignedto;
	private String status;
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", descripttion=" + descripttion + ", duedate=" + duedate
				+ ", assignedto=" + assignedto + ", status=" + status + "]";
	}
	

}
