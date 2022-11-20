package bridge;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private final Bridge answerBridge;
    private GameResult  gameResult;
    public BridgeGame(Bridge answerBridge) {
        this.answerBridge = answerBridge;
        gameResult = new GameResult();
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move(String playerDirection) {
        gameResult.add(playerDirection, canCrossBridge(playerDirection));
    }

    public boolean canCrossBridge(String playerDirection) {
        int moveCount = gameResult.getGameCount();
        String answer = answerBridge.getAnswerDirection(moveCount);
        return answer.equals(playerDirection);
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
