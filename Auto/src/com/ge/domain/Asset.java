package com.ge.domain;



public class Asset {

    private String assetOwner = null;

    Asset(String assetOwner){
        this.assetOwner = assetOwner;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "assetOwner='" + assetOwner + '\'' +
                '}';
    }
}
