package com.aluracursos.challenge_literalura.repositorio;

import com.aluracursos.challenge_literalura.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findByNombreIgnoreCase(String nombre);
    List<Autor> findByFechaDeNacimientoLessThanEqualAndFechaDeMuerteGreaterThanEqual(int añoInicial, int añoFinal);
}
