<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<?php
		$n1 = $_GET["a"];
		$n2 = $_GET["b"];

		$tipo = $_GET["op"];

		echo "Os valores passados foram $n1 e $n2<br/>";
		echo "A operação escolhida foi $tipo<br/>";

		$r = ($tipo == "soma")? $n1 + $n2 : $n1 * $n2;
		echo "O resultado será $r<br/>";

		/*Exemplos entre igual e identico*/
		$a = 3;
		$b = "3";
		$r = $a == $b? "sim": "não";

		echo "As variáveis A e B são iguais? $r<br/>";
		echo "As variáveis A e B são identicas? " . ($a === $b? "sim" : "não") . "<br/>";
		$ano = $_GET["an"];
		$idade = 2018 - $ano;

		echo "Quem nasceu em $ano tem $idade anos.<br/>";

		$tipo = ($idade>=18 && $idade < 65) ? "Obrigatório" : "Não obrigatório<br/>";

		echo "E dessa forma seu voto é $tipo";

	?>
</body>
</html>