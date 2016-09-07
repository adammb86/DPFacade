package com.codelabs.mobileshop;

/**
 * Created by adammb on 9/7/16.
 */
public class Blackberry implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("No Id = Blackberry Gemini");
    }

    @Override
    public void price() {
        System.out.println("Harga = 1000");
    }
}
