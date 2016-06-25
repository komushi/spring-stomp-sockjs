package io.pivotal.springboot.domain;

/**
 * Created by lei_xu on 5/25/16.
 */
public class Greeting {
    private final String content;

    public Greeting(String content) {

        this.content = content;
    }


    public String getContent() {
        return content;
    }
}