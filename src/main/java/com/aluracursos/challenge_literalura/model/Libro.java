package com.aluracursos.challenge_literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;
    private String nombreAutor;
    private String idiomas;
    private Integer conteoDeDescargas;
    @ManyToOne
    private Autor autor;

    public Libro(DatosLibro datosLibro, Autor autor) {
        this.titulo = datosLibro.titulo();
        this.autor = autor;
        this.nombreAutor = autor.getNombre();
        setIdiomas(String.valueOf(datosLibro.idiomas()));
        this.conteoDeDescargas = datosLibro.conteoDeDescargas();
    }

    public Libro(DatosLibro datosLibro) {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getConteoDeDescargas() {
        return conteoDeDescargas;
    }

    public void setConteoDeDescargas(Integer conteoDeDescargas) {
        this.conteoDeDescargas = conteoDeDescargas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "******************LIBRO*******************\n" +
                "   Titulo: " + titulo + "\n" +
                "   Autor: " + (autor != null ? autor.getNombre() : "N/A") + "\n" +
                "   Idiomas: " + idiomas + "\n" +
                "   Numero de Descargas:" + conteoDeDescargas + "\n" +
                "*****************************************";
    }

}