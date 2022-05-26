package com.example.Core;

public class User {
        public String username;
        public String email;
        public String password;
        public String phone;
        public String Type;
        public boolean loggedIn;

        public String getName() {
                return username;
        }

        public void setName(String username) {
                this.username = username;
        }
}
