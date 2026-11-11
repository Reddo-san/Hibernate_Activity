package com.spring.hibernate_demo.entity;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "subject")
  private String subject;

  @Column(name = "hobby")
  private String hobby;

  public InstructorDetail() {
  }

//  @OneToOne (mappedBy = "instructorDeets", cascade = CascadeType.ALL)
//  private Instructor instructor;

  public InstructorDetail(String subject, String hobby) {
    this.subject = subject;
    this.hobby = hobby;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  @Override
  public String toString() {
    return "InstructorDetail [id=" + id + ", subject=" + subject + ", hobby=" + hobby + "]";
  }

  @OneToOne (mappedBy = "instructorDeets", cascade = {CascadeType.DETACH, 
                                                      CascadeType.MERGE, 
                                                      CascadeType.PERSIST, 
                                                      CascadeType.REFRESH})
  private Instructor instructor;
  
}
