package processor;

import request.Request;
import response.Response;

public abstract class AProcessor<T extends Request>
        implements IProcessor<T> {

    @Override
    public Response process(T request) {

        Response response = new Response();

        if(request.getTrackingNumber() == null) {
            response.setOk(false);
            response.setError("trackingnumber is null");
            return response;
        }

        return processInternal(request);
    }

    abstract Response processInternal(T request);

}
