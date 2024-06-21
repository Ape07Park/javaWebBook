package org.zerock.javawebbook.todo2.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoDTO2 {
    private Long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;

}
