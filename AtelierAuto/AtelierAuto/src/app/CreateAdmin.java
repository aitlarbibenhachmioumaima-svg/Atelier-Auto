package app;

import dao.UtilisateurDao;
import entities.Utilisateur;
import util.PasswordUtil;

public class CreateAdmin {

    public static void main(String[] args) {

        try {

            UtilisateurDao dao = new UtilisateurDao();

            String hashed = PasswordUtil.hash("1234");

            Utilisateur u = new Utilisateur("admin", hashed, "admin@gmail.com");

            dao.create(u);

            System.out.println("Admin created successfully!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}