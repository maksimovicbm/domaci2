/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Branko
 */
class Covek {

   int redniborj_id;
   String ime;
   String prezime;

    public Covek(int redniborj_id, String ime, String prezime) {
        this.redniborj_id = redniborj_id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getRedniborj_id() {
        return redniborj_id;
    }

    public void setRedniborj_id(int redniborj_id) {
        this.redniborj_id = redniborj_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return this.redniborj_id + this.ime + this.prezime;
    }
   
   
    
}
