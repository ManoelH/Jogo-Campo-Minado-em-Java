package telas;

import conectaBanco.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Level1 extends javax.swing.JFrame {

    conectaBanco.Conexao conectado = new Conexao();
  
    ArrayList<String> valores = new ArrayList<>();
   
    int vetor[]=new int[99];
    int pontuacao = 0;
    int i;
            
    public Level1() {
 
        
        valores.add("☠"); /*1*/ 
        valores.add("•");
        valores.add("☠"); /*2*/
        valores.add("•");
        valores.add("☠"); /*3*/
        valores.add("•");
        valores.add("☠"); /*4*/
        valores.add("•");
        valores.add("☠"); /*5*/
        valores.add("•");
        valores.add("☠"); /*6*/ 
        valores.add("•");
        valores.add("☠"); /*7*/
        valores.add("•");
        valores.add("☠"); /*8*/
        valores.add("•");
        valores.add("☠"); /*9*/
        valores.add("•");
        valores.add("☠"); /*10*/
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        valores.add("•");
        
      Collections.shuffle(valores);
        
        initComponents();
        conectado.conecta();
    }

    public void aumentaPts(){
        if(vetor[i]==0)
            pontuacao+=10;
        vetor[i]++;
        }
    
    public void igual(){
            if(pontuacao==890){ //890, pontuacao aumenta +10, +70 bônus
            this.dispose();
            Nivel2.setVisible(true);
            }
    }
    
    public void gameOver(){
        JOptionPane.showMessageDialog(null, "Fim de jogo");
        try {
            PreparedStatement pst = conectado.conn.prepareStatement("update pontos set pontuacao = ?" +
"where id = (select max(id) from pontos)");
            pst.setInt(1, pontuacao);
            pst.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(Level1.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        pt.setVisible(true);
    }
 

    public String mina0(){
        if(valores.get(0).equals("☠")){
          mina0.setText(valores.get(0));
           gameOver();
        }else{
            i=0;
            aumentaPts();
            igual();
            if(!valores.get(11).equals("☠")){
                mina11.setText(mina11());
               
            }
        }
            return valores.get(0);
        }
       
        
        
        
        
        public String mina1(){
            
        if(valores.get(1).equals("☠")){
            mina1.setText(valores.get(1));
            gameOver();
        }else{
            i=1;
            aumentaPts();
            igual();
            if(!valores.get(2).equals("☠")){
                mina2.setText(mina2());
                
            }
            if(!valores.get(12).equals("☠")){
                mina12.setText(mina12());
                
            }
        }
            return valores.get(1);
        }
        
        
        
        
        public String mina2(){
        if(valores.get(2).equals("☠")){
            mina2.setText(valores.get(2));
            gameOver();
        }else{
            i=2;
            aumentaPts();
            igual();
            if(!valores.get(3).equals("☠")){
                mina3.setText(mina3());
              
            }
            if(!valores.get(13).equals("☠")){
                mina13.setText(mina13());
               
            }
        }
            return valores.get(2);
        }
        
        
        
        public String mina3(){
        if(valores.get(3).equals("☠")){
            mina3.setText(valores.get(3));
            gameOver();
        }else{
            i=3;
            aumentaPts();
            igual();
            if(!valores.get(4).equals("☠")){
                mina4.setText(mina4());
                
            }
            if(!valores.get(14).equals("☠")){
                mina14.setText(mina14());
             
            }
        }
            return valores.get(3);
        }
        
        
        
        public String mina4(){
        if(valores.get(4).equals("☠")){
            mina4.setText(valores.get(4));
           gameOver();
        }else{
            i=4;
            aumentaPts();
            igual();
            if(!valores.get(5).equals("☠")){
                mina5.setText(mina5());
                
            }
            if(!valores.get(15).equals("☠")){
                mina15.setText(mina15());
                
            }
        }
            return valores.get(4);
        }
        
        
        
        
          public String mina5(){
        if(valores.get(5).equals("☠")){
            mina5.setText(valores.get(5));
            gameOver(); 
        }else{
            i=5;
            aumentaPts();
            igual();
            if(!valores.get(6).equals("☠")){
                mina6.setText(mina6());
                
            }
            if(!valores.get(16).equals("☠")){
                mina16.setText(mina16());
              
            }
            
        }    
            return valores.get(5);
        }  
          
          
          
          
        public String mina6(){
        if(valores.get(6).equals("☠")){
            mina6.setText(valores.get(6));
            gameOver();
        }else{
            i=6;
            aumentaPts();
            igual();
            if(!valores.get(7).equals("☠")){
                mina7.setText(mina7());
                
            }
            if(!valores.get(17).equals("☠")){
                mina17.setText(mina17());
                }
        }    
            return valores.get(6);
        }
        
        
        public String mina7(){
        if(valores.get(7).equals("☠")){
            mina7.setText(valores.get(7));
            gameOver();
        }else{
            i=7;
            aumentaPts();
            igual();
            if(!valores.get(8).equals("☠")){
                mina8.setText(mina8());
                
            }
            if(!valores.get(18).equals("☠")){
                mina18.setText(mina18());
                
            }
        }
            return valores.get(7);
        }
        
        
        public String mina8(){
        if(valores.get(8).equals("☠")){
            mina8.setText(valores.get(8));
            gameOver();
        }else{
            i=8;
            aumentaPts();
            igual();
            if(!valores.get(9).equals("☠")){
                mina9.setText(mina9());
                
            }
            if(!valores.get(19).equals("☠")){
                mina19.setText(mina19());
               
            }
        }
            return valores.get(8);
        }
        
        
        
        
        
        public String mina9(){
        if(valores.get(9).equals("☠")){
            mina9.setText(valores.get(9));
            gameOver();
        }else{
            i=9;
            aumentaPts();
            igual();
            if(!valores.get(10).equals("☠")){
                mina10.setText(mina10());
                
            }
            if(!valores.get(20).equals("☠")){
                mina20.setText(mina20());
              
            }
        }
            return valores.get(9);
        }
        
        
        
        public String mina10(){
            if(valores.get(10).equals("☠")){
            mina10.setText(valores.get(10));
            gameOver();
            }else{
            i=10;
            aumentaPts();
            igual();
            if(!valores.get(21).equals("☠")){
                mina21.setText(mina21());
                }
        } 
            return valores.get(10);
        }
        
        
        
        public String mina11(){
        if(valores.get(11).equals("☠")){
            mina11.setText(valores.get(11));
            gameOver();
        } else{
            i=11;
            aumentaPts();
            igual();
            if(!valores.get(22).equals("☠")){
                mina22.setText(mina22());
                
            }
        }
            return valores.get(11);
        }
        
        
        public String mina12(){
        if(valores.get(12).equals("☠")){
              mina12.setText(valores.get(12));
              gameOver();
        }
        else{
            i=12;
            aumentaPts();
            igual();
            if(!valores.get(13).equals("☠")){
                mina13.setText(mina13());
                
            }
            if(!valores.get(23).equals("☠")){
                mina23.setText(mina23());
                
            }
        }
            return valores.get(12);
        }
        
        
        public String mina13(){
        if(valores.get(13).equals("☠")){
              mina13.setText(valores.get(13));
              gameOver();
        }
        else{
            i=13;
            aumentaPts();
            igual();
            if(!valores.get(14).equals("☠")){
                mina14.setText(mina14());
                
            }
            if(!valores.get(24).equals("☠")){
                mina24.setText(mina24());
                
            }
        }
            return valores.get(13);
        }
        
        
        public String mina14(){
        if(valores.get(14).equals("☠")){
              mina14.setText(valores.get(14));
              gameOver();
        }
        else{
            i=14;
            aumentaPts();
            igual();
            if(!valores.get(15).equals("☠")){
                mina15.setText(mina15());
                
            }
            if(!valores.get(25).equals("☠")){
                mina25.setText(mina25());
                
            }
        }
            return valores.get(14);
        }
        
        
        
        
        
        public String mina15(){
        if(valores.get(15).equals("☠")){
              mina15.setText(valores.get(15));
              gameOver();
        }
        else{
            i=15;
            aumentaPts();
            igual();
            if(!valores.get(16).equals("☠")){
                mina16.setText(mina16());
                
            }
            if(!valores.get(26).equals("☠")){
                mina26.setText(mina26());
                
            }
        }
            return valores.get(15);
        }
        
        
        
          public String mina16(){
        if(valores.get(16).equals("☠")){
              mina16.setText(valores.get(16));
              gameOver();
           
        }
        else{
            i=16;
            aumentaPts();
            igual();
            if(!valores.get(17).equals("☠")){
                mina17.setText(mina17());
                
            }
            if(!valores.get(27).equals("☠")){
                mina27.setText(mina27());
               
            }
        }
            return valores.get(16);
        }
          
          
        public String mina17(){
        if(valores.get(17).equals("☠")){
              mina17.setText(valores.get(17));
              gameOver();
        }
        else{
            i=17;
            aumentaPts();
            igual();
            if(!valores.get(18).equals("☠")){
                mina18.setText(mina18());
                
            }
            if(!valores.get(28).equals("☠")){
                mina28.setText(mina28());
                
            }
        }
            return valores.get(17);
        }
        
        
        
        public String mina18(){
        if(valores.get(18).equals("☠")){
              mina17.setText(valores.get(17));
              gameOver();
        }
        else{
            i=18;
            aumentaPts();
            igual();
            if(!valores.get(19).equals("☠")){
                mina19.setText(mina19());
                
            }
            if(!valores.get(29).equals("☠")){
                mina29.setText(mina29());
            }
        }
            return valores.get(18);
        }
        
        
        
        public String mina19(){
        if(valores.get(19).equals("☠")){
            mina19.setText(valores.get(19));
            gameOver();
        }
        else{
            i=19;
            aumentaPts();
            igual();
            if(!valores.get(20).equals("☠")){
                mina20.setText(mina20());
                
            }
            if(!valores.get(30).equals("☠")){
                mina30.setText(mina30());
                
            }
        }
            return valores.get(19);
        }
        
        
        
        public String mina20(){
        if(valores.get(20).equals("☠")){
            mina20.setText(valores.get(20));
            gameOver();
        }
        else{
            i=20;
            aumentaPts();
            igual();
            if(!valores.get(21).equals("☠")){
                mina21.setText(mina21());
                
            }
            if(!valores.get(31).equals("☠")){
                mina31.setText(mina31());
    
            }
        }
            return valores.get(20);
        }
        
        
        
        public String mina21(){
             if(valores.get(21).equals("☠")){
            mina21.setText(valores.get(21));
            gameOver();
        }
        else{
            i=21;
            aumentaPts();
            igual();
            if(!valores.get(32).equals("☠")){
                mina32.setText(mina32());
               
            }
        }
            return valores.get(21);
        }
        
        
         public String mina22(){
        if(valores.get(22).equals("☠")){
            mina22.setText(valores.get(22));
            gameOver();
        }
        else{
            i=22;
            aumentaPts();
            igual();
            if(!valores.get(23).equals("☠")){
                mina23.setText(mina23());
              
            }
            if(!valores.get(33).equals("☠")){
                mina33.setText(mina33());
              
            }
        }
            return valores.get(22);
        }
        
        
        
        public String mina23(){
        if(valores.get(23).equals("☠")){
         mina23.setText(valores.get(23));
           gameOver();
        }
        else{
            i=23;
            aumentaPts();
            igual();
            if(!valores.get(24).equals("☠")){
                mina24.setText(mina24());
                
            }
            if(!valores.get(34).equals("☠")){
                mina34.setText(mina34());
               
            }
        }    
            return valores.get(23);
        }
        
        
        
        public String mina24(){
        if(valores.get(24).equals("☠")){
            mina24.setText(valores.get(24));
            gameOver();
        }
        else{
            i=24;
            aumentaPts();
            igual();
            if(!valores.get(25).equals("☠")){
                mina25.setText(mina25());
       
            }
            if(!valores.get(35).equals("☠")){
                mina35.setText(mina35());
             
            }
        }
            return valores.get(24);
        }
        
        
        public String mina25(){
        if(valores.get(25).equals("☠")){
            mina25.setText(valores.get(25));
            gameOver();
        }
        else{
            i=25;
            aumentaPts();
            igual();
            if(!valores.get(26).equals("☠")){
                mina26.setText(mina26());
             
            }
            if(!valores.get(36).equals("☠")){
                mina36.setText(mina36());
                
            }
        }
            return valores.get(25);
        }
        
        
        
        public String mina26(){
        if(valores.get(26).equals("☠")){
           mina26.setText(valores.get(26));
           gameOver();
        }
        else{
            i=26;
            aumentaPts();
            igual();
            if(!valores.get(27).equals("☠")){
                mina27.setText(mina27());
                
            }
            if(!valores.get(37).equals("☠")){
                mina37.setText(mina37());
           
            }
        }
            return valores.get(26);
        }
        
        
        
          public String mina27(){
        if(valores.get(27).equals("☠")){
          mina27.setText(valores.get(27));
           gameOver();
        }
        else{
            i=27;
            aumentaPts();
            igual();
            if(!valores.get(28).equals("☠")){
                mina28.setText(mina28());
                
            }
            if(!valores.get(38).equals("☠")){
                mina38.setText(mina38());
                
            }
        }
            return valores.get(27);
        }
          
        public String mina28(){
        if(valores.get(28).equals("☠")){
            mina28.setText(valores.get(28));
            gameOver();
        }
        else{
            i=28;
            aumentaPts();
            igual();
            if(!valores.get(29).equals("☠")){
                mina29.setText(mina29());
                
            }
            if(!valores.get(39).equals("☠")){
                mina39.setText(mina39());
                
            }
        }
            return valores.get(28);
        }
        
        
        
        public String mina29(){
        if(valores.get(29).equals("☠")){
               mina29.setText(valores.get(29));
               gameOver();
        }
        else{
            i=29;
            aumentaPts();
            igual();
            if(!valores.get(30).equals("☠")){
                mina30.setText(mina30());
                
            }
            if(!valores.get(40).equals("☠")){
                mina40.setText(mina40());
                
            }
        }
            return valores.get(29);
        }
        
        
        
        public String mina30(){
        if(valores.get(30).equals("☠")){
              mina30.setText(valores.get(30));
              gameOver();
        }
        else{
            i=30;
            aumentaPts();
            igual();
            if(!valores.get(31).equals("☠")){
                mina31.setText(mina31());
               
            }
            if(!valores.get(41).equals("☠")){
                mina41.setText(mina41());
               
            }
        }
            return valores.get(30);
        }
        
        
        public String mina31(){
        if(valores.get(31).equals("☠")){
              mina31.setText(valores.get(31));
            gameOver(); 
        }
        else{
            i=31;
            aumentaPts();
            igual();
            if(!valores.get(32).equals("☠")){
                mina32.setText(mina32());
                
            }
            if(!valores.get(42).equals("☠")){
                mina42.setText(mina42());
               
            }
        }
            return valores.get(31);
        }
       
        
        public String mina32(){
             if(valores.get(32).equals("☠")){
                mina31.setText(valores.get(31));
                gameOver();
             }else{
            i=32;
            aumentaPts();
            igual();
            if(!valores.get(43).equals("☠")){
                mina43.setText(mina43());
              
            }
             }
            return valores.get(32);
        
        }
        
        
        public String mina33(){
        if(valores.get(33).equals("☠")){
           mina33.setText(valores.get(33));
           gameOver();
        }
        else{
            i=33;
            aumentaPts();
            igual();
            if(!valores.get(34).equals("☠")){
                mina34.setText(mina34());
                
            }
            if(!valores.get(44).equals("☠")){
                mina44.setText(mina44());
        
            }
        }
            return valores.get(33);
        }
        
        
        public String mina34(){
        if(valores.get(34).equals("☠")){
            mina34.setText(valores.get(34));
            gameOver();
        }
        else{
            i=34;
            aumentaPts();
            igual();
            if(!valores.get(35).equals("☠")){
                mina35.setText(mina35());
            }
            if(!valores.get(45).equals("☠")){
                mina45.setText(mina45());
                
            }
        }
            return valores.get(34);
        }
        
        public String mina35(){
        if(valores.get(35).equals("☠")){
           mina35.setText(valores.get(35));
           gameOver();
        }
        else{
            i=35;
            aumentaPts();
            igual();
            if(!valores.get(36).equals("☠")){
                mina36.setText(mina36());
                
            }
            if(!valores.get(46).equals("☠")){
                mina46.setText(mina46());
                
            }
        }
            return valores.get(35);
        }
        
        
        public String mina36(){
        if(valores.get(36).equals("☠")){
            mina36.setText(valores.get(36));
           gameOver();
        }
        else{
            i=36;
            aumentaPts();
            igual();
            if(!valores.get(37).equals("☠")){
                mina37.setText(mina37());
               
            }
            if(!valores.get(47).equals("☠")){
                mina47.setText(mina47());
              
            }
        }
            return valores.get(36);
        }
        
        
        public String mina37(){
        if(valores.get(37).equals("☠")){
            mina37.setText(valores.get(37));
            gameOver();
        }
        else{
            i=37;
            aumentaPts();
            igual();
            if(!valores.get(38).equals("☠")){
                mina38.setText(mina38());
            
            }
            if(!valores.get(48).equals("☠")){
                mina48.setText(mina48());
              
            }
        }
            return valores.get(37);
        }
        
          public String mina38(){
        if(valores.get(38).equals("☠")){
            mina38.setText(valores.get(38));
            gameOver();
        }
        else{
            i=38;
            aumentaPts();
            igual();
            if(!valores.get(39).equals("☠")){
                mina39.setText(mina39());
               
            }
            if(!valores.get(49).equals("☠")){
                mina49.setText(mina49());
            
            }
        }
            return valores.get(38);
        }
          
        public String mina39(){
        if(valores.get(39).equals("☠")){
           mina39.setText(valores.get(39));
            gameOver();
        }
        else{
            i=39;
            aumentaPts();
            igual();
            if(!valores.get(40).equals("☠")){
                mina40.setText(mina40());
                
            }
            if(!valores.get(50).equals("☠")){
                mina50.setText(mina50());
                
            }
        }
            return valores.get(39);
        }
        public String mina40(){
        if(valores.get(40).equals("☠")){
            mina40.setText(valores.get(40));
            gameOver();
        }
        else{
            i=40;
            aumentaPts();
            igual();
            if(!valores.get(41).equals("☠")){
                mina41.setText(mina41());
                
            }
            if(!valores.get(51).equals("☠")){
                mina51.setText(mina51());
   
            }
     }
            return valores.get(40);
        }
        
        
        public String mina41(){
        if(valores.get(41).equals("☠")){
          mina41.setText(valores.get(41));
            gameOver();
        }
        else{
            i=41;
            aumentaPts();
            igual();
            if(!valores.get(42).equals("☠")){
                mina42.setText(mina42());           
            }
            if(!valores.get(52).equals("☠")){
                mina52.setText(mina52());
               
            }
        }
            return valores.get(41);
        }
        
        public String mina42(){
        if(valores.get(42).equals("☠")){
            mina42.setText(valores.get(42));
            gameOver();
        }
        else{
            i=42;
            aumentaPts();
            igual();
            if(!valores.get(43).equals("☠")){
                mina43.setText(mina43());
             
            }
            if(!valores.get(53).equals("☠")){
                mina53.setText(mina53());
               
            }
        }
            return valores.get(42);
        }
        
        
        public String mina43(){
               
             if(valores.get(43).equals("☠")){
                gameOver();
             }else{
            i=43;
            aumentaPts();
            igual();
            if(!valores.get(54).equals("☠")){
                mina54.setText(mina54());
            }
             }
            return valores.get(43);
        }
        
        public String mina44(){
        if(valores.get(44).equals("☠")){
          mina44.setText(valores.get(44));
            gameOver();
        }
        else{i=44;
            aumentaPts();
            igual();
            if(!valores.get(45).equals("☠")){
                mina45.setText(mina45());
         
            }
            if(!valores.get(55).equals("☠")){
                mina55.setText(mina55());
               
            }
        }
            return valores.get(44);
        }
        
        
        public String mina45(){
        if(valores.get(45).equals("☠")){
            mina45.setText(valores.get(45));
            gameOver();
        }
        else{
            i=45;
            aumentaPts();
            igual();
            if(!valores.get(46).equals("☠")){
                mina46.setText(mina46());
                
            }
            if(!valores.get(56).equals("☠")){
                mina56.setText(mina56());
                
            }
        }
            return valores.get(45);
        }
        
        
        public String mina46(){
        if(valores.get(46).equals("☠")){
            mina46.setText(valores.get(46));
            gameOver();
        }
        else{
            i=46;
            aumentaPts();
            igual();
            if(!valores.get(47).equals("☠")){
                mina47.setText(mina47());
              
            }
            if(!valores.get(57).equals("☠")){
                mina57.setText(mina57());
                
            }
        }
            return valores.get(46);
        }
        public String mina47(){
        if(valores.get(47).equals("☠")){
           mina42.setText(valores.get(42));
            gameOver();
        }
        else{
            i=47;
            aumentaPts();
            igual();
            if(!valores.get(48).equals("☠")){
                mina48.setText(mina48());
               
            }
            if(!valores.get(58).equals("☠")){
                mina58.setText(mina58());
                
            }
        }
            return valores.get(47);
        }
        public String mina48(){
        if(valores.get(48).equals("☠")){
            mina48.setText(valores.get(48));
            gameOver();
        }
        else{
            i=48;
            aumentaPts();
            igual();
            if(!valores.get(49).equals("☠")){
                mina49.setText(mina49());
              
            }
            if(!valores.get(59).equals("☠")){
                mina59.setText(mina59());
                
            }
        }
            return valores.get(48);
        }
        
        
          public String mina49(){
        if(valores.get(49).equals("☠")){
            mina49.setText(valores.get(49));
            gameOver();
        }
        else{
            i=49;
            aumentaPts();
            igual();
            if(!valores.get(50).equals("☠")){
                mina50.setText(mina50());
               
            }
            if(!valores.get(60).equals("☠")){
                mina60.setText(mina60());
                
            }
        }
            return valores.get(49);
        }
          
        public String mina50(){
        if(valores.get(50).equals("☠")){
            mina50.setText(valores.get(50));
            gameOver();
        }
        else{
            i=50;
            aumentaPts();
            igual();
            if(!valores.get(51).equals("☠")){
                mina51.setText(mina51());
                
            }
            if(!valores.get(61).equals("☠")){
                mina61.setText(mina61());
              
            }
        }
            return valores.get(50);
        }
        
        
        public String mina51(){
        if(valores.get(51).equals("☠")){
            mina51.setText(valores.get(51));
            gameOver();
        }
        else{
            i=51;
            aumentaPts();
            igual();
            if(!valores.get(52).equals("☠")){
                mina52.setText(mina52());
               
            }
            if(!valores.get(62).equals("☠")){
                mina62.setText(mina62());
                
            }
        }
            return valores.get(51);
        }
        
        
        public String mina52(){
        if(valores.get(52).equals("☠")){
           mina52.setText(valores.get(52));
            gameOver();
        }
        else{
            i=52;
            aumentaPts();
            igual();
            if(!valores.get(53).equals("☠")){
                mina53.setText(mina53());
            
            }
            if(!valores.get(63).equals("☠")){
                mina63.setText(mina63());
        
            }
        }
            return valores.get(52);
        }
        
        
        public String mina53(){
        if(valores.get(53).equals("☠")){
            mina53.setText(valores.get(53));
            gameOver();
        }
        else{
            i=53;
            aumentaPts();
            igual();
            if(!valores.get(54).equals("☠")){
                mina54.setText(mina54());
           
            }
            if(!valores.get(64).equals("☠")){
                mina64.setText(mina64());
            
            }
        }
            return valores.get(53);
        }
        
        
        public String mina54(){
             if(valores.get(54).equals("☠")){
            mina54.setText(valores.get(54));
            gameOver();
        }
        else{
            i=54;
            aumentaPts();
            igual();
            if(!valores.get(65).equals("☠")){
                mina65.setText(mina65());
      
            }
        }
            return valores.get(54);
        }
        
        
        public String mina55(){
        if(valores.get(55).equals("☠")){
            mina55.setText(valores.get(55));
            gameOver();
        }
        else{
            i=55;
            aumentaPts();
            igual();
            if(!valores.get(56).equals("☠")){
                mina56.setText(mina56());
                
            }
            if(!valores.get(66).equals("☠")){
                mina66.setText(mina66());
              
            }
        }
            return valores.get(55);
        }
        
        public String mina56(){
        if(valores.get(56).equals("☠")){
            mina56.setText(valores.get(56));
           gameOver();
        }
        else{
            i=56;
            aumentaPts();
            igual();
            if(!valores.get(57).equals("☠")){
                mina57.setText(mina57());
              
            }
            if(!valores.get(67).equals("☠")){
                mina67.setText(mina67());
             
            }
        }
            return valores.get(56);
        }
        
        
        public String mina57(){
        if(valores.get(57).equals("☠")){
            mina57.setText(valores.get(57));
         gameOver();
        }
        else{
            i=57;
            aumentaPts();
            igual();
            if(!valores.get(58).equals("☠")){
                mina58.setText(mina58());
            
            }
            if(!valores.get(68).equals("☠")){
                mina68.setText(mina68());
             
            }
        }
            return valores.get(57);
        }
        
        
        public String mina58(){
        if(valores.get(58).equals("☠")){
            mina58.setText(valores.get(58));
            gameOver();
        }
        else{
            i=58;
            aumentaPts();
            igual();
            if(!valores.get(59).equals("☠")){
                mina59.setText(mina59());
               
            }
            if(!valores.get(69).equals("☠")){
                mina69.setText(mina69());
                
            }
        }
            return valores.get(58);
        }
        
        
        public String mina59(){
        if(valores.get(59).equals("☠")){
            mina59.setText(valores.get(59));
            gameOver();
        }
        else{
            i=59;
            aumentaPts();
            igual();
            if(!valores.get(60).equals("☠")){
                mina60.setText(mina60());
                
            }
            if(!valores.get(70).equals("☠")){
                mina70.setText(mina70());
               
            }
        }
              return valores.get(59);
        }
        
        
        public String mina60(){
        if(valores.get(60).equals("☠")){
            mina60.setText(valores.get(60));
           gameOver();
        }
        else{
            i=60;
            aumentaPts();
            igual();
            if(!valores.get(61).equals("☠")){
                mina61.setText(mina61());
                
            }
            if(!valores.get(71).equals("☠")){
                mina71.setText(mina71());
                
            }
        }
             return valores.get(60);
        }  
       
        public String mina61(){
        if(valores.get(61).equals("☠")){
            mina61.setText(valores.get(61));
            gameOver();
        }
        else{
            i=61;
            aumentaPts();
            igual();
            if(!valores.get(62).equals("☠")){
                mina62.setText(mina62());
                
            }
            if(!valores.get(72).equals("☠")){
                mina72.setText(mina72());
               
            }
        }
            return valores.get(61);
        }
        
        public String mina62(){
        if(valores.get(62).equals("☠")){
            mina62.setText(valores.get(62));
            gameOver();
        }
        else{
            i=62;
            aumentaPts();
            igual();
            if(!valores.get(63).equals("☠")){
                mina63.setText(mina63());
             
            }
            if(!valores.get(73).equals("☠")){
                mina73.setText(mina73());
               
            }
        }
            return valores.get(62);
        }
        
        
        public String mina63(){
        if(valores.get(63).equals("☠")){
            mina63.setText(valores.get(63));
            gameOver();
        }
        else{
            i=63;
            aumentaPts();
            igual();
            if(!valores.get(64).equals("☠")){
                mina64.setText(mina64());
               
            }
            if(!valores.get(74).equals("☠")){
                mina74.setText(mina74());
               
            }
        }
            return valores.get(63);
        }  
        
        public String mina64(){
        if(valores.get(64).equals("☠")){
            mina64.setText(valores.get(64));
            gameOver();
        }
        else{
            i=64;
            aumentaPts();
            igual();
            if(!valores.get(65).equals("☠")){
                mina65.setText(mina65());
              
            }
            if(!valores.get(75).equals("☠")){
                mina75.setText(mina75());
                
            }
        }
            return valores.get(64);
        }
        
        
        public String mina65(){
             if(valores.get(65).equals("☠")){
         mina65.setText(valores.get(65));
            gameOver();
        }
        else{
            i=65;
            aumentaPts();
            igual();
            if(!valores.get(76).equals("☠")){
                mina76.setText(mina76());
            
            }
        }
            return valores.get(65);
        }
        
        
         public String mina66(){
        if(valores.get(66).equals("☠")){
           mina66.setText(valores.get(66));
            gameOver();
        }
        else{
            i=66;
            aumentaPts();
            igual();
            if(!valores.get(67).equals("☠")){
                mina67.setText(mina67());
      
            }
            if(!valores.get(77).equals("☠")){
                mina77.setText(mina77());
                
            }
        }
            return valores.get(66);
        }
         
         
        public String mina67(){
        if(valores.get(67).equals("☠")){
            mina67.setText(valores.get(67));
            gameOver();
        }
        else{
            i=67;
            aumentaPts();
            igual();
            if(!valores.get(68).equals("☠")){
                mina68.setText(mina68());
             
            }
            if(!valores.get(78).equals("☠")){
                mina78.setText(mina78());
                
            }
        }
            return valores.get(67);
        }
        
        public String mina68(){
        if(valores.get(68).equals("☠")){
            mina68.setText(valores.get(68));
           gameOver();
        }
        else{
            i=68;
            aumentaPts();
            igual();
            if(!valores.get(69).equals("☠")){
                mina69.setText(mina69());
                
            }
            if(!valores.get(79).equals("☠")){
                mina79.setText(mina79());
               
            }
        }
            return valores.get(68);
        }
        
        public String mina69(){
        if(valores.get(69).equals("☠")){
           mina69.setText(valores.get(69));
            gameOver();
        }
        else{
            i=69;
            aumentaPts();
            igual();
            if(!valores.get(70).equals("☠")){
                mina70.setText(mina70());
                
            }
            if(!valores.get(80).equals("☠")){
                mina80.setText(mina80());
                
            }
        }
            return valores.get(69);
        }
        
        
        public String mina70(){
        if(valores.get(70).equals("☠")){
            mina70.setText(valores.get(70));
            gameOver();
        }
        else{
            i=70;
            aumentaPts();
            igual();
            if(!valores.get(71).equals("☠")){
                mina71.setText(mina71());
              
            }
            if(!valores.get(81).equals("☠")){
                mina81.setText(mina81());
              
            }
        }
            return valores.get(70);
        }
        
        
        public String mina71(){
        if(valores.get(71).equals("☠")){
            mina71.setText(valores.get(71));
            gameOver();
        }
        else{
            i=71;
            aumentaPts();
            igual();
            if(!valores.get(72).equals("☠")){
                mina72.setText(mina72());
              
            }
            if(!valores.get(82).equals("☠")){
                mina82.setText(mina82());
             
            }
        }
            return valores.get(71);
        }
        
        
        public String mina72(){
        if(valores.get(72).equals("☠")){
           mina72.setText(valores.get(72));
            gameOver();
        }
        else{
            i=72;
            aumentaPts();
            igual();
            if(!valores.get(73).equals("☠")){
                mina73.setText(mina73());
               
            }
            if(!valores.get(83).equals("☠")){
                mina83.setText(mina83());
               
            }
        }
            return valores.get(72);
        }
        
        public String mina73(){
        if(valores.get(73).equals("☠")){
           mina73.setText(valores.get(73));
           gameOver();
        }
        else{
            i=73;
            aumentaPts();
            igual();
            if(!valores.get(74).equals("☠")){
                mina74.setText(mina74());
                
            }
            if(!valores.get(84).equals("☠")){
                mina84.setText(mina84());
                
            }
        }
            return valores.get(73);
        }
        
        
        public String mina74(){
        if(valores.get(74).equals("☠")){
            mina74.setText(valores.get(74));
            gameOver();
        }
        else{
            i=74;
            aumentaPts();
            igual();
            if(!valores.get(75).equals("☠")){
                mina75.setText(mina75());
             
            }
            if(!valores.get(85).equals("☠")){
                mina85.setText(mina85());
               
            }
        }
            return valores.get(74);
        }
        
        
        public String mina75(){
        if(valores.get(75).equals("☠")){
            mina75.setText(valores.get(75));
            gameOver();
        }
        else{
            i=75;
            aumentaPts();
            igual();
            if(!valores.get(76).equals("☠")){
                mina76.setText(mina76());
                
            }
            if(!valores.get(86).equals("☠")){
                mina86.setText(mina86());
                
            }
        }
            return valores.get(75);
        }
        
        
        public String mina76(){
        if(valores.get(76).equals("☠")){
            mina76.setText(valores.get(76));
            gameOver();
        }
        else{
            i=76;
            aumentaPts();
            igual();
            if(!valores.get(87).equals("☠")){
                mina87.setText(mina87());
          
        }
        }
            return valores.get(76);
        }
        
        public String mina77(){
        if(valores.get(77).equals("☠")){
            mina77.setText(valores.get(77));
            gameOver();
        }
        else{
            i=77;
            aumentaPts();
            igual();            
            if(!valores.get(78).equals("☠")){
                mina78.setText(mina78());
              
            }
            if(!valores.get(88).equals("☠")){
                mina88.setText(mina88());
              
            }
        }
            return valores.get(77);
        }
        
        
        public String mina78(){
        if(valores.get(78).equals("☠")){
            mina78.setText(valores.get(78));
           gameOver();
        }
        else{
            i=78;
            aumentaPts();
            igual();
            if(!valores.get(79).equals("☠")){
                mina79.setText(mina79());
               
            }
            if(!valores.get(89).equals("☠")){
                mina89.setText(mina89());
             
            }
        }
            return valores.get(78);
        }
        
        
        public String mina79(){
        if(valores.get(79).equals("☠")){
            mina79.setText(valores.get(79));
            gameOver();
        }
        else{
            i=79;
            aumentaPts();
            igual();            
            if(!valores.get(80).equals("☠")){
                mina80.setText(mina80());
               
            }
            if(!valores.get(90).equals("☠")){
                mina90.setText(mina90());
           
            }
        }
            return valores.get(79);
        }
        
        
        public String mina80(){
        if(valores.get(80).equals("☠")){
            mina80.setText(valores.get(80));
            gameOver();
        }
        else{ 
            i=80;
            aumentaPts();
            igual();
            if(!valores.get(81).equals("☠")){
                mina81.setText(mina81());
                
            }
            if(!valores.get(91).equals("☠")){
                mina91.setText(mina91());
                
            }
        }
            return valores.get(80);
        }
        
        
        public String mina81(){
        if(valores.get(81).equals("☠")){
           mina81.setText(valores.get(81));
            gameOver();
        }
        else{
            i=81;
            aumentaPts();
            igual();
            if(!valores.get(82).equals("☠")){
                mina82.setText(mina82());
               
            }
            if(!valores.get(92).equals("☠")){
                mina92.setText(mina92());
             
            }
        }
            return valores.get(81);
        }
        
        
          public String mina82(){
        if(valores.get(82).equals("☠")){
            mina82.setText(valores.get(82));
           gameOver();
        }
        else{
            i=82;
            aumentaPts();
            igual();
            if(!valores.get(83).equals("☠")){
                mina83.setText(mina83());
              
            }
            if(!valores.get(93).equals("☠")){
                mina93.setText(mina93());
              
            }
        }
            return valores.get(82);
        }
          
          
        public String mina83(){
        if(valores.get(83).equals("☠")){
            mina83.setText(valores.get(83));
           gameOver();
        }
        else{
            i=83;
            aumentaPts();
            igual();
            if(!valores.get(84).equals("☠")){
                mina84.setText(mina84());
               
            }
            if(!valores.get(94).equals("☠")){
                mina94.setText(mina94());
               
            }
        }
            return valores.get(83);
        }
        
        
        public String mina84(){
        if(valores.get(84).equals("☠")){
            mina84.setText(valores.get(84));
           gameOver();
        }
        else{
            i=84;
            aumentaPts();
            igual();
            if(!valores.get(85).equals("☠")){
                mina85.setText(mina85());
               
            }
            if(!valores.get(95).equals("☠")){
                mina95.setText(mina95());
             
            }
        }
            return valores.get(84);
        }
        
        
        public String mina85(){
        if(valores.get(85).equals("☠")){
            mina85.setText(valores.get(85));
            gameOver();
        }
        else{
            i=85;
            aumentaPts();
            igual();
            if(!valores.get(86).equals("☠")){
                mina86.setText(mina86());
               
            }
            if(!valores.get(96).equals("☠")){
                mina96.setText(mina96());
               
            }
        }
            return valores.get(85);
        }
        
        
        public String mina86(){
        if(valores.get(86).equals("☠")){
            gameOver();
        }
        else{
            i=86;
            aumentaPts();
            igual();
            if(!valores.get(87).equals("☠")){
                mina87.setText(mina87());
 
            }
            if(!valores.get(97).equals("☠")){
                mina97.setText(mina97());
              
            }
        }
            return valores.get(86);
        }
        
        
        public String mina87(){
           if(valores.get(87).equals("☠")){
           gameOver();
        }
        else{
            i=87;
            aumentaPts();
            igual();
            if(!valores.get(98).equals("☠")){
                mina98.setText(mina98());
              
            }
        }
            return valores.get(87);
        }
        
        
        public String mina88(){
        if(valores.get(88).equals("☠")){
            gameOver();
        }
        else{
            i=88;
            aumentaPts();
            igual();
            if(!valores.get(89).equals("☠")){
                mina89.setText(mina89());
            }
        }
            return valores.get(88);
        }
        
        
        public String mina89(){
        if(valores.get(89).equals("☠")){
            gameOver();
        }
        else{
            i=89;
            aumentaPts();
            igual();
            if(!valores.get(90).equals("☠")){
                mina90.setText(mina90());
              
            }
        }
            return valores.get(89);
        }
        
        
        public String mina90(){
        if(valores.get(90).equals("☠")){
            gameOver();
        }
        else{
            i=90;
            aumentaPts();
            igual();
            if(!valores.get(91).equals("☠")){
                mina91.setText(mina91());
              
            }
        }
            return valores.get(90);
        }
        
        
        public String mina91(){
        if(valores.get(91).equals("☠")){
            mina91.setText(valores.get(91));
            gameOver();
        }
        else{
            i=91;
            aumentaPts();
            igual();
            if(!valores.get(92).equals("☠")){
                mina92.setText(mina92());
            
            }
        }
            return valores.get(91);
        }
        
        
        public String mina92(){
        if(valores.get(92).equals("☠")){
            gameOver();
        }
        else{
            i=92;
            aumentaPts();
            igual();
            if(!valores.get(93).equals("☠")){
                mina93.setText(mina93());
             
            }
        }
            return valores.get(92);
        }
        
        
          public String mina93(){
        if(valores.get(93).equals("☠")){
            gameOver();
        }
        else{
            i=93;
            aumentaPts();
            igual();
            if(!valores.get(94).equals("☠")){
                mina94.setText(mina94());
             
            }
        }
            return valores.get(93);
        } 
          
          
        public String mina94(){
        if(valores.get(94).equals("☠")){
            gameOver();
        }
        else{
            i=94;
            aumentaPts();
            igual();
            if(!valores.get(95).equals("☠")){
                mina95.setText(mina95());
              
            }
        }
            return valores.get(94);
        }
        
        
        public String mina95(){
        if(valores.get(95).equals("☠")){
           gameOver();
        }
        else{
            i=95;
            aumentaPts();
            igual();
            if(!valores.get(96).equals("☠")){
                mina96.setText(mina96());
             
            }
        }
            return valores.get(95);
        }
        
        
        public String mina96(){
        if(valores.get(96).equals("☠")){
            gameOver();
        }
        else{
            i=96;
            aumentaPts();
            igual();
            if(!valores.get(97).equals("☠")){
                mina97.setText(mina97());
               
            }
        }
            return valores.get(96);
        }  
        public String mina97(){
        if(valores.get(97).equals("☠")){
           gameOver();
        }
        else{
            i=97;
            aumentaPts();
           igual();
            if(!valores.get(98).equals("☠")){
                mina98.setText(mina98());
               
            }
        }
            return valores.get(97);
        }
        
        
        public String mina98(){
             if(valores.get(98).equals("☠")){
            gameOver();           
        }
             else{
            i=98;
            aumentaPts();
            igual();
            }        
            return valores.get(98);
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mina2 = new javax.swing.JButton();
        mina10 = new javax.swing.JButton();
        mina9 = new javax.swing.JButton();
        mina8 = new javax.swing.JButton();
        mina7 = new javax.swing.JButton();
        mina6 = new javax.swing.JButton();
        mina5 = new javax.swing.JButton();
        mina4 = new javax.swing.JButton();
        mina3 = new javax.swing.JButton();
        mina1 = new javax.swing.JButton();
        mina0 = new javax.swing.JButton();
        mina11 = new javax.swing.JButton();
        mina12 = new javax.swing.JButton();
        mina13 = new javax.swing.JButton();
        mina14 = new javax.swing.JButton();
        mina15 = new javax.swing.JButton();
        mina16 = new javax.swing.JButton();
        mina17 = new javax.swing.JButton();
        mina18 = new javax.swing.JButton();
        mina19 = new javax.swing.JButton();
        mina20 = new javax.swing.JButton();
        mina21 = new javax.swing.JButton();
        mina22 = new javax.swing.JButton();
        mina23 = new javax.swing.JButton();
        mina24 = new javax.swing.JButton();
        mina25 = new javax.swing.JButton();
        mina26 = new javax.swing.JButton();
        mina27 = new javax.swing.JButton();
        mina28 = new javax.swing.JButton();
        mina29 = new javax.swing.JButton();
        mina30 = new javax.swing.JButton();
        mina31 = new javax.swing.JButton();
        mina32 = new javax.swing.JButton();
        mina33 = new javax.swing.JButton();
        mina34 = new javax.swing.JButton();
        mina35 = new javax.swing.JButton();
        mina36 = new javax.swing.JButton();
        mina37 = new javax.swing.JButton();
        mina38 = new javax.swing.JButton();
        mina39 = new javax.swing.JButton();
        mina40 = new javax.swing.JButton();
        mina41 = new javax.swing.JButton();
        mina42 = new javax.swing.JButton();
        mina43 = new javax.swing.JButton();
        mina44 = new javax.swing.JButton();
        mina45 = new javax.swing.JButton();
        mina46 = new javax.swing.JButton();
        mina47 = new javax.swing.JButton();
        mina48 = new javax.swing.JButton();
        mina49 = new javax.swing.JButton();
        mina50 = new javax.swing.JButton();
        mina51 = new javax.swing.JButton();
        mina52 = new javax.swing.JButton();
        mina53 = new javax.swing.JButton();
        mina54 = new javax.swing.JButton();
        mina55 = new javax.swing.JButton();
        mina56 = new javax.swing.JButton();
        mina57 = new javax.swing.JButton();
        mina58 = new javax.swing.JButton();
        mina59 = new javax.swing.JButton();
        mina60 = new javax.swing.JButton();
        mina61 = new javax.swing.JButton();
        mina62 = new javax.swing.JButton();
        mina63 = new javax.swing.JButton();
        mina64 = new javax.swing.JButton();
        mina65 = new javax.swing.JButton();
        mina66 = new javax.swing.JButton();
        mina67 = new javax.swing.JButton();
        mina68 = new javax.swing.JButton();
        mina69 = new javax.swing.JButton();
        mina70 = new javax.swing.JButton();
        mina71 = new javax.swing.JButton();
        mina72 = new javax.swing.JButton();
        mina73 = new javax.swing.JButton();
        mina74 = new javax.swing.JButton();
        mina75 = new javax.swing.JButton();
        mina76 = new javax.swing.JButton();
        mina77 = new javax.swing.JButton();
        mina78 = new javax.swing.JButton();
        mina79 = new javax.swing.JButton();
        mina80 = new javax.swing.JButton();
        mina81 = new javax.swing.JButton();
        mina82 = new javax.swing.JButton();
        mina83 = new javax.swing.JButton();
        mina84 = new javax.swing.JButton();
        mina85 = new javax.swing.JButton();
        mina86 = new javax.swing.JButton();
        mina87 = new javax.swing.JButton();
        mina88 = new javax.swing.JButton();
        mina89 = new javax.swing.JButton();
        mina90 = new javax.swing.JButton();
        mina91 = new javax.swing.JButton();
        mina92 = new javax.swing.JButton();
        mina93 = new javax.swing.JButton();
        mina94 = new javax.swing.JButton();
        mina95 = new javax.swing.JButton();
        mina96 = new javax.swing.JButton();
        mina97 = new javax.swing.JButton();
        mina98 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campo Minado - Nível 1");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(565, 400));

        mina2.setForeground(new java.awt.Color(255, 0, 51));
        mina2.setText(".");
        mina2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina2ActionPerformed(evt);
            }
        });

        mina10.setForeground(new java.awt.Color(255, 0, 51));
        mina10.setText(".");
        mina10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina10ActionPerformed(evt);
            }
        });

        mina9.setForeground(new java.awt.Color(255, 0, 51));
        mina9.setText(".");
        mina9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina9ActionPerformed(evt);
            }
        });

        mina8.setForeground(new java.awt.Color(255, 0, 51));
        mina8.setText(".");
        mina8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina8ActionPerformed(evt);
            }
        });

        mina7.setForeground(new java.awt.Color(255, 0, 51));
        mina7.setText(".");
        mina7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina7ActionPerformed(evt);
            }
        });

        mina6.setForeground(new java.awt.Color(255, 0, 51));
        mina6.setText(".");
        mina6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina6ActionPerformed(evt);
            }
        });

        mina5.setForeground(new java.awt.Color(255, 0, 51));
        mina5.setText(".");
        mina5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina5ActionPerformed(evt);
            }
        });

        mina4.setForeground(new java.awt.Color(255, 0, 51));
        mina4.setText(".");
        mina4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina4ActionPerformed(evt);
            }
        });

        mina3.setForeground(new java.awt.Color(255, 0, 51));
        mina3.setText(".");
        mina3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina3ActionPerformed(evt);
            }
        });

        mina1.setForeground(new java.awt.Color(255, 0, 51));
        mina1.setText(".");
        mina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina1ActionPerformed(evt);
            }
        });

        mina0.setForeground(new java.awt.Color(255, 0, 51));
        mina0.setText(".");
        mina0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina0ActionPerformed(evt);
            }
        });

        mina11.setForeground(new java.awt.Color(255, 0, 51));
        mina11.setText(".");
        mina11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina11ActionPerformed(evt);
            }
        });

        mina12.setForeground(new java.awt.Color(255, 0, 51));
        mina12.setText(".");
        mina12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina12ActionPerformed(evt);
            }
        });

        mina13.setForeground(new java.awt.Color(255, 0, 51));
        mina13.setText(".");
        mina13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina13ActionPerformed(evt);
            }
        });

        mina14.setForeground(new java.awt.Color(255, 0, 51));
        mina14.setText(".");
        mina14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina14ActionPerformed(evt);
            }
        });

        mina15.setForeground(new java.awt.Color(255, 0, 51));
        mina15.setText(".");
        mina15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina15ActionPerformed(evt);
            }
        });

        mina16.setForeground(new java.awt.Color(255, 0, 51));
        mina16.setText(".");
        mina16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina16ActionPerformed(evt);
            }
        });

        mina17.setForeground(new java.awt.Color(255, 0, 51));
        mina17.setText(".");
        mina17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina17ActionPerformed(evt);
            }
        });

        mina18.setForeground(new java.awt.Color(255, 0, 51));
        mina18.setText(".");
        mina18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina18ActionPerformed(evt);
            }
        });

        mina19.setForeground(new java.awt.Color(255, 0, 51));
        mina19.setText(".");
        mina19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina19ActionPerformed(evt);
            }
        });

        mina20.setForeground(new java.awt.Color(255, 0, 51));
        mina20.setText(".");
        mina20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina20ActionPerformed(evt);
            }
        });

        mina21.setForeground(new java.awt.Color(255, 0, 51));
        mina21.setText(".");
        mina21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina21ActionPerformed(evt);
            }
        });

        mina22.setForeground(new java.awt.Color(255, 0, 51));
        mina22.setText(".");
        mina22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina22ActionPerformed(evt);
            }
        });

        mina23.setForeground(new java.awt.Color(255, 0, 51));
        mina23.setText(".");
        mina23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina23ActionPerformed(evt);
            }
        });

        mina24.setForeground(new java.awt.Color(255, 0, 51));
        mina24.setText(".");
        mina24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina24ActionPerformed(evt);
            }
        });

        mina25.setForeground(new java.awt.Color(255, 0, 51));
        mina25.setText(".");
        mina25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina25ActionPerformed(evt);
            }
        });

        mina26.setForeground(new java.awt.Color(255, 0, 51));
        mina26.setText(".");
        mina26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina26ActionPerformed(evt);
            }
        });

        mina27.setForeground(new java.awt.Color(255, 0, 51));
        mina27.setText(".");
        mina27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina27ActionPerformed(evt);
            }
        });

        mina28.setForeground(new java.awt.Color(255, 0, 51));
        mina28.setText(".");
        mina28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina28ActionPerformed(evt);
            }
        });

        mina29.setForeground(new java.awt.Color(255, 0, 51));
        mina29.setText(".");
        mina29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina29ActionPerformed(evt);
            }
        });

        mina30.setForeground(new java.awt.Color(255, 0, 51));
        mina30.setText(".");
        mina30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina30ActionPerformed(evt);
            }
        });

        mina31.setForeground(new java.awt.Color(255, 0, 51));
        mina31.setText(".");
        mina31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina31ActionPerformed(evt);
            }
        });

        mina32.setForeground(new java.awt.Color(255, 0, 51));
        mina32.setText(".");
        mina32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina32ActionPerformed(evt);
            }
        });

        mina33.setForeground(new java.awt.Color(255, 0, 51));
        mina33.setText(".");
        mina33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina33ActionPerformed(evt);
            }
        });

        mina34.setForeground(new java.awt.Color(255, 0, 51));
        mina34.setText(".");
        mina34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina34ActionPerformed(evt);
            }
        });

        mina35.setForeground(new java.awt.Color(255, 0, 51));
        mina35.setText(".");
        mina35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina35ActionPerformed(evt);
            }
        });

        mina36.setForeground(new java.awt.Color(255, 0, 51));
        mina36.setText(".");
        mina36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina36ActionPerformed(evt);
            }
        });

        mina37.setForeground(new java.awt.Color(255, 0, 51));
        mina37.setText(".");
        mina37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina37ActionPerformed(evt);
            }
        });

        mina38.setForeground(new java.awt.Color(255, 0, 51));
        mina38.setText(".");
        mina38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina38ActionPerformed(evt);
            }
        });

        mina39.setForeground(new java.awt.Color(255, 0, 51));
        mina39.setText(".");
        mina39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina39ActionPerformed(evt);
            }
        });

        mina40.setForeground(new java.awt.Color(255, 0, 51));
        mina40.setText(".");
        mina40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina40ActionPerformed(evt);
            }
        });

        mina41.setForeground(new java.awt.Color(255, 0, 51));
        mina41.setText(".");
        mina41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina41ActionPerformed(evt);
            }
        });

        mina42.setForeground(new java.awt.Color(255, 0, 51));
        mina42.setText(".");
        mina42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina42ActionPerformed(evt);
            }
        });

        mina43.setForeground(new java.awt.Color(255, 0, 51));
        mina43.setText(".");
        mina43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina43ActionPerformed(evt);
            }
        });

        mina44.setForeground(new java.awt.Color(255, 0, 51));
        mina44.setText(".");
        mina44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina44ActionPerformed(evt);
            }
        });

        mina45.setForeground(new java.awt.Color(255, 0, 51));
        mina45.setText(".");
        mina45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina45ActionPerformed(evt);
            }
        });

        mina46.setForeground(new java.awt.Color(255, 0, 51));
        mina46.setText(".");
        mina46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina46ActionPerformed(evt);
            }
        });

        mina47.setForeground(new java.awt.Color(255, 0, 51));
        mina47.setText(".");
        mina47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina47ActionPerformed(evt);
            }
        });

        mina48.setForeground(new java.awt.Color(255, 0, 51));
        mina48.setText(".");
        mina48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina48ActionPerformed(evt);
            }
        });

        mina49.setForeground(new java.awt.Color(255, 0, 51));
        mina49.setText(".");
        mina49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina49ActionPerformed(evt);
            }
        });

        mina50.setForeground(new java.awt.Color(255, 0, 51));
        mina50.setText(".");
        mina50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina50ActionPerformed(evt);
            }
        });

        mina51.setForeground(new java.awt.Color(255, 0, 51));
        mina51.setText(".");
        mina51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina51ActionPerformed(evt);
            }
        });

        mina52.setForeground(new java.awt.Color(255, 0, 51));
        mina52.setText(".");
        mina52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina52ActionPerformed(evt);
            }
        });

        mina53.setForeground(new java.awt.Color(255, 0, 51));
        mina53.setText(".");
        mina53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina53ActionPerformed(evt);
            }
        });

        mina54.setForeground(new java.awt.Color(255, 0, 51));
        mina54.setText(".");
        mina54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina54ActionPerformed(evt);
            }
        });

        mina55.setForeground(new java.awt.Color(255, 0, 51));
        mina55.setText(".");
        mina55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina55ActionPerformed(evt);
            }
        });

        mina56.setForeground(new java.awt.Color(255, 0, 51));
        mina56.setText(".");
        mina56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina56ActionPerformed(evt);
            }
        });

        mina57.setForeground(new java.awt.Color(255, 0, 51));
        mina57.setText(".");
        mina57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina57ActionPerformed(evt);
            }
        });

        mina58.setForeground(new java.awt.Color(255, 0, 51));
        mina58.setText(".");
        mina58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina58ActionPerformed(evt);
            }
        });

        mina59.setForeground(new java.awt.Color(255, 0, 51));
        mina59.setText(".");
        mina59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina59ActionPerformed(evt);
            }
        });

        mina60.setForeground(new java.awt.Color(255, 0, 51));
        mina60.setText(".");
        mina60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina60ActionPerformed(evt);
            }
        });

        mina61.setForeground(new java.awt.Color(255, 0, 51));
        mina61.setText(".");
        mina61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina61ActionPerformed(evt);
            }
        });

        mina62.setForeground(new java.awt.Color(255, 0, 51));
        mina62.setText(".");
        mina62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina62ActionPerformed(evt);
            }
        });

        mina63.setForeground(new java.awt.Color(255, 0, 51));
        mina63.setText(".");
        mina63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina63ActionPerformed(evt);
            }
        });

        mina64.setForeground(new java.awt.Color(255, 0, 51));
        mina64.setText(".");
        mina64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina64ActionPerformed(evt);
            }
        });

        mina65.setForeground(new java.awt.Color(255, 0, 51));
        mina65.setText(".");
        mina65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina65ActionPerformed(evt);
            }
        });

        mina66.setForeground(new java.awt.Color(255, 0, 51));
        mina66.setText(".");
        mina66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina66ActionPerformed(evt);
            }
        });

        mina67.setForeground(new java.awt.Color(255, 0, 51));
        mina67.setText(".");
        mina67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina67ActionPerformed(evt);
            }
        });

        mina68.setForeground(new java.awt.Color(255, 0, 51));
        mina68.setText(".");
        mina68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina68ActionPerformed(evt);
            }
        });

        mina69.setForeground(new java.awt.Color(255, 0, 51));
        mina69.setText(".");
        mina69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina69ActionPerformed(evt);
            }
        });

        mina70.setForeground(new java.awt.Color(255, 0, 51));
        mina70.setText(".");
        mina70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina70ActionPerformed(evt);
            }
        });

        mina71.setForeground(new java.awt.Color(255, 0, 51));
        mina71.setText(".");
        mina71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina71ActionPerformed(evt);
            }
        });

        mina72.setForeground(new java.awt.Color(255, 0, 51));
        mina72.setText(".");
        mina72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina72ActionPerformed(evt);
            }
        });

        mina73.setForeground(new java.awt.Color(255, 0, 51));
        mina73.setText(".");
        mina73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina73ActionPerformed(evt);
            }
        });

        mina74.setForeground(new java.awt.Color(255, 0, 51));
        mina74.setText(".");
        mina74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina74ActionPerformed(evt);
            }
        });

        mina75.setForeground(new java.awt.Color(255, 0, 51));
        mina75.setText(".");
        mina75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina75ActionPerformed(evt);
            }
        });

        mina76.setForeground(new java.awt.Color(255, 0, 51));
        mina76.setText(".");
        mina76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina76ActionPerformed(evt);
            }
        });

        mina77.setForeground(new java.awt.Color(255, 0, 51));
        mina77.setText(".");
        mina77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina77ActionPerformed(evt);
            }
        });

        mina78.setForeground(new java.awt.Color(255, 0, 51));
        mina78.setText(".");
        mina78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina78ActionPerformed(evt);
            }
        });

        mina79.setForeground(new java.awt.Color(255, 0, 51));
        mina79.setText(".");
        mina79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina79ActionPerformed(evt);
            }
        });

        mina80.setForeground(new java.awt.Color(255, 0, 51));
        mina80.setText(".");
        mina80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina80ActionPerformed(evt);
            }
        });

        mina81.setForeground(new java.awt.Color(255, 0, 51));
        mina81.setText(".");
        mina81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina81ActionPerformed(evt);
            }
        });

        mina82.setForeground(new java.awt.Color(255, 0, 51));
        mina82.setText(".");
        mina82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina82ActionPerformed(evt);
            }
        });

        mina83.setForeground(new java.awt.Color(255, 0, 51));
        mina83.setText(".");
        mina83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina83ActionPerformed(evt);
            }
        });

        mina84.setForeground(new java.awt.Color(255, 0, 51));
        mina84.setText(".");
        mina84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina84ActionPerformed(evt);
            }
        });

        mina85.setForeground(new java.awt.Color(255, 0, 51));
        mina85.setText(".");
        mina85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina85ActionPerformed(evt);
            }
        });

        mina86.setForeground(new java.awt.Color(255, 0, 51));
        mina86.setText(".");
        mina86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina86ActionPerformed(evt);
            }
        });

        mina87.setForeground(new java.awt.Color(255, 0, 51));
        mina87.setText(".");
        mina87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina87ActionPerformed(evt);
            }
        });

        mina88.setForeground(new java.awt.Color(255, 0, 51));
        mina88.setText(".");
        mina88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina88ActionPerformed(evt);
            }
        });

        mina89.setForeground(new java.awt.Color(255, 0, 51));
        mina89.setText(".");
        mina89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina89ActionPerformed(evt);
            }
        });

        mina90.setForeground(new java.awt.Color(255, 0, 51));
        mina90.setText(".");
        mina90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina90ActionPerformed(evt);
            }
        });

        mina91.setForeground(new java.awt.Color(255, 0, 51));
        mina91.setText(".");
        mina91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina91ActionPerformed(evt);
            }
        });

        mina92.setForeground(new java.awt.Color(255, 0, 51));
        mina92.setText(".");
        mina92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina92ActionPerformed(evt);
            }
        });

        mina93.setForeground(new java.awt.Color(255, 0, 51));
        mina93.setText(".");
        mina93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina93ActionPerformed(evt);
            }
        });

        mina94.setForeground(new java.awt.Color(255, 0, 51));
        mina94.setText(".");
        mina94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina94ActionPerformed(evt);
            }
        });

        mina95.setForeground(new java.awt.Color(255, 0, 51));
        mina95.setText(".");
        mina95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina95ActionPerformed(evt);
            }
        });

        mina96.setForeground(new java.awt.Color(255, 0, 51));
        mina96.setText(".");
        mina96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina96ActionPerformed(evt);
            }
        });

        mina97.setForeground(new java.awt.Color(255, 0, 51));
        mina97.setText(".");
        mina97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina97ActionPerformed(evt);
            }
        });

        mina98.setForeground(new java.awt.Color(255, 0, 51));
        mina98.setText(".");
        mina98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mina98ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mina98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mina88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina0)
                    .addComponent(mina1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina10)
                        .addComponent(mina9)
                        .addComponent(mina8)
                        .addComponent(mina7)
                        .addComponent(mina6)
                        .addComponent(mina5)
                        .addComponent(mina4)
                        .addComponent(mina3)
                        .addComponent(mina2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina11)
                    .addComponent(mina12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina21)
                        .addComponent(mina20)
                        .addComponent(mina19)
                        .addComponent(mina18)
                        .addComponent(mina17)
                        .addComponent(mina16)
                        .addComponent(mina15)
                        .addComponent(mina14)
                        .addComponent(mina13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina22)
                    .addComponent(mina23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina32)
                        .addComponent(mina31)
                        .addComponent(mina30)
                        .addComponent(mina29)
                        .addComponent(mina28)
                        .addComponent(mina27)
                        .addComponent(mina26)
                        .addComponent(mina25)
                        .addComponent(mina24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina33)
                    .addComponent(mina34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina43)
                        .addComponent(mina42)
                        .addComponent(mina41)
                        .addComponent(mina40)
                        .addComponent(mina39)
                        .addComponent(mina38)
                        .addComponent(mina37)
                        .addComponent(mina36)
                        .addComponent(mina35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina44)
                    .addComponent(mina45)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina54)
                        .addComponent(mina53)
                        .addComponent(mina52)
                        .addComponent(mina51)
                        .addComponent(mina50)
                        .addComponent(mina49)
                        .addComponent(mina48)
                        .addComponent(mina47)
                        .addComponent(mina46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina55)
                    .addComponent(mina56)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina65)
                        .addComponent(mina64)
                        .addComponent(mina63)
                        .addComponent(mina62)
                        .addComponent(mina61)
                        .addComponent(mina60)
                        .addComponent(mina59)
                        .addComponent(mina58)
                        .addComponent(mina57)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina66)
                    .addComponent(mina67)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina76)
                        .addComponent(mina75)
                        .addComponent(mina74)
                        .addComponent(mina73)
                        .addComponent(mina72)
                        .addComponent(mina71)
                        .addComponent(mina70)
                        .addComponent(mina69)
                        .addComponent(mina68)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina77)
                    .addComponent(mina78)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina87)
                        .addComponent(mina86)
                        .addComponent(mina85)
                        .addComponent(mina84)
                        .addComponent(mina83)
                        .addComponent(mina82)
                        .addComponent(mina81)
                        .addComponent(mina80)
                        .addComponent(mina79)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mina88)
                    .addComponent(mina89)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mina98)
                        .addComponent(mina97)
                        .addComponent(mina96)
                        .addComponent(mina95)
                        .addComponent(mina94)
                        .addComponent(mina93)
                        .addComponent(mina92)
                        .addComponent(mina91)
                        .addComponent(mina90)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mina2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina2ActionPerformed
            mina2.setText(mina2());
    }//GEN-LAST:event_mina2ActionPerformed

    private void mina10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina10ActionPerformed
            mina10.setText(mina10());
    }//GEN-LAST:event_mina10ActionPerformed

    private void mina9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina9ActionPerformed
            mina9.setText(mina9());                  
    }//GEN-LAST:event_mina9ActionPerformed

    private void mina8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina8ActionPerformed
            mina8.setText(mina8());          
    }//GEN-LAST:event_mina8ActionPerformed

    private void mina7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina7ActionPerformed
            mina7.setText(mina7());
    }//GEN-LAST:event_mina7ActionPerformed

    private void mina6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina6ActionPerformed
            mina6.setText(mina6());
    }//GEN-LAST:event_mina6ActionPerformed

    private void mina5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina5ActionPerformed
            mina5.setText(mina5());
    }//GEN-LAST:event_mina5ActionPerformed

    private void mina4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina4ActionPerformed
            mina4.setText(mina4());
    }//GEN-LAST:event_mina4ActionPerformed

    private void mina3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina3ActionPerformed
            mina3.setText(mina3()); 
    }//GEN-LAST:event_mina3ActionPerformed

    private void mina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina1ActionPerformed
            mina1.setText(mina1());                    
    }//GEN-LAST:event_mina1ActionPerformed

    private void mina0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina0ActionPerformed
            mina0.setText(mina0());          
    }//GEN-LAST:event_mina0ActionPerformed

    private void mina11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina11ActionPerformed
            mina11.setText(mina11());         
    }//GEN-LAST:event_mina11ActionPerformed

    private void mina12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina12ActionPerformed
            mina12.setText(mina12());  
    }//GEN-LAST:event_mina12ActionPerformed

    private void mina13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina13ActionPerformed
            mina13.setText(mina13());
    }//GEN-LAST:event_mina13ActionPerformed

    private void mina14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina14ActionPerformed
            mina14.setText(mina14());
    }//GEN-LAST:event_mina14ActionPerformed

    private void mina15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina15ActionPerformed
            mina15.setText(mina15());
    }//GEN-LAST:event_mina15ActionPerformed

    private void mina16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina16ActionPerformed
            mina16.setText(mina16());          
    }//GEN-LAST:event_mina16ActionPerformed

    private void mina17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina17ActionPerformed
            mina17.setText(mina17());          
    }//GEN-LAST:event_mina17ActionPerformed

    private void mina18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina18ActionPerformed
            mina18.setText(mina18());       
    }//GEN-LAST:event_mina18ActionPerformed

    private void mina19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina19ActionPerformed
            mina19.setText(mina19());
    }//GEN-LAST:event_mina19ActionPerformed

    private void mina20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina20ActionPerformed
            mina20.setText(mina20());      
    }//GEN-LAST:event_mina20ActionPerformed

    private void mina21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina21ActionPerformed
            mina21.setText(mina21());
    }//GEN-LAST:event_mina21ActionPerformed

    private void mina22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina22ActionPerformed
            mina22.setText(mina22());     
    }//GEN-LAST:event_mina22ActionPerformed

    private void mina23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina23ActionPerformed
            mina23.setText(mina23());       
    }//GEN-LAST:event_mina23ActionPerformed

    private void mina24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina24ActionPerformed
            mina24.setText(mina24());      
    }//GEN-LAST:event_mina24ActionPerformed

    private void mina25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina25ActionPerformed
            mina25.setText(mina25());
    }//GEN-LAST:event_mina25ActionPerformed

    private void mina26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina26ActionPerformed
            mina26.setText(mina26());       
    }//GEN-LAST:event_mina26ActionPerformed

    private void mina27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina27ActionPerformed
            mina27.setText(mina27());      
    }//GEN-LAST:event_mina27ActionPerformed

    private void mina28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina28ActionPerformed
            mina28.setText(mina28());       
    }//GEN-LAST:event_mina28ActionPerformed

    private void mina29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina29ActionPerformed
            mina29.setText(mina29());      
    }//GEN-LAST:event_mina29ActionPerformed

    private void mina30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina30ActionPerformed
            mina30.setText(mina30());
    }//GEN-LAST:event_mina30ActionPerformed

    private void mina31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina31ActionPerformed
            mina31.setText(mina31());      
    }//GEN-LAST:event_mina31ActionPerformed

    private void mina32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina32ActionPerformed
            mina32.setText(mina32());      
    }//GEN-LAST:event_mina32ActionPerformed

    private void mina33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina33ActionPerformed
            mina33.setText(mina33());
    }//GEN-LAST:event_mina33ActionPerformed

    private void mina34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina34ActionPerformed
            mina34.setText(mina34());
    }//GEN-LAST:event_mina34ActionPerformed

    private void mina35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina35ActionPerformed
            mina35.setText(mina35());
    }//GEN-LAST:event_mina35ActionPerformed

    private void mina36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina36ActionPerformed
            mina36.setText(mina36());
    }//GEN-LAST:event_mina36ActionPerformed

    private void mina37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina37ActionPerformed
            mina37.setText(mina37());
    }//GEN-LAST:event_mina37ActionPerformed

    private void mina38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina38ActionPerformed
            mina38.setText(mina38());
    }//GEN-LAST:event_mina38ActionPerformed

    private void mina39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina39ActionPerformed
            mina39.setText(mina39());
    }//GEN-LAST:event_mina39ActionPerformed

    private void mina40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina40ActionPerformed
            mina40.setText(mina40());
    }//GEN-LAST:event_mina40ActionPerformed

    private void mina41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina41ActionPerformed
            mina41.setText(mina41());
    }//GEN-LAST:event_mina41ActionPerformed

    private void mina42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina42ActionPerformed
            mina42.setText(mina42());
    }//GEN-LAST:event_mina42ActionPerformed

    private void mina43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina43ActionPerformed
            mina43.setText(mina43());
    }//GEN-LAST:event_mina43ActionPerformed

    private void mina44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina44ActionPerformed
            mina44.setText(mina44());
    }//GEN-LAST:event_mina44ActionPerformed

    private void mina45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina45ActionPerformed
            mina45.setText(mina45());
    }//GEN-LAST:event_mina45ActionPerformed

    private void mina46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina46ActionPerformed
            mina46.setText(mina46());
    }//GEN-LAST:event_mina46ActionPerformed

    private void mina47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina47ActionPerformed
            mina47.setText(mina47());
    }//GEN-LAST:event_mina47ActionPerformed

    private void mina48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina48ActionPerformed
            mina48.setText(mina48());
    }//GEN-LAST:event_mina48ActionPerformed

    private void mina49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina49ActionPerformed
            mina49.setText(mina49());
    }//GEN-LAST:event_mina49ActionPerformed

    private void mina50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina50ActionPerformed
            mina50.setText(mina50());
    }//GEN-LAST:event_mina50ActionPerformed

    private void mina51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina51ActionPerformed
            mina51.setText(mina51());
    }//GEN-LAST:event_mina51ActionPerformed

    private void mina52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina52ActionPerformed
            mina52.setText(mina52());
    }//GEN-LAST:event_mina52ActionPerformed

    private void mina53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina53ActionPerformed
            mina53.setText(mina53());
    }//GEN-LAST:event_mina53ActionPerformed

    private void mina54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina54ActionPerformed
            mina54.setText(mina54());
    }//GEN-LAST:event_mina54ActionPerformed

    private void mina55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina55ActionPerformed
            mina55.setText(mina55());
    }//GEN-LAST:event_mina55ActionPerformed

    private void mina56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina56ActionPerformed
            mina56.setText(mina56());
    }//GEN-LAST:event_mina56ActionPerformed

    private void mina57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina57ActionPerformed
            mina57.setText(mina57());
    }//GEN-LAST:event_mina57ActionPerformed

    private void mina58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina58ActionPerformed
            mina58.setText(mina58());
    }//GEN-LAST:event_mina58ActionPerformed

    private void mina59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina59ActionPerformed
            mina59.setText(mina59());
    }//GEN-LAST:event_mina59ActionPerformed

    private void mina60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina60ActionPerformed
            mina60.setText(mina60());
    }//GEN-LAST:event_mina60ActionPerformed

    private void mina61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina61ActionPerformed
            mina61.setText(mina61());
    }//GEN-LAST:event_mina61ActionPerformed

    private void mina62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina62ActionPerformed
            mina62.setText(mina62());
    }//GEN-LAST:event_mina62ActionPerformed

    private void mina63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina63ActionPerformed
            mina63.setText(mina63());
    }//GEN-LAST:event_mina63ActionPerformed

    private void mina64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina64ActionPerformed
            mina64.setText(mina64());
    }//GEN-LAST:event_mina64ActionPerformed

    private void mina65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina65ActionPerformed
            mina65.setText(mina65());
    }//GEN-LAST:event_mina65ActionPerformed

    private void mina66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina66ActionPerformed
            mina66.setText(mina66());
    }//GEN-LAST:event_mina66ActionPerformed

    private void mina67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina67ActionPerformed
            mina67.setText(mina67());
    }//GEN-LAST:event_mina67ActionPerformed

    private void mina68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina68ActionPerformed
            mina68.setText(mina68());
    }//GEN-LAST:event_mina68ActionPerformed

    private void mina69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina69ActionPerformed
            mina69.setText(mina69());
    }//GEN-LAST:event_mina69ActionPerformed

    private void mina70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina70ActionPerformed
            mina70.setText(mina70());
    }//GEN-LAST:event_mina70ActionPerformed

    private void mina71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina71ActionPerformed
            mina71.setText(mina71());
    }//GEN-LAST:event_mina71ActionPerformed

    private void mina72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina72ActionPerformed
            mina72.setText(mina72());
    }//GEN-LAST:event_mina72ActionPerformed

    private void mina73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina73ActionPerformed
            mina73.setText(mina73());
    }//GEN-LAST:event_mina73ActionPerformed

    private void mina74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina74ActionPerformed
            mina74.setText(mina74());
    }//GEN-LAST:event_mina74ActionPerformed

    private void mina75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina75ActionPerformed
             mina75.setText(mina75());
    }//GEN-LAST:event_mina75ActionPerformed

    private void mina76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina76ActionPerformed
            mina76.setText(mina76());
    }//GEN-LAST:event_mina76ActionPerformed

    private void mina77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina77ActionPerformed
            mina77.setText(mina77());
    }//GEN-LAST:event_mina77ActionPerformed

    private void mina78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina78ActionPerformed
            mina78.setText(mina78());
    }//GEN-LAST:event_mina78ActionPerformed

    private void mina79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina79ActionPerformed
            mina79.setText(mina79());
    }//GEN-LAST:event_mina79ActionPerformed

    private void mina80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina80ActionPerformed
            mina80.setText(mina80());
    }//GEN-LAST:event_mina80ActionPerformed

    private void mina81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina81ActionPerformed
            mina81.setText(mina81());

    }//GEN-LAST:event_mina81ActionPerformed

    private void mina82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina82ActionPerformed
            mina82.setText(mina82());
    }//GEN-LAST:event_mina82ActionPerformed

    private void mina83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina83ActionPerformed
            mina83.setText(mina83());
    }//GEN-LAST:event_mina83ActionPerformed

    private void mina84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina84ActionPerformed
            mina84.setText(mina84());
    }//GEN-LAST:event_mina84ActionPerformed

    private void mina85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina85ActionPerformed
            mina85.setText(mina85());
    }//GEN-LAST:event_mina85ActionPerformed

    private void mina86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina86ActionPerformed
            mina86.setText(mina86());
    }//GEN-LAST:event_mina86ActionPerformed

    private void mina87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina87ActionPerformed
            mina87.setText(mina87());
    }//GEN-LAST:event_mina87ActionPerformed

    private void mina88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina88ActionPerformed
            mina88.setText(mina88());
    }//GEN-LAST:event_mina88ActionPerformed

    private void mina89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina89ActionPerformed
            mina89.setText(mina89());        
    }//GEN-LAST:event_mina89ActionPerformed

    private void mina90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina90ActionPerformed
            mina90.setText(mina90());

    }//GEN-LAST:event_mina90ActionPerformed

    private void mina91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina91ActionPerformed
            mina91.setText(mina91());
    }//GEN-LAST:event_mina91ActionPerformed

    private void mina92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina92ActionPerformed
            mina92.setText(mina92());
    }//GEN-LAST:event_mina92ActionPerformed

    private void mina93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina93ActionPerformed
            mina93.setText(mina93());
    }//GEN-LAST:event_mina93ActionPerformed

    private void mina94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina94ActionPerformed
            mina94.setText(mina94());
    }//GEN-LAST:event_mina94ActionPerformed

    private void mina95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina95ActionPerformed
            mina95.setText(mina95());
    }//GEN-LAST:event_mina95ActionPerformed

    private void mina96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina96ActionPerformed
            mina96.setText(mina96());
    }//GEN-LAST:event_mina96ActionPerformed

    private void mina97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina97ActionPerformed
            mina97.setText(mina97());
    }//GEN-LAST:event_mina97ActionPerformed

    private void mina98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mina98ActionPerformed
            mina98.setText(mina98());
    }//GEN-LAST:event_mina98ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level1().setVisible(true);
            }
        });
    }
    private HighScore pt = new HighScore();
    private  Level2 Nivel2 = new Level2();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mina0;
    private javax.swing.JButton mina1;
    private javax.swing.JButton mina10;
    private javax.swing.JButton mina11;
    private javax.swing.JButton mina12;
    private javax.swing.JButton mina13;
    private javax.swing.JButton mina14;
    private javax.swing.JButton mina15;
    private javax.swing.JButton mina16;
    private javax.swing.JButton mina17;
    private javax.swing.JButton mina18;
    private javax.swing.JButton mina19;
    private javax.swing.JButton mina2;
    private javax.swing.JButton mina20;
    private javax.swing.JButton mina21;
    private javax.swing.JButton mina22;
    private javax.swing.JButton mina23;
    private javax.swing.JButton mina24;
    private javax.swing.JButton mina25;
    private javax.swing.JButton mina26;
    private javax.swing.JButton mina27;
    private javax.swing.JButton mina28;
    private javax.swing.JButton mina29;
    private javax.swing.JButton mina3;
    private javax.swing.JButton mina30;
    private javax.swing.JButton mina31;
    private javax.swing.JButton mina32;
    private javax.swing.JButton mina33;
    private javax.swing.JButton mina34;
    private javax.swing.JButton mina35;
    private javax.swing.JButton mina36;
    private javax.swing.JButton mina37;
    private javax.swing.JButton mina38;
    private javax.swing.JButton mina39;
    private javax.swing.JButton mina4;
    private javax.swing.JButton mina40;
    private javax.swing.JButton mina41;
    private javax.swing.JButton mina42;
    private javax.swing.JButton mina43;
    private javax.swing.JButton mina44;
    private javax.swing.JButton mina45;
    private javax.swing.JButton mina46;
    private javax.swing.JButton mina47;
    private javax.swing.JButton mina48;
    private javax.swing.JButton mina49;
    private javax.swing.JButton mina5;
    private javax.swing.JButton mina50;
    private javax.swing.JButton mina51;
    private javax.swing.JButton mina52;
    private javax.swing.JButton mina53;
    private javax.swing.JButton mina54;
    private javax.swing.JButton mina55;
    private javax.swing.JButton mina56;
    private javax.swing.JButton mina57;
    private javax.swing.JButton mina58;
    private javax.swing.JButton mina59;
    private javax.swing.JButton mina6;
    private javax.swing.JButton mina60;
    private javax.swing.JButton mina61;
    private javax.swing.JButton mina62;
    private javax.swing.JButton mina63;
    private javax.swing.JButton mina64;
    private javax.swing.JButton mina65;
    private javax.swing.JButton mina66;
    private javax.swing.JButton mina67;
    private javax.swing.JButton mina68;
    private javax.swing.JButton mina69;
    private javax.swing.JButton mina7;
    private javax.swing.JButton mina70;
    private javax.swing.JButton mina71;
    private javax.swing.JButton mina72;
    private javax.swing.JButton mina73;
    private javax.swing.JButton mina74;
    private javax.swing.JButton mina75;
    private javax.swing.JButton mina76;
    private javax.swing.JButton mina77;
    private javax.swing.JButton mina78;
    private javax.swing.JButton mina79;
    private javax.swing.JButton mina8;
    private javax.swing.JButton mina80;
    private javax.swing.JButton mina81;
    private javax.swing.JButton mina82;
    private javax.swing.JButton mina83;
    private javax.swing.JButton mina84;
    private javax.swing.JButton mina85;
    private javax.swing.JButton mina86;
    private javax.swing.JButton mina87;
    private javax.swing.JButton mina88;
    private javax.swing.JButton mina89;
    private javax.swing.JButton mina9;
    private javax.swing.JButton mina90;
    private javax.swing.JButton mina91;
    private javax.swing.JButton mina92;
    private javax.swing.JButton mina93;
    private javax.swing.JButton mina94;
    private javax.swing.JButton mina95;
    private javax.swing.JButton mina96;
    private javax.swing.JButton mina97;
    private javax.swing.JButton mina98;
    // End of variables declaration//GEN-END:variables
}
