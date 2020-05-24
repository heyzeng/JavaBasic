package Java.chapter06.src.main.java.com.example;

/*

 	数组：相同类型数组的组合

 	说明：
 		1.数组本身属性引用数据类型
 		2.数组中存储的元素可以是基本数据类型也可以是引用数据类型

 */

public class arrayTest02 {

    public static void main(String[] args) {

        //1.数组的声明和初始化
        //数组的声明
        int[] numbers; //数组中存放的元素类型为int类型
        int ages[]; //不建议
        String[] names; //数组中存放的元素类型为String类型
        //静态初始化 ：数组的创建和赋值同时进行
        numbers = new int[]{1,2,3,4,5}; //大括号中存放的是要往数组中存储的数据
        //下面的方式：数组的声明和初始化不能分开写
        int[] scores = {100,90,80,60};
        //动态初始化 ：数组的创建和赋值分开进行
        ages = new int[5]; //5表示的是该数组的长度（该数组能放数据的个数）
        ages[0] = 100; //将数据放入到数组的第一个位置上
        ages[1] = 200;
        ages[4] = 300;

        //总结 ：无论是静态初始化还是动态初始化一旦创建成功，数组的长度不可变。


        //2.获取数组中的元素和给数组中的元素进行赋值
        //数组中的下角标（索引值）是从0开始的 ~ （数组的长度-1）
        int age = ages[4]; //4指的是索引值。获取索引值为4的元素
        System.out.println(age);

    }


}
