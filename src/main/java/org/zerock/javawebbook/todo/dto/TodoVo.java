package org.zerock.javawebbook.todo.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TodoVo {
    private Long todoNum;

    private String title;

    private LocalDate dueDate;

    private boolean finished;
}
