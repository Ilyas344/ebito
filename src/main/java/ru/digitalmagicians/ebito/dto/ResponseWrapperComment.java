package ru.digitalmagicians.ebito.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseWrapperComment {
    private Integer count;
    private List<Comment> results;
}
