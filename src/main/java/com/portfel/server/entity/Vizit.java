package com.portfel.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.logging.Logger;

@Entity
@Table(name = "vizit")
public class Vizit {

    private static final Logger logger = Logger.getLogger(Vizit.class.getName());

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private long id;

    @Column(name = "visiting")
    private String visiting;

    @Column(name = "date")
    private Date date;

    @Column(name = "section")
    private String section;

    @Column(name = "count")
    private int countOfVisiting;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVisiting() {
        return visiting;
    }

    public void setVisiting(String visiting) {
        this.visiting = visiting;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCountOfVisiting() {
        return countOfVisiting;
    }

    public void setCountOfVisiting(int countOfVisiting) {
        this.countOfVisiting = countOfVisiting;
    }

    @Override
    public String toString() {
        return "Vizit{" +
                "id=" + id +
                ", visiting='" + visiting + '\'' +
                ", date=" + date +
                ", section='" + section + '\'' +
                ", countOfVisiting=" + countOfVisiting +
                '}';
    }
}
