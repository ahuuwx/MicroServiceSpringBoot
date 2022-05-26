package com.example.demo.dao;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gallery {
    private Integer id;
    private List<Object> images;
}
