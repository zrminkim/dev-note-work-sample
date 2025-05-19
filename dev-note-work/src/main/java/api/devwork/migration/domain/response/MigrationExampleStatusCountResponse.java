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
public class MigrationExampleStatusCountResponse {

    @JsonAlias("available_migration_status")
    private BinaryStatus availableStatus;

    @JsonAlias("result_migration_status")
    private BinaryStatus resultMigrationStatus;
}
