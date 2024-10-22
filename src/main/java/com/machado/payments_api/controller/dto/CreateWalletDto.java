package com.machado.payments_api.controller.dto;

import com.machado.payments_api.entity.Wallet;
import com.machado.payments_api.entity.WalletType;

public record CreateWalletDto(String fullName,
                              String cpf,
                              String email,
                              String password,
                              WalletType.Enum walletType) {

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
