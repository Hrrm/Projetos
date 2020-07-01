using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Software.BD
{
    class Conexao
    {
        protected static SqlConnection abrirConexao()
        {
            SqlConnection con = new SqlConnection("Data Source=DESKTOP-MGMD69B;Initial Catalog=SOFTWARE;User Id=kuxoha;Password=123456");
            con.Open();

            return con;
        }
        protected static void fecharConexao(SqlConnection con)
        {
            con.Close();
        }

        public static void executeNonQuery(string query)
        {
            SqlConnection con = abrirConexao();
            SqlCommand cmd = new SqlCommand(query, con);
            cmd.ExecuteNonQuery();

            fecharConexao(con);
        }

        public static void listar(string query, ListBox lstBox)
        {
            SqlConnection con = abrirConexao();
            SqlCommand cmd = new SqlCommand(query, con);
            SqlDataReader leitor = cmd.ExecuteReader();

            while (leitor.Read())
            {
                lstBox.Items.Add(leitor["NOME"].ToString());
            }
            leitor.Close();
            fecharConexao(con);
        }
    }
}
