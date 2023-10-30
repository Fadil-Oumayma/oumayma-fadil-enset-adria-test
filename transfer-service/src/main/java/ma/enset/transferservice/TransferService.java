package ma.enset.transferservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TransferService {
    // For simplicity, we'll use an in-memory list to store transfers
    private final List<Transfer> transfers;

    public TransferService() {
        // Initialize an empty list of transfers (in a real implementation, you would use a database)
        transfers = new ArrayList<>();
    }

    public Transfer initiateTransfer(Transfer transfer) {
        // Implement logic to initiate a transfer (e.g., save it to a database)
        transfer.setId(UUID.randomUUID());
        transfers.add(transfer);
        return transfer;
    }

    public Transfer getTransfer(UUID id) {
        // Implement logic to retrieve a transfer by its ID (e.g., from a database)
        return transfers.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Transfer> getAllTransfers() {
        // Implement logic to retrieve all transfers (e.g., from a database)
        return transfers;
    }
}
