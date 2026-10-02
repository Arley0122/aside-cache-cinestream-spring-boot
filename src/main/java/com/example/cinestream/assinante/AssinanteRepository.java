package com.example.cinestream.assinante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinanteRepository extends JpaRepository<Assinante, Long> {

    boolean existsByCpf(String cpf);
}
