package com.sumant.springbootlearning.sleuthexample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Integer id;
    private String name;
    private String author;
    private Double price;

}
