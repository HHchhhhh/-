import com.wen.util.Cos;
import com.wen.util.Similarity;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void test(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\work\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\work\\src\\main\\resources\\testFile\\orig_0.8_add.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
    }
}
