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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teacher")
public class TeacherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    @OneToMany
    private Collection<SubjectModel> subjects = new ArrayList<>();
    @Column(name = "is_active", columnDefinition = "Boolean default true")
    private boolean isActive = true;
    @OneToOne
    private NoteModel note;
    @ManyToMany
    private Collection<StudentModel> students = new ArrayList<>();
    @OneToOne
    private CoordinatorModel coordinator;

}
