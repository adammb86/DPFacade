package com.codelabs.mobileshop;

/**
 * Created by adammb on 9/7/16.
 */
public class Iphone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("No Id = Iphone 5");
    }

    @Override
    public void price() {
        System.out.println("Harga = 5000");
    }
}
