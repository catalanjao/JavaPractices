package com.axity.example.servicepaps;

public abstract class Persist {
    public abstract void save(String content);
    public abstract void edit(long ifContent, String newContent);
    public void delete(long idContent){

    }
}
