package api.devwork.migration.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MigrationStatus {

    MIGRATING("MIGRATING"),
    ACTIVE("ACTIVE"),
    ERROR("ERROR"),
    SUCCESS("S"),
    READY("R"),
    PROGRESS("E"),
    FAILURE("F");

    private final String status;
}
