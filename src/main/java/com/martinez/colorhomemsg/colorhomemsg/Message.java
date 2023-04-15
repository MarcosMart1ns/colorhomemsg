package com.martinez.colorhomemsg.colorhomemsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Message {

    @Autowired
    EnvironmentVariables environmentVariables;

    public String getMessage(){
        String backgroundColor = environmentVariables.getColor();
        String message = environmentVariables.getMessage();

        return """
                <div style="
                    display: flex;
                    align-content: center;
                    justify-content: center;
                    background-color: %s;
                ">
                    <p style="font-size: 40px;">
                        %s
                    </p>
                </div>
                """
                .formatted(
                        backgroundColor,
                        message
                );
    }
}
