package vn.edu.hcmuaf.fit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User_Form1 {

    private static List<User> user = new ArrayList<>();
    private static User_Form1 singleton;

    private User_Form1() {
    }

    public static User_Form1 getSingleton() {
        if (singleton == null)
            singleton = new User_Form1();
        return singleton;
    }

    public void addMessage(String name, String email, String phone, String service, String message) {
        boolean isExist = false;
        for (User u : user) {
            if (u.getEmail().equals(email)) {
                isExist = true;
                u.addMessage(service, message);
                break;
            }
        }
        if (!isExist) {
            User u = new User(name, email, phone, service, message);
            u.addMessage(service, message);
            user.add(u);
        }
    }


    private class User {

        private String name;
        private String email;
        private String phone;
        private List<Services> service = new ArrayList<>();
        private String mess;

        private User(String name, String email, String phone, String service, String mess) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            addMessage(service, mess);
        }

        public String getEmail() {
            return email;
        }

        private void addMessage(String servicename, String mess) {
            boolean isExist = false;
            for (Services s : service) {
                if (s.getName().equals(servicename)) {
                    s.addMessage(mess);
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                Services ser = new Services(servicename);
                ser.addMessage(mess);
                service.add(ser);
            }

        }

        private List<Services> getMessage() {
            return service;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(email, user.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email, phone, service);
        }

        private class Services {
            private String name;

            private List<String> message = new ArrayList<String>();

            public Services(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            private List<String> getListMessage() {
                return message;
            }

            private void addMessage(String mess) {
                message.add(mess);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Services services = (Services) o;
                return Objects.equals(name, services.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name);
            }


        }
    }
}
