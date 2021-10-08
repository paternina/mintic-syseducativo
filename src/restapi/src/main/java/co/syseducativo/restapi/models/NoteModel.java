package co.syseducativo.restapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class NoteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private float value;
    private SubjectModel subject;
    private StudentModel estudent;
    private TeacherModel teacher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public SubjectModel getSubject() {
        return subject;
    }

    public void setSubject(SubjectModel subject) {
        this.subject = subject;
    }

    public StudentModel getEstudent() {
        return estudent;
    }

    public void setEstudent(StudentModel estudent) {
        this.estudent = estudent;
    }

    public TeacherModel getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherModel teacher) {
        this.teacher = teacher;
    }

}
