package components;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard2
     */
    public Dashboard() {
        initComponents();
        try {
            init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        dashboardLabel = new javax.swing.JLabel();
        card1 = new javax.swing.JPanel();
        studentsLabel = new javax.swing.JLabel();
        studentsValue = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        tearcherLabel = new javax.swing.JLabel();
        teacherValue = new javax.swing.JLabel();
        card3 = new javax.swing.JPanel();
        courseLabel = new javax.swing.JLabel();
        courseValue = new javax.swing.JLabel();
        card4 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        loginValue = new javax.swing.JLabel();
        detailedLabel = new javax.swing.JLabel();
        databasePanel = new javax.swing.JPanel();
        universityPanel = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        dashboardLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dashboardLabel.setText("components.Dashboard Panel");

        card1.setBackground(new java.awt.Color(255, 204, 51));
        card1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        studentsLabel.setText("Total Students");

        studentsValue.setText("6253");

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
                card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(studentsLabel)
                                .addContainerGap(118, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentsValue)
                                .addContainerGap())
        );
        card1Layout.setVerticalGroup(
                card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(studentsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(studentsValue)
                                .addContainerGap())
        );

        card2.setBackground(new java.awt.Color(204, 102, 255));
        card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tearcherLabel.setText("Total Teachers");

        teacherValue.setText("6253");

        javax.swing.GroupLayout card2Layout = new javax.swing.GroupLayout(card2);
        card2.setLayout(card2Layout);
        card2Layout.setHorizontalGroup(
                card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tearcherLabel)
                                .addContainerGap(118, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teacherValue)
                                .addContainerGap())
        );
        card2Layout.setVerticalGroup(
                card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tearcherLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(teacherValue)
                                .addContainerGap())
        );

        card3.setBackground(new java.awt.Color(255, 204, 51));
        card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        courseLabel.setText("Total Courses");

        courseValue.setText("6253");

        javax.swing.GroupLayout card3Layout = new javax.swing.GroupLayout(card3);
        card3.setLayout(card3Layout);
        card3Layout.setHorizontalGroup(
                card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseLabel)
                                .addContainerGap(118, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseValue)
                                .addContainerGap())
        );
        card3Layout.setVerticalGroup(
                card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(courseValue)
                                .addContainerGap())
        );

        card4.setBackground(new java.awt.Color(204, 102, 255));
        card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        loginLabel.setText("Total Logins");

        loginValue.setText("6253");

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
                card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginValue)
                                .addContainerGap())
        );
        card4Layout.setVerticalGroup(
                card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(card4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(loginValue)
                                .addContainerGap())
        );

        detailedLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        detailedLabel.setText("Detailed Statistics");

        databasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Database Statistics"));

        javax.swing.GroupLayout databasePanelLayout = new javax.swing.GroupLayout(databasePanel);
        databasePanel.setLayout(databasePanelLayout);
        databasePanelLayout.setHorizontalGroup(
                databasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        databasePanelLayout.setVerticalGroup(
                databasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 218, Short.MAX_VALUE)
        );

        universityPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("University Statistics"));

        javax.swing.GroupLayout universityPanelLayout = new javax.swing.GroupLayout(universityPanel);
        universityPanel.setLayout(universityPanelLayout);
        universityPanelLayout.setHorizontalGroup(
                universityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 409, Short.MAX_VALUE)
        );
        universityPanelLayout.setVerticalGroup(
                universityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 218, Short.MAX_VALUE)
        );

        descriptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descriptionLabel.setText("Further Description");

        descriptionPanel.setBackground(new java.awt.Color(255, 102, 102));
        descriptionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout descriptionPanelLayout = new javax.swing.GroupLayout(descriptionPanel);
        descriptionPanel.setLayout(descriptionPanelLayout);
        descriptionPanelLayout.setHorizontalGroup(
                descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        descriptionPanelLayout.setVerticalGroup(
                descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dashboardLabel)
                                        .addComponent(detailedLabel)
                                        .addComponent(descriptionLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(databasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(universityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(descriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dashboardLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(detailedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(databasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(universityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(descriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void init() throws IOException {
        try {
            studentsValue.setText(String.valueOf(countLines("./csv/students.csv")));
            teacherValue.setText(String.valueOf(countLines("./csv/faculty.csv")));
            courseValue.setText(String.valueOf(countLines("./csv/courses.csv")));
            loginValue.setText(String.valueOf(countLines("./csv/registration.csv")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        databasePanel.setLayout(new MigLayout("wrap 4", "[][]20[][]"));

        // Database Panel
        databasePanel.add(new JLabel("<html><b> ** Student Courses -</b></html>"), "wrap");
        databasePanel.add(new JLabel("Computer Science Students"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/students.csv", "Computer Science", 5)));
        databasePanel.add(new JLabel("Civil Engineering Students"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/students.csv", "Civil", 5)));
        databasePanel.add(new JLabel("Mechanical Students"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/students.csv", "Mechanical", 5)));
        databasePanel.add(new JLabel("Pharmacy Students"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/students.csv", "Pharmacy", 5)));
        databasePanel.add(new JLabel("Electrical Students"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/students.csv", "Electrical", 5)));
        databasePanel.add(new JLabel("BHU Students"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/students.csv", "BHU", 5)));

        databasePanel.add(new JLabel(""), "wrap");
        databasePanel.add(new JLabel("<html><b> ** Fee Status -</b></html>"), "wrap");
        databasePanel.add(new JLabel("Fee Paid"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/fees.csv", "Paid", 4)));
        databasePanel.add(new JLabel("Fee Pending"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/fees.csv", "Pending", 4)));
        databasePanel.add(new JLabel("Fine Paid"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/fees.csv", "Paid", 4)));
        databasePanel.add(new JLabel("Fine Pending"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/fees.csv", "Pending", 4)));

        databasePanel.add(new JLabel(""), "wrap");
        databasePanel.add(new JLabel("<html><b> ** Faculty Salary -</b></html>"), "wrap");
        databasePanel.add(new JLabel("Fee Paid"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/fees.csv", "Paid", 4)));
        databasePanel.add(new JLabel("Fee Pending"));
        databasePanel.add(new JLabel(countMatchingRecords("./csv/fees.csv", "Pending", 4)));

        // University Panel
        universityPanel.setLayout(new MigLayout("wrap 4", "[][]20[][]"));
        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));
        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));

        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));
        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));

        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));
        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));

        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));
        universityPanel.add(new JLabel("Example Title"));
        universityPanel.add(new JLabel("Usage"));
    }

    public static String countMatchingRecords(String filePath, String searchString, int columnNumber) throws IOException {
        Path path = Paths.get(filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            int recordCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                // Use StringTokenizer to split the line into columns
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                int currentColumn = 0;

                // Iterate through columns
                while (tokenizer.hasMoreTokens()) {
                    String columnValue = tokenizer.nextToken().trim();

                    // Check if the current column matches the specified column number
                    if (currentColumn == columnNumber && columnValue.equals(searchString)) {
                        recordCount++;
                        break; // No need to check further columns in this row
                    }

                    currentColumn++;
                }
            }

            String returnValue = ": " + String.valueOf(recordCount);
            return returnValue;
        }
    }

    public static int countLines(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            return lineCount-1;
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel courseValue;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JPanel databasePanel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JLabel detailedLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginValue;
    private javax.swing.JLabel studentsLabel;
    private javax.swing.JLabel studentsValue;
    private javax.swing.JLabel teacherValue;
    private javax.swing.JLabel tearcherLabel;
    private javax.swing.JPanel universityPanel;
    // End of variables declaration
}