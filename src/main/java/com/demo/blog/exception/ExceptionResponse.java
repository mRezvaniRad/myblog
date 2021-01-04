package com.demo.blog.exception;



import java.util.Date;
import java.util.List;


/*
Implementing Generic Exception Handling for all Resources
 */


/**
 * @author Rezvani
 */

public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private List<String> details;

    public ExceptionResponse(Date timestamp, String message, List<String> details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String>  getDetail() {
        return details;
    }

    public void setDetail(List<String> details) {
        this.details = details;
    }
}
