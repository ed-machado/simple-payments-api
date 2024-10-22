package com.machado.payments_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_wallet_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class WalletType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @AllArgsConstructor
    public enum Enum {

        USER(1L, "user"),
        MERCHANT(2L, "merchant");

        private final Long id;
        private final String description;

        public WalletType get() {
            return new WalletType(id, description);
        }
    }
}
