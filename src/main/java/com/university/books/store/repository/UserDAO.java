package com.university.books.store.repository;

import com.university.books.store.model.entity.UserEntity;

import java.util.List;

/**
 * Created by Aleksandr on 5/15/2017.
 */
public interface UserDAO {
    UserEntity findById(long id);

    List<UserEntity> findAllUsers();

    void save(UserEntity user);

    void update(UserEntity user);

    void deleteById(long id);
}
