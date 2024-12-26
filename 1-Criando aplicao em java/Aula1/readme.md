#Eu aprendi na primeira aula:
--------------------------------
# Ambiente de Desenvolvimento Java ☕️

## Configurando o Ambiente de Desenvolvimento 🛠️

1. **Instalar a JDK 17**:
   - Baixe e instale a JDK 17 a partir do site oficial da Oracle ou do OpenJDK.

2. **Instalar a IDE IntelliJ**:
   - Baixe e instale o IntelliJ IDEA, uma das IDEs mais populares para desenvolvimento em Java.

## Diferenças entre JVM, JRE e JDK 🔍

- **JVM (Java Virtual Machine)** 🖥️:
  - É a Máquina Virtual do Java responsável por executar o bytecode. A JVM permite que o código Java seja executado em qualquer plataforma.

- **JRE (Java Runtime Environment)** 🌐:
  - Ambiente de Execução do Java que fornece as bibliotecas padrão do Java para o JDK compilar o seu código e para a JVM executar o seu programa.

- **JDK (Java Development Kit)** 📦:
  - Kit de Desenvolvimento Java responsável por compilar código-fonte em bytecode. O JDK inclui ferramentas como `javac`, que compila o código, e `java`, que executa o bytecode.

## Fazendo o “Alô Mundo!” no Java 👋

1. **Criar um novo projeto no IntelliJ**:
   - Abra o IntelliJ e crie um novo projeto Java.

2. **Criar a classe `HelloWorld`**:
   - Crie uma nova classe chamada `HelloWorld` e adicione o seguinte código:

   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Alô, Mundo!");
       }
   }