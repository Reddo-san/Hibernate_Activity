package com.spring.hibernate_demo.entity;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity 
@Table(name="review")
public class Review {

  @Id 
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column (name="id")
  private int id;

  @Column (name="comments")
  private String comments;

  public Review(){
  }

  public Review(String comments){
    this.comments = comments;
  }

  public String getComments() {
    return comments;
  }

}
