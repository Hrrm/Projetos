namespace Software
{
    partial class frmGestao
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmGestao));
            this.pnlGestao = new System.Windows.Forms.Panel();
            this.tbGestao = new System.Windows.Forms.TabControl();
            this.tbProduto = new System.Windows.Forms.TabPage();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.lblQt = new System.Windows.Forms.Label();
            this.lblPreco = new System.Windows.Forms.Label();
            this.lblNome = new System.Windows.Forms.Label();
            this.tbEstoque = new System.Windows.Forms.TabPage();
            this.tbAdministrador = new System.Windows.Forms.TabPage();
            this.lblEstoque = new System.Windows.Forms.Label();
            this.cbEstoque = new System.Windows.Forms.ComboBox();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.btnSairGestor = new System.Windows.Forms.Button();
            this.pnlGestao.SuspendLayout();
            this.tbGestao.SuspendLayout();
            this.tbProduto.SuspendLayout();
            this.SuspendLayout();
            // 
            // pnlGestao
            // 
            this.pnlGestao.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.pnlGestao.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("pnlGestao.BackgroundImage")));
            this.pnlGestao.Controls.Add(this.btnSairGestor);
            this.pnlGestao.Controls.Add(this.tbGestao);
            this.pnlGestao.Location = new System.Drawing.Point(2, 12);
            this.pnlGestao.Name = "pnlGestao";
            this.pnlGestao.Size = new System.Drawing.Size(428, 242);
            this.pnlGestao.TabIndex = 0;
            // 
            // tbGestao
            // 
            this.tbGestao.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.tbGestao.Controls.Add(this.tbProduto);
            this.tbGestao.Controls.Add(this.tbEstoque);
            this.tbGestao.Controls.Add(this.tbAdministrador);
            this.tbGestao.Location = new System.Drawing.Point(4, 32);
            this.tbGestao.Name = "tbGestao";
            this.tbGestao.SelectedIndex = 0;
            this.tbGestao.Size = new System.Drawing.Size(424, 207);
            this.tbGestao.TabIndex = 0;
            // 
            // tbProduto
            // 
            this.tbProduto.Controls.Add(this.cbEstoque);
            this.tbProduto.Controls.Add(this.lblEstoque);
            this.tbProduto.Controls.Add(this.textBox3);
            this.tbProduto.Controls.Add(this.textBox2);
            this.tbProduto.Controls.Add(this.textBox1);
            this.tbProduto.Controls.Add(this.lblQt);
            this.tbProduto.Controls.Add(this.lblPreco);
            this.tbProduto.Controls.Add(this.lblNome);
            this.tbProduto.Location = new System.Drawing.Point(4, 22);
            this.tbProduto.Name = "tbProduto";
            this.tbProduto.Padding = new System.Windows.Forms.Padding(3);
            this.tbProduto.Size = new System.Drawing.Size(416, 181);
            this.tbProduto.TabIndex = 0;
            this.tbProduto.Text = "Produtos";
            this.tbProduto.UseVisualStyleBackColor = true;
            // 
            // textBox3
            // 
            this.textBox3.Location = new System.Drawing.Point(15, 122);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(100, 20);
            this.textBox3.TabIndex = 4;
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(186, 41);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(100, 20);
            this.textBox2.TabIndex = 3;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(15, 41);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 20);
            this.textBox1.TabIndex = 1;
            // 
            // lblQt
            // 
            this.lblQt.AutoSize = true;
            this.lblQt.Location = new System.Drawing.Point(12, 106);
            this.lblQt.Name = "lblQt";
            this.lblQt.Size = new System.Drawing.Size(62, 13);
            this.lblQt.TabIndex = 2;
            this.lblQt.Text = "Quantidade";
            // 
            // lblPreco
            // 
            this.lblPreco.AutoSize = true;
            this.lblPreco.Location = new System.Drawing.Point(183, 25);
            this.lblPreco.Name = "lblPreco";
            this.lblPreco.Size = new System.Drawing.Size(35, 13);
            this.lblPreco.TabIndex = 1;
            this.lblPreco.Text = "Preço";
            // 
            // lblNome
            // 
            this.lblNome.AutoSize = true;
            this.lblNome.Location = new System.Drawing.Point(12, 25);
            this.lblNome.Name = "lblNome";
            this.lblNome.Size = new System.Drawing.Size(35, 13);
            this.lblNome.TabIndex = 0;
            this.lblNome.Text = "Nome";
            // 
            // tbEstoque
            // 
            this.tbEstoque.Location = new System.Drawing.Point(4, 22);
            this.tbEstoque.Name = "tbEstoque";
            this.tbEstoque.Padding = new System.Windows.Forms.Padding(3);
            this.tbEstoque.Size = new System.Drawing.Size(408, 258);
            this.tbEstoque.TabIndex = 1;
            this.tbEstoque.Text = "Estoque";
            this.tbEstoque.UseVisualStyleBackColor = true;
            // 
            // tbAdministrador
            // 
            this.tbAdministrador.Location = new System.Drawing.Point(4, 22);
            this.tbAdministrador.Name = "tbAdministrador";
            this.tbAdministrador.Padding = new System.Windows.Forms.Padding(3);
            this.tbAdministrador.Size = new System.Drawing.Size(408, 258);
            this.tbAdministrador.TabIndex = 2;
            this.tbAdministrador.Text = "Administrador";
            this.tbAdministrador.UseVisualStyleBackColor = true;
            // 
            // lblEstoque
            // 
            this.lblEstoque.AutoSize = true;
            this.lblEstoque.Location = new System.Drawing.Point(183, 106);
            this.lblEstoque.Name = "lblEstoque";
            this.lblEstoque.Size = new System.Drawing.Size(46, 13);
            this.lblEstoque.TabIndex = 5;
            this.lblEstoque.Text = "Estoque";
            // 
            // cbEstoque
            // 
            this.cbEstoque.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.cbEstoque.FormattingEnabled = true;
            this.cbEstoque.Location = new System.Drawing.Point(186, 122);
            this.cbEstoque.Name = "cbEstoque";
            this.cbEstoque.Size = new System.Drawing.Size(121, 21);
            this.cbEstoque.TabIndex = 6;
            // 
            // statusStrip1
            // 
            this.statusStrip1.Location = new System.Drawing.Point(0, 270);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(435, 22);
            this.statusStrip1.TabIndex = 1;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // btnSairGestor
            // 
            this.btnSairGestor.BackColor = System.Drawing.Color.Transparent;
            this.btnSairGestor.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnSairGestor.BackgroundImage")));
            this.btnSairGestor.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnSairGestor.FlatAppearance.BorderColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.btnSairGestor.FlatAppearance.BorderSize = 0;
            this.btnSairGestor.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnSairGestor.Location = new System.Drawing.Point(389, 3);
            this.btnSairGestor.Name = "btnSairGestor";
            this.btnSairGestor.Size = new System.Drawing.Size(32, 32);
            this.btnSairGestor.TabIndex = 2;
            this.btnSairGestor.UseVisualStyleBackColor = false;
            this.btnSairGestor.Click += new System.EventHandler(this.sairGestor);
            // 
            // frmGestao
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.ClientSize = new System.Drawing.Size(435, 292);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.pnlGestao);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.MaximizeBox = false;
            this.Name = "frmGestao";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "SGBD";
            this.pnlGestao.ResumeLayout(false);
            this.tbGestao.ResumeLayout(false);
            this.tbProduto.ResumeLayout(false);
            this.tbProduto.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel pnlGestao;
        private System.Windows.Forms.TabControl tbGestao;
        private System.Windows.Forms.TabPage tbProduto;
        private System.Windows.Forms.TabPage tbEstoque;
        private System.Windows.Forms.TabPage tbAdministrador;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label lblQt;
        private System.Windows.Forms.Label lblPreco;
        private System.Windows.Forms.Label lblNome;
        private System.Windows.Forms.ComboBox cbEstoque;
        private System.Windows.Forms.Label lblEstoque;
        private System.Windows.Forms.Button btnSairGestor;
        private System.Windows.Forms.StatusStrip statusStrip1;
    }
}