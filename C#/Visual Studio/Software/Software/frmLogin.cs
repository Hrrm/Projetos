using Software.BD;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Software
{
    public partial class frmLogin : Form
    {
        public frmLogin()
        {
            InitializeComponent();

            //Alinha os textBox na tela
            this.txtUsuario.Location = new System.Drawing.Point(this.ClientSize.Width / 2 - txtUsuario.Width / 2, this.ClientSize.Height/2 - txtUsuario.Height);
            this.txtSenha.Location = new System.Drawing.Point(this.ClientSize.Width / 2 - txtSenha.Width / 2, this.ClientSize.Height / 2 + txtSenha.Height/2);
        }


        //Event fecha o programa
        private void sair(object sender, EventArgs e)
        {
            //abre uma caixa de mensagem que fecha pergunta se deseja fechar o programa
            if (MessageBox.Show("Você realmente deseja sair?", "Atenção", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
            {
                Application.Exit();
            }
            
        }
 
        private void logar(object sender, EventArgs e)
        {
            //busca no bd pelo usuário e senha passado nos textBoxs, depois verifica se existe alguma
            //linha com essas infos, se true ele passa para a proxima tela
            /*
            try
            {
                if (Autenticacao.logar(txtUsuario.Text, txtSenha.Text))
                {
                    frmGestao telaGestor = new frmGestao();
                    telaGestor.Show();
                    this.Hide();
                }
            }
            catch(Exception erro)
            {
                MessageBox.Show(erro.Message, "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            */
            if(txtUsuario.Text == "kuxoha" && txtSenha.Text == "123456")
            {
                frmGestao telaGestor = new frmGestao();
                telaGestor.Show();
                this.Hide();
            }
        }
    }
}