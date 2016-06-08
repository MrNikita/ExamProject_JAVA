package com.family_budget.spends;

/**
 * Created by Dmytro Melnychuk on 08.04.16.
 */
public abstract class Service implements SpendType{

    protected double price;

    @Override
    public String getType() {
        return "Service";
    }

    protected double getPrice() {
        return price;
    }

    private void setPrice(double priceForUpdating ){
           price=priceForUpdating;
    }
}
