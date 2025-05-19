package api.devwork.migration.domain.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceMigrationRequest {

    private MigrationPlanBundle migrationPlanBundle;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MigrationPlanBundle {

        private List<MigrationPlan> plans;
        private List<HostResourceStatus> hosts;
        private List<MigrationDetail> details;

        @Getter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class MigrationPlan {
            private Integer taskId;
            private String sourceId;
            private Double stabilityScore;
            private Double previousScore;
            private Double estimatedCost;
            private Integer totalVmCount;
            private Long recordedAt;
        }

        @Getter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class HostResourceStatus {
            private Integer taskId;
            private String sourceId;
            private String hostName;
            private Integer runningVms;
            private Integer cpuUsed;
            private Integer cpuRemaining;
            private Integer memoryUsed;
            private Integer memoryRemaining;
            private Long recordedAt;
        }

        @Getter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class MigrationDetail {
            private String sourceId;
            private Integer taskId;
            private String fromHost;
            private String toHost;
            private String vmUuid;
            private String vmName;
            private Integer vmCpu;
            private Integer vmMemory;
            private LocalDateTime dateTime;
            private Long recordedAt;
        }
    }
}
