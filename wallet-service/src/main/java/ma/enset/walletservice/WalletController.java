package ma.enset.walletservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/wallets")
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/create")
    public Wallet createWallet(@RequestBody Wallet wallet) {
        // Implement logic to create a new wallet (e.g., save it to a database)
        return walletService.createWallet(wallet);
    }

    @GetMapping("/{id}")
    public Wallet getWallet(@PathVariable UUID id) {
        // Implement logic to retrieve a wallet by its ID
        return walletService.getWallet(id);
    }

    @PutMapping("/{id}")
    public Wallet updateWallet(@PathVariable UUID id, @RequestBody Wallet updatedWallet) {
        // Implement logic to update a wallet by its ID
        return walletService.updateWallet(id, updatedWallet);
    }

    @GetMapping("/")
    public List<Wallet> getAllWallets() {
        // Implement logic to retrieve all wallets (e.g., from a database)
        return walletService.getAllWallets();
    }

    @DeleteMapping("/{id}")
    public void deleteWallet(@PathVariable UUID id) {
        // Implement logic to delete a wallet by its ID
        walletService.deleteWallet(id);
    }
}