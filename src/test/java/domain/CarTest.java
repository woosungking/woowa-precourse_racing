package domain;

import com.java.domain.car.Car;
import com.java.dto.CarDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    private Car car;
    @Test
    @DisplayName("Car를 CarDto로 변환 시 이름이 일치해야 한다")
    public void carToCarDtoTransform(){
        //given: car객체를 초기화 한다
        car=Car.of("s63Amg");
        String expected = "s63Amg";
        //when: Car를 carDTO로 변환한다
        CarDto carDto = car.carDto();
        //then: Car의 이름과, DTO의 이름이 동일한지 확인
        Assertions.assertEquals(expected, carDto.getCarName(), "CarDto의 이름이 예상과 일치해야 합니다.");
    }
}
