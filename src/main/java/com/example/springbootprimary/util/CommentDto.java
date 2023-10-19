package com.example.springbootprimary.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CommentDto {
    @JsonProperty("rating")
    private Integer rating;

    @JsonProperty("content")
    private String content;

    @JsonProperty("film_id")
    private Integer film_id;

    @JsonProperty("user_id")
    private Integer user_id;
}
