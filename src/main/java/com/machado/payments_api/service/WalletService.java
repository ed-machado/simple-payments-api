package com.machado.payments_api.service;

import com.machado.payments_api.controller.dto.CreateWalletDto;
import com.machado.payments_api.entity.Wallet;
import com.machado.payments_api.exception.WalletAlreadyExistsException;
import com.machado.payments_api.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreateWalletDto createWalletDto) {
        var walletDb = walletRepository.findByCpfOrEmail(createWalletDto.cpf(), createWalletDto.email());

        if (walletDb.isPresent()) {
            throw new WalletAlreadyExistsException("Wallet already created");
        }

        return walletRepository.save(createWalletDto.toWallet());
    }
}
