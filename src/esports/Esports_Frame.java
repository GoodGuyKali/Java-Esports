/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esports;

import java.util.*;


/**
 *
 * @author L37TURNER
 */
enum game_type{
    Overwatch,
    CSGO,
    COD,
    Valorant,
    Apex,
    NotSet
}
class Events_test{
    game_type GameType;
    int event_num;
    int event_points;
    int event_score;
    int event_posistion;
    public Events_test(game_type typr){
        GameType = typr;
    }
    public void CalculateScore(){
        //need to figure out the scoreing multiplier
        switch(GameType){
            case Overwatch:
                break;
            case CSGO:
                break;
            case COD:
                break;
            case Valorant:
                break;
            case Apex:
                break;
            
                
        }
    }
}
class TeamArray_test{
    int index = 0;
    int scoreboard_pos = 0;
    Events_test event_class[] = new Events_test[6];
    String teamname;
    boolean is_guest = false;
    
    public TeamArray_test(int indx,int size){
        index = indx;
        teamname = ("Team "+(indx+1));
        for (int i =0;i < size; i++){
            event_class[i]= new Events_test(game_type.NotSet);
        }
    }
    public TeamArray_test(String name,boolean isguest){
       teamname = name;
       is_guest= isguest;
       
    }
    

}


public class Esports_Frame extends javax.swing.JFrame {
   // TeamArray_test object_test[] = new TeamArray_test[6];
    ArrayList<TeamArray_test> TeamArray = new ArrayList<TeamArray_test>();
    /**
     * Creates new form ESports_Frame
     */
    public Esports_Frame() {
        initComponents();

       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        ScoreboardPane = new javax.swing.JTabbedPane();
        ScorePanel = new javax.swing.JPanel();
        ScoreScrollPane = new javax.swing.JScrollPane();
        Scoretable = new javax.swing.JTable();
        TeamPanel = new javax.swing.JPanel();
        IsGuest_checkbox = new javax.swing.JCheckBox();
        AddTeam_Button = new javax.swing.JButton();
        RemoveTeam_Button = new javax.swing.JButton();
        TeamComboBox = new javax.swing.JComboBox<>();
        EventsPanel = new javax.swing.JPanel();
        SelectedEventCombo = new javax.swing.JComboBox<>();
        SelectedGameCombo = new javax.swing.JComboBox<>();
        Event_Label = new javax.swing.JLabel();
        EventsScrollPane = new javax.swing.JScrollPane();
        EventTable = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ScoreboardPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ScoreboardPaneStateChanged(evt);
            }
        });
        ScoreboardPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScoreboardPaneMouseClicked(evt);
            }
        });

        Scoretable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Team Name", "Event 1", "Event 2", "Event 3", "Event 4", "Event 5", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScoreScrollPane.setViewportView(Scoretable);

        javax.swing.GroupLayout ScorePanelLayout = new javax.swing.GroupLayout(ScorePanel);
        ScorePanel.setLayout(ScorePanelLayout);
        ScorePanelLayout.setHorizontalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScoreScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );
        ScorePanelLayout.setVerticalGroup(
            ScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ScorePanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(ScoreScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        ScoreboardPane.addTab("Scoreboard", ScorePanel);

        IsGuest_checkbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IsGuest_checkbox.setText("Is Guest Team?");
        IsGuest_checkbox.setMaximumSize(new java.awt.Dimension(69, 20));
        IsGuest_checkbox.setMinimumSize(new java.awt.Dimension(69, 20));
        IsGuest_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsGuest_checkboxActionPerformed(evt);
            }
        });

        AddTeam_Button.setText("Add Team");
        AddTeam_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeam_ButtonActionPerformed(evt);
            }
        });

        RemoveTeam_Button.setText("Remove Selected Team");
        RemoveTeam_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTeam_ButtonActionPerformed(evt);
            }
        });

        TeamComboBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        TeamComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeamComboBoxMouseClicked(evt);
            }
        });
        TeamComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TeamPanelLayout = new javax.swing.GroupLayout(TeamPanel);
        TeamPanel.setLayout(TeamPanelLayout);
        TeamPanelLayout.setHorizontalGroup(
            TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddTeam_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RemoveTeam_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IsGuest_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        TeamPanelLayout.setVerticalGroup(
            TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeamPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IsGuest_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTeam_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveTeam_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        ScoreboardPane.addTab("Teams", TeamPanel);

        EventsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventsPanelMouseClicked(evt);
            }
        });

        SelectedEventCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Event 1", "Event 2", "Event 3", "Event 4", "Event 5" }));
        SelectedEventCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedEventComboActionPerformed(evt);
            }
        });

        ArrayList<String> events = new ArrayList<String>();
        for (game_type type : game_type.values()){
            events.add(type.toString());

        }
        SelectedGameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<String>(events)));
        SelectedGameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedGameComboActionPerformed(evt);
            }
        });

        Event_Label.setText("Event");

        EventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team", "Points", "Score", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EventsScrollPane.setViewportView(EventTable);

        javax.swing.GroupLayout EventsPanelLayout = new javax.swing.GroupLayout(EventsPanel);
        EventsPanel.setLayout(EventsPanelLayout);
        EventsPanelLayout.setHorizontalGroup(
            EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(EventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Event_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EventsPanelLayout.createSequentialGroup()
                        .addComponent(SelectedEventCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(SelectedGameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        EventsPanelLayout.setVerticalGroup(
            EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectedEventCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectedGameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Event_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        ScoreboardPane.addTab("Events", EventsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScoreboardPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScoreboardPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ScoreboardPane.getAccessibleContext().setAccessibleName("ScoreboardPane");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void SelectedEventComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedEventComboActionPerformed

        String Selected_event = (String)SelectedEventCombo.getSelectedItem();
        Event_Label.setText(Selected_event);
        SelectedGameCombo.setSelectedIndex(TeamArray.get(1).event_class[SelectedEventCombo.getSelectedIndex()].GameType.ordinal());

        System.out.println(TeamArray.get(1).event_class[SelectedEventCombo.getSelectedIndex()].GameType);

              
    }//GEN-LAST:event_SelectedEventComboActionPerformed

    private void RemoveTeam_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTeam_ButtonActionPerformed

        int selected = TeamComboBox.getSelectedIndex();
        
        if(selected >= 0){
            TeamComboBox.removeItemAt(selected);
            TeamArray.remove(selected);
            javax.swing.table.DefaultTableModel test = (javax.swing.table.DefaultTableModel)EventTable.getModel();
            test.removeRow(selected);
         }
        
    }//GEN-LAST:event_RemoveTeam_ButtonActionPerformed

    private void IsGuest_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsGuest_checkboxActionPerformed

    }//GEN-LAST:event_IsGuest_checkboxActionPerformed

    private void TeamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamComboBoxActionPerformed

        int selected = TeamComboBox.getSelectedIndex();
        
        if(selected >= 0)
            IsGuest_checkbox.setSelected( TeamArray.get(selected).is_guest);
        
        else{}
    }//GEN-LAST:event_TeamComboBoxActionPerformed

    private void AddTeam_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeam_ButtonActionPerformed
       int amount = TeamComboBox.getItemCount();
       int testbonk = 1;

       if(amount !=6){
           TeamArray.add(amount, new TeamArray_test(amount,SelectedEventCombo.getItemCount()));
           TeamComboBox.addItem(TeamArray.get(amount).teamname);
           TeamArray.get(amount).is_guest = IsGuest_checkbox.isSelected();
           System.out.println(TeamArray.get(amount).is_guest);
           TeamComboBox.setSelectedIndex(amount);
          javax.swing.table.DefaultTableModel test = (javax.swing.table.DefaultTableModel)EventTable.getModel();
          test.addRow(new Object[]{TeamArray.get(amount).teamname});

       }
       else
           System.out.println("too many teams!");
       
    
        
    }//GEN-LAST:event_AddTeam_ButtonActionPerformed

    private void TeamComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeamComboBoxMouseClicked
      

    }//GEN-LAST:event_TeamComboBoxMouseClicked

    private void SelectedGameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedGameComboActionPerformed
        int Selected_Game = SelectedGameCombo.getSelectedIndex();
        
        for (game_type type : game_type.values())
            if(type.ordinal() == Selected_Game)
                 for(int i = 0;i < TeamArray.size();i++) 
                    TeamArray.get(i).event_class[SelectedEventCombo.getSelectedIndex()].GameType = type;
            
        
       
    }//GEN-LAST:event_SelectedGameComboActionPerformed

    
    
    private void ScoreboardPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScoreboardPaneMouseClicked

    }//GEN-LAST:event_ScoreboardPaneMouseClicked
