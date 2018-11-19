package com.lay.lambda.function;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Person> personList(){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1L,"zhangsan","男",70));
        personList.add(new Person(2L,"lisi","男",80));
        personList.add(new Person(3L,"wangwu","女",30));
        personList.add(new Person(4L,"zhangsan","女",40));
        personList.add(new Person(5L,"zhangsan","女",50));
        personList.add(new Person(6L,"lisi","男",60));
        return personList;
    }
}
