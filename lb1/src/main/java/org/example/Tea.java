package org.example;

import java.io.PrintStream;

public class Tea extends Food {
    private String siryp;

    public Tea() {
        super("Sandwich");
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(var10001 + " " + this.siryp + " eaten");
    }

    public void setParam(String param) {
        this.siryp = param;
    }
}
