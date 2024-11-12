package domain;

import com.java.domain.Car;
import com.java.domain.racing.RacingTrack;
import org.junit.jupiter.api.Assertions;
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
}
