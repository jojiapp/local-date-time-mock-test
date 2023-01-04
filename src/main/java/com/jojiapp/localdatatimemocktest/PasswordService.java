package com.jojiapp.localdatatimemocktest;

import jdk.jfr.*;
import org.springframework.stereotype.*;

import java.time.*;

@Service
public class PasswordService {

    private final Clock clock;

    public PasswordService(Clock clock) {
        this.clock = clock;
    }

    public Password updatePassword(final String password) {

        return new Password(password, LocalDateTime.now(clock));
    }
}
