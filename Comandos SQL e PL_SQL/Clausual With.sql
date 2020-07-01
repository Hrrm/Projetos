Create Materialized View Mv_nome
Refresh Complete On Demand
Start With To_date('xx-xx-xxxx xx:xx:xx', 'dd-mm-rrrr hh24:mi:ss') Next Sysdate + 1
As
With
  --Henrique, xx/xx/xxxx
  --Comentários relevantes
  --Tab_temp_1 e seu objetivo
  Tab_nome_1 As (Select dado_1 As campo_1,
                        dado_2 As campo_2
                   From tab_nome
                  Where "filtro_1"
                    And "filtro_2"),
  --Tab_temp_2 e seu objetivo
  Tab_nome_2 As ((Select dado_1 As campo_1,
                        dado_2 As campo_2
                   From tab_nome
                  Where "filtro_1"
                    And "filtro_2")

  --Select final
  Select campo_1,
         campo_2,
         campo_x
    From tab_nome_1
   Inner Join tab_nome_2;
