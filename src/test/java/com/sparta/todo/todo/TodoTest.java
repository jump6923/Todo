package com.sparta.todo.todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;
import static org.junit.jupiter.api.Assertions.*;

class TodoTest {
    @Test
    public void todoTest1(){
        //given
        Todo todo = Todo.builder()
                .title("title")
                .content("content")
                .build();
        //when

        //then
        assertThatNoException().isThrownBy(()-> todo.getIsCompleted());
    }
}