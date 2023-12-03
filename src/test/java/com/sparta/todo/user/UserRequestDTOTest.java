package com.sparta.todo.user;

import static org.assertj.core.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

class UserRequestDTOTest {

    @DisplayName("유저 요청 DTO 생성")
    @Nested
    class createUserRequestDTO {

        private Validator validator;

        @BeforeEach
        public void setUp() {
            try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
                validator = factory.getValidator();
            }
        }
        @DisplayName("유저 요청 DTO 생성 성공")
        @Test
        void createUserRequestDTO_success() {
            // given
            UserRequestDTO userRequestDTO = new UserRequestDTO();
            userRequestDTO.setUsername("username");
            userRequestDTO.setPassword("12345678");

            // when
            Set<ConstraintViolation<UserRequestDTO>> violations = validator.validate(userRequestDTO);

            // then
            assertThat(violations).isEmpty();
        }

    }
}