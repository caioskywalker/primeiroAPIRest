<h1>MyFirstWebAPI</h1>

<h2>Introdução</h2>
<p><strong>MyFirstWebAPI</strong> é uma API RESTful simples desenvolvida usando Spring Boot. Este projeto serve como uma introdução à construção de APIs web em Java, demonstrando operações CRUD básicas e a estruturação de uma aplicação Spring Boot.</p>

<h2>Índice</h2>
<ul>
  <li><a href="#introducao">Introdução</a></li>
  <li><a href="#recursos">Recursos</a></li>
  <li><a href="#instalacao">Instalação</a></li>
  <li><a href="#uso">Uso</a></li>
  <li><a href="#configuracao">Configuração</a></li>
  <li><a href="#dependencias">Dependências</a></li>
  <li><a href="#estrutura-do-projeto">Estrutura do Projeto</a></li>
  <li><a href="#contribuidores">Contribuidores</a></li>
  <li><a href="#licenca">Licença</a></li>
</ul>

<h2 id="recursos">Recursos</h2>
<ul>
  <li>Estrutura básica de API RESTful</li>
  <li>Operações CRUD na entidade <code>Usuario</code></li>
  <li>Controladores simples para lidar com solicitações relacionadas a usuários</li>
  <li>Uso do Spring Boot para desenvolvimento rápido</li>
  <li>Utilização de uma ArrayList no repositório, para simular um banco de dados. Mas o projeto pode ser personalizado para utilizar um banco de dados como PostgreSql, H2, MongoDb ou outro de sua escolha</li>
</ul>

<h2 id="instalacao">Instalação</h2>
<p>Para configurar e executar este projeto localmente, siga estas etapas:</p>
<ol>
  <li><strong>Clone o repositório:</strong>
    <pre><code>git clone &lt;[url-do-repositorio](https://github.com/caioskywalker/primeiroAPIRest/tree/main)&gt;
cd myFisrtWebAPI
    </code></pre>
  </li>
  <li><strong>Construa o projeto usando Maven:</strong>
    <pre><code>./mvnw clean install
    </code></pre>
  </li>
  <li><strong>Execute a aplicação:</strong>
    <pre><code>./mvnw spring-boot:run
    </code></pre>
  </li>
</ol>

<h2 id="uso">Uso</h2>
<p>Após executar a aplicação, você pode interagir com a API usando ferramentas como <code>curl</code>, Postman, ou diretamente através de um navegador web.</p>

<h3>Endpoints da API</h3>
<ul>
  <li><strong>GET /usuarios</strong>: Recupera todos os usuários</li>
  <li><strong>POST /usuarios</strong>: Cria um novo usuário</li>
  <li><strong>GET /usuarios/{id}</strong>: Recupera um usuário específico pelo ID</li>
  <li><strong>PUT /usuarios/{id}</strong>: Atualiza um usuário pelo ID</li>
  <li><strong>DELETE /usuarios/{id}</strong>: Exclui um usuário pelo ID</li>
</ul>

<h2 id="configuracao">Configuração</h2>
<p>O arquivo principal de configuração da aplicação está localizado em:</p>
<ul>
  <li><code>src/main/resources/application.properties</code></li>
</ul>
<p>Você pode ajustar várias configurações, como a porta do servidor, detalhes de conexão com o banco de dados e outras propriedades específicas do ambiente.</p>

<h2 id="dependencias">Dependências</h2>
<p>Este projeto depende das seguintes bibliotecas, gerenciadas via Maven:</p>
<ul>
  <li>Spring Boot Starter Web</li>
  <li>ArrayList para simular um banco de dados</li>
</ul>
<p>Essas dependências estão definidas no arquivo <code>pom.xml</code>.</p>

<h2 id="estrutura-do-projeto">Estrutura do Projeto</h2>
<p>O projeto segue a estrutura padrão do Spring Boot:</p>
<pre><code>myFisrtWebAPI/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dio/web/api/
│   │   │       ├── MyFisrtWebApiApplication.java
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       └── repositorio/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── dio/web/api/
├── pom.xml
└── README.md
</code></pre>

<h2 id="contribuidores">Contribuidores</h2>
<ul>
  <li><strong>Autor</strong>: [Caio Farias]</li>
</ul>
<p>Contribuições são bem-vindas! Por favor, faça um fork do repositório e envie um pull request.</p>

<h2 id="licenca">Licença</h2>
<p>Este projeto está licenciado sob a Licença MIT - veja o arquivo <code>LICENSE</code> para mais detalhes.</p>
