package com.example.rt_tasker.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskDTO {
    private String title;
    private String status;
    private Long projectId;
}
