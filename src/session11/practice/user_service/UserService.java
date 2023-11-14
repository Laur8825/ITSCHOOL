package session11.practice.user_service;

public interface UserService {

    /**
     * Creates a user
     * @param user
     * @return
     */
    User createUser(User user);

    void deleteUser(long id);
}
