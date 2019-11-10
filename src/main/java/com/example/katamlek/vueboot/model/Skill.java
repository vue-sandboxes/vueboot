package com.example.katamlek.vueboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Skill {
private Long id;
private String name;
private Level level;
}
