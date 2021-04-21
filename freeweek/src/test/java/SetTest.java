import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;
import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @Test
    void nothing(){

    }

    @BeforeEach
    public void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set 사이즈를 테스트 해보자")
    public void setSizeTest(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    @DisplayName("ParameterizedTest를 해보자. 오 좋은데?")
    public void contains(int num){
        assertThat(numbers.contains(num)).isTrue();
    }
}
