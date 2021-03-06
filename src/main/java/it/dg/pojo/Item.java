package it.dg.pojo;

import org.springframework.stereotype.Component;

@Component
public class Item {

	private String name;
	private String surname;
	private String birth;
	private String name;

	public Item() {

	}

	public Item(String name, String surname, String birth) {
		super();
		this.name = name;
		this.surname = surname;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + surname + "," + birth;
	}

}
