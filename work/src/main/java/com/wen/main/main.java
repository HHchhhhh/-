package com.wen.main;

import com.wen.util.Cos;
import com.wen.util.File;
import com.wen.util.Similarity;
import java.util.List;
import java.util.Map;


public class main {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        Map<String, List<Integer>> stringListMap = Cos.Countword(file1);
        Map<String, List<Integer>> stringListMap2 = Cos.Countword(file2);
        Double aDouble =Similarity.Similarity(stringListMap, stringListMap2);
        System.out.println(aDouble);
        File.stringToFile(args[2],String.valueOf(aDouble));
    }


}
