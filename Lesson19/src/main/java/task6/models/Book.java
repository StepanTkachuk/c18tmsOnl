package task6.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private Integer theYearOfPublishing;

    @Override
    public int compareTo(Book o) {
        return this.getTheYearOfPublishing().compareTo(o.getTheYearOfPublishing());
    }
}
