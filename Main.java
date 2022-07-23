import processor.IProcessor;
import processor.PersonInquiryProcessor;
import processor.PostInquiryProcessor;
import request.PersonInquiryRequest;
import request.PostInquiryRequest;
import response.Response;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        IProcessor<PersonInquiryRequest> personProcessor = new PersonInquiryProcessor();

        PersonInquiryRequest personInquiryRequest = new PersonInquiryRequest();
        personInquiryRequest.setNationalCode("217321867");

        PostInquiryRequest postInquiryRequest = new PostInquiryRequest();
        postInquiryRequest.setTrackingNumber("alo");
        postInquiryRequest.setPostalCode("21398347");


        IProcessor<PostInquiryRequest> postProcessor = new PostInquiryProcessor();

        Response response = personProcessor.process(personInquiryRequest);
        System.out.println(response.getError());

        response = postProcessor.process(postInquiryRequest);
        System.out.println(response.getError());

        List<String> l = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
    }
}
