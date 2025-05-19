package api.devwork.migration.domain.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenSearchTotalExampleResponse {

    @JsonAlias("source_id")
    @JsonProperty("sourceId")
    private String sourceId;

    @JsonAlias("task_id")
    @JsonProperty("taskId")
    private Integer taskId;

    @JsonAlias("stability_score")
    @JsonProperty("stabilityScore")
    private Double stabilityScore;

    @JsonAlias("previous_score")
    @JsonProperty("previousScore")
    private Double previousScore;

    @JsonAlias("cost_estimate")
    @JsonProperty("costEstimate")
    private Double costEstimate;

    @JsonAlias("total_vm_count")
    @JsonProperty("totalVmCount")
    private Integer totalVmCount;

    private Long recordedAt;
}
