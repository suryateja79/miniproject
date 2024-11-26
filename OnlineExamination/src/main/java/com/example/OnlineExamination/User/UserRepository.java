package com.example.OnlineExamination.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    public User findByEmail(String email);
}
