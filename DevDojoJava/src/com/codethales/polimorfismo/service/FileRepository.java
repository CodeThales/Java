package com.codethales.polimorfismo.service;

import com.codethales.polimorfismo.repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving to file.");
    }
}
