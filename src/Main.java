import com.entities.User;

public class Main {
    public static void main(String[] args) {
        // Construindo um usu�rio com nome e email apenas
        User user1 = new User.UserBuilder()
                .setName("John Doe")
                .setEmail("johndoe@example.com")
                .build();

        // Construindo um usu�rio completo
        User user2 = new User.UserBuilder()
                .setName("Jane Smith")
                .setEmail("janesmith@example.com")
                .setPhone("123-456-7890")
                .setAddress("123 Main St, City")
                .setBirthDate("1990-01-01")
                .build();

        // Exibindo os usu�rios criados
        System.out.println(user1);
        System.out.println(user2);
    }
}
