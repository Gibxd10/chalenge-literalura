package com.aluracursos.challenge_literalura.repositorio;

import com.aluracursos.challenge_literalura.modelos.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libros, Long>{
    Libros findByTitulo(String titulo);
    List<Libros> findByIdiomasContaining(String idioma);
}
