package bridge.constant;

public enum ErrorMessage {
    INPUT_BRIDGE_SIZE_ERROR("다리 길이는 3부터 20 사이의 숫지여야 합니다."),
    INPUT_DIRECTION_ERROR("이동할 칸은 U(위), D(아래) 둘 중 하나여야 합니다.");

    private static final String ERROR_FORMAT = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ERROR_FORMAT + message;
    }
}
