package uk.gov.hmcts.reform.mi.micore.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Map;

@Getter
public class CoreCaseData {

    @JsonProperty("extraction_date")
    String extractionDate;

    @JsonProperty("case_metadata_event_id")
    long caseMetadataEventId;

    @JsonProperty("ce_case_data_id")
    long ceCaseDataId;

    @JsonProperty("ce_created_date")
    long ceCreatedDate;

    @JsonProperty("ce_case_type_id")
    String ceCaseTypeId;

    @JsonProperty("ce_case_type_version")
    long ceCaseTypeVersion;

    @JsonProperty("ce_state_id")
    String ceStateId;

    @JsonProperty("ce_data")
    Map<String, Object> ceData;
}