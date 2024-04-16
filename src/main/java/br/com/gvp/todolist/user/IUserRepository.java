package br.com.gvp.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// Local onde são parametrizados todos os métodos realizados pela aplicação (save, find, delete, etc.)
public interface IUserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
