package com.firstapi.rest.webservices.restfulwebservices.Exception;

import java.util.Date;

public class ExceptionResponse {
    private Date timseStamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timseStamp, String message, String details) {
        this.timseStamp = timseStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimseStamp() {
        return timseStamp;
    }

    public void setTimseStamp(Date timseStamp) {
        this.timseStamp = timseStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
