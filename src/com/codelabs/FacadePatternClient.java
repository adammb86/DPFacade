package com.codelabs;

public class FacadePatternClient {

    public static void main(String[] args) {
	// write your code here
        ShopKeeperFacade shopKeeperFacade=new ShopKeeperFacade();
        shopKeeperFacade.iphoneSale();
        shopKeeperFacade.samsungSale();
        shopKeeperFacade.blackberrySale();
    }
}
