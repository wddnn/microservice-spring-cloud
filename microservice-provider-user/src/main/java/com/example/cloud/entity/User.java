package com.example.cloud.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String username;

  @Column
  private String name;

  @Column
  private Short age;

  @Column
  private BigDecimal balance;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User(Long id, String username) {
	super();
	this.id = id;
	this.username = username;
}

@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", name=" + name + ", age=" + age + ", balance=" + balance
			+ "]";
}

public User() {
	super();
}

public User(Long id, String username, String name, Short age, BigDecimal balance) {
	super();
	this.id = id;
	this.username = username;
	this.name = name;
	this.age = age;
	this.balance = balance;
}

public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Short getAge() {
    return this.age;
  }

  public void setAge(Short age) {
    this.age = age;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
