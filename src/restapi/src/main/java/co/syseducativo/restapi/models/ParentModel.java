package co.syseducativo.restapi.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parent")
public class ParentModel extends UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private ArrayList<StudentModel> childrens;
    @Column(name = "is_active", columnDefinition = "Boolean default true")
    private boolean isActive = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<StudentModel> getChildrens() {
        return childrens;
    }

    public void setChildrens(ArrayList<StudentModel> childrens) {
        this.childrens = childrens;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
