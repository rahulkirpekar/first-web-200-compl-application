package com.royal.bean;

import java.util.Arrays;

public class StudentBean 
{
	private Integer rno;
	private String fullName;
	private Integer age;
	private String course;
	private String gender;
	private String hobbies[];
	private String dob;
	private String email;
	private String mobile;
	private String address;
	
	public StudentBean() 
	{
	}
	public StudentBean(Integer rno, String fullName, Integer age, String course, String gender, String[] hobbies,
			String dob, String email, String mobile, String address) {
		super();
		this.rno = rno;
		this.fullName = fullName;
		this.age = age;
		this.course = course;
		this.gender = gender;
		this.hobbies = hobbies;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getRno() {
		return rno;
	}

	public void setRno(Integer rno) {
		this.rno = rno;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Boolean isAvailableHobby(String hobby) 
	{
		if (hobbies == null) 
		{
			return false;
		}
		for (int i = 0; i < hobbies.length; i++) 
		{
			if (hobby.equals(hobbies[i])) 
			{
				return true;
			}
		}
		return false;
	}
	
	public String getHobbiesStr() 
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < hobbies.length; i++) 
		{
			if(i < (hobbies.length-1)) 
			{
				sb.append(hobbies[i]+",");
			}
			else 
			{
				sb.append(hobbies[i]);
			}
		} 
		return sb.toString();
	}
	@Override
	public String toString() {
		return "StudentBean [rno=" + rno + ", fullName=" + fullName + ", age=" + age + ", course=" + course
				+ ", gender=" + gender + ", hobbies=" + Arrays.toString(hobbies) + ", dob=" + dob + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + ", getRno()=" + getRno() + ", getFullName()="
				+ getFullName() + ", getAge()=" + getAge() + ", getCourse()=" + getCourse() + ", getGender()="
				+ getGender() + ", getHobbies()=" + Arrays.toString(getHobbies()) + ", getDob()=" + getDob()
				+ ", getEmail()=" + getEmail() + ", getMobile()=" + getMobile() + ", getAddress()=" + getAddress()
				+ ", getHobbiesStr()=" + getHobbiesStr() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}









