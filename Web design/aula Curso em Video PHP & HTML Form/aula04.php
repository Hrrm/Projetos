<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<!--<link rel=stylesheet href="css/animatable.css">-->
</head>
<body>
	<?php
		/*PEGANDO VALORES DIGITADOS NA URL*/
		$n1 = $_GET["a"];
		$n2 = $_GET["b"];
		echo "O valor $n1 e o valor $n2 somados dá " . ($n1+$n2);
		/*funções aritméticas principais da linguagem php*/

		/*Exemplos*/
		$v1 = $_GET["a"];
		$v2 = $_GET["b"];
		echo "<br/><br/>Valores recebidos: $v1 e $v2";
		/*abs() pega o valor absoluto*/
		echo'<br/><br/> O valor absoluto de $v2 é ' . abs($v2);

		/*pow(variável 1, variável 2); pega o primeiro valor e eleva ao segundo valor*/
		echo "<br/><br/> O valor de $v1<sup>$v2</sup> é " . pow($v1, $v2);

		/*sqrt(variável); retorna a raiz quadrada de um número*/
		echo "<br/><br/> A raiz quadrada de $v1 é " . sqrt($v1);

		/*roud(); arredonda o valor de um número real para inteiro*/
		echo "<br/><br/> O valor arredondado de $v2 é " . round($v2) . "<br/>";

		/*referenciando valores, somente igualando, você joga o valor de uma variável na outra
		é necessário utilizar o & na frente da variável após o igual para dizer que você está
		referênciando aquele valor.*/
		$a=3;
		echo $a;
		echo "<br/>";
		$b=$a;
		echo $b;
		echo "<br/>";
		$b+=5;
		echo $a."<br/>".$b;
		echo "<br/>";
		$a=3;
		echo $a;
		echo "<br/>";
		$b=&$a;
		echo $b;
		echo "<br/>";
		$b+=5;
		echo $a."<br/>".$b;
		echo "<br/>";
		$a+=5;
		echo $a."<br/>".$b;
		echo "<br/>";
		$x = "abc";
		$$x = "def";
		echo $x;
		echo "<br/>";
		echo $abc;
		echo "<br/>";

		/*Operador ternário*/
		$maior = $a==(string)$b?"é igual": "é diferente";
		echo $maior . "<br/>";

		$maior = $a===(string)$b?"é identico": "não é identico";
		echo $maior;

	?> 
</body>
</html>