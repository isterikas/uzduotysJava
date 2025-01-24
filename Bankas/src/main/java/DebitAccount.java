import java.math.BigDecimal;

public class DebitAccount extends ClientAccount {
    public DebitAccount(String accountNumber, String holderName, BigDecimal balance, ClientBank clientBank) {
        super(accountNumber, holderName, balance, clientBank);
    }


}
