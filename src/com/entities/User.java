package com.entities;

public class User {
    // Campos do usuário
    private String name;
    private String email;
    private String phone;
    private String address;
    private String birthDate;

    // Construtor privado
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.birthDate = builder.birthDate;
    }

    // Método toString para exibir os dados do usuário
    @Override
    public String toString() {
        return "User{name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    // Builder interno
    public static class UserBuilder {
        private String name;
        private String email;
        private String phone;
        private String address;
        private String birthDate;

        // Métodos do builder para setar os atributos
        public UserBuilder setName(String name) {
            this.name = name;
            return this; // Retorna o próprio builder
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        // Método para construir o objeto `User`
        public User build() {
            return new User(this);
        }
    }
}

