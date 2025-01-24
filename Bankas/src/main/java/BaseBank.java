import ibank.Bank;
import ibank.BaseBankTest;

public class BaseBank extends BaseBankTest {
    @Override
    protected Bank createBank() {
        return new ClientBank();
    }
}
