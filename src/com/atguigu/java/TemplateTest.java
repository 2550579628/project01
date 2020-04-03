package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author liguo
 * @create 2020-04-02 9:14
 */
public class TemplateTest {

    //模板六： prsf：可生成 private static final
    private static final Customer cs = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";

    //模版一:psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        int num = 10;
        System.out.println("num = " + num);
        System.out.println(num);

        //模板三：fori
        String[] arr = new String[]{"tom","jerry","skr","cxk"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            System.out.println(o);
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板五：ifn
        if (list == null) {

        }

        //变形:inn
        if (arr != null) {

        }

        //变形：xxx.nn /  xxx.null
        if (arr == null) {

        }
        if (list != null) {

        }


    }
}
