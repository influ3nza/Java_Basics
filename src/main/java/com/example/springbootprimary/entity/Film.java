package com.example.springbootprimary.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "film")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Film {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String film_name;

    private String show_date;

    private Double rating;

    private Integer reviews;

    private String description;

    @OneToMany(mappedBy = "film", cascade = CascadeType.REMOVE)
    private List<Comment> commentList;
}
