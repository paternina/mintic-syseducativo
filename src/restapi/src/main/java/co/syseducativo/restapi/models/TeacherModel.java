package co.syseducativo.restapi.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class TeacherModel extends UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private ArrayList<SubjectModel> subjects;
    private ArrayList<CourseModel> courses;
    @Column(name = "is_active", columnDefinition = "Boolean default true")
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<SubjectModel> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<SubjectModel> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<CourseModel> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseModel> courses) {
        this.courses = courses;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
