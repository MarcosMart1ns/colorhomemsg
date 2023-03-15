package com.martinez.colorhomemsg.colorhomemsg;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentVariables {
    @Autowired
    private Environment env;

    public String getColor() {
        String color = env.getProperty("COLOR");

        if (color == null) {
            return "white";
        }
        return color;
    }

    public String getMessage() {

        String text = env.getProperty("TEXT");
        if (text == null) {
            return "MENSAGEM NÃO DEFINIDA";
        }
        return text;
    }
}
