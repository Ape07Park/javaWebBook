package org.zerock.javawebbook.todo2.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TodoVo2 {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
