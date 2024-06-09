package com.gg.test09.pytanie05.my.user;

import com.gg.test09.pytanie05.my.blog.MainSite;

public class MainUser {
    public void behave() {
        MainSite mainSite = new MainSite("site header", "site description");
        System.out.println(mainSite.id);
//        System.out.println(mainSite.header);
//        System.out.println(mainSite.description);
    }
}
