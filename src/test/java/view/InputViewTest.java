package view;

import com.java.dto.view.StartRacingDto;
import com.java.view.InputView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputViewTest {
    private InputView inputView;
    @BeforeEach
    public void beforeEach(){
        inputView = new InputView();
    }

    @Test
    void startRacingView_withValidInput_returnsStartRacingDto() {
        // given : Console.read()가 실행되기전 버퍼에 값을 넣어줌.
        String simulatedUserInput = "Car1,Car2,Car3\n5\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // when
        StartRacingDto result = inputView.startRacingView();

        // then
        assertEquals("Car1,Car2,Car3", result.getCarNames());
        assertEquals(5, result.getRetries());
    }
}
