package com.example.springdemo.Repository;

import java.util.List;

import com.example.springdemo.Model.UserModel;

public interface UserRepository {

	UserModel findByEmail(String email);

	List<UserModel> findAll();

	Object findById(int id);

	UserModel save(UserModel obj);

}
