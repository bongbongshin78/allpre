package com.bongbong.alprev.mlkit.ghost.error;

public class UncaughtRxException extends RuntimeException {

    /**
     * @param cause - the original cause of this exception
     */
    public UncaughtRxException(Throwable cause) {
        super(cause);
    }

}
