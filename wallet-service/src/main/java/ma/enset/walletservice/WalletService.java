package ma.enset.walletservice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
@Service
public class WalletService {
    // For simplicity, we'll use an in-memory list to store wallets
    private final List<Wallet> wallets;

    public WalletService() {
        // Initialize an empty list of wallets (in a real implementation, you would use a database)
        wallets = new ArrayList<>();
    }

    public Wallet createWallet(Wallet wallet) {
        // Implement logic to create a new wallet (e.g., save it to a database)
        wallet.setId(UUID.randomUUID());
        wallets.add(wallet);
        return wallet;
    }

    public Wallet getWallet(UUID id) {
        // Implement logic to retrieve a wallet by its ID (e.g., from a database)
        return wallets.stream()
                .filter(w -> w.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Wallet updateWallet(UUID id, Wallet updatedWallet) {
        // Implement logic to update a wallet by its ID (e.g., in a database)
        return wallets.stream()
                .filter(w -> w.getId().equals(id))
                .map(w -> {
                    w.setBalance(updatedWallet.getBalance());
                    w.setCurrency(updatedWallet.getCurrency());
                    w.setOwner(updatedWallet.getOwner());
                    return w;
                })
                .findFirst()
                .orElse(null);
    }

    public List<Wallet> getAllWallets() {
        // Implement logic to retrieve all wallets (e.g., from a database)
        return wallets;
    }

    public void deleteWallet(UUID id) {
        // Implement logic to delete a wallet by its ID (e.g., from a database)
        wallets.removeIf(w -> w.getId().equals(id));
    }
}
