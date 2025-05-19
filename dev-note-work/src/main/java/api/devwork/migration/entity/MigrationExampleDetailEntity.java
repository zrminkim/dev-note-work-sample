package api.devwork.migration.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Table("migration_example_detail")
public class MigrationExampleDetailEntity {

    @Column("id")
    @Setter
    private Long id;

    @Column("task_id")
    private Integer taskId;

    @Column("sequence")
    @Setter
    private Long sequence;

    @Column("source_id")
    private String sourceId;

    @Column("status")
    private String status;

    @Column("from_host")
    private String fromHost;

    @Column("to_host")
    private String toHost;

    @Column("instance_uuid")
    private String instanceUuid;

    @Column("instance_name")
    private String instanceName;

    @Column("final_status")
    private String finalStatus;

    @Column("vm_cpu")
    private Integer vmCpu;

    @Column("vm_memory")
    private Integer vmMemory;

    @Column("recorded_at")
    private Long recordedAt;
}
