package com.banking.corebankingservice.service;

import com.banking.corebankingservice.model.dto.User;
import com.banking.corebankingservice.exception.EntityNotFoundException;
import com.banking.corebankingservice.model.entity.UserEntity;
import com.banking.corebankingservice.model.mapper.UserMapper;
import com.banking.corebankingservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserMapper userMapper = new UserMapper();

    private final UserRepository userRepository;

    public User readUser(String identification) {
        UserEntity userEntity = userRepository.findByIdentificationNumber(identification).orElseThrow(EntityNotFoundException::new);
        return userMapper.convertToDto(userEntity);
    }

    public List<User> readUsers(Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
    }
}
