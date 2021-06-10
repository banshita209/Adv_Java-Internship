package com.model;

public class Complain {

	private int id;
	private String title;
	private String description;
	private String address;
	private int user;
	private long contact;
	private int isActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		if (isActive) {
			this.isActive = 1;
		}
		this.isActive=0;
	}

	@Override
	public String toString() {
		return "Complain [id=" + id + ", title=" + title + ", description=" + description + ", address=" + address
				+ ", user=" + user + ", contact=" + contact + ", isActive=" + isActive + "]";
	}

}
