# 📚 Java - Fundamentos e Lógica de Programação

Este repositório contém exercícios práticos e exemplos dos conceitos fundamentais da linguagem Java, organizados de forma didática para facilitar o aprendizado de lógica de programação.

## 🎯 Objetivos do Projeto

- Demonstrar conceitos básicos da linguagem Java
- Praticar lógica de programação através de exemplos
- Servir como material de consulta e estudo
- Consolidar conhecimentos em estruturas de dados e algoritmos

## 🚀 Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior
- IDE de sua preferência (VS Code, IntelliJ, Eclipse, etc.)

### Compilação e Execução
```bash
# Compilar um arquivo Java
javac NomeDoArquivo.java

# Executar o programa compilado
java NomeDoArquivo
```

### Exemplo Prático
```bash
# Compilar o arquivo Mensagem.java
javac java-fundamentos-logica/Mensagem.java

# Executar o programa
java Mensagem
```

### Executar Arquivos com Pacotes
```bash
# Compilar arquivo de um pacote (a partir da raiz do projeto)
javac POO/conceitos/Main.java

# Executar arquivo de um pacote
java POO.conceitos.Main

# Ou usar o comando Run do VS Code (recomendado)
# Clique com botão direito no arquivo → Run Java
```

## 📁 Estrutura do Projeto

```
java-fundamentos-logica/
├── Exercicios/                       # Exercícios práticos de lógica
│   ├── Exercicio01.java
│   ├── Exercicio02.java
│   └── ... (demais exercícios)
├── Exercicios Orientacao a Objetos/ # Exercícios de POO
│   ├── ex01/                        # Classe Numero
│   ├── ex02/                        # Classe Horário
│   ├── ex03/                        # Classe Média
│   ├── ex04/                        # Classe Contador
│   ├── ex05/                        # Herança: Produto, Eletrônico, Vestuário
│   └── ex06/                        # Sistema de Pagamento (Loja)
├── Extras/                          # Exemplos extras
│   ├── ExemploArrayList.java
│   ├── ExemploHashMap.java
│   ├── ExemploLinkedList.java
│   ├── ExemploQueue.java
│   ├── ExemploStack.java
│   ├── Crud.JAVA
│   ├── Enums.java
│   ├── Modal.java
│   └── TratamentoErros.java
├── java-fundamentos-logica/         # Conceitos fundamentais
│   ├── Concatenacao.java
│   ├── Condicionais.java
│   ├── Constantes.java
│   ├── Conversao.java
│   ├── Escolha.java
│   ├── Estrutura1.java
│   ├── Estrutura2.java
│   ├── Interacao.java
│   ├── LacoFacaEnquanto.java
│   ├── LacoPara.java
│   ├── LacoParaCada.java
│   ├── LacosEnquanto.java
│   ├── Matriz.java
│   ├── Mensagem.java
│   ├── OperadoresAritmeticos.java
│   ├── OperadoresLogicos.java
│   ├── OperadoresRelacionais.java
│   ├── OperadorTernario.java
│   ├── Variaveis.java
│   └── Vetor.java
└── POO/                             # Programação Orientada a Objetos
    ├── abstracao/
    ├── conceitos/
    ├── estatico/
    ├── getset/
    ├── heranca/
    ├── interfaces/
    ├── modificadoresdeacesso/
    ├── polimorfismo1/
    └── polimorfismo2/
```

## 📋 Conteúdo dos Exercícios

### 🔤 Fundamentos Básicos
| Arquivo | Conceito | Descrição |
|---------|----------|-----------|
| `Variaveis.java` | Variáveis | Declaração, inicialização e regras de nomenclatura |
| `Constantes.java` | Constantes | Uso de `final` e boas práticas |
| `Conversao.java` | Conversão de Tipos | String ↔ int, Double.parseDouble, casting |
| `Mensagem.java` | Saída de Dados | System.out.println e formatação |
| `Interacao.java` | Entrada de Dados | Scanner e interação com usuário |
| `Concatenacao.java` | Manipulação de Strings | Operador + e métodos de String |

### ➕ Operadores
| Arquivo | Conceito | Descrição |
|---------|----------|-----------|
| `OperadoresAritmeticos.java` | Operadores Aritméticos | +, -, *, /, % |
| `OperadoresRelacionais.java` | Operadores Relacionais | ==, !=, <, >, <=, >= |
| `OperadoresLogicos.java` | Operadores Lógicos | &&, \|\|, ! (AND, OR, NOT) |
| `OperadorTernario.java` | Operador Ternário | Sintaxe ? : |

### 🔀 Estruturas de Controle
| Arquivo | Conceito | Descrição |
|---------|----------|-----------|
| `Condicionais.java` | If/Else | Estruturas condicionais simples e aninhadas |
| `Escolha.java` | Switch-Case | Estrutura de seleção múltipla |

