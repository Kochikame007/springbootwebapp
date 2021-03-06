package com.spring.boot.webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String name;
	private String adderssLine1;
	private String city;
	private String state;
	private int zip;

	@OneToMany
	@JoinColumn(name="publisher_id")
	private Set<Book> book = new HashSet<>();

//	public Publisher() {
//
//	}
//
//	public Publisher(Long id, String name, String adderssLine1, String city, String state, int zip) {
//		super();
//
//		this.name = name;
//		this.adderssLine1 = adderssLine1;
//		this.city = city;
//		this.state = state;
//		this.zip = zip;
////		this.book = book;
//	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdderssLine1() {
		return adderssLine1;
	}

	public void setAdderssLine1(String adderssLine1) {
		this.adderssLine1 = adderssLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Publisher [Id=" + Id + ", name=" + name + ", adderssLine1=" + adderssLine1 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", book=" + book + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

}
