/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcca;

/**
 *
 * @author Cheikh Mbacké
 */
public class Compteur {
    private int idCompteur ;
    private String numCompteur;
    private int idAbonne;
    
    public Compteur(int idcompteur,String numcompteur, int idabonne){
        this.idCompteur=idcompteur;
        this.numCompteur=numcompteur;
        this.idAbonne=idabonne;
    }

    Compteur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String CreateNumCompteur(){
        return "CPT"+this.numCompteur;
    }
    
    
}
