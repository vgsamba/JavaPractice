package com.interfaceClassWork.projectonePhoneRingingDesktopNMobileINTERFACE;

public class MainOne {
    public static void main(String[] args) {

        ITelephone myPhone;
        myPhone=new DeskPhone(125);
        myPhone.powerOn();
        myPhone.callPhone(1233545);
        myPhone.answer();

        myPhone=new MobilrPhone(23234);
        myPhone.powerOn();
        myPhone.callPhone(1234);
        myPhone.answer();


    }
}
