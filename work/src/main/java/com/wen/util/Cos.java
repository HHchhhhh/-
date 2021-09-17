package com.wen.util;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.Word;
import cn.hutool.extra.tokenizer.engine.hanlp.HanLPEngine;
import com.wen.Exception.FileException;


import java.util.*;


/**
 *   基于hanlp 分词
 */
public class Cos {

public static Map<String,List<Integer>> Countword(String path) {
    /*定义一个Map*/
    Map<String, List<Integer>> map = new TreeMap<String, List<Integer>>();
    HanLPEngine engine = new HanLPEngine();
    /* 检查路径是否正确 */
    try {
        String a=File.fileToString(path);
    } catch (FileException e) {
        System.out.println(e.getMessage());
    }
    /*读取文件，设定UTF-8编码*/
    FileReader fileReader = new FileReader(path, "UTF-8");
    String readString = fileReader.readString();
    Result result = engine.parse(readString);
    Iterator<Word> iterator = result.iterator();
    int pos=0;
    /*开始遍历*/
    while (iterator.hasNext()){
        String s = iterator.next().toString();
        String  nextWord="";
        for (int i = 0; i <s.length() ; i++) {
            /*获取第i个字符*/
            char c=s.charAt(i);
            /*匹配中文字符*/
            if (String.valueOf(c).matches("[\u4e00-\u9fa5]")){
                nextWord +=i;
                }
            }
            if (map.get(nextWord)==null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(pos);
                map.put(nextWord,list);
            }
            List<Integer> integers = map.get(nextWord);
            integers.add(pos);
            pos++;
        }
     return map;
}



}







