package ru.oopteam.bot.writers;

public class Response {
    private String message;


    public Response(String text) {
        message = text;
    }


    public String getText() {
        return message;
    }
}
