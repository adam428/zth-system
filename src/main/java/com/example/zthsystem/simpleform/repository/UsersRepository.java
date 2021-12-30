package com.example.zthsystem.simpleform.repository;

import com.example.zthsystem.simpleform.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

    Optional<UsersModel> findByLoginAndPassword(String email, String password);
}
