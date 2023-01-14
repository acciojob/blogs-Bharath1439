package com.driver.models;


import javax.persistence.*;

@Entity
@Table
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getDescription() {
        return Description;
    }

    public Image() {
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Image(String description, String dimensions) {
        Description = description;
        Dimensions = dimensions;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public void setDimensions(String dimensions) {
        Dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Column
    private String Description;

    @Column(nullable = false)
    private String Dimensions;

    @ManyToOne
    @JoinColumn
    private Blog blog;

}
