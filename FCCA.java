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
public class FCCA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Accueil acc=new Accueil();
        acc.setVisible(true);
        try {
                for(int i=0;i<=100;i++){
                    Thread.sleep(40);
                    acc.loadingNum.setText(Integer.toString(i)+"%");
                    acc.loadingBar.setValue(i);
                    if(i==100){
                        acc.setVisible(false);
                        new AbonneRegister().setVisible(true);
                     }
                }
              }catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    
       
    }
    
}
