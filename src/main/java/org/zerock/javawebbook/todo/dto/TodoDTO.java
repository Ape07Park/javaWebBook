package org.zerock.javawebbook.todo.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoDTO {
    private Long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;

}
