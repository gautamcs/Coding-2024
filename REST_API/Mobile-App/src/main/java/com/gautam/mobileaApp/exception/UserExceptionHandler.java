package com.gautam.mobileaApp.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleGlobalException(Exception exp, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setTimeStamp(new Date());
        String localMsg = exp.getLocalizedMessage();
        errorMessage.setMessage(localMsg != null ? localMsg: exp.toString() );
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    @ExceptionHandler(value = NullPointerException.class)
//    public ResponseEntity<Object> handleNPE(NullPointerException exp, WebRequest request) {
//        ErrorMessage errorMessage = new ErrorMessage();
//        errorMessage.setTimeStamp(new Date());
//        String localMsg = exp.getLocalizedMessage();
//        errorMessage.setMessage(localMsg != null ? localMsg: exp.toString() );
//        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }

   // We combine the more than exception in single method
    @ExceptionHandler(value = {IndexOutOfBoundsException.class, NullPointerException.class})
    public ResponseEntity<Object> handleIndexOutOfBound(Exception exp, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setTimeStamp(new Date());
        String localMsg = exp.getLocalizedMessage();
        errorMessage.setMessage(localMsg != null ? localMsg: exp.toString() );
        //errorMessage.setMessage("Index Out Of Bound" );
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
