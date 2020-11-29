package com.arabbank.arabina.adapter.repo;

import com.arabbank.arabina.model.Simple;

import java.util.List;
import java.util.Optional;

public interface ArabinaDAO {
    Optional<Simple> addForm(Simple form);

    List<Simple> getAllSimpleForms();

    Optional<Simple> getFormById(String id);

    void deleteFormById(String id);

    Optional<Simple> updateForm(Simple form);
}
