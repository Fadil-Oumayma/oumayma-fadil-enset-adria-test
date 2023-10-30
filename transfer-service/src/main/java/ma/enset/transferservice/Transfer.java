package ma.enset.transferservice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Transfer {
    private UUID id;
    private String sourceWalletId;
    private String destinationWalletId;
    private double amount;
    private TransferStatus status;



}
