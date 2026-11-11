package com.spring.hibernate_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

//import com.spring.hibernate_demo.dao.StudentDao;

import com.spring.hibernate_demo.dao.AppDao;
import com.spring.hibernate_demo.entity.Course;
//import com.spring.hibernate_demo.entity.Instructor;
//import com.spring.hibernate_demo.entity.InstructorDetail;
//import com.spring.hibernate_demo.entity.Review;
//import com.spring.hibernate_demo.entity.Student;
import com.spring.hibernate_demo.entity.Student;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

  @Bean
  CommandLineRunner commandLineRunner(AppDao app) {
    return runner ->{
      //createStudent(studentDao);
      //readStudent(studentDao);
      //queryStudents(studentDao);
      //queryStudentLastName(studentDao);
      //updateStudent(studentDao);
      //deleteStudent(studentDao);
      //deleteAllStudent(studentDao);

      //createInstructor(app);
      //findInstructor(app);
      //deleteInstructor(app);
      //findInstructorDetail(app);
      //deleteInstructorDetail(app);
      //createInstructorWithCourses(app);
      //findInstructorWithCourses(app);
      //findInstructorWithCoursesJoinFetch(app);
      //updateInstructor(app);
      //deleteInstructorOnly(app);
      //createCourseAndReviews(app);
      //retrieveCourseAndReviews(app);
      //deleteCourseAndReviews(app);
      //createCourseAndStudents(app);
      //findCourseAndStudents(app);
      //addMoreCoursesForStudent(app);
      deleteCourseById(app);
    };
  }

  private void deleteCourseById(AppDao app){
    int id = 11;

    System.out.println("Delete!" + id);
    app.deleteCourseById(id);
    System.out.println("WALA NA!!!");
  }

/*
  private void addMoreCoursesForStudent(AppDao app){
    int id = 2;
    Student student = app.findStudentAndCoursesByStudentId(id);
    Course course1 = new Course("Paano ba toh?");
    Course course2 = new Course("Ganito ba toh?");
    Course course3 = new Course("Pwede ba toh?");

    student.addCourse(course1);
    student.addCourse(course2);
    student.addCourse(course3);

    System.out.println("Success!");
    app.update(student);

  }
*/

/*  
  public void findCourseAndStudents(AppDao app){
    int id = 7;
    Course course = app.findCourseAndStudentByCourseId(id);
    System.out.println("Course: "+course);
    System.out.println("Students: "+ course.getStudents());
  }
*/

/*
  private void createCourseAndStudents(AppDao app){
    Course course = new Course ("How to ult");

    Student student1 = new Student("Esmi", "Ringhoy", "esmi.ringhoy@example.com");
    Student student2 = new Student("Nagi", "Atay", "nagi.atay@example.com");

    course.addStudent(student1);
    course.addStudent(student2);
    app.save(course);
    System.out.println("Yown Pasok!");
  }
*/

/*
  private void deleteCourseAndReviews(AppDao app){
    int id = 4;
    System.out.println("Delete course: " + id);
    app.deleteCourseById(id);
    System.out.println("Gone.");
  }
*/
/*
  private void retrieveCourseAndReviews(AppDao app){
    int id = 3;
    System.out.println("GET ID!" + id);
    Course course = app.findCourseAndReviewsByCourseId(id);
    System.out.println(course);
    System.out.println(course.getReview());
  }
*/
/*
  private void createCourseAndReviews(AppDao app){
    Course course = new Course("How to basic");

    course.addReview(new Review("Egg"));
    course.addReview(new Review("More egg"));
    course.addReview(new Review("Hair cake"));

    System.out.println("Course saved!");
    app.save(course);
  }
*/
/*
  private void deleteInstructorOnly(AppDao app){
    int id=5;
    System.out.println(id + "be gone!");
    app.deleteInstructorById(id);
    System.out.println("Successfully banished.");
  }
*/
/*
  private void updateInstructor(AppDao app){
    int id=7;
    System.out.println("Find proof of existence: " + id);
    Instructor ins = app.findInstructorById(id);
    ins.setLastName("Wakarimasen");
    System.out.println("Identity changed.");
    app.update(ins);

  }
*/

/*
  private void findInstructorWithCoursesJoinFetch(AppDao app){

    int id = 7;
    System.out.println("Find instructor id: "+id);
    Instructor ins = app.findInstructorByIdJoinFetch(id);
    System.out.println("Instructor: "+ins);
    System.out.println("Courses: "+ins.getCourses());
  }
*/
  
/*
  private void findInstructorWithCourses(AppDao app){
    int id = 7;
    System.out.println("Hunt 'em down. " + id);
    Instructor ins = app.findInstructorById(id);

    System.out.println("Instructor: " + ins);
    System.out.println("Courses from id: " + id);
    List<Course> courses = app.findCoursesByInstructorId(id);
    ins.setCourses(courses);
    System.out.println("Courses: " + ins.getCourses());
  }
*/

