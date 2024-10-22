package com.machado.payments_api.repository;

import com.machado.payments_api.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByCpfOrEmail(String cpf, String email);
}
