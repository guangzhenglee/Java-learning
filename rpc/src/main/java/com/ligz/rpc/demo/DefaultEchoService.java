package com.ligz.rpc.demo;

public class DefaultEchoService implements EchoService {

    @Override
    public String echo(String message) {
        return "[ECHO] : " + message;
    }
}
