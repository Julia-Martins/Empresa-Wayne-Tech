package ciclo.de.desenvolvimento;

import javax.swing.JOptionPane;

public class Menu_Pessoal extends javax.swing.JFrame {

    public Menu_Pessoal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Campor_Bairro = new javax.swing.JTextField();
        Campo_Nome = new javax.swing.JTextField();
        Campo_RG = new javax.swing.JTextField();
        Campo_Cidade = new javax.swing.JTextField();
        Campo_CPF = new javax.swing.JTextField();
        Campo_Endereco = new javax.swing.JTextField();
        Campo_CEP = new javax.swing.JTextField();
        Campo_Estado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Campo_Email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Campo_DDD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Campo_Telefone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Campo_CodigoFuncionario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Campo_Admin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Botao_Entrada = new javax.swing.JButton();
        Botao_Voltar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Campor_Bairro.setBackground(new java.awt.Color(51, 51, 51));
        Campor_Bairro.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campor_Bairro.setForeground(new java.awt.Color(255, 255, 0));
        Campor_Bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campor_BairroActionPerformed(evt);
            }
        });
        getContentPane().add(Campor_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 100, -1));

        Campo_Nome.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Nome.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Nome.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, -1));

        Campo_RG.setBackground(new java.awt.Color(51, 51, 51));
        Campo_RG.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_RG.setForeground(new java.awt.Color(255, 255, 0));
        Campo_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_RGActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 100, -1));

        Campo_Cidade.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Cidade.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Cidade.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_CidadeActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, -1));

        Campo_CPF.setBackground(new java.awt.Color(51, 51, 51));
        Campo_CPF.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_CPF.setForeground(new java.awt.Color(255, 255, 0));
        Campo_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_CPFActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, -1));

        Campo_Endereco.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Endereco.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Endereco.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_EnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, -1));

        Campo_CEP.setBackground(new java.awt.Color(51, 51, 51));
        Campo_CEP.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_CEP.setForeground(new java.awt.Color(255, 255, 0));
        Campo_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_CEPActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 100, -1));

        Campo_Estado.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Estado.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Estado.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_EstadoActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 100, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome do Funcionário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bairro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cidade");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CEP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informações Pessoais");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 31));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Localização");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 155, 37));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contato");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, 29));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        Campo_Email.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Email.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Email.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 100, -1));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DDD");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        Campo_DDD.setBackground(new java.awt.Color(51, 51, 51));
        Campo_DDD.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_DDD.setForeground(new java.awt.Color(255, 255, 0));
        Campo_DDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_DDDActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_DDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 40, -1));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Telefone");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        Campo_Telefone.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Telefone.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Telefone.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_TelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 100, -1));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Código de Funcionário");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        Campo_CodigoFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        Campo_CodigoFuncionario.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_CodigoFuncionario.setForeground(new java.awt.Color(255, 255, 0));
        Campo_CodigoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_CodigoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_CodigoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, -1));

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Código Admin");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        Campo_Admin.setBackground(new java.awt.Color(51, 51, 51));
        Campo_Admin.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Campo_Admin.setForeground(new java.awt.Color(255, 255, 0));
        Campo_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 70, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botao_Entrada.setBackground(new java.awt.Color(51, 51, 51));
        Botao_Entrada.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Botao_Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Botao_Entrada.setText("Entrar");
        Botao_Entrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Botao_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_EntradaActionPerformed(evt);
            }
        });
        jPanel1.add(Botao_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 100, 50));

        Botao_Voltar.setBackground(new java.awt.Color(51, 51, 51));
        Botao_Voltar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Botao_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Botao_Voltar.setText("Voltar");
        Botao_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(Botao_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 110, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciclo/de/desenvolvimento/Wayne_Logo_W.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 410, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 720, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_NomeActionPerformed
        Funcionario nome = new Funcionario();
        nome.getNome();
    }//GEN-LAST:event_Campo_NomeActionPerformed

    private void Campo_RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_RGActionPerformed
        Funcionario rg = new Funcionario();
        rg.getRg();
    }//GEN-LAST:event_Campo_RGActionPerformed

    private void Campo_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_CPFActionPerformed
        Funcionario cpf = new Funcionario();
        cpf.getCpf();
    }//GEN-LAST:event_Campo_CPFActionPerformed

    private void Campo_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_CEPActionPerformed
        Funcionario cep = new Funcionario();
        cep.getCep();
    }//GEN-LAST:event_Campo_CEPActionPerformed

    private void Campo_CodigoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_CodigoFuncionarioActionPerformed
        Funcionario codigo = new Funcionario();
        codigo.GetIdFuncionario();
    }//GEN-LAST:event_Campo_CodigoFuncionarioActionPerformed

    private void Campo_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_AdminActionPerformed
        Funcionario admin = new Funcionario();
        admin.isAdmin();
    }//GEN-LAST:event_Campo_AdminActionPerformed

    private void Campo_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_EnderecoActionPerformed
        Funcionario endereco = new Funcionario();
        endereco.getEndereco();
    }//GEN-LAST:event_Campo_EnderecoActionPerformed

    private void Campor_BairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campor_BairroActionPerformed
        Funcionario bairro = new Funcionario();
        bairro.getBairro();
    }//GEN-LAST:event_Campor_BairroActionPerformed

    private void Campo_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_CidadeActionPerformed
        Funcionario cidade = new Funcionario();
        cidade.getCidade();
    }//GEN-LAST:event_Campo_CidadeActionPerformed

    private void Campo_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_EstadoActionPerformed
        Funcionario estado = new Funcionario();
        estado.getEstado();
    }//GEN-LAST:event_Campo_EstadoActionPerformed

    private void Campo_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_EmailActionPerformed
        Funcionario email = new Funcionario();
        email.getEmail();
    }//GEN-LAST:event_Campo_EmailActionPerformed

    private void Campo_DDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_DDDActionPerformed
        Funcionario ddd = new Funcionario();
        ddd.getDdd();
    }//GEN-LAST:event_Campo_DDDActionPerformed

    private void Campo_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_TelefoneActionPerformed
        Funcionario telefone = new Funcionario();
        telefone.getTelefone();
    }//GEN-LAST:event_Campo_TelefoneActionPerformed

    private void Botao_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_EntradaActionPerformed
        Funcionario nome = new Funcionario();
        nome.setNome(Campo_Nome.getText());

        Funcionario rg = new Funcionario();
        rg.setRg(Integer.parseInt(Campo_RG.getText()));

        Funcionario cpf = new Funcionario();
        cpf.setCpf(Integer.parseInt(Campo_CPF.getText()));

        Funcionario codigo = new Funcionario();
        codigo.setId_funcionario(Integer.parseInt(Campo_CodigoFuncionario.getText()));

        Funcionario admin = new Funcionario();
        admin.setAdmin(Integer.parseInt(Campo_Admin.getText()));

        Funcionario endereco = new Funcionario();
        endereco.setEndereco(Campo_Endereco.getText());

        Funcionario bairro = new Funcionario();
        bairro.setBairro(Campor_Bairro.getText());

        Funcionario cep = new Funcionario();
        cep.setCep(Campo_CEP.getText());

        Funcionario cidade = new Funcionario();
        cidade.setCidade(Campo_Cidade.getText());

        Funcionario estado = new Funcionario();
        estado.setEstado(Campo_Estado.getText());

        Funcionario email = new Funcionario();
        email.setEmail(Campo_Email.getText());

        Funcionario ddd = new Funcionario();
        ddd.setDdd(Integer.parseInt(Campo_DDD.getText()));

        Funcionario telefone = new Funcionario();
        telefone.setTelefone(Integer.parseInt(Campo_Telefone.getText()));

        if (!"Bruce Wayne".equals(nome.getNome()) && !"BruceWayne".equals(nome.getNome()) && 
            !"bruce wayne".equals(nome.getNome()) && !"brucewayne".equals(nome.getNome()) && 
            !"Alfred".equals(nome.getNome()) && !"alfred".equals(nome.getNome()) &&
            !"Dick Grandson".equals(nome.getNome()) && !"dick grandson".equals(nome.getNome()) && 
            !"DickGrandson".equals(nome.getNome()) && !"dickgrandson".equals(nome.getNome())) {

            JOptionPane.showMessageDialog(null, "Nome Inválido");

        } else if (!"90897867".equals(String.valueOf(rg.getRg())) && 
                   !"21324354".equals(String.valueOf(rg.getRg())) && 
                   !"87654321".equals(String.valueOf(rg.getRg()))) {

            JOptionPane.showMessageDialog(null, "Rg Inválido");

        } else if (!"76655443".equals(String.valueOf(cpf.getCpf())) && 
                   !"23344556".equals(String.valueOf(cpf.getCpf())) && 
                   !"89786754".equals(String.valueOf(cpf.getCpf()))) {

            JOptionPane.showMessageDialog(null, "Cpf Inválido");

        }else if (!"210".equals(String.valueOf(codigo.GetIdFuncionario())) && 
                   !"810".equals(String.valueOf(codigo.GetIdFuncionario())) && 
                   !"720".equals(String.valueOf(codigo.GetIdFuncionario()))) {

            JOptionPane.showMessageDialog(null, "Código Funcionário Inválido");
            
        }else if(!"217281".equals(String.valueOf(admin.isAdmin())) &&
                 !"219261".equals(String.valueOf(admin.isAdmin())) &&
                 !"215241".equals(String.valueOf(admin.isAdmin()))){
            
        }else if(!"Rua Batman o Cavaleiro das Trevas número 2172".equals(endereco.getEndereco()) &&
                 !"rua batman o cavaleiro das trevas numero 2172".equals(endereco.getEndereco()) && 
                 !"rua batman o cavaleiro das trevas número 2172".equals(endereco.getEndereco()) && 
                 !"RuaBatmanoCavaleirodasTrevasnúmero2172".equals(endereco.getEndereco()) &&
                 !"RuaBatmanoCavaleirodasTrevasnumero2172".equals(endereco.getEndereco()) && 
                 !"ruabatmanocavaleirodastrevasnúmero2172".equals(endereco.getEndereco()) && 
                 !"ruabatmanocavaleirodastrevasnumero2172".equals(endereco.getEndereco())){
            
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            
        }else if(!"Gotham Village".equals(bairro.getBairro()) &&
                 !"gotham village".equals(bairro.getBairro()) &&
                 !"Gotham village".equals(bairro.getBairro()) &&
                 !"gotham Village".equals(bairro.getBairro()) &&
                 !"GothamVillage".equals(bairro.getBairro()) &&
                 !"gothamvillage".equals(bairro.getBairro()) &&
                 !"Gothamvillage".equals(bairro.getBairro()) &&
                 !"gothamvillage".equals(bairro.getBairro())){
        
                    JOptionPane.showMessageDialog(null, "Bairro Inválido");
            
        }else if(!"2172".equals(cep.getCep())){
            
            JOptionPane.showMessageDialog(null, "CEP Inválido");
            
        }else if(!"Gotham City".equals(cidade.getCidade()) && !"GothamCity".equals(cidade.getCidade()) && 
                 !"gotham city".equals(cidade.getCidade()) && !"gotham City".equals(cidade.getCidade()) &&
                 !"Gotham city".equals(cidade.getCidade()) && !"gothamcity".equals(cidade.getCidade()) && 
                 !"gothamCity".equals(cidade.getCidade()) && !"Gothamcity".equals(cidade.getCidade())){
            
            JOptionPane.showMessageDialog(null, "Cidade Inválido");
            
        }else if(!"New Jersey".equals(estado.getEstado()) && !"New jersey".equals(estado.getEstado()) && 
                 !"new Jersey".equals(estado.getEstado()) && !"new jersey".equals(estado.getEstado()) &&
                 !"NewJersey".equals(estado.getEstado()) && !"Newjersey".equals(estado.getEstado()) &&
                 !"newJersey".equals(estado.getEstado()) && !"newjersey".equals(estado.getEstado())){
            
            JOptionPane.showMessageDialog(null, "Estado Inválido");
            
        }else if(!"brucewayne@gmail.com".equals(email.getEmail()) &&
                 !"alfredmordomo@gamil.com".equals(email.getEmail()) &&
                 !"dickgrandson@gmail.com".equals(email.getEmail())){
            
            JOptionPane.showMessageDialog(null, "Email inválido");
            
        }else if(!"12".equals(String.valueOf(ddd.getDdd())) &&
                 !"32".equals(String.valueOf(ddd.getDdd())) &&
                 !"42".equals(String.valueOf(ddd.getDdd()))){
            
            JOptionPane.showMessageDialog(null, "DDD Inválido");
            
        }else if(!"21321223".equals(String.valueOf(telefone.getTelefone())) &&
                 !"92837465".equals(String.valueOf(telefone.getTelefone())) &&
                 !"10293847".equals(String.valueOf(telefone.getTelefone()))){
            
            JOptionPane.showMessageDialog(null, "Telefone Inválido");
            
        }else {
            if ("Bruce Wayne".equals(nome.getNome()) 
                && "BruceWayne".equals(nome.getNome())
                && "bruce wayne".equals(nome.getNome()) 
                && "brucewayne".equals(nome.getNome())
                || "90897867".equals(String.valueOf(rg.getRg())) 
                || "76655443".equals(String.valueOf(cpf.getCpf()))
                || "210".equals(String.valueOf(codigo.GetIdFuncionario())) 
                || "217281".equals(String.valueOf(admin.isAdmin()))
                || "brucewayne@gmail.com".equals(email.getEmail())
                || "12".equals(String.valueOf(ddd.getDdd()))
                || "21321223".equals(String.valueOf(telefone.getTelefone()))){
                
                JOptionPane.showMessageDialog(null, "Bem Vindo a Wayne Tech, senhor " + nome.getNome());
                
            }else if("Alfred".equals(nome.getNome()) && "alfred".equals(nome.getNome()) || 
                     "21324354".equals(String.valueOf(rg.getRg())) || 
                     "23344556".equals(String.valueOf(cpf.getCpf())) ||
                     "810".equals(String.valueOf(codigo.GetIdFuncionario())) ||
                     "219261".equals(String.valueOf(admin.isAdmin())) ||
                     "alfredmordomo@gamil.com".equals(email.getEmail()) ||
                     "32".equals(String.valueOf(ddd.getDdd())) ||
                     "92837465".equals(String.valueOf(telefone.getTelefone()))){
                
                JOptionPane.showMessageDialog(null, "Bem Vindo a Wayne Tech, senhor " + nome.getNome());
                
            }else if("Dick Grandson".equals(nome.getNome()) && "dick grandson".equals(nome.getNome()) && 
                     "DickGrandson".equals(nome.getNome()) && "dickgrandson".equals(nome.getNome()) ||
                     "87654321".equals(String.valueOf(rg.getRg())) || 
                    "89786754".equals(String.valueOf(cpf.getCpf())) ||
                     "720".equals(String.valueOf(codigo.GetIdFuncionario())) || 
                     "215241".equals(String.valueOf(admin.isAdmin())) ||
                     "dickgrandson@gmail.com".equals(email.getEmail()) ||
                     "42".equals(String.valueOf(ddd.getDdd())) ||
                     "10293847".equals(String.valueOf(telefone.getTelefone()))){
                
                JOptionPane.showMessageDialog(null, "Bem Vindo a Wayne Tech senhor " + nome.getNome());
                dispose();
                
            }

        }
    }//GEN-LAST:event_Botao_EntradaActionPerformed

    private void Botao_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_VoltarActionPerformed
        Menu_Principal menu = new Menu_Principal();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Pessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Pessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Pessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Pessoal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Pessoal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Entrada;
    private javax.swing.JButton Botao_Voltar;
    private javax.swing.JTextField Campo_Admin;
    private javax.swing.JTextField Campo_CEP;
    private javax.swing.JTextField Campo_CPF;
    private javax.swing.JTextField Campo_Cidade;
    private javax.swing.JTextField Campo_CodigoFuncionario;
    private javax.swing.JTextField Campo_DDD;
    private javax.swing.JTextField Campo_Email;
    private javax.swing.JTextField Campo_Endereco;
    private javax.swing.JTextField Campo_Estado;
    private javax.swing.JTextField Campo_Nome;
    private javax.swing.JTextField Campo_RG;
    private javax.swing.JTextField Campo_Telefone;
    private javax.swing.JTextField Campor_Bairro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
