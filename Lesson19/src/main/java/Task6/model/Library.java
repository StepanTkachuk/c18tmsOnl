package Task6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Library {
    List<Book> books;
    List<Reader> readers;
}
