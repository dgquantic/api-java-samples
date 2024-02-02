package com.capital.api.java.samples.rest.dto.orders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkingOrdersItem {
    private WorkingOrderData workingOrderData;
    private MarketData marketData;
}
