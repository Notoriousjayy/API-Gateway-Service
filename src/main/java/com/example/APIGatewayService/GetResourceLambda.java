package com.example.APIGatewayService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetResourceLambda implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        String resourceId = input.getPathParameters().get("id");

        // Replace this with your business logic to retrieve the resource
        String resourceData = "Data for resource with ID: " + resourceId;

        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
        response.setStatusCode(200);
        response.setBody(resourceData);

        return response;
    }
}

