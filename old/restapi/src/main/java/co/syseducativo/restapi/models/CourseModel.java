package co.syseducativo.restapi.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String name;

    @ManyToMany
    private Collection<SubjectModel> subjects = new ArrayList<>();
    @OneToMany
    private Collection<StudentModel> students = new ArrayList<>();
    @Column(name = "is_active", columnDefinition = "Boolean default true")
    private boolean isActive = true;

}
