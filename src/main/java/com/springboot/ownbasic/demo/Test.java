package com.springboot.ownbasic.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

       /* String xml = "<?xml version=\"1.0\" encoding=\"GBK\"?>\n" +
                "<DATA>\n" +
                "\t<HEAD>\n" +
                "\t\t<HeadName3>value3</HeadName3>\n" +
                "\t\t<HeadName2>value2</HeadName2>\n" +
                "\t\t<HeadName1>value1</HeadName1>\n" +
                "\t</HEAD>\n" +
                "\t<ROOT>\n" +
                "\t\t<RootName3>RootValue3</RootName3>\n" +
                "\t\t<RootName2>RootValue2</RootName2>\n" +
                "\t\t<RootName1>RootValue1</RootName1>\n" +
                "\t</ROOT>\n" +
                "</DATA>\n" ;
        saveFile("D:/aa.xml",xml);*/
    }

    public static void saveFile(String fileName, String content) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName, true),"UTF-8");
            osw.write(content);
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
