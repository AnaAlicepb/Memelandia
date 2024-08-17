<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Projeto Memelandia para cadastro de catálogo de memes">
    <meta name="keywords" content="Spring Boot, PostgreSQL, Microserviços, Memes, Cadastro">
    <meta name="author" content="Ana Alice Rodrigues">
    
</head>
<body>

<header>
    <h1>Projeto Memelandia</h1>
    </header>

<details>
    <summary>Índice</summary>
    <ol>
        <li><a href="#sobre-o-projeto">Sobre o projeto</a></li>
        <li><a href="#parte-tecnica">Parte Técnica</a></li>
        <li><a href="#estrutura-dos-arquivos">Estrutura dos Arquivos</a></li>
        <li><a href="#casos-de-uso">Casos de Uso</a></li>
        <li><a href="#ferramentas">Ferramentas</a></li>
        <li><a href="#contato">Contato</a></li>
    </ol>
</details>

<section id="sobre-o-projeto">
    <h2>Sobre o projeto</h2>
    <p>
        O Memelandia é o projeto final desenvolvido por Ana Alice Rodrigues como parte do curso na Escola Britânica de Artes Criativas. Este projeto tem como objetivo o cadastro de um catálogo de memes, permitindo que usuários enviem memes, categorizem-nos, e gerenciem suas criações. O projeto é composto por múltiplos microserviços, utilizando tecnologias de métricas, logs e descobertas de serviços para uma experiência robusta e escalável.
    </p>
    <p>
        Proposta de Valor: Oferecer uma plataforma eficiente e escalável para o cadastro e gestão de memes, integrando categorias, usuários e funcionalidades avançadas de microserviços.
    </p>
</section>

<section id="parte-tecnica">
    <h2>Parte Técnica</h2>
    <ul>
        <li><strong>Spring Boot</strong>: Backbone do projeto, oferecendo uma estrutura sólida para aplicações Java. Inclui suporte para Spring Data JPA, JDBC, e web.</li>
        <li><strong>PostgreSQL</strong>: Banco de dados relacional utilizado para persistência de dados.</li>
        <li><strong>Spring Cloud</strong>: Utilizado para construir e gerenciar a arquitetura de microserviços, incluindo Feign para chamadas HTTP e Zookeeper para descoberta de serviços.</li>
        <li><strong>Micrometer e Observabilidade</strong>: Ferramentas de monitoramento e rastreamento distribuído, integradas com Zipkin para análise de traces.</li>
        <li><strong>Testes</strong>: Implementação de testes unitários e de integração usando Spring Boot Test.</li>
    </ul>
</section>

<section id="estrutura-dos-arquivos">
    <h2>Estrutura dos Arquivos</h2>
    <ul>
        <li><strong>MemesController</strong>: Controlador REST que gerencia as requisições relacionadas aos memes.</li>
        <li><strong>Meme</strong>: Classe de entidade que representa um meme no banco de dados.</li>
        <li><strong>MemeRepository</strong>: Interface de repositório que estende JpaRepository para operações CRUD.</li>
        <li><strong>MemeService</strong>: Classe de serviço que contém a lógica de negócios para manipulação de memes.</li>
    </ul>
</section>

<section id="casos-de-uso">
    <h2>Casos de Uso</h2>
    <ul>
        <li>Cadastro de usuários para envio de memes.</li>
        <li>Cadastro de categorias de memes.</li>
        <li>Cadastro de memes, obrigatoriamente associados a uma categoria.</li>
        <li>Consultas e manipulação de memes através de endpoints REST.</li>
    </ul>
</section>

<section id="ferramentas">
    <h2>Ferramentas</h2>
    <ul>
        <li><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Badge Java"></li>
        <li><img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Badge Spring Boot"></li>
        <li><img src="https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white" alt="Badge PostgreSQL"></li>
        <li><img src="https://img.shields.io/badge/Feign-007396?style=for-the-badge&logo=apache-feign&logoColor=white" alt="Badge Feign"></li>
        <li><img src="https://img.shields.io/badge/Zipkin-000000?style=for-the-badge&logo=zipkin&logoColor=white" alt="Badge Zipkin"></li>
    </ul>
</section>

<section id="contato">
    <h2>Contato</h2>
    <ul>
        <li><a href="https://linktr.ee/anaeanali5" target="_blank"><img src="https://img.shields.io/badge/Ana_Alice_Rodrigues-blue?style=for-the-badge" alt="Perfil de Ana Alice Rodrigues"></a></li>
    </ul>
</section>

</body>
</html>
