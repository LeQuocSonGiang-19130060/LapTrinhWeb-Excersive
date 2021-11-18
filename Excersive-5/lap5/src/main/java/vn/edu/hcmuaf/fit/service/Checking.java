package vn.edu.hcmuaf.fit.service;



import java.util.HashMap;
import java.util.Map;

public class Checking {
    private static Checking singleton;
    private static Map<String, String> listUser = new HashMap<>();

    static {
        listUser.put("admin", "admin");
        listUser.put("songiang", "prime");
        listUser.put("hello", "123");
        listUser.put("kali", "kali");
    }

    private Checking() {
    }

    public static Checking getInstance() {
        if (singleton == null)
            singleton = new Checking();
        return singleton;
    }

    public boolean checkInfo(String username, String password) {
        if (listUser.containsKey(username) && listUser.get(username).equals(password))
            return true;
        return false;
    }
}
