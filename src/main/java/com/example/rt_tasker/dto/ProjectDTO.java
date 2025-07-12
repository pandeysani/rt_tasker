package com.example.rt_tasker.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectDTO {
    private String name;
    private String description;
}
