/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Branko
 */
public class MainForm extends Form {

    @FXML
    private Label lbl1;
    @FXML
    private Button btnpopuni;
    @FXML
    private ListView<Covek> lista1;

    @FXML
    private void popunilabelu(MouseEvent event) throws SQLException {
        
         ArrayList <Covek> lista2=new ArrayList<Covek>();
        Connection conn=null;
        conn=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kontakti?autoReconnect=true&useSSL=false", "root", "123456");
        Statement s=conn.createStatement();
        ResultSet rs=s.executeQuery("Select rednibroj_id,ime,prezime from covek");
        Covek c=null;
        while(rs.next()){
            c=new Covek(rs.getInt("rednibroj_id"),rs.getString("ime"),rs.getString("prezime"));
            lista2.add(c);
        }
        ObservableList<Covek> lista = FXCollections.observableList(lista2);
        lista1=new ListView<Covek>(lista);
        String ljudi="";
        for(int i=0;i<lista.size();i++){
            
            ljudi=ljudi+lista2.get(i).getIme();
        }
        lbl1.setText(ljudi);
        lista1=new ListView<Covek> (lista);
        popunilabelu(event);
        conn.close();
        
        
        
        
    }

    @FXML
    private void popuni(ActionEvent event) throws SQLException {
       
        
    }
    
}
