package model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book {
    private Long id;
    private String name;
    private String author;
}
