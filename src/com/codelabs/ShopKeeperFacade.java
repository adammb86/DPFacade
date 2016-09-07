package com.codelabs;

import com.codelabs.mobileshop.Blackberry;
import com.codelabs.mobileshop.Iphone;
import com.codelabs.mobileshop.MobileShop;
import com.codelabs.mobileshop.Samsung;

/**
 * Created by adammb on 9/7/16.
 */
public class ShopKeeperFacade {
    //atribut
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    //method

    public ShopKeeperFacade() {
    }

    public void iphoneSale(){
        iphone = new Iphone();
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale(){
        samsung = new Samsung();
        samsung.modelNo();
        samsung.price();
    }

    public void blackberrySale(){
        blackberry=new Blackberry();
        blackberry.modelNo();
        blackberry.price();
    }
}
