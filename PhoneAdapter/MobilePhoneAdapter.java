import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {
    private MobilePhone mobilePhone;
    private String response;

    public MobilePhoneAdapter(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;

    }

    @Override
    public void dial(String s) {
        response = mobilePhone.dial(s);
    }

    @Override
    public String getReponse() {
        return response;
    }
}
