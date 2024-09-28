# Lista de Exercícios #08 💡

Este repositório contém os exercícios de programação em Java, utilizando somente os conteúdos abordados no **Módulo 5: Introdução à Linguagem Java**, da Formação Dev Full Stack Junior da [+prati](https://www.maisprati.com.br/) e [codifica](https://www.codificaedu.com.br/).

**Aluna:** [Andressa V Conrado](https://www.github.com/Andressavcon)

## Execução

Para executar os exercícios, siga as etapas abaixo:

**Clonar o Repositório:**

```bash
git clone [URL_DO_REPOSITÓRIO]
cd [NOME_DA_PASTA_DO_REPOSITÓRIO]
```

**Compilar o Código: Compile os arquivos Java utilizando o comando javac:**

```bash
javac [NOME_DO_ARQUIVO].java
```

**Executar o Código: Execute o código compilado com o comando java:**

```bash
java [NOME_DA_CLASSE]
```

Certifique-se de substituir **[URL_DO_REPOSITÓRIO]**, **[NOME_DA_PASTA_DO_REPOSITÓRIO]**, **[NOME_DO_ARQUIVO]**, e **[NOME_DA_CLASSE]** pelos valores correspondentes ao seu projeto.

Verificar Resultados: Após a execução, verifique a saída no terminal para garantir que o programa esteja funcionando conforme o esperado. Realize testes adicionais conforme necessário para validar a funcionalidade dos exercícios

### Encapsulation

### 👉 [Exercício 1 e 2](./src/Encapsulation/Main.java)

**Criação de uma Classe Simples**

- Objetivo: Crie uma classe Produto que represente um produto de uma
  loja. A classe deve ter atributos privados nome, preco e quantidade em
  estoque. Implemente métodos públicos para acessar e modificar esses
  atributos. Garanta que o preço e a quantidade não possam ser negativos.

**Melhorando a Classe com Validação**

- Objetivo: Extenda a classe Produto para incluir um método
  aplicarDesconto(double porcentagem) que reduz o preço do produto.
  Valide para garantir que o desconto não possa ser maior que 50%.
  Implemente a lógica que lança uma exceção se o desconto for inválido.

### Inheritance

### 👉 [Exercício 3 e 4](./src/Inheritance/Main.java)

**Criação de uma Hierarquia de Classes**

- Objetivo: Crie uma classe Funcionario com atributos nome e salario. Em
  seguida, crie duas subclasses: Gerente e Desenvolvedor. Adicione um
  método calcularBonus que retorna um valor diferente para cada tipo de
  funcionário (por exemplo, 20% do salário para Gerente e 10% para
  Desenvolvedor). Utilize protected para permitir que as subclasses
  acessem os atributos da classe base de forma segura.

**Sobrescrita de Métodos**

- Objetivo: Na classe Funcionario, crie um método trabalhar(), que
  imprime uma mensagem genérica sobre o trabalho realizado. Nas
  subclasses Gerente e Desenvolvedor, sobrescreva esse método para
  especificar o tipo de trabalho realizado por cada um. Utilize a anotação
  @Override e explore como ela ajuda a garantir que a sobrescrita foi feita
  corretamente.

### Polymorphism

### 👉 [Exercício 5 e 6](./src/Polymorphism/Main.java)

**Polimorfismo com Interfaces**

- Objetivo: Crie uma interface IMeioTransporte com métodos acelerar() e
  frear(). Implemente essa interface em classes Carro, Bicicleta e Trem.
  No método principal, crie um array de IMeioTransporte e percorra-o
  chamando acelerar() e frear() para cada objeto. Utilize polimorfismo
  para que cada tipo de transporte implemente acelerar() e frear() de
  maneira diferente.

**Polimorfismo com Classes Abstratas**

- Objetivo: Crie uma classe abstrata Animal com um método abstrato
  emitirSom(). Crie subclasses Cachorro, Gato e Vaca, cada uma
  implementando emitirSom() de maneira específica. Crie uma lista de
  Animal no método principal e adicione instâncias de cada subclasse. Itere
  sobre a lista e invoque o método emitirSom() para cada animal,
  demonstrando o polimorfismo.

### Abstraction

### 👉 [Exercício 7](./src/Abstraction/Main.java)

**Abstração em um Sistema de Pagamentos**

- Objetivo: Crie uma classe abstrata FormaPagamento com métodos
  abstratos processarPagamento(double valor) e validarPagamento().
  Crie classes concretas CartaoCredito, Boleto e Pix que herdam de
  FormaPagamento e implementam os métodos abstratos. Adicione lógica de
  validação específica para cada forma de pagamento e simule um sistema
  que utilize diferentes formas de pagamento.

### 👉 [Exercício 8](./src/EmployeeManagement/Main.java)

**Sistema de Gestão de Funcionários**

- Objetivo: Crie um sistema que gerencie diferentes tipos de funcionários
  (Gerente, Desenvolvedor, Estagiario). Cada tipo de funcionário deve ter
  uma maneira diferente de calcular o salário e o bônus. Utilize uma
  combinação de herança, polimorfismo e encapsulamento para estruturar
  as classes. Implemente um método calcularFolhaPagamento que itera
  sobre todos os funcionários e calcula o total de salários e bônus. Adicione
  novas funcionalidades, como a possibilidade de promover um funcionário,
  o que altera seu tipo e os cálculos de salário e bônus.
