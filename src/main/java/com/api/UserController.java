package com.api;


public class UserController {
    public UserRespons print(UserRequest userRequest) {
        var user = new User(null, null, null, userRequest.email(), userRequest.password());
        UserRepository userRepository = new UserRepository() {
            @Override
            public UserRespons getUserByEmailAndPassword() {
                var name = "John";
                var surname = "Brown";
                var email = user.email();
                var password = user.password();
                return new UserRespons(name, surname, email, password);
            }
        };
        return userRepository.getUserByEmailAndPassword();
    }
}