### 🔄 Estruturas de Repetição
| Arquivo | Conceito | Descrição |
|---------|----------|-----------|
| `LacosEnquanto.java` | While | Loop com condição no início |
| `LacoFacaEnquanto.java` | Do-While | Loop com condição no final |
| `LacoPara.java` | For | Loop com contador |
| `LacoParaCada.java` | Enhanced For | For-each para coleções |
| `Estrutura1.java` | Loops Básicos | Estruturas de repetição fundamentais |
| `Estrutura2.java` | Loops Avançados | Combinações e casos especiais |

### 📊 Estruturas de Dados
| Arquivo | Conceito | Descrição |
|---------|----------|-----------|
| `Vetor.java` | Arrays Unidimensionais | Declaração, inicialização e manipulação |
| `Matriz.java` | Arrays Bidimensionais | Matrizes e algoritmos relacionados |

### 🧩 Programação Orientada a Objetos (POO)
| Pasta | Conceito | Descrição |
|---------|----------|-----------|
| `POO/conceitos/` | Conceitos Básicos | Classes, objetos, atributos e métodos |
| `POO/getset/` | Encapsulamento | Getters, Setters e modificadores de acesso |
| `POO/heranca/` | Herança | Reutilização de código através de herança |
| `POO/modificadoresdeacesso/` | Modificadores | Public, private, protected |
| `POO/estatico/` | Membros Estáticos | Atributos e métodos static |
| `POO/abstracao/` | Abstração | Classes abstratas e métodos abstratos |
| `POO/interfaces/` | Interfaces | Contratos e implementação de interfaces |
| `POO/polimorfismo1/` | Polimorfismo (Sobrecarga) | Sobrecarga de métodos |
| `POO/polimorfismo2/` | Polimorfismo (Sobrescrita) | Sobrescrita de métodos e herança |

### 📦 Estruturas de Dados Avançadas (Extras)
| Arquivo | Conceito | Descrição |
|---------|----------|-----------|
| `ExemploArrayList.java` | ArrayList | Lista dinâmica implementada com array |
| `ExemploLinkedList.java` | LinkedList | Lista duplamente encadeada |
| `ExemploHashMap.java` | HashMap | Estrutura chave-valor |
| `ExemploStack.java` | Stack | Pilha (LIFO - Last In First Out) |
| `ExemploQueue.java` | Queue | Fila (FIFO - First In First Out) |
| `Enums.java` | Enumerações | Tipos enumerados |
| `Modal.java` | JOptionPane | Interface gráfica com modais |
| `TratamentoErros.java` | Exceções | Try-catch e tratamento de erros |
| `Crud.JAVA` | CRUD | Operações Create, Read, Update, Delete |

## 📖 Detalhamento dos Exercícios de POO

### Exercício 01 - Classe Numero
**Objetivo**: Introdução a classes e métodos básicos
- Criar uma classe que recebe um número
- Implementar método para verificar se é positivo, negativo ou zero
- Retornar mensagem apropriada

### Exercício 02 - Classe Horario
**Objetivo**: Validação de dados e formatação
- Criar classe para representar horários
- Validar horas (0-23), minutos e segundos (0-59)
- Formatar saída no padrão hh:mm:ss

### Exercício 03 - Classe Media
**Objetivo**: Cálculos e lógica de aprovação
- Calcular média de notas
- Verificar se o aluno foi aprovado (média ≥ 7.0)
- Exibir resultado com formatação adequada

### Exercício 04 - Classe Contador
**Objetivo**: Controle de estado e métodos de manipulação
- Implementar contador com valor inicial
- Métodos: incrementar, decrementar, zerar
- Exibir valor atual

### Exercício 05 - Herança com Produtos
**Objetivo**: Herança, especialização e polimorfismo
- Classe base `Produto` com atributos comuns
- Classe `Eletronico` com garantia e voltagem
- Classe `Vestuario` com tamanho e material
- Cálculo de preço final com impostos específicos

### Exercício 06 - Sistema de Loja
**Objetivo**: Sistema completo com múltiplas classes
- Classe `Loja` para gerenciar vendas
- Classe `Pagamento` para processar pagamentos
- Implementar formas de pagamento: À vista, Cartão, Boleto
- Cálculo de descontos e acréscimos

### 🎯 Exercícios Práticos de Lógica
| Arquivo | Descrição |
|---------|-----------|
| `Exercicio01.java` | Calcular média de duas notas e verificar aprovação |
| `Exercicio02.java` | Encontrar o menor entre três números |
| `Exercicio03.java` | Somar ou multiplicar dois números conforme condição |
| `Exercicio04.java` | Exercício intermediário |
| `Exercicio05.java` | Calculadora com operações básicas |
| `Exercicio06.java` | Sistema de cálculo de produtos |
| `Exercicio07.java` | Soma de números até digitar zero |
| `Exercicio08.java` | Exercício avançado |
| `Exercicio09.java` | Contar pares e ímpares em vetor |
| `Exercicio10.java` | Armazenar e exibir nomes em vetor |
| `Exercicio11.java` | Matriz de estados e cidades |
| `Exercicio12.java` | Matriz 3x3 e soma de valores |

