package com.cydeo.algoQuestions.builder;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

@Data
@Builder //is using for calling particular fields from the class
public class BuilderTshirt {

    private final String size;

    @NonNull//make it mandatory field
    private final String color;
    private final String brand;

    @Singular(value = "company")
    private List<String> orderedCompanies;
}
