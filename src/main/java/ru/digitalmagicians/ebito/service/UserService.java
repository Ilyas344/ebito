package ru.digitalmagicians.ebito.service;

import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.digitalmagicians.ebito.dto.NewPasswordDto;
import ru.digitalmagicians.ebito.dto.Role;
import ru.digitalmagicians.ebito.dto.UserDto;
import ru.digitalmagicians.ebito.entity.User;

import java.io.IOException;

public interface UserService {

    void setPassword(NewPasswordDto newPassword, Authentication authentication);

    UserDto getUser(Authentication authentication);

    UserDto updateUser(UserDto userDto, Authentication authentication);

    UserDto updateRole(Integer id, Role role);

    void updateAvatar(MultipartFile image, Authentication authentication);

    User getUserByEmail(String email);

}
