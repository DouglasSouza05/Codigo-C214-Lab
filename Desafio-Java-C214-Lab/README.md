# Codigos-C214-LAB

Códigos feitos para a disciplina de laboratório C214

Gerenciador de Filmes

Este é um projeto de gerenciamento de filmes, que permite ao usuário adicionar filmes a uma lista, marca-los como assistidos, avalia-los com uma nota e por fim ver todos os filmes da lista. O programa é implementado em Java e utiliza conceitos como classes, objetos, exceções e interações com o usuário.

Funcionalidades:

Adicionar um novo filme:

O usuário pode adicionar um novo filme a lista.
São solicitados um ID, título, ano, gênero e duração do filme.
Os detalhes do filme são armazenados em objetos da classe Filme e adicionados à lista de filmes gerenciada pelo Gerenciador.

Marcar um filme como assistido:

O usuário pode marcar um filme como assistido, fornecendo o ID do filme.
Antes de realizar a ação, o programa verifica se a lista de filmes está vazia.
Se a lista não estiver vazia, o filme correspondente é marcado como assistido.

Avaliar um filme:

O usuário pode avaliar um filme fornecendo o ID do filme e uma nota.
Antes de realizar a ação, o programa também verifica se a lista de filmes está vazia.
Se a lista não estiver vazia, a avaliação é atribuída ao filme correspondente.

Exibir a lista de filmes:

O programa exibe os detalhes de todos os filmes presentes na lista.
Antes de exibir, verifica-se se a lista de filmes está vazia.
Isso é feito para evitar tentativas de exibir uma lista vazia.

Componentes:

Main.java:

Contém o loop principal do programa, onde o usuário pode selecionar opções do menu.
Utiliza instâncias da classe Scanner para interagir com o usuário e chama métodos do Gerenciador para executar ações.

Filme.java:

Define os atributos e métodos relacionados a um filme.
Armazena informações como ID, título, ano, gênero, duração, status de assistido e avaliação.

Gerenciador.java:

Contém a lógica para adicionar filmes, marcar como assistidos, avaliar filmes e exibir detalhes dos filmes.
Mantém uma lista dinâmica de objetos da classe Filme.
Inclui um método testEmptyArray() para verificar se a lista de filmes está vazia antes de realizar ações.

ListaVaziaException.java:

Define uma exceção personalizada para quando a lista de filmes estiver vazia.
É lançada e tratada no Gerenciador quando apropriado.
O projeto segue uma estrutura de entrada de dados, execução de ações e exibição de resultados, lidando com possíveis exceções ao longo do processo.
