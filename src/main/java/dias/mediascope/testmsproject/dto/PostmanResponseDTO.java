package dias.mediascope.testmsproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostmanResponseDTO {

    @JsonProperty(value = "url")
    private String panelCode;

    @JsonProperty(value = "args")
    private PostmanArgsDTO args;

    @JsonProperty(value = "headers")
    private PostmanHeadersDTO headers;

}
