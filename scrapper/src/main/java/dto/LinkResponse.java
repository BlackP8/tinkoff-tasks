package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LinkResponse {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("url")
    private String url = null;
}
