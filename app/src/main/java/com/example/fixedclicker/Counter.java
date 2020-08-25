package com.example.fixedclicker;

public class Counter {
    private int value;
    public Counter()
    {
        value = 0;
    }
    public void increaseCount(){
        value++;
    }
    public void decreaseValue(){
        value--;
    }
    public void doubleValue()
    {
        value = value * 2;
    }
    public void reset()
    {
        value = 0;
    }
    public Integer getCount()
    {
        return value;
    }
}
