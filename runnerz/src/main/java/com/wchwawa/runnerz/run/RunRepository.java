package com.wchwawa.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    void init() {
        runs.add(new Run(1,
                "wch run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                "$99999999999999999",
                Location.Outdoor));

        runs.add(new Run(2,
                "陈洁怡大美女之奔跑",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                "$999999999",
                Location.Indoor));
    }

    Optional<Run> findById(Integer id){
        return runs.stream().filter(run -> run.id() == id)
                .findFirst();
    }

    // post
    void create (Run run){
        runs.add(run);
    }

    // put
    //UPGRADE(put)
    void update (Run run, Integer id){
        Optional<Run> existingRun = findById(id);
        if (existingRun.isPresent()){
            runs.set(runs.indexOf(existingRun.get()), run);
        }
    }

    //delete
}
