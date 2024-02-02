package com.capital.api.java.samples.rest.dto.market.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetMarketDetailsResponse {
    private Instrument instrument;
    private DealingRules dealingRules;
    private Snapshot snapshot;
}
