package domain;

import com.java.domain.RacingManager;
import com.java.domain.car.Car;
import com.java.domain.racing.RacingTrack;
import com.java.domain.view.Retries;
import com.java.dto.CarPositionDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingManagerTest {
    private RacingManager racingManager;
    private RacingTrack racingTrack;

    @BeforeEach
    public void beforeEach(){
    }
    @Test
    @DisplayName("선택된 자동차는 한번만 움직여야 한다.")
    public void moveCarInTrack() {
        // given: 초기 자동차 목록과 시도횟수 입력.
        List<Car> cars = new ArrayList<>();
        Car avante = Car.of("avante");
        cars.add(Car.of("E3004matic"));
        cars.add(Car.of("328i"));
        cars.add(avante);

        Retries retries = Retries.of(5);
        racingTrack = RacingTrack.of(cars);
        racingManager = RacingManager.of(racingTrack, retries);

        // when: avante를 이동시킴
        racingManager.moveCarInTrack(avante);

        // then: 이동 결과 확인
        CarPositionDto carPositionDto = racingManager.getCarPositionDto(avante);
        assertEquals(1, carPositionDto.getCarPosition(), "선택된 자동차는 1번만 이동해야 함.");
        System.out.println("자동차 이름: " + carPositionDto.getCarName() + ", 위치: " + carPositionDto.getCarPosition());
    }
    @Test
    @DisplayName("한 라운드가 지날때마다, Retries는 1씩 감소해야 한다.")
    public void decrease(){
        // given: 초기 자동차 목록과 시도횟수 입력.
        List<Car> cars = new ArrayList<>();
        Car avante = Car.of("avante");
        cars.add(Car.of("E3004matic"));
        cars.add(Car.of("328i"));
        cars.add(avante);

        Retries retries = Retries.of(5);
        racingTrack = RacingTrack.of(cars);
        racingManager = RacingManager.of(racingTrack, retries);
        Integer expexted = 4;
        // when
        racingManager.reduceRetries();
        Integer actual = racingManager.getRetriesDto().getRetries();
        // then
        assertEquals(expexted, actual);
    }
}
