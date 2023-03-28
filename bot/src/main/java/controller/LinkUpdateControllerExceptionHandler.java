package controller;

import dto.ApiErrorResponse;
import exceptions.IncorrectRequestParametersException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LinkUpdateControllerExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IncorrectRequestParametersException.class)
    public ApiErrorResponse incorrectParamsHandle(IncorrectRequestParametersException ex) {
        return new ApiErrorResponse();
    }
}
