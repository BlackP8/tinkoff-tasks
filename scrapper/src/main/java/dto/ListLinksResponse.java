package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Validated
public class ListLinksResponse {
    @JsonProperty("links")
    @Valid
    private List<LinkResponse> links = null;

    @JsonProperty("size")
    private Integer size = null;

    public ListLinksResponse addLinksItem(LinkResponse linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<LinkResponse>();
        }
        this.links.add(linksItem);
        return this;
    }
}
