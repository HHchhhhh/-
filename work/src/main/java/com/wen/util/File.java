package com.wen.util;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import com.wen.Exception.FileException;

public class File {
    public static String fileToString(String filePath) throws FileException {
        if(filePath==null ||"".equals(filePath)){
            throw new FileException("文件路径为空");
        }
        String str = "";
        java.io.File file = new java.io.File(filePath);
        FileInputStream in;
        try {
            in = new FileInputStream(file);
            int size = in.available();
            byte[] buffer = new byte[size];
            int result = in.read(buffer);
            if(result!=-1)
                in.close();
            str = new String(buffer, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("文件读取失败");
        }
        return str;
    }

    public static void stringToFile(String text,String path){
        java.io.File file = new java.io.File(path);
        boolean res = true;
        try {
            if (!file.exists()) {
                res = file.createNewFile();
            }
            if (res){
                FileWriter fw = new FileWriter(file);
                fw.write(text);
                fw.flush();
                fw.close();
            }

        } catch (Exception e) {
            System.out.println("输出异常");
        }

    }
}
