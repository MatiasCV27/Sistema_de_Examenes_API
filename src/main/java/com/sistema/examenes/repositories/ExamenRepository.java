package com.sistema.examenes.repositories;

import com.sistema.examenes.entities.Categoria;
import com.sistema.examenes.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamenRepository extends JpaRepository<Examen, Long> {

    List<Examen> findByCategoria(Categoria categoria);

}
