package com.owino.jpacode.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Tweet {
    @Id
    private long id;
    private String contents;
    private String dateString;
    private String timeString;
}
