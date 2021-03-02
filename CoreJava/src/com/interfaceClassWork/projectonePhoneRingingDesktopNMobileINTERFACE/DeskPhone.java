package com.interfaceClassWork.projectonePhoneRingingDesktopNMobileINTERFACE;


public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone does not have a power button");
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("answering the desktop");
            isRinging=false;
        }

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing ");
    }



    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber)
        {
            isRinging=true;
            System.out.println("ring ring");
        }
        else
        {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;//return false was default giving by system
    }
}

