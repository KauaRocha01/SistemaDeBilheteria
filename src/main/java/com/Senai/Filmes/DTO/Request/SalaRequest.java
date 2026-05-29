package com.Senai.Filmes.DTO.Request;

import jakarta.persistence.criteria.CriteriaBuilder;

public record SalaRequest(
        String nome,
        Integer totalAssentos,
        Integer fileiras,
        Integer assentosPorFileira
) {
}
