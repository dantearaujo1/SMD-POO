# SMD-POO
Super Mascotes Digitais - Pets Otimistas e Otimizados

Um simulador simples de Tamagotchi no console.

Repositório no github: [Recursão? rsrs](
https://github.com/dantearaujo1/SMD-POO)

## Equipe

A equipe é composta por:

**Dante de Araújo Clementino** - 509015

**Jaycee Loueny Felix Camara** - 472360

**Mirailton Mota Costa Filho** - 521325

## Como usar

Para uma melhor visualização recomenda-se usar um terminal que interprete
ANSI ESCAPE CODES


### Primeira forma, compilando os arquivos no prompt

```bash

git clone https://github.com/dantearaujo1/SMD-POO.git
cd SMD-POO
javac -d bin SMD-POO/AppPackage/*.java SMD-POO/AppPackage/states/*.java
java -cp bin AppPackage.App

# Seja feliz jogando

```

### Segunda forma, criando e rodando o jar no prompt

```bash

git clone https://github.com/dantearaujo1/SMD-POO.git
cd SMD-POO
javac -d bin SMD-POO/AppPackage/*.java SMD-POO/AppPackage/states/*.java

cd bin
jar cfe SMD-POO.jar AppPackage.App AppPackage/*.class AppPackage/states/*.class
java -jar SMD-POO.jar

# Seja feliz jogando

```

### Terceira forma forma, rodando o jar

```bash

git clone https://github.com/dantearaujo1/SMD-POO.git
cd SMD-POO
java -jar SMD-POO.jar

# Seja feliz jogando

```

### Quarta forma, eclipse (PAINLESS)

**PS: Essa forma não é recomendada pelos profissionais de TI, pois o terminal
do eclipse apenas recebe o stdout de um console então não é capaz de interpretar
ANSI ESCAPE CODES a não ser que vc tenha algum plugin para isso**

Abra um projeto no eclipse
Abra a pasta SMD-POO
Abra o pacote AppPackage
Clique com o botão direito em App.java
Coloque o mouse sobre Run As
Selecione Java Application no menu lateral que aparecer.

Após fazer isso uma vez, se quiser repetir, basta apertar CTRL+F11
e aperte em Run ou CTRL+F11

