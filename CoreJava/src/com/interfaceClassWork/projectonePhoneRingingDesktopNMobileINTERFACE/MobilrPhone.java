package com.interfaceClassWork.projectonePhoneRingingDesktopNMobileINTERFACE;

public class MobilrPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilrPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone is powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn)
        {
            System.out.println("now ringing"+phoneNumber+"mobile pgone.");
        }
        else
        {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("aswering the mobile phone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn)
        {   isRinging=true;
            System.out.println("Melody right tone played ..");
        }
        else
        {
            isRinging=false;
            System.out.println("Mobile phone not on or number different\"");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
