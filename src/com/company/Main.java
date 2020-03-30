package com.company;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.Scrollbar;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.ImageIcon;

class IntelligentCalulator {

    private JFrame frmIntelligentcalculatorByKhaoula;
    private JTextField txtDisplay;
    private JTextField txtInputConvert;

    /**
     * Launch the application.
     * @throws UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    IntelligentCalulator window = new IntelligentCalulator();
                    window.frmIntelligentcalculatorByKhaoula.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public IntelligentCalulator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmIntelligentcalculatorByKhaoula = new JFrame();
        frmIntelligentcalculatorByKhaoula.getContentPane().setBackground(new Color(175, 238, 238));
        frmIntelligentcalculatorByKhaoula.setBackground(new Color(173, 216, 230));
        frmIntelligentcalculatorByKhaoula.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
        frmIntelligentcalculatorByKhaoula.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\DESKTOP\\education.png"));
        frmIntelligentcalculatorByKhaoula.setFont(new Font("Dialog", Font.BOLD, 12));
        frmIntelligentcalculatorByKhaoula.setTitle("Intelligent_Calculator By KHAOULA ELMAJNI");
        frmIntelligentcalculatorByKhaoula.setBounds(100, 100,941, 478);
        frmIntelligentcalculatorByKhaoula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.WHITE);
        frmIntelligentcalculatorByKhaoula.setJMenuBar(menuBar);

        JMenu mnChoice = new JMenu("Choice");
        mnChoice.setFont(new Font("Segoe UI", Font.BOLD, 14));
        menuBar.add(mnChoice);

        JMenuItem mntmStandard = new JMenuItem("Standard");
        mntmStandard.setFont(new Font("Segoe UI", Font.BOLD, 14));
        mntmStandard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmIntelligentcalculatorByKhaoula.setTitle("Standard Calculator");
                frmIntelligentcalculatorByKhaoula.setBounds(100, 100,350, 520);
                txtDisplay.setBounds(10, 11, 307, 51);
            }
        });
        mnChoice.add(mntmStandard);

        JMenuItem mntmScientific = new JMenuItem("Scientific");
        mntmScientific.setFont(new Font("Segoe UI", Font.BOLD, 14));
        mntmScientific.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frmIntelligentcalculatorByKhaoula.setTitle("Scientific Calculator");
                frmIntelligentcalculatorByKhaoula.setBounds(100, 100,650, 520);
                txtDisplay.setBounds(10, 11,364, 51);

            }
        });
        mnChoice.add(mntmScientific);

        JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
        mntmUnitConversion.setFont(new Font("Segoe UI", Font.BOLD, 14));
        mntmUnitConversion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frmIntelligentcalculatorByKhaoula.setTitle("Unit Conversion");
                frmIntelligentcalculatorByKhaoula.setBounds(100, 100,950, 520);
                txtDisplay.setBounds(10, 11,520, 51);

            }
        });
        mnChoice.add(mntmUnitConversion);

        JMenuItem mntmExit = new JMenuItem("EXIT");
        mntmExit.setForeground(Color.RED);
        mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 14));
        mntmExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });
        mnChoice.add(mntmExit);
        frmIntelligentcalculatorByKhaoula.getContentPane().setLayout(null);

        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtDisplay.setBounds(10, 11, 307, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(txtDisplay);
        txtDisplay.setColumns(10);

        JButton btnBackSpace = new JButton("<-");
        btnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String backSpace = null;
                if(txtDisplay.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backSpace = strB.toString();
                    txtDisplay.setText(backSpace);

                }

            }
        });
        btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBackSpace.setBounds(10, 84, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnBackSpace);

        JButton btnCe = new JButton("CE");
        btnCe.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCe.setBounds(72, 84, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnCe);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {



            }
        });
        btn7.setName("");
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(10, 146, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setName("");
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn8.setBounds(72, 146, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn8);

        JButton btnC = new JButton("C");
        btnC.setName("");
        btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnC.setBounds(134, 84, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnC);

        JButton btn9 = new JButton("9");
        btn9.setName("");
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(134, 146, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn9);

        JButton btnPM = new JButton("+/-");
        btnPM.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnPM.setBounds(196, 84, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnPM);

        JButton btnSquare = new JButton("sq");
        btnSquare.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnSquare.setBounds(258, 84, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnSquare);

        JButton btnDiv = new JButton("/");
        btnDiv.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnDiv.setBounds(196, 146, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnDiv);

        JButton btnPrc = new JButton("%");
        btnPrc.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnPrc.setBounds(258, 146, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnPrc);

        JButton btn4 = new JButton("4");
        btn4.setName("");
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(10, 208, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setName("");
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(72, 208, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setName("");
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(134, 208, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn6);

        JButton btnMul = new JButton("*");
        btnMul.setFont(new Font("SansSerif", Font.BOLD, 28));
        btnMul.setBounds(196, 208, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnMul);

        JButton btn1X = new JButton("1/x");
        btn1X.setFont(new Font("SansSerif", Font.BOLD, 16));
        btn1X.setBounds(258, 208, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn1X);

        JButton btn1 = new JButton("1");
        btn1.setName("");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(10, 270, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setName("");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(72, 270, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setName("");
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(134, 270, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn3);

        JButton btnSub = new JButton("-");
        btnSub.setFont(new Font("SansSerif", Font.BOLD, 28));
        btnSub.setBounds(196, 270, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnSub);

        JButton btnEquals = new JButton("=");
        btnEquals.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnEquals.setBounds(258, 270, 52, 113);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnEquals);

        JButton btn0 = new JButton("0");
        btn0.setFont(new Font("SansSerif", Font.BOLD, 20));
        btn0.setBounds(10, 332, 115, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btn0);

        JButton btnPoint = new JButton(".");
        btnPoint.setFont(new Font("SansSerif", Font.BOLD, 28));
        btnPoint.setBounds(134, 332, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnPoint);

        JButton btnPlus = new JButton("+");
        btnPlus.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnPlus.setBounds(196, 332, 52, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnPlus);

        JButton btnLog = new JButton("log");
        btnLog.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnLog.setBounds(336, 84, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnLog);

        JButton btnSin = new JButton("Sin");
        btnSin.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnSin.setBounds(406, 84, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnSin);

        JButton btnSinh = new JButton("Sinh");
        btnSinh.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnSinh.setBounds(478, 84, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnSinh);

        JButton btnMod = new JButton("Mod");
        btnMod.setFont(new Font("SansSerif", Font.BOLD, 16));
        btnMod.setBounds(554, 84, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnMod);

        JButton btnPi = new JButton("Pi");
        btnPi.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnPi.setBounds(336, 146, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnPi);

        JButton btnCos = new JButton("Cos");
        btnCos.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnCos.setBounds(406, 146, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnCos);

        JButton btnCosh = new JButton("Cosh");
        btnCosh.setFont(new Font("SansSerif", Font.BOLD, 12));
        btnCosh.setBounds(478, 146, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnCosh);

        JButton btnLnx = new JButton("lnx");
        btnLnx.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnLnx.setBounds(554, 146, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnLnx);

        JButton btnXY = new JButton("X^Y");
        btnXY.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnXY.setBounds(336, 208, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnXY);

        JButton btnTan = new JButton("Tan");
        btnTan.setFont(new Font("SansSerif", Font.BOLD, 16));
        btnTan.setBounds(406, 208, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnTan);

        JButton btnTanh = new JButton("Tanh");
        btnTanh.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnTanh.setBounds(478, 208, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnTanh);

        JButton btnC_1 = new JButton("C");
        btnC_1.setFont(new Font("SansSerif", Font.BOLD, 24));
        btnC_1.setBounds(554, 208, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnC_1);

        JButton btnX2 = new JButton("X^2");
        btnX2.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnX2.setBounds(336, 270, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnX2);

        JButton btnCbr = new JButton("Cbr");
        btnCbr.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnCbr.setBounds(406, 270, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnCbr);

        JButton btnRund = new JButton("Rund");
        btnRund.setFont(new Font("SansSerif", Font.BOLD, 12));
        btnRund.setBounds(478, 270, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnRund);

        JButton btnp =
                new JButton("2*P");
        btnp.setName("btn2P");
        btnp.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnp.setBounds(554, 270, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnp);

        JButton btnX3 = new JButton("X^3");
        btnX3.setFont(new Font("SansSerif", Font.BOLD, 18));
        btnX3.setBounds(336, 332, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnX3);

        JButton btnBin = new JButton("Bin");
        btnBin.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnBin.setBounds(406, 332, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnBin);

        JButton btnHex = new JButton("Hex");
        btnHex.setFont(new Font("SansSerif", Font.BOLD, 16));
        btnHex.setBounds(478, 332, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnHex);

        JButton btnOct = new JButton("Oct");
        btnOct.setFont(new Font("SansSerif", Font.BOLD, 20));
        btnOct.setBounds(554, 332, 62, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnOct);

        JComboBox jcmCurrency = new JComboBox();
        jcmCurrency.setMaximumRowCount(10);
        jcmCurrency.setFont(new Font("Tahoma", Font.BOLD, 16));
        jcmCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Nigeria", "Canada", "Brasil", "Indonesia", "Philipine", "India", "Morocco"}));
        jcmCurrency.setBounds(656, 84, 227, 46);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(jcmCurrency);

        JLabel lblCurrencyConversion = new JLabel("Currency Conversion");
        lblCurrencyConversion.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblCurrencyConversion.setBounds(643, 11, 240, 51);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(lblCurrencyConversion);

        txtInputConvert = new JTextField();
        txtInputConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtInputConvert.setBounds(656, 161, 228, 46);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(txtInputConvert);
        txtInputConvert.setColumns(10);

        JLabel lblDisplayConvert = new JLabel("");
        lblDisplayConvert.setBackground(new Color(255, 255, 255));
        lblDisplayConvert.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        lblDisplayConvert.setHorizontalAlignment(SwingConstants.CENTER);
        lblDisplayConvert.setBounds(656, 236, 227, 39);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(lblDisplayConvert);

        JButton btnConvets = new JButton("Convert");
        btnConvets.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnConvets.setBounds(661, 307, 89, 46);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnConvets);

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnClear.setBounds(794, 307, 89, 46);
        frmIntelligentcalculatorByKhaoula.getContentPane().add(btnClear);
    }
}
