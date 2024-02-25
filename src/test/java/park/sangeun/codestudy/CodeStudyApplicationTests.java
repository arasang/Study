package park.sangeun.codestudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import park.sangeun.codestudy.datastructure.ArrayList.ArrayList;


@SpringBootTest
class CodeStudyApplicationTests {
    @Test
    public void test() {
        ArrayList<String> test = new ArrayList<>(4);
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("4");

        System.out.println(test);

        test.add("5");
        System.out.println(test);

        test.remove("4"); // 1,2,3,4,4,5 -> // 1,2,3,4,5
        System.out.println(test);

        test.add("4");
        System.out.println(test);

        test.removeAll("4");
        System.out.println(test);

        System.out.println(test.indexOf("9"));
    }
}
