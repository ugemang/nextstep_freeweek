import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    public void nothing(){

    }

    @Test
    public void splitTest(){
        String text = "1,2";
        String[] split = text.split(",");
        assertThat(split).contains("1");
        assertThat(split).containsExactly("1","2");
    }

    @Test
    public void subStringTest(){
        String text = "(1,2)";
        String substringText = text.substring(1, 4);
        assertThat(substringText).isEqualTo("1,2");
    }

    @Test
    @DisplayName("야 이거 왜 안돼냐")
    public void charAtTest(){
        String text = "abc";
        char a = text.charAt(0);
        char b = text.charAt(1);
        char c = text.charAt(2);

        assertThat(a).isEqualTo('a');
        assertThat(b).isEqualTo('b');
        assertThat(c).isEqualTo('c');

        assertThatThrownBy(() -> {
            text.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
