package ma.enset.transferservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/initiate")
    public Transfer initiateTransfer(@RequestBody Transfer transfer) {
        // Implement logic to initiate a transfer
        return transferService.initiateTransfer(transfer);
    }

    @GetMapping("/{id}")
    public Transfer getTransfer(@PathVariable UUID id) {
        // Implement logic to retrieve a transfer by its ID
        return transferService.getTransfer(id);
    }

    @GetMapping("/")
    public List<Transfer> getAllTransfers() {
        // Implement logic to retrieve all transfers
        return transferService.getAllTransfers();
    }
}
