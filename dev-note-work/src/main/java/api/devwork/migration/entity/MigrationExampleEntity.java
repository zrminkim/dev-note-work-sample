package api.devwork.migration.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Table("migration_example_plan")
public class MigrationExampleEntity {

    @Column("id")
    @Setter
    private Long id;

    @Column("task_id")
    private Integer taskId;

    @Column("source_id")
    private String sourceId;

    @Column("status")
    private String status;

    @Column("final_status")
    private String finalStatus;

    @Column("stability_score")
    private Double stabilityScore;

    @Column("previous_score")
    private Double previousScore;

    @Column("cost_estimate")
    private Double costEstimate;

    @Column("migration_count")
    private Integer migrationCount;

    @Column("created_at")
    private Long createdAt;
}
