package io.khasang.rtrail.entiry;

import javax.persistence.*;

@Entity
//@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(name="cat_id")
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return description;
    }

    public void setDiscription(String description) {
        this.description = description;
    }

    //    @Column(name = "names")
    private String name;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
