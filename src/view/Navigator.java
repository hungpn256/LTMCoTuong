/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import model.Paticipant;

/**
 *
 * @author phamhung
 */
public class Navigator{
    private static Paticipant paticipantLogin;
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

    public static Paticipant getPaticipantLogin() {
        return paticipantLogin;
    }

    public static void setPaticipantLogin(Paticipant paticipantLogin) {
        Navigator.paticipantLogin = paticipantLogin;
    }
    
}
