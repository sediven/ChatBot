
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ja
 */
public class JFrameGUI extends javax.swing.JFrame {
    
    private Bledy blad;
    private TxtGenerator generator = new TxtGenerator(2);
    private String wiadomosc="Witaj! Wybierz swój nick :)",bufor="";
    private Integer ileLinii=0;
    private Statystyka stat=new Statystyka(generator.czytaj.listaNgram, generator.czytaj.jednostkowe);

    /**
     * Creates new form JFrameGUI
     */
    public JFrameGUI() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserBaza = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        slTxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ngTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        nickLbl = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        bledyLbl = new javax.swing.JLabel();
        wiadomoscLbl = new javax.swing.JLabel();
        wiadomoscTxt = new javax.swing.JTextField();
        wyslijBtn = new javax.swing.JButton();
        errorsTxt = new javax.swing.JTextField();
        bazaBtn = new javax.swing.JButton();
        statyBtn = new javax.swing.JButton();

        jFrame1.setTitle("Statystyka");
        jFrame1.setResizable(false);

        jLabel2.setText("10 Najpopularniejszych Słów:");

        jLabel3.setText("10 Najpopularniejszych Ngramów:");

        slTxt.setColumns(20);
        slTxt.setRows(5);
        jScrollPane2.setViewportView(slTxt);

        ngTxt.setColumns(20);
        ngTxt.setRows(5);
        jScrollPane3.setViewportView(ngTxt);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 42, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(32, 32, 32))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat z botem");

        jLabel1.setText("Chat");

        messageTextArea.setEditable(false);
        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        nickLbl.setText("Nick: ");

        userNameTxt.setText("user");
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        bledyLbl.setText("Bledy:");

        wiadomoscLbl.setText("Wiadomość:");

        wiadomoscTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiadomoscTxtActionPerformed(evt);
            }
        });

        wyslijBtn.setText("Wyslij");
        wyslijBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyslijBtnActionPerformed(evt);
            }
        });

        errorsTxt.setEditable(false);
        errorsTxt.setText("Nie znaleziono");

        bazaBtn.setText("Wybierz plik z bazą");
        bazaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bazaBtnActionPerformed(evt);
            }
        });

        statyBtn.setText("Statystyka");
        statyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(wiadomoscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wyslijBtn))
                                    .addComponent(wiadomoscLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nickLbl)
                                .addGap(18, 18, 18)
                                .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorsTxt)
                            .addComponent(bazaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(statyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bledyLbl)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nickLbl)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wiadomoscLbl)
                            .addComponent(bledyLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bazaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statyBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorsTxt)
                    .addComponent(wyslijBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(wiadomoscTxt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void wiadomoscTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiadomoscTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wiadomoscTxtActionPerformed

    private void wyslijBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyslijBtnActionPerformed
     // TODO add your handling code here:

    String temp = wiadomoscTxt.getText();
			wiadomoscTxt.setText("");

			//usuwam poczatkowe spacje
			if((!temp.isEmpty()))
				while(((int)temp.charAt(0))==32)
					if(temp.length()>1)
						temp=temp.substring(1);
					else {temp="";break;}


			if((!temp.isEmpty()))
			{
				blad = new Bledy(generator.czytaj,temp);
				errorsTxt.setText(blad.Bledne);
				ileLinii++;
				wiadomosc+= '\n'+userNameTxt.getText()+ " > "+ temp;
				bufor+= temp+" ";
				String answer=generator.generuj(temp.length()/4+1, temp);
				wiadomosc+= '\n'+"bot"+ " > "+Character.toUpperCase(answer.charAt(0)) + answer.substring(1)+".";
                                 if(ileLinii==3)
				{
					Update(bufor);
					String help[]=bufor.split(" ");
					bufor="";
					for(int i = help.length -generator.ngramLvl;i<help.length;i++)
					bufor+=help[i];
					ileLinii=0;
				}
                                 
				if(!"".equals(blad.Bledne))
					Update(bufor);

				messageTextArea.setText(wiadomosc);
			}// TODO add your handling code here:
    }//GEN-LAST:event_wyslijBtnActionPerformed

    private void bazaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bazaBtnActionPerformed
        int odp = jFileChooserBaza.showOpenDialog(this);
            if(odp == jFileChooserBaza.APPROVE_OPTION)
            {
             File file = jFileChooserBaza.getSelectedFile();
             generator=new TxtGenerator(2,file.getAbsolutePath()) ;
             Update(" ");
            }
    }//GEN-LAST:event_bazaBtnActionPerformed

    private void statyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statyBtnActionPerformed
        jFrame1.setVisible(true);
        jFrame1.setSize(400, 325);
        jFrame1.setLocation(475, 0);
        ngTxt.setText(stat.najNgramy());
        slTxt.setText(stat.najSlowa());

// TODO add your handling code here:
    }//GEN-LAST:event_statyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bazaBtn;
    private javax.swing.JLabel bledyLbl;
    private javax.swing.JTextField errorsTxt;
    private javax.swing.JFileChooser jFileChooserBaza;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JTextArea ngTxt;
    private javax.swing.JLabel nickLbl;
    private javax.swing.JTextArea slTxt;
    private javax.swing.JButton statyBtn;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel wiadomoscLbl;
    private javax.swing.JTextField wiadomoscTxt;
    private javax.swing.JButton wyslijBtn;
    // End of variables declaration//GEN-END:variables
       public void Update(String s)
	{


		generator.czytaj.Update(s);
		stat = new Statystyka(generator.czytaj.listaNgram, generator.czytaj.jednostkowe);
                ngTxt.setText(stat.najNgramy());
                slTxt.setText(stat.najSlowa());



	}

    }

