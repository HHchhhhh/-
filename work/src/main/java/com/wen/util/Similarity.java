package com.wen.util;

import java.util.List;
import java.util.Map;


public  class Similarity {

    public static Double Similarity(Map<String, List<Integer>> map1,Map<String, List<Integer>> map2){
        if(map1==null||map2==null){
            return null;
        }

        //统计计算了多少个词
        int count = 0;
        //余弦方程的分母
        double equationUp = 0;
        //余弦方程的分子的部分一
        double equationDown1 = 0;
        //余弦方程的分子的部分二
        double equationDown2 = 0;
        //每一个词的相似度相加
        double sum = 0;
        for(String key:map1.keySet()){
            List<Integer> integers1 = map1.get(key);
            List<Integer> integers2 = map2.get(key);
            //第二个文本中也存在这个词，就计算向量
            if(integers2!=null){
                equationUp=equationDown1=equationDown2=0;
                //开始遍历每一个词的位置，准备构建余弦公式
                for(int i=0;i<integers1.size()&&i<integers2.size();i++){
                    Integer posFromOrign = integers1.get(i);
                    Integer posFromCopy = integers2.get(i);
                    //上面两个数相乘
                    equationUp+= posFromOrign * posFromCopy;
                    //下面相乘 后面要开方
                    equationDown1+= posFromOrign * posFromOrign;
                    equationDown2+= posFromCopy * posFromCopy;
                }
                equationDown1 = Math.sqrt(equationDown1);
                equationDown2 = Math.sqrt(equationDown2);
                double equationDown = equationDown1 * equationDown2;
                if(equationDown!=0){
                    sum+= equationUp/equationDown;
                }
            }
            count++;
        }

        return sum/count;

    }

}
