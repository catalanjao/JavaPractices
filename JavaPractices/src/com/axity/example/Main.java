package com.axity.example;

import com.axity.example.servicepaps.Persist;
import com.axity.example.servicepaps.inh.ADbPersist;
import com.axity.example.servicepaps.inh.AFilPersist;
import com.axity.example.services.IPersist;
import com.axity.example.services.impl.DbPersist;
import com.axity.example.services.impl.FIlePersist;

public class Main {

    public static void main(String[] args) {

        boolean canIWriteInFile = false;
        IPersist persist;
        Persist persist1;

        persist = canIWriteInFile ? new FIlePersist() : new DbPersist();

        persist.save("content");
        persist.edit(1,"New String");
        persist.delete(1);


        persist1 = canIWriteInFile ? new AFilPersist() : new ADbPersist();

        persist1.save("content");
        persist1.edit(1,"New String");
        persist1.delete(1);



    }
}