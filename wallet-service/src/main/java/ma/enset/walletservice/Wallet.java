package ma.enset.walletservice;

import lombok.Data;

import java.util.UUID;
@Data
public class Wallet {
    private UUID id;
    private double balance;
    private String currency;
    private String owner;

}