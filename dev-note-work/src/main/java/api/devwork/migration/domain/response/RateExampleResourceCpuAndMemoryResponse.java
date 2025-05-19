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
public class RateExampleResourceCpuAndMemoryResponse {

    @JsonAlias("task_id")
    private Integer taskId;

    @JsonAlias("host_name")
    private String hostName;

    @JsonAlias("cpu_usage_rate")
    private Integer cpuUsageRate;

    @JsonAlias("memory_usage_rate")
    private Integer memoryUsageRate;
}
