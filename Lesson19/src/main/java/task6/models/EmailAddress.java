package task6.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailAddress {
    private String email;
    private String additionalInformation;

    public EmailAddress(String email) {
        this.email = email;
    }
}
