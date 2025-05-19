package api.devwork.migration.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MigrationExampleDetailResponse {

    private String status;
    private String finalStatus;
    private List<MigrationDetail> migrationDetails;

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MigrationDetail {
        private Integer taskId;
        private String fromHost;
        private String toHost;
        private String status;
        private String finalStatus;
        private String vmUuid;
        private String vmName;
        private String sourceId;
        private int vmCpu;
        private int vmMemory;
    }
}
