# Memelandia
Projeto final da Escola Britânica de Artes Criativas

Cadastro de catálogo de memes

Requisitos:
1. Cadastro de usuários para envio de memes. 
2. Cadastro de categorias de memes. 
3. Cadastro de memes. Memes precisam necessariamente ter uma categoria.

  O projeto possui tecnologias de métricas, logs e descobertas de microserviços 

  1. Spring Boot
O Spring Boot é a espinha dorsal do projeto, proporcionando uma estrutura sólida e fácil de configurar para aplicações Java. Utilizamos o spring-boot-starter-parent como parent POM, que oferece uma configuração padrão e otimizada para o Spring Boot. O spring-boot-starter-web é utilizado para simplificar o desenvolvimento de serviços web, enquanto o spring-boot-starter-data-jpa e spring-boot-starter-jdbc facilitam o acesso e manipulação de dados no banco de dados.

2. PostgreSQL
Para a persistência de dados, o projeto utiliza o PostgreSQL como sistema de gerenciamento de banco de dados relacional. A dependência postgresql garante a integração com o banco de dados, aproveitando suas características avançadas de performance e confiabilidade.

3. Spring Cloud
O Spring Cloud é utilizado para construir e gerenciar a arquitetura de microserviços. Com o spring-cloud-starter-openfeign, o projeto faz uso do Feign para simplificar chamadas HTTP entre serviços. O spring-cloud-starter-zookeeper-discovery é empregado para o registro e descoberta de serviços, utilizando o Apache Zookeeper como mecanismo de descoberta de serviços.

4. Micrometer e Observabilidade
Para monitoramento e rastreamento, o projeto incorpora o Micrometer com micrometer-tracing-bridge-brave e zipkin-reporter-brave. Estas bibliotecas são essenciais para a coleta de métricas e rastreamento distribuído, integrando-se com o Zipkin para análise e visualização de traces.

5. Testes
Para garantir a qualidade do código, o projeto utiliza o spring-boot-starter-test, que fornece suporte para testes unitários e de integração, promovendo uma abordagem abrangente para a validação das funcionalidades.

6. Ferramentas e Plugins
O Spring Boot Maven Plugin (spring-boot-maven-plugin) é empregado para a construção e execução da aplicação, simplificando o processo de embalagem e execução do projeto.

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>MemelandiaServices</h1>
    <p>Este é um microserviço desenvolvido como parte do projeto Memelandia, responsável por fornecer serviços essenciais para a aplicação.</p>
    <h2>Descrição</h2>
    <p>O MemelandiaServices é um microserviço que oferece funcionalidades específicas para a aplicação Memelandia. Ele é desenvolvido utilizando Java e Spring Boot, e se comunica com outros microserviços através de APIs REST.</p>
    <h2>Instalação</h2>
    <ol>
        <li>Clone o repositório: <code>git clone https://github.com/caioskywalker/Memelandia.git</code></li>
        <li>Navegue até o diretório do microserviço: <code>cd Memelandia/MemelandiaServices</code></li>
        <li>Compile e construa o projeto utilizando Maven: <code>mvn clean install</code></li>
        <li>Configure o banco de dados conforme as instruções no arquivo <code>application.properties</code>.</li>
        <li>Execute o microserviço: <code>java -jar target/MemelandiaServices-0.0.1-SNAPSHOT.jar</code></li>
    </ol>
    <h2>Configuração do Banco de Dados</h2>
    <p>O microserviço utiliza um banco de dados relacional para armazenar os dados. As configurações do banco de dados estão no arquivo <code>application.properties</code>. Certifique-se de ajustar as configurações de acordo com o seu ambiente.</p>
    <h2>Endpoints</h2>
    <p>O MemelandiaServices expõe os seguintes endpoints REST:</p>
    <ul>
        <li><code>GET /api/memes</code>: Retorna uma lista de memes.</li>
        <li><code>POST /api/memes</code>: Adiciona um novo meme.</li>
        <li><code>GET /api/memes/{id}</code>: Retorna os detalhes de um meme específico.</li>
        <li><code>PUT /api/memes/{id}</code>: Atualiza as informações de um meme existente.</li>
        <li><code>DELETE /api/memes/{id}</code>: Remove um meme.</li>
    </ul>
    <h2>Classes Utilizadas</h2>
    <p>O projeto utiliza várias classes para gerenciar a lógica de negócios e a persistência de dados. Algumas das principais classes incluem:</p>
    <ul>
        <li><code>MemesController</code>: Controlador REST que gerencia as requisições relacionadas aos memes.</li>
        <li><code>Meme</code>: Classe de entidade que representa um meme no banco de dados.</li>
        <li><code>MemeRepository</code>: Interface de repositório que estende <code>JpaRepository</code> para operações CRUD.</li>
        <li><code>MemeService</code>: Classe de serviço que contém a lógica de negócios para manipulação de memes.</li>
    </ul>
    <h2>Uso</h2>
    <p>Para utilizar o microserviço, faça requisições HTTP para os endpoints mencionados acima. Você pode usar ferramentas como Postman ou cURL para testar as APIs.</p>
    <h2>Contribuição</h2>
    <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.</p>
    <h2>Licença</h2>
    <p>Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.</p>
</body>
</html>




