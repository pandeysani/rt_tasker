package com.example.rt_tasker.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {
    private String username;
    private String password;
}
