package controller;

import dto.ApiErrorResponse;
import exceptions.ChatNotFoundException;
import exceptions.IncorrectRequestParametersException;
import exceptions.RepeatedLinkException;
import exceptions.RepeatedRegistrationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ScrapperControllerExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IncorrectRequestParametersException.class)
    public ApiErrorResponse incorrectParamsHandle(IncorrectRequestParametersException ex) {
        return new ApiErrorResponse();
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RepeatedLinkException.class)
    public ApiErrorResponse repeatedLinkHandle(RepeatedLinkException ex) {
        return new ApiErrorResponse();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RepeatedRegistrationException.class)
    public ApiErrorResponse repeatedRegistrationHandle(RepeatedRegistrationException ex) {
        return new ApiErrorResponse();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RepeatedRegistrationException.class)
    public ApiErrorResponse chatNotFoundHandle(ChatNotFoundException ex) {
        return new ApiErrorResponse();
    }
}
