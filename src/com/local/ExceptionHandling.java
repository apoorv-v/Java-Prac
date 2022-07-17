package com.local;

public class ExceptionHandling {
    public  void  SayHi () throws MyExp{
        throw new MyExp("What the hell");
    }
}
