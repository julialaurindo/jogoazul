public class TelaJogo extends javax.swing.JFrame {

    public TelaJogo() {
        initComponents();
        desativarJ1();
        desativarJ2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlSelecao = new javax.swing.JPanel();
        btnLuz = new javax.swing.JButton();
        btnFogo = new javax.swing.JButton();
        btnAgua = new javax.swing.JButton();
        btnEnergia = new javax.swing.JButton();
        btnMago = new javax.swing.JButton();
        btnNinja = new javax.swing.JButton();
        btnArqueiro = new javax.swing.JButton();
        btnEspadachim = new javax.swing.JButton();
        lblSelecao = new javax.swing.JLabel();
        lblFadas = new javax.swing.JLabel();
        lblHumanos = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        lblDe = new javax.swing.JLabel();
        lblPersonagens = new javax.swing.JLabel();
        pnlJogador2 = new javax.swing.JPanel();
        lblJogador2 = new javax.swing.JLabel();
        txtClasse2 = new javax.swing.JTextField();
        lblHP2 = new javax.swing.JLabel();
        txtHP2 = new javax.swing.JTextField();
        btnAtacar2 = new javax.swing.JButton();
        btnCurar2 = new javax.swing.JButton();
        pnlBatalha = new javax.swing.JPanel();
        lblBatalha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrincipal = new javax.swing.JTextArea();
        pnlJogador1 = new javax.swing.JPanel();
        btnCurar1 = new javax.swing.JButton();
        btnAtacar1 = new javax.swing.JButton();
        txtHP1 = new javax.swing.JTextField();
        lblHP1 = new javax.swing.JLabel();
        txtClasse1 = new javax.swing.JTextField();
        lblJogador1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlSelecao.setBackground(new java.awt.Color(153, 204, 255));
        pnlSelecao.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 153, 255)));

        btnLuz.setBackground(new java.awt.Color(51, 153, 255));
        btnLuz.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnLuz.setForeground(new java.awt.Color(0, 0, 0));
        btnLuz.setText("Fada da Luz");
        btnLuz.setActionCommand("");
        btnLuz.setBorder(null);
        btnLuz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuzActionPerformed(evt);
            }
        });

        btnFogo.setBackground(new java.awt.Color(51, 153, 255));
        btnFogo.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnFogo.setForeground(new java.awt.Color(0, 0, 0));
        btnFogo.setText("Fada do Fogo");
        btnFogo.setActionCommand("");
        btnFogo.setBorder(null);
        btnFogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFogoActionPerformed(evt);
            }
        });

        btnAgua.setBackground(new java.awt.Color(51, 153, 255));
        btnAgua.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnAgua.setForeground(new java.awt.Color(0, 0, 0));
        btnAgua.setText("Fada da Água");
        btnAgua.setActionCommand("");
        btnAgua.setBorder(null);
        btnAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAguaActionPerformed(evt);
            }
        });

        btnEnergia.setBackground(new java.awt.Color(51, 153, 255));
        btnEnergia.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnEnergia.setForeground(new java.awt.Color(0, 0, 0));
        btnEnergia.setText("Fada da Energia");
        btnEnergia.setActionCommand("");
        btnEnergia.setBorder(null);
        btnEnergia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnergiaActionPerformed(evt);
            }
        });

        btnMago.setBackground(new java.awt.Color(51, 153, 255));
        btnMago.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnMago.setForeground(new java.awt.Color(0, 0, 0));
        btnMago.setText("Mago");
        btnMago.setActionCommand("");
        btnMago.setBorder(null);
        btnMago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagoActionPerformed(evt);
            }
        });

        btnNinja.setBackground(new java.awt.Color(51, 153, 255));
        btnNinja.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnNinja.setForeground(new java.awt.Color(0, 0, 0));
        btnNinja.setText("Ninja");
        btnNinja.setActionCommand("");
        btnNinja.setBorder(null);
        btnNinja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNinja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNinjaActionPerformed(evt);
            }
        });

        btnArqueiro.setBackground(new java.awt.Color(51, 153, 255));
        btnArqueiro.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnArqueiro.setForeground(new java.awt.Color(0, 0, 0));
        btnArqueiro.setText("Arqueiro");
        btnArqueiro.setActionCommand("");
        btnArqueiro.setBorder(null);
        btnArqueiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqueiroActionPerformed(evt);
            }
        });

        btnEspadachim.setBackground(new java.awt.Color(51, 153, 255));
        btnEspadachim.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        btnEspadachim.setForeground(new java.awt.Color(0, 0, 0));
        btnEspadachim.setText("Espadachim");
        btnEspadachim.setActionCommand("");
        btnEspadachim.setBorder(null);
        btnEspadachim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEspadachim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspadachimActionPerformed(evt);
            }
        });

        lblSelecao.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lblSelecao.setForeground(new java.awt.Color(0, 0, 0));
        lblSelecao.setText("SELEÇÃO");
        lblSelecao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblFadas.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        lblFadas.setForeground(new java.awt.Color(0, 0, 0));
        lblFadas.setText("FADAS");
        lblFadas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblHumanos.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        lblHumanos.setForeground(new java.awt.Color(0, 0, 0));
        lblHumanos.setText("HUMANOS");
        lblHumanos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnJogar.setBackground(new java.awt.Color(51, 153, 255));
        btnJogar.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(0, 0, 0));
        btnJogar.setText("JOGAR");
        btnJogar.setActionCommand("");
        btnJogar.setBorder(null);
        btnJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        lblDe.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lblDe.setForeground(new java.awt.Color(0, 0, 0));
        lblDe.setText("DE");
        lblDe.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblPersonagens.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lblPersonagens.setForeground(new java.awt.Color(0, 0, 0));
        lblPersonagens.setText("PERSONAGENS");
        lblPersonagens.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout pnlSelecaoLayout = new javax.swing.GroupLayout(pnlSelecao);
        pnlSelecao.setLayout(pnlSelecaoLayout);
        pnlSelecaoLayout.setHorizontalGroup(
            pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecaoLayout.createSequentialGroup()
                .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnJogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNinja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnArqueiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEspadachim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelecaoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblHumanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))))
                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblDe))
                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblSelecao))
                    .addGroup(pnlSelecaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSelecaoLayout.createSequentialGroup()
                                .addComponent(lblPersonagens)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnLuz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnergia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlSelecaoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblFadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)))))
                .addContainerGap())
        );
        pnlSelecaoLayout.setVerticalGroup(
            pnlSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDe, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFadas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(btnLuz, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFogo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgua, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHumanos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(btnMago, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNinja, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArqueiro, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEspadachim, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnJogar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlJogador2.setBackground(new java.awt.Color(153, 204, 255));
        pnlJogador2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 153, 255)));

        lblJogador2.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        lblJogador2.setForeground(new java.awt.Color(0, 0, 0));
        lblJogador2.setText("Jogador 2:");

        txtClasse2.setEditable(false);
        txtClasse2.setBackground(new java.awt.Color(51, 153, 255));
        txtClasse2.setForeground(new java.awt.Color(0, 0, 0));
        txtClasse2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClasse2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblHP2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        lblHP2.setForeground(new java.awt.Color(0, 0, 0));
        lblHP2.setText("HP:");

        txtHP2.setEditable(false);
        txtHP2.setBackground(new java.awt.Color(51, 153, 255));
        txtHP2.setForeground(new java.awt.Color(0, 0, 0));
        txtHP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHP2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnAtacar2.setBackground(new java.awt.Color(51, 153, 255));
        btnAtacar2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnAtacar2.setForeground(new java.awt.Color(0, 0, 0));
        btnAtacar2.setText("ATACAR");
        btnAtacar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacar2ActionPerformed(evt);
            }
        });

        btnCurar2.setBackground(new java.awt.Color(51, 153, 255));
        btnCurar2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnCurar2.setForeground(new java.awt.Color(0, 0, 0));
        btnCurar2.setText("CURAR");
        btnCurar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlJogador2Layout = new javax.swing.GroupLayout(pnlJogador2);
        pnlJogador2.setLayout(pnlJogador2Layout);
        pnlJogador2Layout.setHorizontalGroup(
            pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJogador2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlJogador2Layout.createSequentialGroup()
                        .addGroup(pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJogador2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHP2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHP2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(pnlJogador2Layout.createSequentialGroup()
                        .addComponent(btnAtacar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCurar2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlJogador2Layout.setVerticalGroup(
            pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJogador2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJogador2)
                    .addComponent(txtClasse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHP2)
                    .addComponent(txtHP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlBatalha.setBackground(new java.awt.Color(153, 204, 255));
        pnlBatalha.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 153, 255)));

        lblBatalha.setBackground(new java.awt.Color(0, 0, 0));
        lblBatalha.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lblBatalha.setForeground(new java.awt.Color(0, 0, 0));
        lblBatalha.setText("BATALHA");
        lblBatalha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPrincipal.setEditable(false);
        txtPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        txtPrincipal.setColumns(20);
        txtPrincipal.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtPrincipal.setRows(5);
        txtPrincipal.setAlignmentX(2.0F);
        txtPrincipal.setAlignmentY(2.0F);
        txtPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 153, 255)));
        txtPrincipal.setCaretColor(new java.awt.Color(153, 153, 153));
        txtPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrincipal.setSelectionColor(new java.awt.Color(255, 0, 102));
        jScrollPane1.setViewportView(txtPrincipal);

        javax.swing.GroupLayout pnlBatalhaLayout = new javax.swing.GroupLayout(pnlBatalha);
        pnlBatalha.setLayout(pnlBatalhaLayout);
        pnlBatalhaLayout.setHorizontalGroup(
            pnlBatalhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatalhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlBatalhaLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblBatalha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBatalhaLayout.setVerticalGroup(
            pnlBatalhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatalhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBatalha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pnlJogador1.setBackground(new java.awt.Color(153, 204, 255));
        pnlJogador1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 153, 255)));

        btnCurar1.setBackground(new java.awt.Color(51, 153, 255));
        btnCurar1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnCurar1.setForeground(new java.awt.Color(0, 0, 0));
        btnCurar1.setText("CURAR");
        btnCurar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurar1ActionPerformed(evt);
            }
        });

        btnAtacar1.setBackground(new java.awt.Color(51, 153, 255));
        btnAtacar1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnAtacar1.setForeground(new java.awt.Color(0, 0, 0));
        btnAtacar1.setText("ATACAR");
        btnAtacar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacar1ActionPerformed(evt);
            }
        });
        btnAtacar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAtacar1KeyPressed(evt);
            }
        });

        txtHP1.setEditable(false);
        txtHP1.setBackground(new java.awt.Color(51, 153, 255));
        txtHP1.setForeground(new java.awt.Color(0, 0, 0));
        txtHP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHP1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblHP1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        lblHP1.setForeground(new java.awt.Color(0, 0, 0));
        lblHP1.setText("HP:");

        txtClasse1.setEditable(false);
        txtClasse1.setBackground(new java.awt.Color(51, 153, 255));
        txtClasse1.setForeground(new java.awt.Color(0, 0, 0));
        txtClasse1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClasse1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblJogador1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        lblJogador1.setForeground(new java.awt.Color(0, 0, 0));
        lblJogador1.setText("Jogador 1:");

        javax.swing.GroupLayout pnlJogador1Layout = new javax.swing.GroupLayout(pnlJogador1);
        pnlJogador1.setLayout(pnlJogador1Layout);
        pnlJogador1Layout.setHorizontalGroup(
            pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJogador1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJogador1)
                    .addComponent(lblHP1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHP1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(pnlJogador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtacar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCurar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlJogador1Layout.setVerticalGroup(
            pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJogador1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJogador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHP1)
                    .addComponent(txtHP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBatalha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBatalha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuzActionPerformed
        click();
        luz();
        desativarFadas();
    }//GEN-LAST:event_btnLuzActionPerformed

    private void btnFogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFogoActionPerformed
        click();
        fogo();
        desativarFadas();
    }//GEN-LAST:event_btnFogoActionPerformed

    private void btnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAguaActionPerformed
        click();
        agua();
        desativarFadas();
    }//GEN-LAST:event_btnAguaActionPerformed

    private void btnEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnergiaActionPerformed
        click();
        energia();
        desativarFadas();
    }//GEN-LAST:event_btnEnergiaActionPerformed

    private void btnMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagoActionPerformed
        click();
        mago();
        desativarHumanos();
    }//GEN-LAST:event_btnMagoActionPerformed

    private void btnNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNinjaActionPerformed
        click();
        ninja();
        desativarHumanos();
    }//GEN-LAST:event_btnNinjaActionPerformed

    private void btnArqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqueiroActionPerformed
        click();
        arqueiro();
        desativarHumanos();
    }//GEN-LAST:event_btnArqueiroActionPerformed

    private void btnEspadachimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspadachimActionPerformed
        click();
        espadachim();
        desativarHumanos();
    }//GEN-LAST:event_btnEspadachimActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        ativarJ1();
        txtClasse1.setText(j1.getClasse());
        txtClasse2.setText(j2.getClasse());
        txtHP1.setText(Integer.toString(j1.getVida()));
        txtHP2.setText(Integer.toString(j2.getVida()));
        btnJogar.setEnabled(false);
        barrinha();
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnAtacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacar2ActionPerformed
        j2.atacar(j1);
        atualizarAtaque(j2);
        desativarJ2();
        ativarJ1();
        atualizarHP();
        barrinha();
        if (j1.getVida() <= 0) {
            new VitoriaJogador2().setVisible(true);
        }
    }//GEN-LAST:event_btnAtacar2ActionPerformed

    private void btnCurar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurar2ActionPerformed
        j2.curar();
        atualizarCura(j2);
        desativarJ2();
        ativarJ1();
        atualizarHP();
        barrinha();
    }//GEN-LAST:event_btnCurar2ActionPerformed

    private void btnAtacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacar1ActionPerformed
        j1.atacar(j2);
        atualizarAtaque(j1);
        desativarJ1();
        ativarJ2();
        atualizarHP();
        if (j2.getVida() <= 0) {
            new VitoriaJogador1().setVisible(true);
        }
    }//GEN-LAST:event_btnAtacar1ActionPerformed

    private void btnCurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurar1ActionPerformed
        j1.curar();
        atualizarCura(j1);
        desativarJ1();
        ativarJ2();
        atualizarHP();
    }//GEN-LAST:event_btnCurar1ActionPerformed

    private void btnAtacar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAtacar1KeyPressed

    }//GEN-LAST:event_btnAtacar1KeyPressed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    Personagens j1;
    Personagens j2;

    private int clicar;
    private int click;

    private void desativarHumanos() {
        btnMago.setEnabled(false);
        btnNinja.setEnabled(false);
        btnArqueiro.setEnabled(false);
        btnEspadachim.setEnabled(false);
    }

    private void desativarFadas() {
        btnLuz.setEnabled(false);
        btnAgua.setEnabled(false);
        btnFogo.setEnabled(false);
        btnEnergia.setEnabled(false);
    }

    private void desativarJ1() {
        btnAtacar1.setEnabled(false);
        btnCurar1.setEnabled(false);
    }

    private void desativarJ2() {
        btnAtacar2.setEnabled(false);
        btnCurar2.setEnabled(false);
    }

    private void ativarJ1() {
        btnAtacar1.setEnabled(true);
        btnCurar1.setEnabled(true);
    }

    private void ativarJ2() {
        btnAtacar2.setEnabled(true);
        btnCurar2.setEnabled(true);
    }

    private void barrinha() {
        textoPrincipal("=========================================\n");
    }

    private void textoPrincipal(String textPrincipal) {
        txtPrincipal.setText(txtPrincipal.getText() + (textPrincipal));
    }

    private void txtJogador1(Personagens x) {
        textoPrincipal("O jogador 1 escolheu ser: " + x.getClasse() + "\n");
    }

    private void txtJogador2(Personagens x) {
        textoPrincipal("O jogador 2 escolheu ser: " + x.getClasse() + "\n");
    }

    private void click() {
        clicar = clicar + 1;

        if (clicar % 2 == 1) {
            click = 1;       //ímpar = player 1 turn
        } else if (clicar % 2 == 0) {
            click = 2;      //par = player 2 turn
        }
    }

    private void luz() {
        if (click == 1) {
            j1 = new Luz("Fada da Luz", 100, 100);
            j1.setJogador(1);
            txtJogador1(j1);
        } else {
            j2 = new Luz("Fada da Luz", 100, 100);
            j2.setJogador(1);
            txtJogador2(j2);
        }
    }

    private void fogo() {
        if (click == 1) {
            j1 = new Fogo("Fada do Fogo", 100, 100);
            j1.setJogador(2);
            txtJogador1(j1);
        } else {
            j2 = new Fogo("Fada do Fogo", 100, 100);
            j2.setJogador(2);
            txtJogador2(j2);
        }
    }

    private void agua() {
        if (click == 1) {
            j1 = new Agua("Fada da Água", 100, 100);
            j1.setJogador(1);
            txtJogador1(j1);
        } else {
            j2 = new Agua("Fada da Água", 100, 100);
            j2.setJogador(1);
            txtJogador2(j2);
        }
    }

    private void energia() {
        if (click == 1) {
            j1 = new Energia("Fada da Energia", 100, 100);
            j1.setJogador(2);
            txtJogador1(j1);
        } else {
            j2 = new Energia("Fada da Energia", 100, 100);
            j2.setJogador(2);
            txtJogador2(j2);
        }
    }

    private void mago() {
        if (click == 1) {
            j1 = new Mago("Mago", 100, 125);
            j1.setJogador(3);
            txtJogador1(j1);
        } else {
            j2 = new Mago("Mago", 100, 125);
            j2.setJogador(3);
            txtJogador2(j2);
        }
    }

    private void ninja() {
        if (click == 1) {
            j1 = new Ninja("Ninja", 100, 125);
            j1.setJogador(4);
            txtJogador1(j1);
        } else {
            j2 = new Ninja("Ninja", 100, 125);
            j2.setJogador(4);
            txtJogador2(j2);
        }
    }

    private void arqueiro() {
        if (click == 1) {
            j1 = new Arqueiro("Arqueiro", 100, 125);
            j1.setJogador(3);
            txtJogador1(j1);
        } else {
            j2 = new Arqueiro("Arqueiro", 100, 125);
            j2.setJogador(3);
            txtJogador2(j2);
        }
    }

    private void espadachim() {
        if (click == 1) {
            j1 = new Espadachim("Espadachim", 100, 125);
            j1.setJogador(4);
            txtJogador1(j1);
        } else {
            j2 = new Espadachim("Espadachim", 100, 125);
            j2.setJogador(4);
            txtJogador2(j2);
        }
    }

    private void atualizarAtaque(Personagens x) {
        textoPrincipal(x.getClasse() + " deu " + x.getAtaque() + " de dano.\n");
    }
 
    private void atualizarCura(Personagens x) {
        textoPrincipal(x.getClasse() + " curou " + x.getCura() + " de vida.\n");
    }

    private void atualizarHP() {
        if (j1.getVida() <= 0) {
            txtHP1.setText("0");
        } else if (j1.getVida() >= j1.getVidaMax()) {
            txtHP1.setText(Integer.toString(j1.getVidaMax()));
        } else {
            txtHP1.setText(Integer.toString(j1.getVida()));
        }

        if (j2.getVida() <= 0) {
            txtHP2.setText("0");
        } else if (j2.getVida() >= j2.getVidaMax()) {
            txtHP2.setText(Integer.toString(j2.getVidaMax()));
        } else {
            txtHP2.setText(Integer.toString(j2.getVida()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgua;
    private javax.swing.JButton btnArqueiro;
    private javax.swing.JButton btnAtacar1;
    private javax.swing.JButton btnAtacar2;
    private javax.swing.JButton btnCurar1;
    private javax.swing.JButton btnCurar2;
    private javax.swing.JButton btnEnergia;
    private javax.swing.JButton btnEspadachim;
    private javax.swing.JButton btnFogo;
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnLuz;
    private javax.swing.JButton btnMago;
    private javax.swing.JButton btnNinja;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBatalha;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblFadas;
    private javax.swing.JLabel lblHP1;
    private javax.swing.JLabel lblHP2;
    private javax.swing.JLabel lblHumanos;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblPersonagens;
    private javax.swing.JLabel lblSelecao;
    private javax.swing.JPanel pnlBatalha;
    private javax.swing.JPanel pnlJogador1;
    private javax.swing.JPanel pnlJogador2;
    private javax.swing.JPanel pnlSelecao;
    private javax.swing.JTextField txtClasse1;
    private javax.swing.JTextField txtClasse2;
    private javax.swing.JTextField txtHP1;
    private javax.swing.JTextField txtHP2;
    private javax.swing.JTextArea txtPrincipal;
    // End of variables declaration//GEN-END:variables
}
