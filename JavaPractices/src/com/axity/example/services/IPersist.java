package com.axity.example.services;

public interface IPersist {
    void save(String content);
    void delete(long idContent);
    void edit(long ifContent, String newContent);
}
