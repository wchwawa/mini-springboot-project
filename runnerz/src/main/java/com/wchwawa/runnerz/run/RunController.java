package com.wchwawa.runnerz.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/runs")
public class RunController {
    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping()
    List<Run> findAll(){
        return runRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id){
        Optional<Run> run = runRepository.findById(id);
        if (run.isPresent()) {
            return run.get();
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    //post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void create (@RequestBody Run run){
        runRepository.create(run);
    }

    //put


    //deleteq
}
