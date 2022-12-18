package by.tms.authorization.models;

public interface AuthenticationService {
    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}
