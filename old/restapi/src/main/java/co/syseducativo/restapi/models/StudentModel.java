package co.syseducativo.restapi.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = CourseModel.class)
    private CourseModel course;
    @Column(name = "is_active", columnDefinition = "Boolean default true")
    private boolean isActive = true;
    @ManyToMany
    private Collection<NoteModel> notes = new ArrayList<>();
    @ManyToMany
    private Collection<TeacherModel> teachers = new ArrayList<>();


}
