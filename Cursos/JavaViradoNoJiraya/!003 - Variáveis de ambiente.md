# Variáveis de Ambiente

Vamos usar o sistema Windows como exemplo. Após a instalação da JDK, teremos a capacidade de utilizar comandos como javac e java no CMD do Windows.

Mas por quê? É simples: podemos utilizar esses comandos porque instalamos a JDK, a qual nos permite utilizá-los. No entanto, 
a questão principal é que a JDK é essencialmente uma pasta que contém várias pastas e arquivos relacionados aos comandos mencionados. 
Nossa capacidade de utilizar seus comandos está ligada ao fato de que, ao utilizarmos o CMD, por exemplo, ele procura pela variável 
'java_home' nas variáveis de ambiente do windows, e esta variável aponta para o diretório onde a JDK está instalada.
