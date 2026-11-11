package com.spring.hibernate_demo.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity 
@Table (name="Student")
public class Student {

  @Id 
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String first_name;
  private String last_name;
  private String email;

  public Student(){
  }

  public Student(String first_name, String last_name, String email){
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
  }

  @ManyToMany(mappedBy="students",
              fetch=FetchType.LAZY,
              cascade={CascadeType.DETACH,CascadeType.MERGE,
                        CascadeType.PERSIST,CascadeType.REFRESH})
  private List<Course> courses;

  public List<Course> getCourses() {
    return courses;
  }

  public void addCourse(Course course){
    if(courses == null){
      courses = new ArrayList<>();
    }
    courses.add(course);
    course.addStudent(this);
  }


}
