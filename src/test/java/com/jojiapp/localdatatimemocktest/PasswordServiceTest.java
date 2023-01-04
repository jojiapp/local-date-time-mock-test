package com.jojiapp.localdatatimemocktest;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;

import java.time.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@SpringBootTest
class PasswordServiceTest {

    @Autowired
    private PasswordService passwordService;

    @MockBean
    private Clock clock;

    @Test
    @DisplayName("패스워드가 변경 시간이 현재 시간으로 변경된다.")
    void test1() throws Exception {
        // Given
        final var password = "password";

        final var now = Instant.now();
        given(clock.instant()).willReturn(now);
        given(clock.getZone()).willReturn(ZoneId.systemDefault());

        // When
        final var updatePassword = passwordService.updatePassword(password);

        // Then
        final var newPassword = new Password(password, LocalDateTime.now(clock));
        assertThat(updatePassword).isEqualTo(newPassword);
    }

}
