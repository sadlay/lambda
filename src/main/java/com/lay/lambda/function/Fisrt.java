package com.lay.lambda.function;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Fisrt {
    private static List<Person> personList=Util.personList();

    public static List<Person> findByName(String name){
        List<Person> list=new ArrayList<>();
        for (Person person : personList) {
            if(name.equals(person.getName())){
                list.add(person);
            }
        }
        return list;
    }

    public static List<Person> findBySex(String sex){
        List<Person> list=new ArrayList<>();
        for (Person person : personList) {
            if(sex.equals(person.getSex())){
                list.add(person);
            }
        }
        return list;
    }


    public static void main(String[] args){
        findByName("zhangsan").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
        findBySex("男").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
    }
}
