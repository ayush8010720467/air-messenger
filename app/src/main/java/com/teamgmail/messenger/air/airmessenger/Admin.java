package com.teamgmail.messenger.air.airmessenger;

import android.util.Log;

/**
 * Created by Ayush on 02-Nov-17.
 */

public class Admin {
    private String admin[]=new String [3];
    Admin()
    {
        admin[0]="Ayush";
        admin[1]="Kushagra";
        admin[2]="Alok";
    }
   public boolean isAdmin(String str)
   {

       if (str.equals(admin[0])||str.equals(admin[1])||str.equals(admin[2]))
       return true;
       return false;
   }
}
