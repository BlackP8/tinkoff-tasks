package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Builder
@Validated
public class LinkUpdate   {
  @JsonProperty("id")
  private Long id = 1L;

  @JsonProperty("url")
  private String url = "url";

  @JsonProperty("description")
  private String description = "smth";

  @JsonProperty("tgChatIds")
  @Valid
  private List<Long> tgChatIds = null;

  public LinkUpdate addTgChatIdsItem(Long tgChatIdsItem) {
    if (this.tgChatIds == null) {
      this.tgChatIds = new ArrayList<Long>();
    }
    this.tgChatIds.add(tgChatIdsItem);
    return this;
  }
}
