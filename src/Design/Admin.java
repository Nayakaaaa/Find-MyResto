/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

/**
 *
 * @author REYHAN NAYAKA UTOMO_2311103071
 */
public class Admin extends User {

    public Admin(String username, String password, String role) throws ValidasiInputException {
        super(username, password, "admin");
        
        if (username == null || username.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }
    }
}
