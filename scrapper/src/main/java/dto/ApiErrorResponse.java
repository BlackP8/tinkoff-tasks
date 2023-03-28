package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Data
@Validated
public class ApiErrorResponse {
    @JsonProperty("description")
    private String description = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("exceptionName")
    private String exceptionName = null;

    @JsonProperty("exceptionMessage")
    private String exceptionMessage = null;

    @JsonProperty("stacktrace")
    @Valid
    private List<String> stacktrace = null;

    public ApiErrorResponse addStacktraceItem(String stacktraceItem) {
        if (this.stacktrace == null) {
            this.stacktrace = new ArrayList<String>();
        }
        this.stacktrace.add(stacktraceItem);
        return this;
    }
}
