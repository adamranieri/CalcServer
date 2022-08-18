package dev.ranieri.app;

import io.javalin.Javalin;

public class App {

    static int requestNumber = 0;

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        app.get("hello", ctx ->{
            ctx.result("Hi Everyone" + ++requestNumber);
        });

        app.get("hola", ctx ->{
            ctx.result("Hola" + ++requestNumber);
        });

        app.get("wassup", ctx ->{
            ctx.result("wassup" + ++requestNumber);
        });

        app.start();
    }
}
