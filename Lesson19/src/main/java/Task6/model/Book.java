package Task6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    String author;
    String title;
    int theYearOfPublishing;
}
