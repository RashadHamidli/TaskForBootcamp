package com.company.services;

import com.company.dto.UserDTO;
import com.company.entity.User;
import com.company.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public List<User> getAll() {
        return userRepository.findAll(Sort.by("name"));
    }

    public List<User> findTop5ByAge(Integer age) {
        return userRepository.findTop5ByAge(age);
    }

    public User findById(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    //    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    public List<User> findFirst5ByAge(Integer age) {
        return userRepository.findFirst5ByAge(age);
    }

    public User findByNameSorted(String name) {
        return userRepository.findByName(Sort.by("name"), name);
    }

    public UserDTO getUser(User user) {
        System.out.println(user);
        UserDTO map = modelMapper.map(user, UserDTO.class);
        System.out.println(map);
        return map;
    }

    public User getUserDTO(UserDTO userDTO) {
        System.out.println(userDTO);
        User map = modelMapper.map(userDTO, User.class);
        System.out.println(map);
        return map;
    }
}
