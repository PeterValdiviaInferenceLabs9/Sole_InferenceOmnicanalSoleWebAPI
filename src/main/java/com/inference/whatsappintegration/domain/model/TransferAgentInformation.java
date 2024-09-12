package com.inference.whatsappintegration.domain.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class TransferAgentInformation {

    private String clientRequest;

    private String chatSessionId;

    private String campaign;

    private String agentSkill;

    private String subject;

    private String customExternalHistory;

    private String channel;

    private String email;

    private String dvaPath;
}
