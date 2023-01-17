package Task6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Reader {
    String fullName;
    EmailAddress eMail;
    boolean agreement;
    List<Book> readersBooks;


}
