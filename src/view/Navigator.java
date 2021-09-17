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
    private static Login JLogin;
    private static Register JRegister;
    private static GameUI JGameUI;
    private static Paticipant paticipant;
    public static List<JFrame> listScreen;
    public static void main(String[] args) {
        listScreen = new ArrayList<>();
        JLogin = new Login();
        JRegister = new Register();
        JRegister.setVisible(false);
        JGameUI = new GameUI();
        listScreen.add(JLogin);
        listScreen.add(JRegister);
        listScreen.add(JGameUI);
        navigateTo("Login");
    }
    public static void navigateTo(String name) {
        for(JFrame x:listScreen){
            if(x.getName().equals(name)){
                x.setVisible(true);
            }
            else{
                x.setVisible(false);
            }
        }
    }

    public static Login getJLogin() {
        return JLogin;
    }

    public static void setJLogin(Login JLogin) {
        Navigator.JLogin = JLogin;
    }

    public static Register getJRegister() {
        return JRegister;
    }

    public static void setJRegister(Register JRegister) {
        Navigator.JRegister = JRegister;
    }

    public static GameUI getJGameUI() {
        return JGameUI;
    }

    public static void setJGameUI(GameUI JGameUI) {
        Navigator.JGameUI = JGameUI;
    }

    public static Paticipant getPaticipant() {
        return paticipant;
    }

    public static void setPaticipant(Paticipant paticipant) {
        Navigator.paticipant = paticipant;
    }
    
}
