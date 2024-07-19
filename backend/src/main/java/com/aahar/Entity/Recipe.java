package com.aahar.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    @ManyToOne
    private User user;
    private String image;
    private String description;
    private boolean veg;
    private LocalDateTime createdAt;
    private List<Long> likes = new ArrayList<>();
    public Recipe() {
    }
    public Recipe(Long id, String title, User user, String image, String description, boolean veg, LocalDateTime createdAt, List<Long> likes) {
        Id = id;
        this.title = title;
        this.user = user;
        this.image = image;
        this.description = description;
        this.veg = veg;
        this.createdAt = createdAt;
        this.likes = likes;
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVeg() {
        return veg;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Long> getLikes() {
        return likes;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLikes(List<Long> likes) {
        this.likes = likes;
    }
}
