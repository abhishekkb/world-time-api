package org.abhi.worldtime.exception.handler;

import lombok.Getter;

public class WorldTimeException extends Exception{

    @Getter
    private String code;

    public WorldTimeException(String code, String msg, Throwable t) {
        super(msg,  t);
        this.code = code;
    }
}
