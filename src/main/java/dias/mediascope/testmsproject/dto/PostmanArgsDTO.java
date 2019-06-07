package dias.mediascope.testmsproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostmanArgsDTO {

    @JsonProperty(value = "foo1")
    private String foo1;

    @JsonProperty(value = "foo2")
    private String foo2;

}
