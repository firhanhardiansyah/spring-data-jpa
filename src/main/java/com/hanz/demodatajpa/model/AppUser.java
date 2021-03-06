package com.hanz.demodatajpa.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class AppUser {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "username")
  private String username;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "join_date")
  private Date joinDate;

  @Override
  public String toString() {
    return String.format(""
                         + "AppUser[id=%d,username=%s,firstName=%s,lastName=%s,joinDate=%tD]",
                         id, username, firstName, lastName, joinDate);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getJoinDate() {
    return this.joinDate;
  }

  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }

}