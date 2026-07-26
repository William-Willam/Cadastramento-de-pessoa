# Cadastro de Pessoas — CRUD com Java, Spring Boot, Thymeleaf e MySQL

Projeto introdutório de um sistema **CRUD** (Create, Read, Update, Delete) para cadastro de pessoas, desenvolvido com **Java + Spring Boot** no back-end, **HTML/CSS (Thymeleaf)** no front-end e **MySQL** como banco de dados.

## 📋 Sobre o projeto

O sistema permite:
- ✅ Cadastrar uma nova pessoa (nome, e-mail e telefone)
- ✅ Listar todas as pessoas cadastradas
- ✅ Editar os dados de uma pessoa existente
- ✅ Excluir uma pessoa da lista

## 🛠️ Tecnologias utilizadas

| Tecnologia | Função no projeto |
|---|---|
| **Java 21** | Linguagem principal do back-end |
| **Spring Boot** | Framework que estrutura a aplicação e o servidor web |
| **Spring Web (MVC)** | Gerencia as requisições HTTP e o roteamento |
| **Spring Data JPA** | Camada de persistência — abstrai o acesso ao banco de dados |
| **Thymeleaf** | Motor de templates que gera as páginas HTML dinamicamente |
| **MySQL** | Banco de dados relacional onde as pessoas são armazenadas |
| **HTML5 / CSS3** | Estrutura e estilização das páginas |
| **Maven** | Gerenciador de dependências e build do projeto |

## 🏗️ Arquitetura

O projeto segue o padrão **MVC em camadas**:

```
Navegador (HTML/CSS)
        ↓
   Controller    → recebe as requisições (ex: acessar /pessoas)
        ↓
    Service      → contém as regras de negócio
        ↓
   Repository    → conversa diretamente com o banco de dados
        ↓
      MySQL
```

### Estrutura de pacotes

```
com.william.cadastropessoa
├── model         → classe Pessoa (representa a entidade/tabela do banco)
├── repository    → interface PessoaRepository (acesso ao banco via Spring Data JPA)
├── service       → classe PessoaService (regras de negócio)
├── controller    → classe PessoaController (recebe requisições web)
└── CadastropessoaApplication → classe principal, inicia o servidor
```

### Estrutura de views (Thymeleaf)

```
src/main/resources
├── templates
│   ├── lista.html       → exibe a tabela com todas as pessoas cadastradas
│   └── formulario.html  → formulário de cadastro/edição de pessoa
└── static
    └── style.css        → estilização das páginas
```

## ▶️ Como rodar o projeto localmente

### Pré-requisitos
- Java 21 instalado
- MySQL instalado e em execução
- Maven (ou usar o `mvnw` incluso no projeto)

### Passo a passo

1. **Clone o repositório**
```bash
git clone https://github.com/William-Willam/cadastro-pessoa.git
cd cadastropessoa
```

2. **Crie o banco de dados no MySQL**
```sql
CREATE DATABASE cadastro_pessoa;
```

3. **Configure a conexão com o banco**

Copie o arquivo de exemplo:
```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

Depois, edite o `application.properties` e preencha com seu usuário e senha do MySQL:
```properties
spring.datasource.username=root
spring.datasource.password=SUA_SENHA_AQUI
```

4. **Rode a aplicação**

Pelo terminal:
```bash
./mvnw spring-boot:run
```
Ou pelo IntelliJ: clique no botão ▶️ na classe `CadastropessoaApplication`.

5. **Acesse no navegador**
```
http://localhost:8080/pessoas
```

## 📸 Funcionalidades (telas)

- **Lista de pessoas** — exibe todas as pessoas cadastradas, com botões de Editar e Excluir
- **Formulário de cadastro/edição** — mesmo formulário é reaproveitado para criar uma pessoa nova ou editar uma existente

<img width="1347" height="681" alt="image" src="https://github.com/user-attachments/assets/8bbf303a-e046-466c-95d7-5239f5136d24" />
<img width="1364" height="684" alt="image" src="https://github.com/user-attachments/assets/c0c9fd98-4a56-4b08-a445-35f3ce0fb334" />



## 🧠 Conceitos aplicados

- Injeção de dependência (`@Autowired`)
- Mapeamento objeto-relacional com JPA/Hibernate (`@Entity`, `@Id`, `@GeneratedValue`)
- Separação de responsabilidades em camadas (Controller → Service → Repository)
- Templates dinâmicos com Thymeleaf (`th:each`, `th:field`, `th:object`)
- Operações CRUD completas com Spring Data JPA

## 👤 Autor

Desenvolvido por William como projeto introdutório de estudo, unindo Java, front-end web (HTML/CSS) e banco de dados MySQL.