/*
  private void createInstructorWithCourses(AppDao app) {
    Instructor ins = new Instructor("Zenzen", 
                                    "Wakaranai", 
                                    "zenzen.wakaranai@example.com");
    InstructorDetail deets = new InstructorDetail("Bee Movie", "Jazz");
    ins.setInstructorDeets(deets);

    Course course1 = new Course("Jazz");
    Course course2 = new Course("Honey Making");
    ins.add(course1);
    ins.add(course2);

    System.out.println("Of course: " + ins.getCourses());
    app.save(ins);
  }
*/

/*
  private void deleteInstructorDetail(AppDao app) {
    int theId = 6;
    System.out.println("Erasing the existence of instructor with id: " + theId);
    app.deleteInstructorDetail(theId);
    System.out.println("Instructor " + theId + " have been removed from existence.");
  }
*/

/*
  private void findInstructorDetail(AppDao app) {
    int theId = 3;
    System.out.println("Kidnapping Instructor with the id: " + theId);
    InstructorDetail details = app.findInstructorDetailById(theId);
    System.out.println("Target captured.");
    System.out.println("Details: " + details);
    System.out.println("Instructor: " + details.getInstructor());
  }
*/    

/*
  private void deleteInstructor(AppDao app) {
    int theId = 4;
    System.out.println("Eliminating instructor with id: " + theId);
    app.deleteInstructorId(theId);
    System.out.println("Instructor " + theId + " has been eliminated.");
  }
*/ 

/*
  private void findInstructor(AppDao app) {
    int theId = 1;
    Instructor ins = app.findInstructorById(theId);
    System.out.println("Instructor: " + ins);
    System.out.println("Details: " + ins.getInstructor());
  }
*/ 

/*
  private void createInstructor(AppDao app) {
    Instructor ins = new Instructor("Motte", "Kimasu", "motte.kimasu@example.com");
    InstructorDetail deets = new InstructorDetail("Python", "Snake");
    Instructor ins2 = new Instructor("Arigatou", "Gozaimasu", "arigatou.gozaimasu@example.com");
    InstructorDetail deets2 = new InstructorDetail("Assembly", "Avengers");
    ins.setInstructorDeets(deets);
    ins2.setInstructorDeets(deets2);
    System.out.println("Saving instructor: " + ins);
    app.save(ins);
    System.out.println("Saving second instructor: " + ins2);
    app.save(ins2); 
  }
*/  
   
/*
  private void deleteAllStudent(StudentDao studentDao){
    System.out.println("Wiping 'em out...");
    int rowsDeleted = studentDao.deleteAll();
    System.out.println("Kill count: " + rowsDeleted);

  }
*/

/* 
  private void deleteStudent(StudentDao studentDao) {
    int id = 12;
    System.out.println("Deleting student with id: " +id);
    studentDao.delete(id);
    System.out.println("Deleted student with id: " + id);
  }
*/ 

/*
  private void updateStudent(StudentDao studentDao) {
    int studentId = 12;
    System.out.println("Retrieving student with id: " + studentId);
    Student student = studentDao.findById(studentId);
    System.out.println("Updating student...");
    student.setFirstName("Oite");
    studentDao.update(student);
    System.out.println("Updated student: " + student);
  }
*/ 

/*
  private void queryStudentLastName(StudentDao studentDao) {
    System.out.println("Retrieving students with last name 'Kudasai'...");
    List<Student> students = studentDao.findByLastName("Kudasai");
    for (Student s : students) {
      System.out.println(s);
    }
  }
*/

/*
  private void queryStudents(StudentDao studentDao) {
    System.out.println("Retrieving all students...");
    List<Student> students = studentDao.findAll();
    for (Student s : students) {
      System.out.println(s);
  }
}  
*/  

/* 
  private void createStudent(StudentDao studentDao) {
    System.out.println("Creating student information...");
    Student student = new Student("Kara", 
                                    "Kimashita",
                                    "kara.kimashita@example.com");
    
    //Create second student
    Student student2 = new Student("Nakereba",
                                    "Narimasen",
                                    "nakereba.narimasen@example.com");

    System.out.println("Saving the life of the student..."); 
    studentDao.save(student);
    studentDao.save(student2);

    System.out.println("Saved! Generated id: " + student.getId());

  }
*/  

   
/*
    private void readStudent(StudentDao studentDao) {
    System.out.println("Retrieving the student id 12...");
    Student student = studentDao.findById(12);
    System.out.println("Got 'em! " + student);
  }
*/

/*
   @Bean
  CommandLineRunner resetDatabaseOnRequest(StudentDao studentDao) {
    return args -> {
      for (String arg : args) {
        if ("--reset-database".equals(arg)) {
          studentDao.resetDatabase();
          System.out.println("Student table cleared; the next generated ID will be 1.");
          break;
        }
      }
    };
  }
*/

  }
