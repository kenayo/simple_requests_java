package com.request;

import com.github.kevinsawicki.http.HttpRequest;

public class Request {
    public static void main(String[] args) {
        int delayTime = 3;

        HttpRequest response1 = HttpRequest.get("https://httpbin.org/delay/" + delayTime);
        printResponse(response1);

        HttpRequest response2 = HttpRequest.get("https://httpbin.org/image/png");
        printResponse(response2);
    }

    private static void printResponse (HttpRequest response) {
        System.out.println("Response status code is: " + response.code());
        System.out.println("Response body is: " + response.body());
    }
}
