package io.khasang.rtrail.model.impl;

import io.khasang.rtrail.model.Message;
import org.springframework.stereotype.Component;

@Component("message")
public class MessageImpl implements Message {
    public MessageImpl(String helloWorld) {
    }

    public MessageImpl() {
    }

    @Override
    public String getInfo() {
        return "New Bean World!";
    }

    @Override
    public void setInfo(String info) {
    }
}
