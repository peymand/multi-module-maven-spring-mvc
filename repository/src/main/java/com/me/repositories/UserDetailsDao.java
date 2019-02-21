package com.me.repositories;


import com.me.entities.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
