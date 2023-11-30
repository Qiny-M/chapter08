package com.hspedu.generic.genericexercise;

import org.junit.jupiter.api.Test;

@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {


    }

    @Test
    public void testGeneric() {
        GenericDao<GenericUser> userDAO = new GenericDao<>();
        userDAO.save("001", new GenericUser(1, 20, "jack"));
        userDAO.save("002", new GenericUser(2, 31, "jim"));
        userDAO.save("003", new GenericUser(3, 21, "jack"));

        System.out.println(userDAO.list());

        userDAO.update("003",new GenericUser(3,22,"smith"));
        System.out.println(userDAO.list());

    }
}
