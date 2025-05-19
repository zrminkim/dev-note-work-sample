package api.devwork.migration.domain.response;

public enum BinaryStatus {

    DISABLED(0),
    ENABLED(1);

    private final int code;

    BinaryStatus(int code){
        this.code = code;
    }

}
