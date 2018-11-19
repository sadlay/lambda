package com.lay.lambda.function;

import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;

public class Second {
    private static List<Person> personList=Util.personList();

    public static List<Person> findByName(String name){

        return null;
    }

    public static List<Person> findBySex(String sex){

        return null;
    }

    public static List<Person> find(Match match){
        List<Person> list=new ArrayList<>();
        for (Person person : personList) {
            if(match.matching(person)){
                list.add(person);
            }
        }
        return list;
    }
    public interface Match{
        boolean matching(Person person);

    }

    public static void main(String[] args){
        findByName("zhangsan").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
        findBySex("男").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
    }
}
