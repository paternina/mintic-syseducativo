package co.syseducativo.restapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "coordinator")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoordinatorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    @Column(name = "is_active", columnDefinition = "Boolean default true")
    private boolean isActive = true;
    OneToMany
    private ArrayList<TeacherModel> teachers;
}
