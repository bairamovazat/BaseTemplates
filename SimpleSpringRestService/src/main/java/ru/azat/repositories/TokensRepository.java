package ru.azat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.azat.models.Token;

import java.util.Optional;

public interface TokensRepository extends JpaRepository<Token, Long> {
    Optional<Token> findOneByValue(String value);
}
