package com.jojiapp.localdatatimemocktest;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import java.time.*;

@Configuration
public class ClockConfig {

    @Bean
    public Clock clock() {
        return Clock.systemDefaultZone();
    }
}
