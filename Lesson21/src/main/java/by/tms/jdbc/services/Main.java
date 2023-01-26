package by.tms.jdbc.services;

import by.tms.jdbc.utils.CRUDUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(CRUDUtils.getAllStudentsAndCity());
        System.out.println(CRUDUtils.getAllCity());
    }
}
