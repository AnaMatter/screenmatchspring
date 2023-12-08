package br.com.alura.screenmatchspring.domain;

import br.com.alura.screenmatchspring.domain.filme.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
