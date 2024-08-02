package com.wchwawa.runnerz.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime competedOn,
        String money,
        Location location
) {
}
