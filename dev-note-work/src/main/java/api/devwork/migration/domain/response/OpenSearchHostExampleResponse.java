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
public class OpenSearchHostExampleResponse {

    @JsonAlias("source_id")
    @JsonProperty("sourceId")
    private String sourceId;

    @JsonAlias("task_id")
    @JsonProperty("taskId")
    private Integer taskId;

    @JsonAlias("host_name")
    @JsonProperty("hostName")
    private String hostName;

    @JsonAlias("cpu_used")
    @JsonProperty("cpuUsed")
    private Integer cpuUsed;

    @JsonAlias("cpu_remaining")
    @JsonProperty("cpuRemaining")
    private Integer cpuRemaining;

    @JsonAlias("memory_used")
    @JsonProperty("memoryUsed")
    private Integer memoryUsed;

    @JsonAlias("memory_remaining")
    @JsonProperty("memoryRemaining")
    private Integer memoryRemaining;

    private Long recordedAt;
}
