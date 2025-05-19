package api.devwork.migration.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Table("migration_example_host")
public class MigrationExampleHostsEntity {

    @Column("id")
    @Setter
    private Long id;

    @Column("task_id")
    private Integer taskId;

    @Column("source_id")
    private String sourceId;

    @Column("host_name")
    private String hostName;

    @Column("running_vms")
    private Integer runningVms;

    @Column("cpu_used")
    private Integer cpuUsed;

    @Column("cpu_remaining")
    private Integer cpuRemaining;

    @Column("memory_used")
    private Integer memoryUsed;

    @Column("memory_remaining")
    private Integer memoryRemaining;

    @Column("recorded_at")
    private Long recordedAt;
}
