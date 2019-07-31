package com.company;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map.Entry;

public class PriorityQueue<T>{
    ArrayList<Entry<Integer,T>> queue = new ArrayList<>();
    public void PriorityQueue(){
        queue = new ArrayList<>();
    }
    public void add(Integer priority, T item){
        queue.add(new AbstractMap.SimpleEntry<>(priority, item));
    }
    public T remove(){
        if(queue.isEmpty()){
            return null;
        }
        Entry<Integer,T> retVal = queue.get(0);
        for(Entry<Integer,T> entry : queue){
            if(entry.getKey().intValue() > retVal.getKey().intValue()){
                retVal = entry;
            }
        }
        queue.remove(retVal);
        return retVal.getValue();
    }
}
