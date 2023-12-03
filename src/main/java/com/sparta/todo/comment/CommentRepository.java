package com.sparta.todo.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.todo.todo.Todo;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}