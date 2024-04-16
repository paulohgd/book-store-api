package com.bookstore.api.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String titulo;
    public String autor;
    public String area;
    public String anoPublicacao;
    @JsonProperty("ano_publicacao")
    public String biografia;
    public String isbn;

}
