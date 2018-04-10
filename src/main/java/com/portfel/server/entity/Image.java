package com.portfel.server.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "images")
public class Image {
    private static final Logger logger = LogManager.getLogger(Image.class.getName());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data_image", nullable = false)
    private byte[] dataImage;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Column(name = "section")
    private String section;

    public Image(){
    }

    public static Logger getLogger() {
        return logger;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getDataImage() {
        return dataImage;
    }

    public void setDataImage(byte[] dataImage) {
        this.dataImage = dataImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", dataImage=" + Arrays.toString(dataImage) +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
