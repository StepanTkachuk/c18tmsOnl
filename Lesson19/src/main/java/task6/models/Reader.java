package task6.models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Reader {
    private String fullName;
    private String eMailAddress;
    private boolean agreement;
    private List<Book> readersBooks;


}
