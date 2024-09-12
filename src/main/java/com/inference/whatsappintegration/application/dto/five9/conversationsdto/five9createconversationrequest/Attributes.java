package com.inference.whatsappintegration.application.dto.five9.conversationsdto.five9createconversationrequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Attributes {

    @JsonProperty("Question")
    private String subject;

    @JsonProperty("Custom.external_history")
    private String customExternalHistory;

    @JsonProperty("canal")
    private String channel;

    @JsonProperty("skill")
    private String skillArea;

    @JsonProperty("chatSessionId")
    private String chatSessionId;

    @JsonProperty("conversationId")
    private String conversationId;

    @JsonProperty("dvaPath")
    private String dvaPath;
}
