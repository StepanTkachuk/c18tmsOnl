package by.tms.service;

import by.tms.model.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService implements UserAware {
    private User user;

    @Override
    public boolean isVerifyUser(String login, String password) {
        return user.getLogin().equals(login) && user.getPassword().equals(password);
    }
}
