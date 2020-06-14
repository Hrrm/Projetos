using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Software.BD
{
    class Autenticacao: Conexao
    {
        
        public static bool logar(string usuario, string senha)
        {
            SqlConnection con = abrirConexao();
            SqlCommand cmd = new SqlCommand("SELECT * FROM USUARIO WHERE USUARIO=@usuario and SENHA=@senha", con);
            try
            {
                cmd.Parameters.Add("@usuario", SqlDbType.VarChar, 20).Value = usuario;
                cmd.Parameters.Add("@senha", SqlDbType.VarChar, 20).Value = senha;
                SqlDataReader leitor = cmd.ExecuteReader();
                if (leitor.HasRows)
                {
                    leitor.Close();
                    return true;
                }
                else
                {
                    leitor.Close();
                    return false;
                }
            }
            catch(Exception erro)
            {
                MessageBox.Show(erro.Message,"Atenção",MessageBoxButtons.OK,MessageBoxIcon.Warning);
                return false;
            }
            finally
            {
                fecharConexao(con);
            }
        }
    }
}
