package com.portfel.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.logging.Logger;

@Entity
@Table(name = "message")
public class Message {

    private static final Logger logger = Logger.getLogger(Message.class.getName());

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private int id;

    @Column(name = "value",nullable = false)
    private String value;

    @Column(name = "date",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Message() {
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getValue() {return value;}

    public void setValue(String value) {this.value = value;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", date=" + date +
                '}';
    }
}
