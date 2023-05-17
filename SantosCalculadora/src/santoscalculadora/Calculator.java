/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package santoscalculadora;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author SNdzeko
 */
public class Calculator extends javax.swing.JFrame {
 Double valor1,valor2,resultado; String sinal;
 
 //auxiliares de navegacao
 int nextValor=0,previousValor=0;

 
SantosCalculadora operacao=new SantosCalculadora();
 ArrayList<Double> historico=new ArrayList<>();

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }
    
    
    
    //ULTIMO PRIMEIRO RESULTADO QUE APARECEU NA CALCULADORA.
    
    public void LastResult(){
        
        int x=historico.size();
        x=x-1;
        nextValor=x;
      previousValor=x;
        //String rsl;
        //rsl=String.valueOf(historico.get(x));
        try {
             txtPainel.setText(String.valueOf(historico.get(x).toString()));
        } catch (Exception e) {
            
        }
       
        
    }
    public void FirstResult(){
          int x=historico.size();
       x=(x-x)+1;
      nextValor=x;
      previousValor=x;
        
        //String rsl;
        //rsl=String.valueOf(historico.get(x));
        try{
            txtPainel.setText(String.valueOf(historico.get(0).toString()));
        }catch(Exception e){
            
            
        }
         
        
    }
    void proximoResult(){
        
       nextValor=nextValor+1;
       previousValor=nextValor;
       
       try{
            txtPainel.setText(String.valueOf(historico.get(nextValor).toString()));
        }catch(Exception e){
            
            
        }
        
    }
    
    void AnteriorResultado(){
        
        previousValor=previousValor-1;
        nextValor=previousValor;
       
       try{
            txtPainel.setText(String.valueOf(historico.get(previousValor).toString()));
        }catch(Exception e){
            
            
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

        txtPainel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPrimeiroResultado = new javax.swing.JButton();
        btnUltimoResultado = new javax.swing.JButton();
        btnAnteriorResultado = new javax.swing.JButton();
        btnProximoResultado = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnQuarto = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnIgualdade = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnVirgurla = new javax.swing.JButton();
        lblNotification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPainel.setEditable(false);
        txtPainel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPainel.setForeground(new java.awt.Color(51, 51, 51));
        txtPainel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPainelActionPerformed(evt);
            }
        });
        txtPainel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPainelKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA CIENTIFICA-SIMPLES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 251, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CALCULADORA SIMPLES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 6, 140, 30));

        btnPrimeiroResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/primeiro.png"))); // NOI18N
        btnPrimeiroResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroResultadoActionPerformed(evt);
            }
        });

        btnUltimoResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ultimo.png"))); // NOI18N
        btnUltimoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoResultadoActionPerformed(evt);
            }
        });

        btnAnteriorResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ANTERIOR.png"))); // NOI18N
        btnAnteriorResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorResultadoActionPerformed(evt);
            }
        });

        btnProximoResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/proximo.png"))); // NOI18N
        btnProximoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoResultadoActionPerformed(evt);
            }
        });

        btnAdicionar.setText("+");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnOito.setText("8");
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setText("9");
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btnCancelar.setText("CE");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSete.setText("7");
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnLimpar.setText("C");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnQuarto.setText("4");
        btnQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartoActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnDois.setText("2");
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnUm.setText("1");
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnIgualdade.setText("=");
        btnIgualdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualdadeActionPerformed(evt);
            }
        });

        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnVirgurla.setText(".");
        btnVirgurla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgurlaActionPerformed(evt);
            }
        });

        lblNotification.setForeground(new java.awt.Color(153, 153, 153));
        lblNotification.setText("By Santos Miranda ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVirgurla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIgualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnUltimoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnAnteriorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnProximoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnPrimeiroResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUltimoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnteriorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProximoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrimeiroResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNotification)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVirgurla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIgualdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorResultadoActionPerformed
        // TODO add your handling code here:
        
        AnteriorResultado();
    }//GEN-LAST:event_btnAnteriorResultadoActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
        
        txtPainel.setText(txtPainel.getText()+"0"); //ENVIANDO O VALOR PARA O PAINEL.
        
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        
        //1. pegar o valor anterior
        //PASSAR O VALOR PARA A VARIAVEL RESERVA.
        try{
            valor1=Double.parseDouble(txtPainel.getText());
            
        }catch(Exception e){
            lblNotification.setForeground(Color.red);
            lblNotification.setText("Sem valor para adicionar ...");
        }
        //2 limpar o painel de resultado
        txtPainel.setText(""); 
        sinal="soma";
        
           
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnIgualdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualdadeActionPerformed
        // TODO add your handling code here:
        
        //o valor2 , sera convertido e vai armazenar o resultado.
         
        
        
        
        
       
        
        try{
           valor2=Double.parseDouble(txtPainel.getText()); 
         
             operacao.setValor1(valor1);
             operacao.setValor2(valor2);
             operacao.setSinal(sinal);

              
              
        
        //VERIFICAR A OPERAÇÃO DESEJADA.
        
        if(sinal.equals("soma")){
            //txtPainel.setText(String.valueOf(valor1+valor2));
            
            operacao.somatorio(operacao.getValor1(), operacao.getValor2());
            
            txtPainel.setText(String.valueOf(operacao.getResultado()));
            
           // JOptionPane.showMessageDialog(null, String.valueOf(operacao.getResultado()));
           
            
        }
        if(sinal.equals("menos")){
           
            operacao.subtracao(operacao.getValor1(), operacao.getValor2());
            txtPainel.setText(String.valueOf(operacao.getResultado()));
        }
         if(sinal.equals("mult")){
           
             operacao.multiplicacao(operacao.getValor1(), operacao.getValor2());
             txtPainel.setText(String.valueOf(operacao.getResultado()));
        }
          if(sinal.equals("div")){
            
            
              
            if (valor2>0 && valor1>0){
              
               
                operacao.divisao(operacao.getValor1(), operacao.getValor2());
             txtPainel.setText(String.valueOf(operacao.getResultado()));
                
            }else{
                lblNotification.setText("Não pode dividir por zelo...");
            }
        }
          
          
          
          
           }catch(Exception e){
            
            txtPainel.setText(txtPainel.getText()+"");
        }
        
        //Armazenando resultados no Array List.
         historico.add(operacao.getResultado());
        //int tamanho= historico.size();
       // JOptionPane.showMessageDialog(null, "Tamanho do Resultado : "+tamanho);
        
        
        
    }//GEN-LAST:event_btnIgualdadeActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
     
        txtPainel.setText(txtPainel.getText()+"5");
        
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartoActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"4");
    }//GEN-LAST:event_btnQuartoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"9");
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        // TODO add your handling code here:
        txtPainel.setText(txtPainel.getText()+"2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        // TODO add your handling code here:
        
        try{
            valor1=Double.parseDouble(txtPainel.getText());
        }catch(Exception e){
            lblNotification.setForeground(Color.red);
            lblNotification.setText("Sem valor para subtrair...");
        }
        
        txtPainel.setText("");
        sinal="menos";        
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        
         try{
            valor1=Double.parseDouble(txtPainel.getText());
        }catch(Exception e){
            lblNotification.setForeground(Color.red);
            lblNotification.setText("Sem valor para mutiplicar...");
        }
        txtPainel.setText("");
        
        sinal="mult";
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
         try{
            valor1=Double.parseDouble(txtPainel.getText());
        }catch(Exception e){
            lblNotification.setForeground(Color.red);
            lblNotification.setText("Sem valor para divisão...");
        }
        //2 limpar o painel de resultado
        txtPainel.setText("");
        
        sinal="div";
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       txtPainel.setText("");
       historico.clear();
       
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:\
        txtPainel.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVirgurlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgurlaActionPerformed
        // TODO add your handling code here:
        
        
        txtPainel.setText(txtPainel.getText()+".");
        
        
    }//GEN-LAST:event_btnVirgurlaActionPerformed

    private void btnUltimoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoResultadoActionPerformed
        // TODO add your handling code here:
        
        //pegar o ultimo resultado da lista
        
       FirstResult();
        
        
    }//GEN-LAST:event_btnUltimoResultadoActionPerformed

    private void btnProximoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoResultadoActionPerformed
        // TODO add your handling code here:
        
        
        proximoResult();
        
    }//GEN-LAST:event_btnProximoResultadoActionPerformed

    private void btnPrimeiroResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroResultadoActionPerformed
      LastResult();
    }//GEN-LAST:event_btnPrimeiroResultadoActionPerformed

    private void txtPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPainelActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_txtPainelActionPerformed

    private void txtPainelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPainelKeyTyped
        // TODO add your handling code here:
        
        char c=evt.getKeyChar();
        
        if(!Character.isDigit(c)){  //SE O VALOR DIGITADO FOR IGUAL A UM CARACTER ENTAO :
            evt.consume();            // CONSUMIR O CARACTER, NAO EXIBINDO E NEM ARMAZENAR NA MEMORIA.
            
        }
    }//GEN-LAST:event_txtPainelKeyTyped

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnteriorResultado;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgualdade;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPrimeiroResultado;
    private javax.swing.JButton btnProximoResultado;
    private javax.swing.JButton btnQuarto;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUltimoResultado;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnVirgurla;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JTextField txtPainel;
    // End of variables declaration//GEN-END:variables
}
