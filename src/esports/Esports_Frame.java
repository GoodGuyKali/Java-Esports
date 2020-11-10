/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esports;

import java.util.*;
import javax.swing.DefaultRowSorter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;


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
class EventArray{
    game_type GameType;
    int eventNumber;
    int eventPoints;
    int eventScore;
    int eventPosistion;
    public EventArray(game_type typr){
        GameType = typr;
    }
    public void CalculateScore(javax.swing.JTable eventTable){
        //need to figure out the scoreing multiplier
        switch(GameType){
            case Overwatch:
                //this is all a test case, not a valid function!
                eventScore = eventPoints*10;
                eventTable.setValueAt(eventScore, eventTable.getSelectedRow(), 2);
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
class PlayerData{
    String PlayerName;
    public PlayerData(String name){
        PlayerName = name;
    }
}
class TeamArray{
    int scoreboard_pos = 0;
    EventArray eventArray[] = new EventArray[6];
    ArrayList<PlayerData> PlayersData = new ArrayList<PlayerData>();

    String teamname;
    boolean is_guest = false;
    
    public TeamArray(String Teamname,int size){
        teamname = Teamname;
        for (int i =0;i < size; i++){
            eventArray[i]= new EventArray(game_type.NotSet);
        }
        
    }
    

}


public class Esports_Frame extends javax.swing.JFrame {
   // TeamArray_test object_test[] = new TeamArray_test[6];
    ArrayList<TeamArray> myTeamArray = new ArrayList<TeamArray>();
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
        TeamNameField1 = new javax.swing.JTextField();
        PlayerNameTextField = new javax.swing.JTextField();
        AddTeamPlayerButton = new javax.swing.JButton();
        RemoveTeamPlayerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        SelectedTeamLabel = new javax.swing.JLabel();
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
        TeamComboBox.setToolTipText("bonk");
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

        TeamNameField1.setText("Team Name");
        TeamNameField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeamNameField1MouseClicked(evt);
            }
        });
        TeamNameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamNameField1ActionPerformed(evt);
            }
        });

        PlayerNameTextField.setText("Player Name");
        PlayerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerNameTextFieldActionPerformed(evt);
            }
        });

        AddTeamPlayerButton.setText("Add Player");
        AddTeamPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeamPlayerButtonActionPerformed(evt);
            }
        });

        RemoveTeamPlayerButton.setText("Remove Selected Player");
        RemoveTeamPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTeamPlayerButtonActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        SelectedTeamLabel.setText("Selected Team");

        javax.swing.GroupLayout TeamPanelLayout = new javax.swing.GroupLayout(TeamPanel);
        TeamPanel.setLayout(TeamPanelLayout);
        TeamPanelLayout.setHorizontalGroup(
            TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeamPanelLayout.createSequentialGroup()
                        .addComponent(SelectedTeamLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TeamPanelLayout.createSequentialGroup()
                        .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddTeamPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RemoveTeamPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(TeamPanelLayout.createSequentialGroup()
                        .addComponent(AddTeam_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RemoveTeam_Button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeamPanelLayout.createSequentialGroup()
                        .addComponent(TeamNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(IsGuest_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(TeamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        TeamPanelLayout.setVerticalGroup(
            TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeamPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IsGuest_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddTeam_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveTeam_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelectedTeamLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PlayerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTeamPlayerButton)
                    .addComponent(RemoveTeamPlayerButton))
                .addGap(16, 16, 16))
        );

        TeamComboBox.getAccessibleContext().setAccessibleDescription("");

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
        //5 is the iindex for NotSet
        //this shows the user that by defualt nothing is set so this is what i want for the time being until i start to clean up code
        SelectedGameCombo.setSelectedIndex(5);
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
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EventTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                EventTableInputMethodTextChanged(evt);
            }
        });
        EventTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                EventTablePropertyChange(evt);
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
        //this is because we only need to use one of the teams data since all of the teams game type gets set either way
        SelectedGameCombo.setSelectedIndex(myTeamArray.get(0).eventArray[SelectedEventCombo.getSelectedIndex()].GameType.ordinal());

        System.out.println(myTeamArray.get(0).eventArray[SelectedEventCombo.getSelectedIndex()].GameType);
        EventArray TestCase;
        for(int i = 0; i < myTeamArray.size();i++){
            TestCase = myTeamArray.get(i).eventArray[SelectedEventCombo.getSelectedIndex()];
            EventTable.setValueAt(TestCase.eventPoints, i, 1);        
            EventTable.setValueAt(TestCase.eventScore, i, 2);        
            EventTable.setValueAt(TestCase.eventPosistion, i, 3);        
        }
        
    }//GEN-LAST:event_SelectedEventComboActionPerformed

    private void RemoveTeam_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTeam_ButtonActionPerformed

        int selected = TeamComboBox.getSelectedIndex();
        
        if(selected >= 0){
            TeamComboBox.removeItemAt(selected);
            myTeamArray.remove(selected);
            javax.swing.table.DefaultTableModel test = (javax.swing.table.DefaultTableModel)EventTable.getModel();
            test.removeRow(selected);
         }
        
    }//GEN-LAST:event_RemoveTeam_ButtonActionPerformed

    private void IsGuest_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsGuest_checkboxActionPerformed

    }//GEN-LAST:event_IsGuest_checkboxActionPerformed

    private void TeamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamComboBoxActionPerformed

        int selected = TeamComboBox.getSelectedIndex();
        
        if(selected >= 0)
            IsGuest_checkbox.setSelected(myTeamArray.get(selected).is_guest);
        
    }//GEN-LAST:event_TeamComboBoxActionPerformed

    private void AddTeam_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeam_ButtonActionPerformed
       
        
        int amount = TeamComboBox.getItemCount();
        

           myTeamArray.add(amount, new TeamArray(TeamNameField1.getText(),SelectedEventCombo.getItemCount()));
           TeamComboBox.addItem(myTeamArray.get(amount).teamname);
           myTeamArray.get(amount).is_guest = IsGuest_checkbox.isSelected();
           System.out.println(myTeamArray.get(amount).is_guest);
           TeamComboBox.setSelectedIndex(amount);
           javax.swing.table.DefaultTableModel test = (javax.swing.table.DefaultTableModel)EventTable.getModel();
           test.addRow(new Object[]{myTeamArray.get(amount).teamname}); 
           
    }//GEN-LAST:event_AddTeam_ButtonActionPerformed

    private void TeamComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeamComboBoxMouseClicked
      

    }//GEN-LAST:event_TeamComboBoxMouseClicked

    private void SelectedGameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedGameComboActionPerformed
        int Selected_Game = SelectedGameCombo.getSelectedIndex();
        
        for (game_type type : game_type.values())
            if(type.ordinal() == Selected_Game)
                 for(int i = 0;i < myTeamArray.size();i++) 
                    myTeamArray.get(i).eventArray[SelectedEventCombo.getSelectedIndex()].GameType = type;    
       
        
        int winnerIndex;
        ArrayList sortingpoints = new ArrayList();
        for(int j =0;j < myTeamArray.size();j++){

            sortingpoints.add(myTeamArray.get(j).eventArray[SelectedEventCombo.getSelectedIndex()].eventPoints);
            
        }
   
       /*
       DefaultRowSorter sorter = ((DefaultRowSorter)EventTable.getRowSorter());

       ArrayList list = new ArrayList();
       list.add(new RowSorter.SortKey(2,SortOrder.DESCENDING) );
       sorter.setSortKeys(list);
       sorter.sort();
        /*
                int winnerIndex;
         ArrayList<int> sortingpoints = new ArrayList<int>();
        for(int j =0;j < myTeamArray.size();j++){

            points = myTeamArray.get(j).eventArray[SelectedEventCombo.getSelectedIndex()].eventPoints;
            
        }
        */

       
    }//GEN-LAST:event_SelectedGameComboActionPerformed

    
    
    private void ScoreboardPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScoreboardPaneMouseClicked

    }//GEN-LAST:event_ScoreboardPaneMouseClicked

    private void EventsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsPanelMouseClicked
    }//GEN-LAST:event_EventsPanelMouseClicked
    private void ScoreboardPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ScoreboardPaneStateChanged

        if(ScoreboardPane.getSelectedIndex() == 2){
            String Selected_event = (String)SelectedEventCombo.getSelectedItem();
            Event_Label.setText(Selected_event);

          //EventTable.setValueAt(object_test.get(i).teamname, object_test.get(i).index, NORMAL);
            
            
        }
        
    }//GEN-LAST:event_ScoreboardPaneStateChanged

    private void EventTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_EventTableInputMethodTextChanged
    }//GEN-LAST:event_EventTableInputMethodTextChanged

    private void EventTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_EventTablePropertyChange

       
       if(EventTable.getColumnCount()>0 && EventTable.getRowCount()>0){      
           
          if(EventTable.getValueAt(EventTable.getSelectedRow(), EventTable.getSelectedColumn())!= null){
              if(EventTable.getSelectedColumn() == 1){
                  myTeamArray.get(EventTable.getSelectedRow()).eventArray[SelectedEventCombo.getSelectedIndex()].eventPoints= (int)EventTable.getValueAt(EventTable.getSelectedRow(), EventTable.getSelectedColumn());
                  myTeamArray.get(EventTable.getSelectedRow()).eventArray[SelectedEventCombo.getSelectedIndex()].CalculateScore(EventTable);
                  
              }
            //System.out.print("event data = "+ EventTable.getValueAt(EventTable.getSelectedRow(), EventTable.getSelectedColumn())
           // + "\n"+ "team data inputted into: "+"\n");
         }
       }
       

        
    }//GEN-LAST:event_EventTablePropertyChange

    private void TeamNameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamNameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamNameField1ActionPerformed

    private void PlayerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerNameTextFieldActionPerformed

    }//GEN-LAST:event_PlayerNameTextFieldActionPerformed

    private void AddTeamPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeamPlayerButtonActionPerformed

      //  int amount = TeamPlayerComboBox.getItemCount();

         //  myTeamArray.get(TeamComboBox.getSelectedIndex()).PlayersData.add(amount,new PlayerData(PlayerNameTextField.getText()));
           //TeamPlayerComboBox.addItem(myTeamArray.get(TeamComboBox.getSelectedIndex()).PlayersData.get(amount).PlayerName);
           //TeamPlayerComboBox.setSelectedIndex(amount);
    }//GEN-LAST:event_AddTeamPlayerButtonActionPerformed

    private void TeamNameField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeamNameField1MouseClicked

        TeamNameField1.setText("");
    }//GEN-LAST:event_TeamNameField1MouseClicked

    private void RemoveTeamPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTeamPlayerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveTeamPlayerButtonActionPerformed

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
    private javax.swing.JButton AddTeamPlayerButton;
    private javax.swing.JButton AddTeam_Button;
    private javax.swing.JTable EventTable;
    private javax.swing.JLabel Event_Label;
    private javax.swing.JPanel EventsPanel;
    private javax.swing.JScrollPane EventsScrollPane;
    private javax.swing.JCheckBox IsGuest_checkbox;
    private javax.swing.JTextField PlayerNameTextField;
    private javax.swing.JButton RemoveTeamPlayerButton;
    private javax.swing.JButton RemoveTeam_Button;
    private javax.swing.JPanel ScorePanel;
    private javax.swing.JScrollPane ScoreScrollPane;
    private javax.swing.JTabbedPane ScoreboardPane;
    private javax.swing.JTable Scoretable;
    private javax.swing.JComboBox<String> SelectedEventCombo;
    private javax.swing.JComboBox<String> SelectedGameCombo;
    private javax.swing.JLabel SelectedTeamLabel;
    private javax.swing.JComboBox<String> TeamComboBox;
    private javax.swing.JTextField TeamNameField1;
    private javax.swing.JPanel TeamPanel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
