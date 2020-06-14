using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Software
{
    public partial class frmGestao : Form
    {
        public frmGestao()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void sairGestor(object sender, EventArgs e)
        {
            //abre uma caixa de mensagem que fecha pergunta se deseja fechar o programa
            if (MessageBox.Show("Você realmente deseja sair?", "Atenção", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
