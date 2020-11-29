package com.arabbank.arabina.adapter.rest;

import com.arabbank.arabina.adapter.repo.ArabinaRepoImplementation;
import com.arabbank.arabina.model.Simple;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("simple-form")
@CrossOrigin(origins = "*")
public class ArabinaController {
    private final ArabinaRepoImplementation repo;

    public ArabinaController(ArabinaRepoImplementation repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Optional<Simple> getFormById(@PathVariable("id") String id) {
        return repo.getFormById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFormById(@PathVariable("id") String id) {
        repo.deleteFormById(id);
    }

    @GetMapping
    public List<Simple> getAllSimpleForms() {
        return repo.getAllSimpleForms();
    }

    @PostMapping
    public Optional<Simple> addSimpleForm(@RequestBody Simple form) {
        return repo.addForm(form);
    }

    @PutMapping
    public void updateForm(@RequestBody Simple form) {
        repo.updateForm(form);
    }
}