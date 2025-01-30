package br.com.Screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao ) {

}
