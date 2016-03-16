package view;

import modelo.BoardControler;

public class WindowGUI extends javax.swing.JFrame {
    private BoardGUI boardgui;     

 
    
    public WindowGUI(BoardControler tab){
    	initComponents(tab);
    }
    
	public void initComponents(BoardControler tab) {
        boardgui = new BoardGUI(tab);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout tableroGUI1Layout = new javax.swing.GroupLayout(boardgui);
        boardgui.setLayout(tableroGUI1Layout);
        tableroGUI1Layout.setHorizontalGroup(
            tableroGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        tableroGUI1Layout.setVerticalGroup(
            tableroGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardgui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(boardgui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pack();
    }
	
	public void setEnableBoard(boolean enabled){
		boardgui.setEnabled(enabled);
	}
}
