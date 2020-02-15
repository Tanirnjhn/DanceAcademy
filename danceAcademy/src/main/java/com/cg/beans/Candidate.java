package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Candidate")
public class Candidate {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "candidate_id")
	private int candidateId;
	@NotNull
	 @Column(name = "first_name")
	private String firstname;
	@NotNull
	 @Column(name = "last_name")
	private String lastname;
	@NotNull
	 @Column(name = "address")
	private String address;
	@NotNull
	 @Column(name = "email")
	private String email;
	@NotNull
	 @Column(name = "phone")
	private String phone;
	@NotNull
	@Column(unique = true)
	private String username;
	@NotNull
	@Column(name = "password")
	private String password;
	@NotNull
	@Column(name = "danceStyle")
	private String danceStyle;
	@NotNull
	@Column(name = "gender")
	private String gender;
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDanceStyle() {
		return danceStyle;
	}
	public void setDanceStyle(String danceStyle) {
		this.danceStyle = danceStyle;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + ", username=" + username
				+ ", password=" + password + ", danceStyle=" + danceStyle + ", gender=" + gender + "]";
	}
	
	

	
	
}

	