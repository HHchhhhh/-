import com.wen.util.Cos;
import com.wen.util.Similarity;
import org.junit.Test;
import com.wen.util.File;
import java.util.List;
import java.util.Map;

public class text {
    @Test
    public void test1(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig_0.8_add.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(String.valueOf(aDouble),"C:\\Users\\HHHH\\Desktop\\result.txt");
    }

    @Test
    public void test2(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig_0.8_dis_1.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(String.valueOf(aDouble),"C:\\Users\\HHHH\\Desktop\\result.txt");
    }

    @Test
    public void test3(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig_0.8_dis_10.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(String.valueOf(aDouble),"C:\\Users\\HHHH\\Desktop\\result.txt");
    }

    @Test
    public void test4(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig_0.8_dis_15.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(String.valueOf(aDouble),"C:\\Users\\HHHH\\Desktop\\result.txt");
    }

    @Test
    public void test5(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig_0.8_del.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(String.valueOf(aDouble),"C:\\Users\\HHHH\\Desktop\\result.txt");
    }

    @Test
    public void test6(){
        Map<String, List<Integer>> stringListMap = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\orig.txt");
        Map<String, List<Integer>> stringListMap2 = Cos.Countword("D:\\RuanGong\\软件工程作业\\RUANGONG\\src\\main\\resources\\testFile\\del.txt");
        Double aDouble = Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(String.valueOf(aDouble),"C:\\Users\\HHHH\\Desktop\\result.txt");
    }

}
