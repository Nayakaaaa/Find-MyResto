/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

/**
 *
 * @author REYHAN NAYAKA UTOMO_2311103071
 */
public class Costumer extends User{
    private String NamaLengkap;
    
    public Costumer(String NamaLengkap, String username, String password, String role) throws ValidasiInputException {
        super(username, password, "costumer");
        
        if (username == null || username.isEmpty()) {
            throw new ValidasiInputException("Username tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }
        
        this.NamaLengkap = NamaLengkap;
    }
    
    public String getNama(){
        return NamaLengkap;
    }
}
