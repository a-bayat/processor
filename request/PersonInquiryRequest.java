package request;

public class PersonInquiryRequest extends Request{
    private String nationalCode;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
