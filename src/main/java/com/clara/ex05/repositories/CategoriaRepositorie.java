package com.clara.ex05.repositories;

import com.clara.ex05.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorie extends JpaRepository<CategoriaModel, Long> {
}
