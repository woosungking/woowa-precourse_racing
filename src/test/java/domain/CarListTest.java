package domain;

import com.java.domain.Car;
import com.java.domain.CarList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarListTest {

    private CarList carList;
    @BeforeEach
    public void beforeEach(){
        carList = CarList.of(new ArrayList<>());
    }

    @Test
    @DisplayName("beforeEach 테스트")
    public void initCarListTest(){
        //given
        Integer expected = 0;
        //when
        //then
        Assertions.assertEquals(expected, carList.size());
    }

    @Test
    @DisplayName("CarList 생성 테스트")
    public void carCreateTest(){
        //given
        List<Car> cars = new ArrayList<>();
        cars.add(Car.of("K3"));
        cars.add(Car.of("K5"));
        cars.add(Car.of("K7"));
        cars.add(Car.of("K9"));
        //when
        carList.addAllCar(cars);
        //then
        Assertions.assertEquals(cars.size(), carList.size());
    }
}
