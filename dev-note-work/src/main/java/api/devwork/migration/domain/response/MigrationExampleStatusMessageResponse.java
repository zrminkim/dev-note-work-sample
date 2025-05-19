package api.devwork.migration.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
public class MigrationExampleStatusMessageResponse {

    private String message;
    private int status;
    private int successCount;
    private int failedCount;
    private List<String> failedList;
    private List<String> errorMessageList;
    private Throwable throwable;
    private BinaryStatus availableOptimizeStatus;
    private BinaryStatus resultOptimizeStatus;

    public MigrationExampleStatusMessageResponse(String message, int status, int successCount, int failedCount, BinaryStatus availableOptimizeStatus, BinaryStatus resultOptimizeStatus) {
        this.message = message;
        this.status = status;
        this.successCount = successCount;
        this.failedCount = failedCount;
        this.failedList = Collections.singletonList("");
        this.errorMessageList = Collections.singletonList("");
        this.throwable = null;
        this.availableOptimizeStatus = availableOptimizeStatus;
        this.resultOptimizeStatus = resultOptimizeStatus;

    }
}