### 🏆 Exercícios de Orientação a Objetos
| Exercício | Conceito | Descrição |
|-----------|----------|-----------|
| **ex01** | Classe Básica | **Numero**: Classe que armazena um número e verifica se é positivo, negativo ou zero |
| **ex02** | Validação de Dados | **Horario**: Classe que valida e formata horários (hh:mm:ss) |
| **ex03** | Cálculos e Métodos | **Media**: Classe que calcula média de notas e verifica aprovação |
| **ex04** | Estado e Controle | **Contador**: Classe com incremento, decremento e reset de contador |
| **ex05** | Herança e Especialização | **Produto/Eletronico/Vestuario**: Sistema de produtos com herança e cálculo de preço final |
| **ex06** | Sistema Completo | **Loja/Pagamento**: Sistema de loja com diferentes formas de pagamento e cálculo de descontos |

## 🛠️ Tecnologias Utilizadas

- **Java SE** - Standard Edition
- **JDK 8+** - Kit de desenvolvimento Java
- **VS Code** - Editor de código recomendado com Extension Pack for Java
- **Git** - Controle de versão
- **GitHub** - Hospedagem do repositório

### Extensões Recomendadas para VS Code
- Extension Pack for Java (Microsoft)
- Language Support for Java (Red Hat)
- Debugger for Java (Microsoft)
- Maven for Java (Microsoft)

## 🎓 Como Estudar

### Para Iniciantes
1. **Comece pelos fundamentos**: Variáveis, tipos de dados e operadores
2. **Pratique as estruturas**: Condicionais e loops
3. **Explore os arrays**: Vetores e matrizes
4. **Resolva os exercícios básicos**: Aplique os conceitos aprendidos

### Progressão Intermediária
5. **Estude POO básico**: Classes, objetos e métodos (pasta `POO/conceitos/`)
6. **Pratique exercícios de POO**: Resolva os exercícios em `Exercicios Orientacao a Objetos/`
7. **Explore encapsulamento**: Getters, Setters e modificadores de acesso
8. **Aprenda herança**: Reutilização de código através de herança

### Nível Avançado
9. **Domine polimorfismo**: Sobrecarga e sobrescrita de métodos
10. **Trabalhe com interfaces**: Contratos e implementação
11. **Explore estruturas avançadas**: Collections, Maps, Stacks, Queues
12. **Pratique tratamento de erros**: Try-catch e exceções personalizadas

## 💡 Dicas de Estudo

### Práticas Recomendadas
- ✅ Execute cada exemplo e observe o resultado
- ✅ Comente e descomente linhas para entender o comportamento
- ✅ Modifique valores e veja como afeta a execução
- ✅ Tente criar suas próprias variações dos exercícios
- ✅ Use o debugger para acompanhar a execução passo a passo

### Metodologia de Aprendizado
1. **Leia o código**: Entenda a estrutura e lógica antes de executar
2. **Execute o programa**: Veja o resultado na prática
3. **Modifique o código**: Faça pequenas alterações e teste
4. **Crie variações**: Implemente funcionalidades adicionais
5. **Documente seu aprendizado**: Comente o código com suas observações

### Recursos Úteis
- 📚 Documentação oficial do Java: [docs.oracle.com/javase](https://docs.oracle.com/javase)
- 🎥 Tutoriais em vídeo sobre Java
- 💬 Comunidades: Stack Overflow, Reddit r/learnjava
- 📖 Livros recomendados: "Java: Como Programar" (Deitel)

## 🤝 Contribuições

Contribuições são sempre bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovoExercicio`)
3. Commit suas mudanças seguindo o padrão conventional commits:
   - `feat:` para novos recursos
   - `fix:` para correções
   - `docs:` para documentação
   - `refactor:` para refatorações
4. Push para a branch (`git push origin feature/NovoExercicio`)
5. Abra um Pull Request

### Sugestões de Contribuição
- Adicionar novos exercícios práticos
- Melhorar documentação de código existente
- Criar exemplos de uso mais complexos
- Reportar bugs ou problemas encontrados
- Sugerir melhorias na organização do projeto

## 📝 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para utilizar o código para fins de aprendizado e estudo.

## 📊 Estatísticas do Projeto

- 📁 **4 Módulos principais**: Exercícios, POO, Fundamentos, Extras
- 📝 **50+ arquivos** de exemplos e exercícios
- 🎯 **18 exercícios** de Orientação a Objetos
- 🧩 **9 conceitos de POO** implementados
- 📚 **20+ tópicos** de fundamentos Java

## 📞 Contato

**Wenderson José**
- 📧 Email: wenderson.teles@icloud.com
- 💼 GitHub: [@Wendersonjose](https://github.com/Wendersonjose)
- 📝 LinkedIn: [Wenderson José](https://www.linkedin.com/in/wendersonjose)

---

<div align="center">

⭐ **Se este projeto te ajudou, considere dar uma estrela no repositório!** ⭐

**Feito com ❤️ para a comunidade de desenvolvedores Java**

</div>