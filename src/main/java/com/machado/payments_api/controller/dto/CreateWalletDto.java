package com.machado.payments_api.controller.dto;

import com.machado.payments_api.entity.Wallet;
import com.machado.payments_api.entity.WalletType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateWalletDto(@NotBlank String fullName,
                              @NotBlank String cpf,
                              @NotBlank String email,
                              @NotBlank String password,
                              @NotNull WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(
                fullName,
                cpf,
                email,
                password,
                walletType.get()
        );
    }
}
