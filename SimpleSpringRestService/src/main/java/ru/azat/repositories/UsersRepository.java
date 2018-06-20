package ru.azat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.azat.models.Role;
import ru.azat.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByLogin(String login);

    List<User> findAllByRole(Role role);

    Optional<User> findOneById(Long id);
}
