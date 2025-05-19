package api.devwork.migration.domain.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RateExampleHostCountTotalResponse {

    @JsonAlias("task_id")
    private Integer taskId;

    @JsonAlias("source_id")
    private String sourceId;

    @JsonAlias("host_name")
    private String hostName;

    @JsonAlias("vm_count")
    private Integer vmCountOnHost;
}