//will be used but not just yet
    private void EventsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsPanelMouseClicked
    }//GEN-LAST:event_EventsPanelMouseClicked
    private void ScoreboardPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ScoreboardPaneStateChanged

        if(ScoreboardPane.getSelectedIndex() == 2){
            String Selected_event = (String)SelectedEventCombo.getSelectedItem();
            Event_Label.setText(Selected_event);
          //EventTable.setValueAt(object_test.get(i).teamname, object_test.get(i).index, NORMAL);
            
            
        }
        
    }//GEN-LAST:event_ScoreboardPaneStateChanged

    private void debug(){
        for(int i = 0;i<= TeamArray.size();i++){
            System.out.printf("object data :" );
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
                System.out.println(info.getName());
               
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Esports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Esports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Esports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Esports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Esports_Frame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTeam_Button;
    private javax.swing.JTable EventTable;
    private javax.swing.JLabel Event_Label;
    private javax.swing.JPanel EventsPanel;
    private javax.swing.JScrollPane EventsScrollPane;
    private javax.swing.JCheckBox IsGuest_checkbox;
    private javax.swing.JButton RemoveTeam_Button;
    private javax.swing.JPanel ScorePanel;
    private javax.swing.JScrollPane ScoreScrollPane;
    private javax.swing.JTabbedPane ScoreboardPane;
    private javax.swing.JTable Scoretable;
    private javax.swing.JComboBox<String> SelectedEventCombo;
    private javax.swing.JComboBox<String> SelectedGameCombo;
    private javax.swing.JComboBox<String> TeamComboBox;
    private javax.swing.JPanel TeamPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
