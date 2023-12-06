import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    void testMockito() {
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Hello");
        assertEquals("Hello", mockList.get(0));
    }

    public static void main(String[] args) {
        MyTest myTes = new MyTest();
        myTes.testMockito();
    }
}
