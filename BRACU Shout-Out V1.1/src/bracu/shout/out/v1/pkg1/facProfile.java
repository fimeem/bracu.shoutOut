/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracu.shout.out.v1.pkg1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Niloy
 */
public class facProfile extends javax.swing.JFrame {

    /**
     * Creates new form facProfile
     */
    String user;
    String backUser;
    public facProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public facProfile(String u, String  u2) {
        try
        {
            initComponents();
            this.setLocationRelativeTo(null);
            user=u;
            backUser=u2;
            DBConnect a=new DBConnect();
            userLabel2.setText(u);
            nameLabel2.setText(a.getName(u));
            idLabel2.setText(a.getID(u));
            DeptLabel2.setText(a.getDept(u));
            emailLabel2.setText(a.getEmail(u));
            course1Label2.setText(a.getC1(u));
            course2Label2.setText(a.getC2(u));
            course3Label2.setText(a.getC3(u));
            course4Label2.setText(a.getC4(u));
            course5Label2.setText(a.getC5(u));
            sec1Label2.setText(a.getS1(u));
            sec2Label2.setText(a.getS2(u));
            sec3Label2.setText(a.getS3(u));
            sec4Label2.setText(a.getS4(u));
            sec5Label2.setText(a.getS5(u));
            bloodLabel1.setText(a.getBlood(u));
        } catch (SQLException ex) {
            Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        profileLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        DeptLabel2 = new javax.swing.JLabel();
        DeptLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userLabel2 = new javax.swing.JLabel();
        course1Label = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        sec1Label = new javax.swing.JLabel();
        course2Label = new javax.swing.JLabel();
        course3Label = new javax.swing.JLabel();
        course4Label = new javax.swing.JLabel();
        course5Label = new javax.swing.JLabel();
        sec2Label = new javax.swing.JLabel();
        sec3Label = new javax.swing.JLabel();
        sec4Label = new javax.swing.JLabel();
        sec5Label = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        emailLabel1 = new javax.swing.JLabel();
        courseTitleLabel = new javax.swing.JLabel();
        bloodLabel = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        course2Label2 = new javax.swing.JLabel();
        course3Label2 = new javax.swing.JLabel();
        course1Label2 = new javax.swing.JLabel();
        course5Label2 = new javax.swing.JLabel();
        course4Label2 = new javax.swing.JLabel();
        sec2Label2 = new javax.swing.JLabel();
        sec1Label2 = new javax.swing.JLabel();
        sec3Label2 = new javax.swing.JLabel();
        sec5Label2 = new javax.swing.JLabel();
        sec4Label2 = new javax.swing.JLabel();
        bloodLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1098, 820));

        jPanel1.setBackground(new java.awt.Color(140, 20, 252));

        profileLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(0, 0, 0));
        profileLabel.setText("Faculty Profile");

        minLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        minLabel.setForeground(new java.awt.Color(0, 0, 0));
        minLabel.setText("_");
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });

        closeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(0, 0, 0));
        closeLabel.setText("X");
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(profileLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minLabel)
                .addGap(42, 42, 42)
                .addComponent(closeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileLabel)
                    .addComponent(minLabel))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeLabel)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 230, 64));
        nameLabel.setText("Faculty Name:");

        idLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        idLabel2.setForeground(new java.awt.Color(0, 230, 64));

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 230, 64));
        idLabel.setText("Faculty ID:");

        DeptLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeptLabel2.setForeground(new java.awt.Color(0, 230, 64));

        DeptLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeptLabel.setForeground(new java.awt.Color(0, 230, 64));
        DeptLabel.setText("Department:");

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 230, 64));
        userLabel.setText("Username:");

        userLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(0, 230, 64));

        course1Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course1Label.setForeground(new java.awt.Color(0, 230, 64));
        course1Label.setText("1. Course ID:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 230, 64));
        emailLabel.setText("Email:");

        sec1Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec1Label.setForeground(new java.awt.Color(0, 230, 64));
        sec1Label.setText("Section:");

        course2Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course2Label.setForeground(new java.awt.Color(0, 230, 64));
        course2Label.setText("2. Course ID:");

        course3Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course3Label.setForeground(new java.awt.Color(0, 230, 64));
        course3Label.setText("3. Course ID:");

        course4Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course4Label.setForeground(new java.awt.Color(0, 230, 64));
        course4Label.setText("4. Course ID:");

        course5Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course5Label.setForeground(new java.awt.Color(0, 230, 64));
        course5Label.setText("5. Course ID:");

        sec2Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec2Label.setForeground(new java.awt.Color(0, 230, 64));
        sec2Label.setText("Section:");

        sec3Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec3Label.setForeground(new java.awt.Color(0, 230, 64));
        sec3Label.setText("Section:");

        sec4Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec4Label.setForeground(new java.awt.Color(0, 230, 64));
        sec4Label.setText("Section:");

        sec5Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec5Label.setForeground(new java.awt.Color(0, 230, 64));
        sec5Label.setText("Section:");

        nameLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel2.setForeground(new java.awt.Color(0, 230, 64));

        noteLabel.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(207, 0, 15));

        backButton.setBackground(new java.awt.Color(219, 10, 91));
        backButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        emailLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(0, 230, 64));

        courseTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        courseTitleLabel.setForeground(new java.awt.Color(0, 230, 64));
        courseTitleLabel.setText("Courses Taken:");

        bloodLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bloodLabel.setForeground(new java.awt.Color(0, 230, 64));
        bloodLabel.setText("Blood Group:");

        emailLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emailLabel2.setForeground(new java.awt.Color(0, 230, 64));

        course2Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course2Label2.setForeground(new java.awt.Color(0, 230, 64));

        course3Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course3Label2.setForeground(new java.awt.Color(0, 230, 64));

        course1Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course1Label2.setForeground(new java.awt.Color(0, 230, 64));

        course5Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course5Label2.setForeground(new java.awt.Color(0, 230, 64));

        course4Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        course4Label2.setForeground(new java.awt.Color(0, 230, 64));

        sec2Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec2Label2.setForeground(new java.awt.Color(0, 230, 64));

        sec1Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec1Label2.setForeground(new java.awt.Color(0, 230, 64));

        sec3Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec3Label2.setForeground(new java.awt.Color(0, 230, 64));

        sec5Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec5Label2.setForeground(new java.awt.Color(0, 230, 64));

        sec4Label2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sec4Label2.setForeground(new java.awt.Color(0, 230, 64));

        bloodLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bloodLabel1.setForeground(new java.awt.Color(0, 230, 64));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course2Label)
                            .addComponent(idLabel)
                            .addComponent(DeptLabel)
                            .addComponent(userLabel)
                            .addComponent(nameLabel)
                            .addComponent(course5Label)
                            .addComponent(course4Label)
                            .addComponent(course3Label)
                            .addComponent(emailLabel)
                            .addComponent(course1Label))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course3Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course2Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course5Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course1Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course4Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(emailLabel2)
                                        .addGap(95, 95, 95))
                                    .addComponent(emailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeptLabel2)
                                    .addComponent(userLabel2))
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sec2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sec1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sec3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sec4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sec5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sec2Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sec1Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sec3Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sec5Label2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(sec4Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(237, 237, 237))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381)
                        .addComponent(backButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bloodLabel)
                        .addGap(239, 239, 239)
                        .addComponent(bloodLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(courseTitleLabel)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(idLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeptLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloodLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sec1Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(course1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sec1Label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sec2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sec2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sec3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sec3Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sec4Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sec4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(course3Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(course4Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sec5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sec5Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backButton)))
                            .addComponent(course5Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(course1Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            // TODO add your handling code here:
            if(new DBConnect().stdORfac(backUser))
            {
                new stdHome(backUser).setVisible(true);
            }
            else
            {
                new facHome(backUser).setVisible(true);
            }
            this.close();
        } catch (SQLException ex) {
            Logger.getLogger(editProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
            java.util.logging.Logger.getLogger(facProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeptLabel;
    private javax.swing.JLabel DeptLabel2;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bloodLabel;
    private javax.swing.JLabel bloodLabel1;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel course1Label;
    private javax.swing.JLabel course1Label2;
    private javax.swing.JLabel course2Label;
    private javax.swing.JLabel course2Label2;
    private javax.swing.JLabel course3Label;
    private javax.swing.JLabel course3Label2;
    private javax.swing.JLabel course4Label;
    private javax.swing.JLabel course4Label2;
    private javax.swing.JLabel course5Label;
    private javax.swing.JLabel course5Label2;
    private javax.swing.JLabel courseTitleLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JLabel sec1Label;
    private javax.swing.JLabel sec1Label2;
    private javax.swing.JLabel sec2Label;
    private javax.swing.JLabel sec2Label2;
    private javax.swing.JLabel sec3Label;
    private javax.swing.JLabel sec3Label2;
    private javax.swing.JLabel sec4Label;
    private javax.swing.JLabel sec4Label2;
    private javax.swing.JLabel sec5Label;
    private javax.swing.JLabel sec5Label2;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
