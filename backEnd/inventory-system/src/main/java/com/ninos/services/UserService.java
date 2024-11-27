package com.ninos.services;

import com.ninos.dtos.LoginRequest;
import com.ninos.dtos.RegisterRequest;
import com.ninos.dtos.Response;
import com.ninos.dtos.UserDTO;
import com.ninos.models.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);

}
