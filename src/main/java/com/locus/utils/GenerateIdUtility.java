package com.locus.utils;


public class GenerateIdUtility {
    private static int userId = 0, resourceId =0;
    public static String generateRandomUserId()
    {
        return "user@" + userId++;

    }
    public static String generateRandomResourceId()
    {
        return "resource@" + resourceId++;

    }
}
