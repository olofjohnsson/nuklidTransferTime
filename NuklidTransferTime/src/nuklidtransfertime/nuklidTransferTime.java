/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuklidtransfertime;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.JobAttributes;
import static java.awt.JobAttributes.DestinationType.FILE;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_F1;
import static java.awt.event.KeyEvent.VK_F2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.apache.poi.EncryptedDocumentException;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Acer
 */
public class nuklidTransferTime extends javax.swing.JFrame {

    //writeToFileThread writetofile;
    stopWatch stopwatch = new stopWatch();
    private double elapsedTime;
    private Object textarea;
    public File file;
    public String target = "N/A";
    public String destination = "N/A";
    public String row;
    public String formattedTime;
    public String path = "G:\\\\SU.Omr4.MFT.Radiofarmakacentralen\\\\Utrustning\\\\PETtrace 880\\\\Ledningar\\\\Transfertid\\\\transferTime.xlsx";//default path for file if no other is chosen
    public String pathBackup = "C:\\temp\\backup.xlsx";//default path for backup logging
    //String path = "C:\\temp\\output.xlsx";

    /**
     * Creates new form nuklidTransferTime
     */
    public nuklidTransferTime() {
        initComponents();
        //writetofile = new writeToFileThread(elapsedTime, formattedTime, labelInfo2, textPaneElapsedTime);
        //new Thread(writetofile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStartStop = new javax.swing.ButtonGroup();
        fileBrowser = new javax.swing.JFileChooser();
        buttonGroupCheckBox = new javax.swing.ButtonGroup();
        buttonGroupDestination = new javax.swing.ButtonGroup();
        labelInfo = new javax.swing.JLabel();
        startButton = new javax.swing.JToggleButton();
        stopButton = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPaneElapsedTime = new javax.swing.JTextPane();
        jCheckBoxT1 = new javax.swing.JCheckBox();
        jCheckBoxT2 = new javax.swing.JCheckBox();
        jCheckBoxT4 = new javax.swing.JCheckBox();
        jCheckBoxTargetNa = new javax.swing.JCheckBox();
        targetLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        jCheckBoxMIP1 = new javax.swing.JCheckBox();
        jCheckBoxMIP2 = new javax.swing.JCheckBox();
        jCheckBoxMIP3 = new javax.swing.JCheckBox();
        jCheckBoxTalia = new javax.swing.JCheckBox();
        jCheckBoxBBS1 = new javax.swing.JCheckBox();
        jCheckBoxBBS2 = new javax.swing.JCheckBox();
        jCheckBoxManuela = new javax.swing.JCheckBox();
        jCheckBoxDestNa = new javax.swing.JCheckBox();
        jCheckBoxWaste = new javax.swing.JCheckBox();
        labelInfo2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuBarFile = new javax.swing.JMenu();
        menuBarFileItemBrowsefile = new javax.swing.JMenuItem();
        menuBarFileOpenLogfile = new javax.swing.JMenuItem();
        menuBarFileAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mätning av framledningstid");
        setBackground(new java.awt.Color(51, 255, 51));
        setResizable(false);

        buttonGroupStartStop.add(startButton);
        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startButtonMousePressed(evt);
            }
        });
        startButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startButtonKeyPressed(evt);
            }
        });

        buttonGroupStartStop.add(stopButton);
        stopButton.setText("Stop");
        stopButton.setMaximumSize(new java.awt.Dimension(57, 23));
        stopButton.setMinimumSize(new java.awt.Dimension(57, 23));
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stopButtonMousePressed(evt);
            }
        });
        stopButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stopButtonKeyPressed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textPaneElapsedTime.setEditable(false);
        textPaneElapsedTime.setBackground(new java.awt.Color(240, 240, 240));
        textPaneElapsedTime.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textPaneElapsedTime.setToolTipText("");
        textPaneElapsedTime.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        textPaneElapsedTime.setFocusable(false);
        jScrollPane2.setViewportView(textPaneElapsedTime);

        buttonGroupCheckBox.add(jCheckBoxT1);
        jCheckBoxT1.setText("T1 F18");
        jCheckBoxT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxT1ActionPerformed(evt);
            }
        });

        buttonGroupCheckBox.add(jCheckBoxT2);
        jCheckBoxT2.setText("T2 N13");
        jCheckBoxT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxT2ActionPerformed(evt);
            }
        });

        buttonGroupCheckBox.add(jCheckBoxT4);
        jCheckBoxT4.setText("T4 F18");
        jCheckBoxT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxT4ActionPerformed(evt);
            }
        });

        buttonGroupCheckBox.add(jCheckBoxTargetNa);
        jCheckBoxTargetNa.setText("N/A");
        jCheckBoxTargetNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTargetNaActionPerformed(evt);
            }
        });

        targetLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        targetLabel.setText("Nuklid target:");

        destinationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        destinationLabel.setText("Destination:");
        destinationLabel.setToolTipText("");

        buttonGroupDestination.add(jCheckBoxMIP1);
        jCheckBoxMIP1.setText("MIP 1");
        jCheckBoxMIP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMIP1ActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxMIP2);
        jCheckBoxMIP2.setText("MIP 2");
        jCheckBoxMIP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMIP2ActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxMIP3);
        jCheckBoxMIP3.setText("MIP 3");
        jCheckBoxMIP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMIP3ActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxTalia);
        jCheckBoxTalia.setText("TALIA");
        jCheckBoxTalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTaliaActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxBBS1);
        jCheckBoxBBS1.setText("BBS 1");
        jCheckBoxBBS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBBS1ActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxBBS2);
        jCheckBoxBBS2.setText("BBS 2");
        jCheckBoxBBS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBBS2ActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxManuela);
        jCheckBoxManuela.setText("MANUELA");
        jCheckBoxManuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxManuelaActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxDestNa);
        jCheckBoxDestNa.setText("N/A");
        jCheckBoxDestNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDestNaActionPerformed(evt);
            }
        });

        buttonGroupDestination.add(jCheckBoxWaste);
        jCheckBoxWaste.setText("Waste");
        jCheckBoxWaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWasteActionPerformed(evt);
            }
        });

        labelInfo2.setToolTipText("");

        menuBarFile.setText("File");

        menuBarFileItemBrowsefile.setText("Select log file");
        menuBarFileItemBrowsefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarFileItemBrowsefileActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarFileItemBrowsefile);

        menuBarFileOpenLogfile.setText("Open log file");
        menuBarFileOpenLogfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarFileOpenLogfileActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarFileOpenLogfile);

        menuBarFileAbout.setText("About");
        menuBarFileAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarFileAboutActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarFileAbout);

        menuBar.add(menuBarFile);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxTargetNa)
                            .addComponent(jCheckBoxT2)
                            .addComponent(jCheckBoxT4)
                            .addComponent(jCheckBoxT1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(targetLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxMIP1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxTalia))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxMIP3)
                                    .addComponent(jCheckBoxMIP2)
                                    .addComponent(jCheckBoxDestNa))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxManuela)
                                    .addComponent(jCheckBoxWaste)
                                    .addComponent(jCheckBoxBBS1)
                                    .addComponent(jCheckBoxBBS2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(destinationLabel)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(targetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxT2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxT4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTargetNa))
                    .addComponent(destinationLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxTalia)
                            .addComponent(jCheckBoxMIP1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxMIP2)
                            .addComponent(jCheckBoxBBS1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxMIP3)
                            .addComponent(jCheckBoxBBS2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxManuela)
                            .addComponent(jCheckBoxDestNa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxWaste)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(labelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMousePressed
        labelInfo2.setText("");
        stopButton.requestFocus();
        startMeasurement();
    }//GEN-LAST:event_startButtonMousePressed

    private void stopButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMousePressed
        Thread.currentThread().interrupt();
        startButton.requestFocus();
        setElapsedTime();
        updateTextPaneElapsedTime();
        writeToFile w = null;
        try {
            w = new writeToFile(path, elapsedTime, formattedTime, labelInfo2, textPaneElapsedTime, target, destination);
        } catch (IOException ex) {
            Logger.getLogger(nuklidTransferTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread(w).start();
    }//GEN-LAST:event_stopButtonMousePressed

    private void menuBarFileItemBrowsefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarFileItemBrowsefileActionPerformed
        int returnVal = fileBrowser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fileLocal = fileBrowser.getSelectedFile();
            file = fileLocal;
            path = file.toString();
        } else {
            System.out.println("File access cancelled by user.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarFileItemBrowsefileActionPerformed

    private void menuBarFileAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarFileAboutActionPerformed
        new About(this).setVisible(true);
    }//GEN-LAST:event_menuBarFileAboutActionPerformed

    private void jCheckBoxT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxT1ActionPerformed
        target = "T1";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxT1ActionPerformed

    private void jCheckBoxT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxT2ActionPerformed
        target = "T2";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxT2ActionPerformed

    private void jCheckBoxT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxT4ActionPerformed
        target = "T4";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxT4ActionPerformed

    private void jCheckBoxTargetNaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTargetNaActionPerformed
        target = "N/A";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxTargetNaActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopButtonActionPerformed

    private void jCheckBoxMIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMIP1ActionPerformed
        destination = "MIP 1";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxMIP1ActionPerformed

    private void jCheckBoxMIP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMIP2ActionPerformed
        destination = "MIP 2";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxMIP2ActionPerformed

    private void jCheckBoxMIP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMIP3ActionPerformed
        destination = "MIP 3";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxMIP3ActionPerformed

    private void jCheckBoxTaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTaliaActionPerformed
        destination = "TALIA";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxTaliaActionPerformed

    private void jCheckBoxBBS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBBS1ActionPerformed
        destination = "BBS 1";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxBBS1ActionPerformed

    private void jCheckBoxBBS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBBS2ActionPerformed
        destination = "BBS 2";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxBBS2ActionPerformed

    private void jCheckBoxManuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxManuelaActionPerformed
        destination = "MANUELA";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxManuelaActionPerformed

    private void jCheckBoxWasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWasteActionPerformed
        destination = "Waste";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxWasteActionPerformed

    private void menuBarFileOpenLogfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarFileOpenLogfileActionPerformed
        try {
            Desktop.getDesktop().open(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(nuklidTransferTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuBarFileOpenLogfileActionPerformed

    private void startButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startButtonKeyPressed
        labelInfo2.setText("");
        stopButton.requestFocus();
        startMeasurement();
    }//GEN-LAST:event_startButtonKeyPressed
    private void stopButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stopButtonKeyPressed
        Thread.currentThread().interrupt();
        startButton.requestFocus();
        setElapsedTime();
        updateTextPaneElapsedTime();
        writeToFile w = null;
        try {
            w = new writeToFile(path, elapsedTime, formattedTime, labelInfo2, textPaneElapsedTime, target, destination);
        } catch (IOException ex) {
            Logger.getLogger(nuklidTransferTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread(w).start();
    }//GEN-LAST:event_stopButtonKeyPressed

    private void jCheckBoxDestNaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDestNaActionPerformed
        destination = "N/A";
        startButton.requestFocus();
    }//GEN-LAST:event_jCheckBoxDestNaActionPerformed
    private void setElapsedTime() {
        elapsedTime = stopwatch.elapsedTime();
    }

    private void updateTextPaneElapsedTime() {
        formattedTime = String.format("%.1f", elapsedTime);
        textPaneElapsedTime.setText(formattedTime + "s");
        System.out.println("StopButtonHotkey is pressed...elapsed time is: " + formattedTime + "s");
    }

    private void startMeasurement() {
        StyledDocument doc = textPaneElapsedTime.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, true);
        textPaneElapsedTime.setText("Counting");
        stopwatch.start();
        labelInfo.setText("");
    }

    private void delaySecconds(int s) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(nuklidTransferTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(nuklidTransferTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuklidTransferTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuklidTransferTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuklidTransferTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuklidTransferTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCheckBox;
    private javax.swing.ButtonGroup buttonGroupDestination;
    private javax.swing.ButtonGroup buttonGroupStartStop;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JFileChooser fileBrowser;
    private javax.swing.JCheckBox jCheckBoxBBS1;
    private javax.swing.JCheckBox jCheckBoxBBS2;
    private javax.swing.JCheckBox jCheckBoxDestNa;
    private javax.swing.JCheckBox jCheckBoxMIP1;
    private javax.swing.JCheckBox jCheckBoxMIP2;
    private javax.swing.JCheckBox jCheckBoxMIP3;
    private javax.swing.JCheckBox jCheckBoxManuela;
    private javax.swing.JCheckBox jCheckBoxT1;
    private javax.swing.JCheckBox jCheckBoxT2;
    private javax.swing.JCheckBox jCheckBoxT4;
    private javax.swing.JCheckBox jCheckBoxTalia;
    private javax.swing.JCheckBox jCheckBoxTargetNa;
    private javax.swing.JCheckBox jCheckBoxWaste;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelInfo2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarFile;
    private javax.swing.JMenuItem menuBarFileAbout;
    private javax.swing.JMenuItem menuBarFileItemBrowsefile;
    private javax.swing.JMenuItem menuBarFileOpenLogfile;
    private javax.swing.JToggleButton startButton;
    private javax.swing.JToggleButton stopButton;
    private javax.swing.JLabel targetLabel;
    private javax.swing.JTextPane textPaneElapsedTime;
    // End of variables declaration//GEN-END:variables
    DecimalFormat numberFormat = new DecimalFormat("#.00");

}

class writeToFile implements Runnable {

    String formattedTime;
    double elapsedTime;
    JLabel labelInfo2 = new JLabel();
    JTextPane textPaneElapsedTime = new JTextPane();
    String row;
    public File file;
    String target = "N/A";
    String path;
    String destination = "N/A";
    String pathBackup = "C:\\Temp\\backup.xlsx";

    writeToFile(String path, double elapsedTime, String formattedText, JLabel labelInfo2, JTextPane textPaneElapsedTime, String target, String destination) throws IOException {
        this.path = path;
        this.elapsedTime = elapsedTime;
        this.formattedTime = formattedText;
        this.labelInfo2 = labelInfo2;
        this.textPaneElapsedTime = textPaneElapsedTime;
        this.target = target;
        this.destination = destination;
    }

    @Override
    public void run() {
        if (elapsedTime > 0) {
            System.out.println("Elapsed time is: " + formattedTime + "s");
            FileWriter fileWriter;
            writeData(path);
            //writeDataBackup();
        } else {
            textPaneElapsedTime.setText("");
        }
    }
    
    public void writeData(String path) {
        try {
            Date date = new Date();
            row = (target + ";" + date.toString() + ";" + formattedTime + "\n");
            FileInputStream inputStream = new FileInputStream(new File(path));
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Object[][] bookData = {
                {target, destination, date.toString(), formattedTime}
            };

            int rowCount = sheet.getLastRowNum();
            if (rowCount == 0) {
                Row row = sheet.createRow(0);
                org.apache.poi.ss.usermodel.Cell cell = row.createCell(0);
                cell = row.createCell(0);
                cell.setCellValue("Target");
                cell = row.createCell(1);
                cell.setCellValue("Destination");
                cell = row.createCell(2);
                cell.setCellValue("Date/Time");
                cell = row.createCell(3);
                cell.setCellValue("Transfer time (s)");
            }
            sheet.setColumnWidth(0, 2048);
            sheet.setColumnWidth(1, 3072);
            sheet.setColumnWidth(2, 7936);
            sheet.setColumnWidth(3, 4864);

            for (Object[] aBook : bookData) {
                //if(rowCount>0)
                ++rowCount;
                Row row = sheet.createRow(rowCount);

                int columnCount = 0;

                org.apache.poi.ss.usermodel.Cell cell = row.createCell(columnCount);
                //cell.setCellValue(rowCount);

                for (Object field : aBook) {
                    cell = row.createCell(columnCount);
                    ++columnCount;
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
            }
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException | EncryptedDocumentException
                | InvalidFormatException ex ) {
            ex.printStackTrace();
            writeDataBackup();
        }
        if (path == "") {
            labelInfo2.setText("<html>Please select a logfile<br>(If there is no excisting file create an empty *.xlxs file)</html>");
        } else {
            labelInfo2.setText("<html>Transfer time is successfully stored in selected file</html>");
        }

    }
    
        public void writeDataBackup() {
        try {
            Date date = new Date();
            row = (target + ";" + date.toString() + ";" + formattedTime + "\n");
            FileInputStream inputStream = new FileInputStream(new File(pathBackup));
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Object[][] bookData = {
                {target, destination, date.toString(), formattedTime}
            };

            int rowCount = sheet.getLastRowNum();
            if (rowCount == 0) {
                Row row = sheet.createRow(0);
                org.apache.poi.ss.usermodel.Cell cell = row.createCell(0);
                cell = row.createCell(0);
                cell.setCellValue("Target");
                cell = row.createCell(1);
                cell.setCellValue("Destination");
                cell = row.createCell(2);
                cell.setCellValue("Date/Time");
                cell = row.createCell(3);
                cell.setCellValue("Transfer time (s)");
            }
            sheet.setColumnWidth(0, 2048);
            sheet.setColumnWidth(1, 3072);
            sheet.setColumnWidth(2, 7936);
            sheet.setColumnWidth(3, 4864);

            for (Object[] aBook : bookData) {
                //if(rowCount>0)
                ++rowCount;
                Row row = sheet.createRow(rowCount);

                int columnCount = 0;

                org.apache.poi.ss.usermodel.Cell cell = row.createCell(columnCount);
                //cell.setCellValue(rowCount);

                for (Object field : aBook) {
                    cell = row.createCell(columnCount);
                    ++columnCount;
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
            }
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException | EncryptedDocumentException
                | InvalidFormatException ex) {
            ex.printStackTrace();;
        }
        if (path == "") {
            labelInfo2.setText("<html>Please select a logfile<br>(If there is no excisting file create an empty *.xlxs file)</html>");
        } else {
            labelInfo2.setText("<html>Transfer time is successfully stored in selected file</html>");
        }

    }
    
}
