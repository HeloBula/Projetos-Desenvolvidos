package InterfaceGrafica;

import com.mycompany.jogoforca.Jogo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**Essa classe representa uma tela que será apresentada quando o jogo começar.
 *
 * @author Ana Beatriz Gomes Takehara, Heloísa Silveira Bula e Lara Cesquini Stopa
 */
public class TelaPrincipalUI extends javax.swing.JFrame 
{
    private static Jogo jogoAtual;
    int verificaDica = 0;
    
    /**Construtor da classe TelaPrincipalU
    * 
    */
    public TelaPrincipalUI(Jogo jogoAtual) 
    {
        int i;
        this.jogoAtual = jogoAtual;
        jogoAtual.getUsuario().getPontoChance().setTentativas(7);
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/forcaVazia.png"))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        //jLabel1.setText(jogoAtual.getPartida().getPalavra().getPalavra());

        jTextField1.setText("jTextField1");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Q");
        jButton1.setMaximumSize(new java.awt.Dimension(47, 33));
        jButton1.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("W");
        jButton2.setMinimumSize(new java.awt.Dimension(47, 33));
        jButton2.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("E");
        jButton3.setMaximumSize(new java.awt.Dimension(47, 33));
        jButton3.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("R");
        jButton4.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("T");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Y");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("U");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("I");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("O");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 153, 255));
        jButton10.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("P");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 153, 255));
        jButton11.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("A");
        jButton11.setMinimumSize(new java.awt.Dimension(47, 33));
        jButton11.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(153, 153, 255));
        jButton12.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("S");
        jButton12.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(153, 153, 255));
        jButton13.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("D");
        jButton13.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 153, 255));
        jButton14.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("F");
        jButton14.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(153, 153, 255));
        jButton15.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("G");
        jButton15.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(153, 153, 255));
        jButton16.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setText("H");
        jButton16.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(153, 153, 255));
        jButton17.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("J");
        jButton17.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(153, 153, 255));
        jButton18.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("K");
        jButton18.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(153, 153, 255));
        jButton19.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("L");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(153, 153, 255));
        jButton20.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 0));
        jButton20.setText("Z");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(153, 153, 255));
        jButton21.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setText("X");
        jButton21.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(153, 153, 255));
        jButton22.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 0));
        jButton22.setText("C");
        jButton22.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(153, 153, 255));
        jButton23.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 0));
        jButton23.setText("V");
        jButton23.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(153, 153, 255));
        jButton24.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 0, 0));
        jButton24.setText("B");
        jButton24.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(153, 153, 255));
        jButton25.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 0, 0));
        jButton25.setText("N");
        jButton25.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(153, 153, 255));
        jButton26.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 0, 0));
        jButton26.setText("M");
        jButton26.setPreferredSize(new java.awt.Dimension(47, 33));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/moeda - dica (2) (1).png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(Double.toString((Double)jogoAtual.getUsuario().getPontoDica().getQuantidade()));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dinheiro (1).png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(Integer.toString((Integer)jogoAtual.getUsuario().getPontoChance().getQuantidade()));

        jButton27.setBackground(new java.awt.Color(204, 204, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        jButton27.setBorder(null);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(102, 102, 255));
        jButton28.setForeground(new java.awt.Color(0, 0, 0));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lampada.png"))); // NOI18N
        jButton28.setMaximumSize(new java.awt.Dimension(50, 25));
        jButton28.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(102, 102, 255));
        jButton29.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 0));
        jButton29.setText("+1");
        jButton29.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/moeda - dica (2) (1).png"))); // NOI18N
        jLabel3.setText("10.5");

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dinheiro (1).png"))); // NOI18N
        jLabel8.setText("15");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel8)))
                                .addGap(53, 53, 53))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu3.setBackground(new java.awt.Color(204, 204, 255));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Como Jogar");
        jMenu3.setToolTipText("");
        jMenu3.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N

        jMenuItem4.setText("     O jogo da forca é um jogo em que um jogador deve adivinhar uma palavra, letra por letra,");
        jMenuItem4.setEnabled(false);
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("em um número limitado de tentativas. O objetivo é descobrir a palavra antes de esgotar");
        jMenuItem5.setEnabled(false);
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("as 7 tentativas");
        jMenuItem6.setEnabled(false);
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        String palavra = "";
        for(int i=0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == '-')
            {
                palavra += " ";
            }
            else
            {
                palavra += "_ ";
            }
            
        }
        
        jTextField1.setText(palavra);
        jTextField1.setEditable(false);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**Esse método será utilizada quando a letra Q for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão Q.
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'q')
            {
                campos[i] = "q";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }   
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " ";
        }

        jButton1.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra na última tentativa
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
                String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
                for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                    conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
                conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
                if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
                {
                    jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                    jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
                }

                else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
                {
                    jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                    jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
                }

                else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
                {
                    jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                    jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
                }

                String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
                for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                    novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
                novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    StringBuilder sb = new StringBuilder();
                    String linha;
                    boolean linhaEncontrada = false;

                    while((linha = br.readLine()) != null)
                    {
                        if(linha.equals(conteudoBuscado))
                        {
                            sb.append(novoConteudo);
                            linhaEncontrada = true;
                        }
                        else
                        {
                           sb.append(linha);
                        }
                        sb.append(System.lineSeparator());
                    }
                    br.close();

                    if(linhaEncontrada)
                    {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                        bw.write(sb.toString());
                        bw.close();
                    }
                }
                catch(IOException ex)
                {
                    Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                    new TelaPontuacaoUI(jogoAtual).setVisible(true);
                    dispose();
                }

                else if(verifica == 1) //usuário errou a palavra
                {
                    new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                    dispose();
                }
            }
            else //usuario acertou a palavras sem utilizar todas as chances
            {
                if(verifica == 0)
                {
                    File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
                    String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
                    for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                        conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
                    conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
                    if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
                    {
                        jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                        jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
                    }

                    else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
                    {
                        jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                        jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
                    }

                    else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
                    {
                        jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                        jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
                    }

                    String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
                    for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                        novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
                    novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();

                    try
                    {
                        BufferedReader br = new BufferedReader(new FileReader(arquivo));
                        StringBuilder sb = new StringBuilder();
                        String linha;
                        boolean linhaEncontrada = false;

                        while((linha = br.readLine()) != null)
                        {
                            if(linha.equals(conteudoBuscado))
                            {
                                sb.append(novoConteudo);
                                linhaEncontrada = true;
                            }
                            else
                            {
                               sb.append(linha);
                            }
                            sb.append(System.lineSeparator());
                        }
                        br.close();

                    if(linhaEncontrada)
                    {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                        bw.write(sb.toString());
                        bw.close();
                    }
                }
                catch(IOException ex)
                {
                    Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                    new TelaPontuacaoUI(jogoAtual).setVisible(true);
                    dispose();
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**Esse método será utilizada quando a letra A for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão A.
    */
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'a')
            {
                campos[i] = "a";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'á')
            {
                campos[i] = "á";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'à')
            {
                campos[i] = "à";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'ã')
            {
                campos[i] = "ã";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'â')
            {
                campos[i] = "â";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton11.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
                String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
                for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                    conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
                conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
                if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
                {
                    jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                    jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
                }

                else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
                {
                    jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                    jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
                }

                else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
                {
                    jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                    jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
                }

                String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
                for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                    novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
                novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    StringBuilder sb = new StringBuilder();
                    String linha;
                    boolean linhaEncontrada = false;

                    while((linha = br.readLine()) != null)
                    {
                        if(linha.equals(conteudoBuscado))
                        {
                            sb.append(novoConteudo);
                            linhaEncontrada = true;
                        }
                        else
                        {
                           sb.append(linha);
                        }
                        sb.append(System.lineSeparator());
                    }
                    br.close();

                    if(linhaEncontrada)
                    {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                        bw.write(sb.toString());
                        bw.close();
                    }
                }
                catch(IOException ex)
                {
                    Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                    new TelaPontuacaoUI(jogoAtual).setVisible(true);
                    dispose();
                }
            }
    }//GEN-LAST:event_jButton11ActionPerformed

    /**Esse método será utilizada quando a letra W for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão W.
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'w')
            {
                campos[i] = "w";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton2.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }

                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {

                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
          
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
           
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**Esse método será utilizada quando a letra R for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão R.
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'r')
            {
                campos[i] = "r";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton4.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }

                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
             
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**Esse método será utilizada quando a letra T for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão T.
    */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 't')
            {
                campos[i] = "t";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton5.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }

                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**Esse método será utilizada quando a letra Y for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão Y.
    */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'y')
            {
                campos[i] = "y";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton6.setEnabled(false);
        jTextField1.setText(palavra);

        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**Esse método será utilizada quando a letra P for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão P.
    */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'p')
            {
                campos[i] = "p";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }
        
        jButton10.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    /**Esse método será utilizada quando a letra S for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão S.
    */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 's')
            {
                campos[i] = "s";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton12.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
               
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    /**Esse método será utilizada quando a letra D for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão D.
    */
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'd')
            {
                campos[i] = "d";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton13.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    /**Esse método será utilizada quando a letra F for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão F.
    */
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'f')
            {
                campos[i] = "f";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }
        
        jButton14.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();

            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();

            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    /**Esse método será utilizada quando a letra G for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão G.
    */
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'g')
            {
                campos[i] = "g";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton15.setEnabled(false);
        jTextField1.setText(palavra);
       
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    /**Esse método será utilizada quando a letra H for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão H.
    */
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'h')
            {
                campos[i] = "h";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton16.setEnabled(false);
        jTextField1.setText(palavra);
       
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    /**Esse método será utilizada quando a letra J for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão J.
    */
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'j')
            {
                campos[i] = "j";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton17.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    /**Esse método será utilizada quando a letra K for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão K.
    */
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'k')
            {
                campos[i] = "k";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton18.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    /**Esse método será utilizada quando a letra L for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão L.
    */
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'l')
            {
                campos[i] = "l";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton19.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

   /**Esse método será utilizada quando a letra Z for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão Z.
    */
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'z')
            {
                campos[i] = "z";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton20.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    /**Esse método será utilizada quando a letra X for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão X.
    */
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'x')
            {
                campos[i] = "x";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton21.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

       if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    /**Esse método será utilizada quando a letra V for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão V.
    */
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'v')
            {
                campos[i] = "v";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }
        
        jButton23.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    /**Esse método será utilizada quando a letra B for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão B.
    */
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'b')
            {
                campos[i] = "b";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton24.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    /**Esse método será utilizada quando a letra N for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão N.
    */
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
   
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'n')
            {
                campos[i] = "n";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton25.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    /**Esse método será utilizada quando a letra M for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão M.
    */
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
      
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'm')
            {
                campos[i] = "m";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }
        
        jButton26.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    /**Esse método será utilizada quando a letra C for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão C.
    */
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'c')
            {
                campos[i] = "c";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'ç')
            {
                campos[i] = "ç";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton22.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    /**Esse método será utilizada quando a letra E for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão E.
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'e')
            {
                campos[i] = "e";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'é')
            {
                campos[i] = "é";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'ê')
            {
                campos[i] = "ê";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton3.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**Esse método será utilizada quando a letra U for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão U.
    */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'u')
            {
                campos[i] = "u";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'ú')
            {
                campos[i] = "ú";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }

        jButton7.setEnabled(false);
        jTextField1.setText(palavra);
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
               
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
               
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**Esse método será utilizada quando a letra I for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão I.
    */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
  
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'i')
            {
                campos[i] = "i";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'í')
            {
                campos[i] = "í";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'î')
            {
                campos[i] = "î";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
         
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }
        
        jButton8.setEnabled(false);
        jTextField1.setText(palavra);
        
     
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
              
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

   /**Esse método será utilizada quando a letra O for clicada. Nele, vamos verificar se a letra está presente na palavra, caso esteja substituímos o traço pela letra na posição correta, caso não decrementamos a quantidade de tentativas que o usuário tem e desenhamos mais um membro do corpo na forca.
    * 
    * @param evt Evento gerado caso o usuário clique no botão O.
    */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        String palavra = jTextField1.getText();
        String[] campos = palavra.split(" ");
        int verificaLetra = 0;
        
        
        for(int i = 0; i < jogoAtual.getPartida().getPalavra().getPalavra().length(); i++)
        {
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'o')
            {
                campos[i] = "o";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'ó')
            {
                campos[i] = "ó";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'ô')
            {
                campos[i] = "ô";
                verificaLetra = 1;
            }
            if(jogoAtual.getPartida().getPalavra().getPalavra().charAt(i) == 'õ')
            {
                campos[i] = "õ";
                verificaLetra = 1;
            }
        }
        palavra = "";
        
        if(verificaLetra == 0)
        {
            jogoAtual.getPartida().getPalavra().setTentativa((jogoAtual.getPartida().getPalavra().getTentativa() - 1));
            jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() - 1));
            
            
            if(jogoAtual.getPartida().getPalavra().getTentativa() == 6)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCabeça.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 5)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forca Corpo.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 4)
            {
               jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraçoEsquerdo.png")));
            }
           
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 3)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaBraços.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 2)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaPernaEsquerda.png")));
            }
            
            else if(jogoAtual.getPartida().getPalavra().getTentativa() == 1)
            {
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/forcaCompleta.png")));
            }
        }
        
        for(int i=0; i < campos.length; i++)
        {
            palavra += campos[i] + " "; 
        }
        
        jButton9.setEnabled(false);
        jTextField1.setText(palavra);
        
        
        int verifica = 0;
        
        for(int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == '_')
            {
               verifica = 1;
            }
        }

        if(jogoAtual.getPartida().getPalavra().getTentativa() == 0)
        {   
            if(verifica == 0) //usuário acertou a palavra
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
              
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
            else if(verifica == 1) //usuário errou a palavra
            {
                new TelaFinalPerdeuUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
        else
        {
            if(verifica == 0)
            {
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("fácil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosFacil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosFacil(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("médio"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosMedio(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosMedio(jogoAtual.getUsuario());
            }
            
            else if(jogoAtual.getPartida().getPalavra().getDificuldade().equals("difícil"))
            {
                jogoAtual.getUsuario().getPontoDica().adicionarPontosDificil(jogoAtual.getUsuario());
                jogoAtual.getUsuario().getPontoChance().adicionarPontosDificil(jogoAtual.getUsuario());
            }
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
             
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                new TelaPontuacaoUI(jogoAtual).setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**Essa action ocorrerá caso o usuário selecione o botão com o ícone de casa. Quando clicado, o usuário será redicrecionado para a tela de usuário logado.
     * 
     * @param evt Evento gerado caso o usuário clique no botão com ícone de carro.
     */
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        
        new TelaUsuarioLogadoUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton27ActionPerformed

    /**Essa action ocorrerá caso o usuário selecione o botão para comprar um dica. Quando clicado, um JOptionPane aparecerá com uma dica e a quantidade de dicas disponíveis será decrementada, caso o usuário já tiver usado as três dicas disponíveis uma mensagem será apresentado.
     * 
     * @param evt Evento gerado caso o usuário clique no botão para comprar dica.
     */
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
 
        verificaDica++;
        if((Double)jogoAtual.getUsuario().getPontoDica().getQuantidade() >= 10.5)
        {
            if(verificaDica == 1)
        {
            JOptionPane.showMessageDialog(this,jogoAtual.getPartida().getPalavra().getCategoria(),"Dica 1", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(verificaDica == 2)
        {
            JOptionPane.showMessageDialog(this,jogoAtual.getPartida().getPalavra().getDicaUm(),"Dica 2", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {
            JOptionPane.showMessageDialog(this,jogoAtual.getPartida().getPalavra().getDicaDois(),"Dica 3", JOptionPane.INFORMATION_MESSAGE);
            jButton28.setEnabled(false);
        }
       
        
       
            File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            jogoAtual.getUsuario().getPontoDica().removerPontos(jogoAtual.getUsuario(), 10.5);
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        jLabel5.setText(Double.toString((Double)jogoAtual.getUsuario().getPontoDica().getQuantidade()));
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Você não possui moedas suficientes!","Compra não efetuada", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton28ActionPerformed

    /**Essa action ocorrerá caso o usuário selecione o botão para comprar uma chance. Quando clicado, se o usuário ainda tiver todas as chances uma mensagem será apresentada informando que ele não pode comprar chances aindas, se não a quantidade de tentativas será incrementada em uama unidade.
     * 
     * @param evt Evento gerado caso o usuário clique no botão para comprar dica.
     */
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        
        if(jogoAtual.getPartida().getPalavra().getTentativa() == 7)
        {
            JOptionPane.showMessageDialog(this,"Você ainda possui todas as tentativas!!", "Erro na compra", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {
            if((Integer)jogoAtual.getUsuario().getPontoChance().getQuantidade() >= 15)
            {
                jogoAtual.getPartida().getPalavra().setTentativa(jogoAtual.getPartida().getPalavra().getTentativa() + 1);
                jogoAtual.getUsuario().getPontoChance().setTentativas(((Integer)jogoAtual.getUsuario().getPontoChance().getTentativas() + 1));
                
                File arquivo = new File("C:\\Users\\helsi\\OneDrive\\Área de Trabalho\\Faculdade\\POO\\JogoForca\\usuarios.txt");
            String conteudoBuscado = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                conteudoBuscado += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            conteudoBuscado += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
                
            jogoAtual.getUsuario().getPontoChance().removerPontos(jogoAtual.getUsuario(), 15);
            
            
            String novoConteudo = jogoAtual.getUsuario().getNome() + "#" + jogoAtual.getUsuario().getNomeUser() + "#" + jogoAtual.getUsuario().getEmail() + "#" + jogoAtual.getUsuario().getSenha() + "#";
            for(int i = 0; i< jogoAtual.getUsuario().getIndicesPalavras().size(); i++)
                novoConteudo += jogoAtual.getUsuario().getIndicesPalavras().get(i) + " ";
            novoConteudo += "#" + jogoAtual.getUsuario().getPontoDica().getQuantidade() + "#" + jogoAtual.getUsuario().getPontoChance().getQuantidade();
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                StringBuilder sb = new StringBuilder();
                String linha;
                boolean linhaEncontrada = false;
                
                while((linha = br.readLine()) != null)
                {
                    if(linha.equals(conteudoBuscado))
                    {
                        sb.append(novoConteudo);
                        linhaEncontrada = true;
                    }
                    else
                    {
                       sb.append(linha);
                    }
                    sb.append(System.lineSeparator());
                }
                br.close();
                
                if(linhaEncontrada)
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                    bw.write(sb.toString());
                    bw.close();
                }
            }
            catch(IOException ex)
            {
                Logger.getLogger(TelaDificuldadeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            

         JOptionPane.showMessageDialog(this, "Você possui uma nova tentativa!!\nTentativas atuais: " + (Integer)jogoAtual.getUsuario().getPontoChance().getTentativas(), "Compra efetuada", JOptionPane.INFORMATION_MESSAGE);   
        jLabel7.setText(Integer.toString((Integer)jogoAtual.getUsuario().getPontoChance().getQuantidade()));
        jButton29.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Você não possui dinheiro suficiente!","Compra não efetuada", JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    
    
    
    
    /**Esse método será responsável por chamar a tela.
     * 
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
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalUI(jogoAtual).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
