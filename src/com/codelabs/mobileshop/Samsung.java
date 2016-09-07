package com.codelabs.mobileshop;

/**
 * Created by adammb on 9/7/16.
 */
public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("No Id = Samsung S7");
    }

    @Override
    public void price() {
        System.out.println("Harga = 6000");
    }
}
