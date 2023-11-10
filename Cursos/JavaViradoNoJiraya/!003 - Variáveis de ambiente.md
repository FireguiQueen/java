# Variáveis de ambiente

Vamos usar o sistema Windows como exemplo. Após a instalação da JDK, teremos a capacidade de utilizar comandos como 
'javac' e 'java' no CMD do Windows.

Mas por quê? É simples: podemos utilizar esses comandos porque instalamos a JDK, a qual nos permite utilizá-los. No entanto, a questão principal é que a JDK é essencialmente uma pasta que contém várias subpastas e arquivos relacionados aos comandos mencionados. Nossa capacidade de utilizar esses comandos está ligada ao fato de que, ao utilizarmos o CMD, por exemplo, ele procura pela variável 'java_home' nas variáveis de ambiente do Windows, e esta variável aponta para o diretório onde a JDK está instalada.

Graças às variáveis de ambiente, somos capazes de executar comandos como javac em qualquer lugar do sistema. Podemos entrar no CMD e acessar um diretório onde contenha arquivos .PNG, e mesmo assim, seremos capazes de utilizar esses comandos.