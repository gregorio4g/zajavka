package com.gg.test9.my.user;
import com.gg.test9.my.blog.MainSite;
public class MainUser {
    public void behave(){
        MainSite mainSite = new MainSite("site header", "site description");
        System.out.println(mainSite.id);
//        System.out.println(mainSite.header);
//        System.out.println(mainSite.description);
    }
}
