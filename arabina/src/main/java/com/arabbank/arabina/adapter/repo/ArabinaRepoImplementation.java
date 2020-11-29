package com.arabbank.arabina.adapter.repo;

import com.arabbank.arabina.model.Simple;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ArabinaRepoImplementation implements ArabinaDAO {

    private final ArabinaRepository repository;

    public ArabinaRepoImplementation(ArabinaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Simple> addForm(Simple form) {
        if (repository.existsById(form.getId())) {
            return Optional.empty();

        } else {
            return Optional.of(repository.save(form));
        }
    }

    @Override
    public List<Simple> getAllSimpleForms() {
        return repository.findAll();
    }

    @Override
    public Optional<Simple> getFormById(String id) {
        return repository.findById(id);
    }

    @Override
    public void deleteFormById(String id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Simple> updateForm(Simple form) {
        if (repository.existsById(form.getId())) {
            return Optional.of(repository.save(form));
        } else {
            return Optional.empty();
        }
    }
}