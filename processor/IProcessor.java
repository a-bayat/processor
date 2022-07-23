package processor;

import request.Request;
import response.Response;

public interface IProcessor<T extends Request> {
    public Response process(T request);

}
