package domain;

import com.java.domain.position.Position;
import com.java.dto.PositionDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {
    private Position position;
    @BeforeEach
    public void beforeEach(){
        position = Position.of();
    }
    @Test
    @DisplayName("CarPosition 초기화 시 위치는 0으로 설정되어야 한다")
    public void shouldInitializePositionToZero() {
        // given: CarPosition 객체가 초기 상태(0)으로 생성됨
        position = Position.of();
        Integer expected = 0;

        // when: 객체를 DTO로 변환하여 초기 위치 확인
        PositionDto positionDto = position.carPositionDto();

        // then: position은 0이어야 함
        Assertions.assertEquals(expected, positionDto.getPosition(), "초기 위치는 0이어야 합니다.");
    }
    @Test
    @DisplayName("plusPosition 호출 시 위치 값이 1 증가해야 한다")
    public void shouldIncreasePositionByOneWhenPlusPositionCalled() {
        // given: CarPosition 객체가 초기 상태(0)로 생성됨(beforeEach)
        Integer expected = 1;

        // when: 위치 증가 메서드 호출
        position.plusPosition();
        PositionDto positionDto = position.carPositionDto();

        // then: position의 값은 1이어야 함
        Assertions.assertEquals(expected, positionDto.getPosition(), "위치 값은 1이어야 합니다.");
    }
}
