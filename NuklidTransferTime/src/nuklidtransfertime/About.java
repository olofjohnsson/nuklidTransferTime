/*
Handle version information
*/
package nuklidtransfertime;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * About dialog of the Anagram Game application.
 */
public class About extends JDialog {
    public String version = "v2.0";
    /** Creates new form About */
    public About(JFrame parent) {
        super(parent,true);
        initComponents();
        pack();
        Rectangle parentBounds = parent.getBounds();
        Dimension size = getSize();
        // Center in the parent
        int x = Math.max(0, parentBounds.x + (parentBounds.width - size.width) / 2);
        int y = Math.max(0, parentBounds.y + (parentBounds.height - size.height) / 2);
        setLocation(new Point(x, y));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {                          
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        copyrightTextArea = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About NuklidTransferTime");
        mainPanel.setLayout(new java.awt.GridBagLayout());

        mainPanel.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(11, 11, 12, 12)));
        copyrightTextArea.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        copyrightTextArea.setColumns(25);
        copyrightTextArea.setEditable(false);
        copyrightTextArea.setLineWrap(true);
        copyrightTextArea.setRows(8);
        copyrightTextArea.setText("Nuklid transfer time (2017)\n"+version+" \n\nDeveloper\nOlof Johnsson\nolof.johnsson@vgregion.se");
        copyrightTextArea.setWrapStyleWord(true);
        copyrightTextArea.setBorder(null);
        copyrightTextArea.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 0, 24, 0);
        mainPanel.add(copyrightTextArea, gridBagConstraints);

        closeButton.setMnemonic('C');
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        mainPanel.add(closeButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

    }                        

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        setVisible(false);
        dispose();
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea copyrightTextArea;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration                   

}
