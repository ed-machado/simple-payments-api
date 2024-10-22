package com.machado.payments_api.controller;

import com.machado.payments_api.controller.dto.CreateWalletDto;
import com.machado.payments_api.entity.Wallet;
import com.machado.payments_api.service.WalletService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody @Valid CreateWalletDto createWalletDto) {

        var wallet = walletService.createWallet(createWalletDto);
        return ResponseEntity.ok(wallet);
    }
}
