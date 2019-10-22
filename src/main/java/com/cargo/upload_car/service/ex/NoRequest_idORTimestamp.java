package com.cargo.upload_car.service.ex;

public class NoRequest_idORTimestamp extends ServiceException {
    private static final long serialVersionUID = -4061078633641923809L;

    public NoRequest_idORTimestamp() {
    }

    public NoRequest_idORTimestamp(String message) {
        super(message);
    }

    public NoRequest_idORTimestamp(String message, Throwable cause) {
        super(message, cause);
    }

    public NoRequest_idORTimestamp(Throwable cause) {
        super(cause);
    }

    public NoRequest_idORTimestamp(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
