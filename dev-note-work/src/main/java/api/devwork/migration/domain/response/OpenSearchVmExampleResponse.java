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
public class OpenSearchVmExampleResponse {

    @JsonAlias("source_id")
    @JsonProperty("sourceId")
    private String sourceId;

    @JsonAlias("task_id")
    @JsonProperty("taskId")
    private Integer taskId;

    @JsonAlias("from_host")
    @JsonProperty("fromHost")
    private String fromHost;

    @JsonAlias("to_host")
    @JsonProperty("toHost")
    private String toHost;

    @JsonAlias("vm_uuid")
    @JsonProperty("vmUuid")
    private String vmUuid;

    @JsonAlias("vm_name")
    @JsonProperty("vmName")
    private String vmName;

    @JsonAlias("vm_cpu")
    @JsonProperty("vmCpu")
    private Integer vmCpu;

    @JsonAlias("vm_memory")
    @JsonProperty("vmMemory")
    private Integer vmMemory;

    private Long recordedAt;
}
