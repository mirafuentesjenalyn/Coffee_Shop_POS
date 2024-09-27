/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CoffeShop;

/**
 *
 * @author James
 */
//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {
  private ProductMethods productMethods; 
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        setTitle("Dashboard");
        
        ImageIcon icon = IconLoader.getIcon();
        Image img = icon.getImage();
        
        setIconImage(img);
        productMethods = new ProductMethods();
        GridLayoutDisplay();

        searchText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleSearch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleSearch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleSearch();
            }
        });

        searchText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Trigger the login action when Enter is pressed
                    btnSearchActionPerformed(null);
                }
            }
        });
        


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navbarLeft = new javax.swing.JPanel();
        btnOption = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        itemDetails = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        searchBar = new javax.swing.JPanel();
        searchText = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        coffeeGrid = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teaGrid = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        snackGrid = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        productTable = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        changeLabel = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        amountText = new javax.swing.JTextField();
        changeText = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        header.setBackground(new java.awt.Color(81, 56, 33));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Name");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(1039, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        navbarLeft.setBackground(new java.awt.Color(255, 192, 135));

        btnOption.setBackground(new java.awt.Color(255, 192, 135));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        jButton2.setText("Reports");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHideActionText(true);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setPreferredSize(new java.awt.Dimension(80, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setPreferredSize(new java.awt.Dimension(80, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product.png"))); // NOI18N
        jButton3.setText("Products");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setPreferredSize(new java.awt.Dimension(80, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employee.png"))); // NOI18N
        jButton4.setText("Employees");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setPreferredSize(new java.awt.Dimension(80, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnOptionLayout = new javax.swing.GroupLayout(btnOption);
        btnOption.setLayout(btnOptionLayout);
        btnOptionLayout.setHorizontalGroup(
            btnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnOptionLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(btnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnOptionLayout.setVerticalGroup(
            btnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOptionLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navbarLeftLayout = new javax.swing.GroupLayout(navbarLeft);
        navbarLeft.setLayout(navbarLeftLayout);
        navbarLeftLayout.setHorizontalGroup(
            navbarLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLeftLayout.createSequentialGroup()
                .addComponent(btnOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        navbarLeftLayout.setVerticalGroup(
            navbarLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLeftLayout.createSequentialGroup()
                .addComponent(btnOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 568, Short.MAX_VALUE))
        );

        getContentPane().add(navbarLeft, java.awt.BorderLayout.LINE_START);

        itemDetails.setBackground(new java.awt.Color(255, 192, 135));

        centerPanel.setBackground(new java.awt.Color(142, 104, 69));

        searchBar.setBackground(new java.awt.Color(255, 245, 238));
        searchBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        searchText.setBackground(new java.awt.Color(255, 245, 238));
        searchText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchText.setForeground(new java.awt.Color(142, 104, 69));
        searchText.setText("Search");
        searchText.setToolTipText("");
        searchText.setBorder(null);
        searchText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFocusLost(evt);
            }
        });
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(142, 104, 69));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(142, 104, 69));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSearch.setIconTextGap(20);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchBarLayout = new javax.swing.GroupLayout(searchBar);
        searchBar.setLayout(searchBarLayout);
        searchBarLayout.setHorizontalGroup(
            searchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        searchBarLayout.setVerticalGroup(
            searchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(searchBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(searchText))
                .addGap(27, 27, 27))
        );

        jTabbedPane2.setBackground(new java.awt.Color(142, 104, 69));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setToolTipText("");
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jTabbedPane2.setOpaque(true);

        coffeeGrid.setBackground(new java.awt.Color(255, 245, 238));
        coffeeGrid.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane1.setViewportView(coffeeGrid);

        jTabbedPane2.addTab("Coffee", jScrollPane1);

        teaGrid.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane2.setViewportView(teaGrid);

        jTabbedPane2.addTab("Tea", jScrollPane2);

        snackGrid.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane3.setViewportView(snackGrid);

        jTabbedPane2.addTab("Snacks", jScrollPane3);

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane2)
                    .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 192, 135));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
        }

        totalLabel.setText("Total:");

        amountLabel.setText("Amount:");

        changeLabel.setText("Change:");

        totalText.setText("0");

        amountText.setText("0");

        changeText.setText("0");

        btnPay.setText("Pay");

        btnRemove.setText("Remove");

        btnReceipt.setText("Receipt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalLabel)
                                    .addComponent(amountLabel)
                                    .addComponent(changeLabel))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(changeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnPay)
                                .addGap(52, 52, 52)
                                .addComponent(btnRemove))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnReceipt)))
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addComponent(productTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(productTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeLabel)
                    .addComponent(changeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPay)
                    .addComponent(btnRemove))
                .addGap(26, 26, 26)
                .addComponent(btnReceipt)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout itemDetailsLayout = new javax.swing.GroupLayout(itemDetails);
        itemDetails.setLayout(itemDetailsLayout);
        itemDetailsLayout.setHorizontalGroup(
            itemDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDetailsLayout.createSequentialGroup()
                .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        itemDetailsLayout.setVerticalGroup(
            itemDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(itemDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        getContentPane().add(itemDetails, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1316, 1009));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard callDashboard = new Dashboard();
        callDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchTerm = searchText.getText().trim(); // Get the search term from the text field
        searchMenu(searchTerm);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed

    }//GEN-LAST:event_searchTextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Products callProducts = new Products();
        callProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Employees callEmployees = new Employees();
        callEmployees.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Reports callReports = new Reports();
       callReports.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        GridLayoutDisplay();
    }//GEN-LAST:event_formWindowOpened

    private void searchTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusGained
        if (searchText.getText().equals("Search")) {
            searchText.setText("");
            searchText.setForeground(Color.BLACK); // Optional: Change text color to black
        }
    }//GEN-LAST:event_searchTextFocusGained

    private void searchTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusLost
        if (searchText.getText().isEmpty()) {
                searchText.setText("Search");
                searchText.setForeground(Color.GRAY); // Change text color to gray
            }
    }//GEN-LAST:event_searchTextFocusLost
    
    private void handleSearch() {
        String searchTerm = searchText.getText().trim();  // Get the search term

        if (searchTerm.isEmpty()) {
            // If the search term is empty, reset to display the full menu
            GridLayoutDisplay();
        } else {
            // Perform the search and update the grids
            searchMenu(searchTerm);
        }
    }

    private void searchMenu(String searchTerm) {
        if (searchTerm.isEmpty()) {
            GridLayoutDisplay(); // This will reset and display the full menu
            return;
        }
        // Clear the existing product displays
        coffeeGrid.removeAll();
        teaGrid.removeAll();
        snackGrid.removeAll();
        
        
        // Fetch products based on search term (not dynamically)
        List<Product> products = productMethods.searchMenuMethod(searchTerm); 

        // Iterate over the products list and create UI components for each product
        for (Product product : products) {
            JPanel productPanel = createProductPanel(product);
            // Add the product panel to the corresponding grid based on the category
            switch (product.getProductCategory()) {
                case "Coffee":
                    coffeeGrid.add(productPanel);
                    break;
                case "Tea":
                    teaGrid.add(productPanel);
                    break;
                case "Snacks":
                    snackGrid.add(productPanel);
                    break;
                default:
                    break;
            }
        }

        // Refresh each grid panel
        coffeeGrid.revalidate();
        coffeeGrid.repaint();
        teaGrid.revalidate();
        teaGrid.repaint();
        snackGrid.revalidate();
        snackGrid.repaint();
    }

    private void GridLayoutDisplay() {
        // Clear existing components in each grid
        coffeeGrid.removeAll();
        teaGrid.removeAll();
        snackGrid.removeAll();

        List<Product> products = productMethods.productMethod(); // Fetch products from the database

        // Iterate over the products list and create UI components for each product
        for (Product product : products) {
            JPanel productPanel = createProductPanel(product);
            // Add the product panel to the corresponding grid based on the category
            switch (product.getProductCategory()) {
                case "Coffee":
                    coffeeGrid.add(productPanel);
                    break;
                case "Tea":
                    teaGrid.add(productPanel);
                    break;
                case "Snacks":
                    snackGrid.add(productPanel);
                    break;
                default:
                    break;
            }
        }

        // Refresh each grid panel
        coffeeGrid.revalidate();
        coffeeGrid.repaint();
        teaGrid.revalidate();
        teaGrid.repaint();
        snackGrid.revalidate();
        snackGrid.repaint();
    }

    private JPanel createProductPanel(Product product) {
        JPanel productPanel = new JPanel();
        Color customColor = new Color(230,155,87);
        productPanel.setBorder(BorderFactory.createLineBorder(customColor, 1));
        productPanel.setBackground(new Color(255,245,238));
        
        JLabel imageLabel = new JLabel();
        ImageIcon productImage = new ImageIcon(product.getProductImagePath());
        Image scaledImage = resizeImage(productImage, 100, 200);
        imageLabel.setIcon(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel nameLabel = new JLabel(product.getProductName());
        JLabel priceLabel = new JLabel("₱" + product.getProductPrice());
        
        Font justFont = new Font("Segoe UI", Font.BOLD, 14);
        Font boldFont = new Font("Arial", Font.PLAIN, 14);
        nameLabel.setFont(boldFont);
        priceLabel.setFont(justFont);
        
        JSpinner quantitySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));

        JButton addButton = new JButton("Add");
        addButton.setBackground(new Color(255, 167, 87));
        addButton.setForeground(new Color(81,56,33));
        addButton.setBorderPainted(false);
        addButton.setFocusPainted(false);
        addButton.setContentAreaFilled(true);
        Font boldAdd = addButton.getFont().deriveFont(Font.BOLD);
        addButton.setFont(boldAdd);
        
        addButton.addActionListener(e -> {
            String productName = product.getProductName();
            double productPrice = product.getProductPrice();
            int quantity = (int) quantitySpinner.getValue();
            addToOrderTable(productName, quantity, productPrice);
        });

        GroupLayout productPanelLayout = new GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);

        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(imageLabel, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(nameLabel, GroupLayout.Alignment.CENTER)
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addComponent(priceLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantitySpinner, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap()
        );

        productPanelLayout.setVerticalGroup(
            productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGap(15)
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(productPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(quantitySpinner)
                    .addComponent(addButton))
                .addGap(15)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        productPanel.revalidate();
        productPanel.repaint();
        return productPanel;
    }
    
    
    private Image resizeImage(ImageIcon originalImage, int targetWidth, int targetHeight) {
        // Get the original dimensions
        int originalWidth = originalImage.getIconWidth();
        int originalHeight = originalImage.getIconHeight();

        // Maintain aspect ratio
        double aspectRatio = (double) originalWidth / originalHeight;
        if (originalWidth > originalHeight) {
            targetHeight = (int) (targetWidth / aspectRatio);
        } else {
            targetWidth = (int) (targetHeight * aspectRatio);
        }

        return originalImage.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
    }


    private void addToOrderTable(String productName, int quantity, double price) {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();

        // Calculate total price
        double totalPrice = quantity * price; // Calculate total price

        // Add new row to the order table
        model.addRow(new Object[]{
    //        model.getRowCount() + 1, // ID: simple row count
            productName,              // Product Name
            quantity,                 // Quantity
            totalPrice                // Total Price
        });
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountText;
    private javax.swing.JPanel btnOption;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JTextField changeText;
    private javax.swing.JPanel coffeeGrid;
    private javax.swing.JPanel header;
    private javax.swing.JPanel itemDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel navbarLeft;
    private javax.swing.JTable orderTable;
    private javax.swing.JScrollPane productTable;
    private javax.swing.JPanel searchBar;
    private javax.swing.JTextField searchText;
    private javax.swing.JPanel snackGrid;
    private javax.swing.JPanel teaGrid;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalText;
    // End of variables declaration//GEN-END:variables
}
