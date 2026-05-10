package com.uttara.desginpatterns.structural.proxy;

public class TestProxyPattern
{
    public static void main(String args[])
    {
        Image image = new ProxyImage("photo.jpg");

// Image will be loaded only when display() is called
        image.display();
        image.display();
    }
}
