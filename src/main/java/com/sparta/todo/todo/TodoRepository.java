package com.sparta.todo.todo;

import com.sparta.todo.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}