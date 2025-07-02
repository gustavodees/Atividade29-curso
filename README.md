# Conversor de Temperatura Celsius para Fahrenheit

## Visão Geral

Este programa Java permite que o usuário digite uma temperatura em graus Celsius e a converte para graus Fahrenheit. O programa continuará solicitando temperaturas e realizando as conversões até que o usuário opte por não repetir o processo.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto e execute o seguinte comando para compilar o código Java:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o comando:
    ```bash
    java principal.Main
    ```
    O programa solicitará que você digite a temperatura em Celsius no console.

## Explicação do Código

O código Java realiza as seguintes ações:

* **Importa `java.util.Scanner`:** Importa a classe `Scanner`, que é usada para obter entrada do usuário através do console.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** O ponto de entrada da execução do programa.
* **Cria um objeto `Scanner`:**
    * `Scanner sc = new Scanner(System.in);`: Cria uma instância da classe `Scanner` chamada `sc`, que lê a entrada do sistema (o teclado, neste caso).
* **Declara a variável de resposta:**
    * `char resp;`: Declara uma variável do tipo `char` chamada `resp`, que será usada para armazenar a resposta do usuário sobre se deseja repetir a conversão.
* **Loop `do-while`:** Um loop `do-while` é utilizado para permitir múltiplas conversões. O código dentro do bloco `do` será executado pelo menos uma vez, e continuará a executar enquanto a condição no `while` for verdadeira.
    * **Solicita a temperatura em Celsius:**
        * `System.out.print("Digite a temperatura em Celcius: ");`: Exibe uma mensagem no console pedindo ao usuário para digitar a temperatura em graus Celsius.
        * `double c = sc.nextDouble();`: Lê o número de ponto flutuante (temperatura em Celsius) que o usuário digitou no console e o armazena na variável `c`.
    * **Calcula a temperatura em Fahrenheit:**
        * `double f = 9.0 * c / 5.0 + 32.0;`: Aplica a fórmula de conversão de Celsius para Fahrenheit e armazena o resultado na variável `f`.
    * **Exibe o resultado em Fahrenheit:**
        * `System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);`: Imprime no console a temperatura equivalente em Fahrenheit, formatada para mostrar uma casa decimal.
            * `%.1f`: Especifica que um número de ponto flutuante deve ser impresso com uma casa decimal.
            * `%n`: Insere uma nova linha após a impressão.
    * **Pergunta se o usuário deseja repetir:**
        * `System.out.println("Deseja repetir (s/n)");`: Exibe uma mensagem perguntando ao usuário se deseja realizar outra conversão, solicitando que digite 's' para sim ou 'n' para não.
        * `resp = sc.next().charAt(0);`: Lê a próxima palavra digitada pelo usuário, pega o primeiro caractere dessa palavra e o armazena na variável `resp`.
* **Condição do loop `while`:**
    * `while(resp !='n');`: O loop continuará executando enquanto o valor da variável `resp` for diferente de 'n'. Quando o usuário digitar 'n', o loop terminará.
* **O objeto `Scanner` não é explicitamente fechado:** Embora não seja estritamente necessário para programas simples como este, em aplicações maiores é boa prática fechar o objeto `Scanner` quando ele não for mais utilizado (e.g., `sc.close();` após o loop).

## Entrada do Usuário

O programa utiliza a classe `Scanner` para receber a entrada do usuário diretamente no console (linha de comando). Ele solicitará a temperatura em Celsius e, em seguida, perguntará se o usuário deseja repetir o processo. Para repetir, digite `s` (seguido de Enter). Para sair, digite `n` (seguido de Enter).

## Requisitos

* Java Development Kit (JDK) instalado no sistema.

## Como Executar

1.  Certifique-se de ter o JDK instalado.
2.  Salve o código em `seu_projeto/principal/Main.java`.
3.  Abra o terminal e navegue até a pasta `seu_projeto`.
4.  Compile o código com: `javac principal/Main.java`
5.  Execute o programa com: `java principal.Main`

## Exemplo de Uso

1.  Após executar o programa, o seguinte aparecerá no seu terminal:
    ```
    Digite a temperatura em Celcius:
    ```
2.  Se você digitar `25` e pressionar Enter, a saída será:
    ```
    Equivalente em Fahrenheit: 77.0
    Deseja repetir (s/n)
    ```
3.  Se você digitar `s` e pressionar Enter, o programa solicitará novamente a temperatura em Celsius.
4.  Se você digitar `0` e pressionar Enter, a saída será:
    ```
    Equivalente em Fahrenheit: 32.0
    Deseja repetir (s/n)
    ```
5.  Se você digitar `n` e pressionar Enter, o programa será encerrado.

## Autor

gustavodees

gustavoemartins@gmail.com
