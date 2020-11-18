package pl.davko.jetbrains.excercise;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import pl.davko.jetbrains.excercise.*;
import pl.davko.jetbrains.excercise.baseentity.*;


public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John");

        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);

        WebSite site = new WebSite();
        site.setUrl("https://hyperskill.org");

        BaseEntity siteEntity = site;
        siteEntity.setId(101);
        siteEntity.setVersion(1);

        Visit visit = new Visit();
        visit.setUser(user);
        visit.setSite(site);

        BaseEntity baseVisit = visit;
        baseVisit.setId(102);
        baseVisit.setVersion(103);

        System.out.println(-30 / 7);

    }
}

