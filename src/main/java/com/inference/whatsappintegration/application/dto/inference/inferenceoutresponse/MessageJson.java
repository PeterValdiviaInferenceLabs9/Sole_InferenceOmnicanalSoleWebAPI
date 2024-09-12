package com.inference.whatsappintegration.application.dto.inference.inferenceoutresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.inference.whatsappintegration.util.enums.EnumBotStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageJson {

    @JsonProperty("sessionId")
    private String sessionId;

    @JsonProperty("campaign")
    private String campaign;

    @JsonProperty("skill")
    private String agentSkill;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("nodeCode")
    private String nodeCode;

    @JsonProperty("botStatus")
    private EnumBotStatus botStatus;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("email")
    private String email;

    @JsonProperty("dvaPath")
    private String dvaPath;
}

