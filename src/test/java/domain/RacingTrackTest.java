package domain;

import com.java.domain.car.Car;
import com.java.domain.racing.RacingTrack;
import com.java.dto.CarPositionDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RacingTrackTest {
    private RacingTrack racingTrack;
    @Test
    public void initRacingTrackToListOfCarAndPositionIsZero(){
        //given
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of("s63Amg"));
        cars.add(Car.of("M3"));
        cars.add(Car.of("CLS400"));
        racingTrack = RacingTrack.of(cars);
        //when
        Integer expected = 3;
        //then
        Assertions.assertEquals(expected, racingTrack.size());
    }

    @Test
    @DisplayName("특정 자동차를 이동 시켰을때 위치 변경이 잘 이루어 지는가")
    public void moveCarToCarNameUsing(){
        //given
        List<Car> cars = new ArrayList<>();
        Car s63Amg = Car.of("s63Amg");
        Car M3 = Car.of("M3");
        Car CLS400 = Car.of("CLS400");
        cars.add(s63Amg);
        cars.add(M3);
        cars.add(CLS400);
        racingTrack = RacingTrack.of(cars);
        //when
        racingTrack.moveCar(s63Amg);
        CarPositionDto carPositionDto = racingTrack.getCarPositionDTO(s63Amg);
        //then
        Assertions.assertEquals(carPositionDto.getCarPosition(), 1);
    }
}
