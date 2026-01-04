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
├── Exercicios/           # Exercícios práticos
│   ├── Exercicio01.java
│   ├── Exercicio02.java
│   └── ... (demais exercícios)
├── Extras/               # Exemplos extras
│   ├── ExemploArrayList.java
│   ├── ExemploHashMap.java
│   └── ... (demais exemplos)
├── java-fundamentos-logica/  # Conceitos fundamentais
│   ├── Concatenacao.java
│   ├── Condicionais.java
│   ├── Constantes.java
│   └── ... (demais arquivos)
└── POO/                  # Programação Orientada a Objetos
    ├── conceitos/
    ├── getset/
    ├── heranca/
    └── modificadoresdeacesso/
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

### 🎯 Exercícios Práticos
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

1. **Comece pelos fundamentos**: Variáveis, tipos de dados e operadores
2. **Pratique as estruturas**: Condicionais e loops
3. **Explore os arrays**: Vetores e matrizes
4. **Resolva os exercícios**: Aplique os conceitos aprendidos
5. **Experimente**: Modifique os códigos e teste diferentes cenários

## 💡 Dicas de Estudo

- Execute cada exemplo e observe o resultado
- Comente e descomente linhas para entender o comportamento
- Modifique valores e veja como afeta a execução
- Tente criar suas próprias variações dos exercícios
- Use o debugger para acompanhar a execução passo a passo

## 🤝 Contribuições

Contribuições são sempre bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
Sinta-se à vontade para utilizar o código para fins de aprendizado e estudo.

## 📞 Contato

**Wenderson José**
- 📧 Email: wenderson.teles@icloud.com
- 💼 GitHub: [@Wendersonjose](https://github.com/Wendersonjose)

---

⭐ **Se este projeto te ajudou, considere dar uma estrela no repositório!** ⭐