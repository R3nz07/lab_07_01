/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebas.lab07_refactoring;

/**
 *
 * @author jacks
 */
public class Customer {

    private String name;
    private PhoneNumber  phone;  // Almacenado como String simple

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = new PhoneNumber(phone);
    }
    
    public String getName() {
        return name;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = new PhoneNumber(phone);
    }

    public boolean hasValidPhone() {
        return phone != null && phone.isValid();
    }

    public String getFormattedPhone() {
        return (phone != null) ? phone.getFormatted() : null;
    }
}
