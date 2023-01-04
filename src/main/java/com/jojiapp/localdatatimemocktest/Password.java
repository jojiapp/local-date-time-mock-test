package com.jojiapp.localdatatimemocktest;

import java.time.*;
import java.util.*;

public class Password {

    private final String value;
    private final LocalDateTime passwordLastModifiedAt;

    public Password(String value, LocalDateTime passwordLastModifiedAt) {
        this.value = value;
        this.passwordLastModifiedAt = passwordLastModifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(value, password.value) && Objects.equals(passwordLastModifiedAt, password.passwordLastModifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, passwordLastModifiedAt);
    }
}
