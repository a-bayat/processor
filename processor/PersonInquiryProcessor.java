package processor;

import request.PersonInquiryRequest;
import response.Response;

public class PersonInquiryProcessor
        extends AProcessor<PersonInquiryRequest> {

    @Override
    Response processInternal(PersonInquiryRequest request) {
        Response response = new Response();
        response.setOk(true);
        return response;
    }
}
