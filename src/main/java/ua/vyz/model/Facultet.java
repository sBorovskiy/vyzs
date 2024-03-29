package ua.vyz.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Table(name = "facultets")
public class Facultet {
    @Id
    private int id;

    private String title;

    @ManyToMany(mappedBy = "facultets")
    List<Vyz> vyzs;

    public Facultet(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Facultet() {
    }
}