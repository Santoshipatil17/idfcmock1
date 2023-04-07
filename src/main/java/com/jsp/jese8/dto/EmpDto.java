package com.jsp.jese8.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


/*import org.springframework.stereotype.Component;*/

@Entity
//@Component
public class EmpDto {
	@Id
	private String email;
	private String pwd;
	private String name;
	private String role;
	private long phoneno;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "EmpDto [email=" + email + ", pwd=" + pwd + ", name=" + name + ", role=" + role + ", phoneno=" + phoneno
				+ "]";
	}

}
