package processor;

import request.PostInquiryRequest;
import response.Response;

public class PostInquiryProcessor
        extends AProcessor<PostInquiryRequest> {

    @Override
    Response processInternal(PostInquiryRequest request) {
        Response response = new Response();
        response.setOk(true);
        return response;
    }
}
