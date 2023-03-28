package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemoveLinkRequest {
    @JsonProperty("link")
    private String link = null;
}
