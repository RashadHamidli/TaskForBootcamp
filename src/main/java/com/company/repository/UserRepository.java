package com.company.repository;

import com.company.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findTop5ByAge(Integer age);

    List<User> findFirst5ByAge(Integer age);

    User findByName(Sort sort, String name);
}
