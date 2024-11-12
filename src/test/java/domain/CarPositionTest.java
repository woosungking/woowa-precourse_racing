package domain;

import com.java.domain.Car;
import com.java.domain.CarList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarPositionTest {

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

}
