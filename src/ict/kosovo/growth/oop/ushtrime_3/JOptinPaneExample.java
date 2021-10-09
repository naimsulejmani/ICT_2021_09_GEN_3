package ict.kosovo.growth.oop.ushtrime_3;

import javax.swing.*;

//Shpendi dhe Shkelqimi
public class JOptinPaneExample {
    public static void main(String[] args) {
        // ne fillim importohet javax.swing.JOptionPane

        String name = JOptionPane.showInputDialog("Enter name");
        //Ky është një kuti dialogu që lejon një përdorues të shkruajë disa të dhëna

        JOptionPane.showMessageDialog(null, "Hello " + name);
        //Kjo është një kuti dialogu e thjeshtë informacioni


        String lastname = JOptionPane.showInputDialog("Enter your lastname");
        JOptionPane.showMessageDialog(null, "Your lastname is" + lastname);

        String state = JOptionPane.showInputDialog("Enter state");
        JOptionPane.showMessageDialog(null, "Your state is " + state);

        String city = JOptionPane.showInputDialog("Enter city");
        JOptionPane.showMessageDialog(null, "Your city is " + city);




    }
}
