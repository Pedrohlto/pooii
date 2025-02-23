Exercício: Sistema de Gerenciamento de Documentos com Interface Segregation

Você foi contratado para desenvolver um sistema de gerenciamento de documentos em uma plataforma de armazenamento de arquivos. 
Esse sistema precisa lidar com diversos tipos de documentos, como Textos, Imagens e Vídeos, e cada tipo de documento pode ter diferentes formas de processamento.

O sistema permite as seguintes operações:

Exibição de documentos.
Edição de documentos.
Conversão de documentos para outros formatos.
Upload e Download de arquivos.
Impressão de documentos.
Porém, nem todos os tipos de documentos precisam implementar todas as funcionalidades. Por exemplo:

Textos podem ser editados e impressos, mas não precisam ser convertidos em outro formato.
Imagens podem ser exibidas e convertidas para outros formatos, mas não precisam ser editadas como um texto.
Vídeos podem ser exibidos e baixados, mas não precisam ser impressos.
A tarefa é aplicar o Princípio da Segregação de Interfaces (ISP) para garantir que cada tipo de documento implemente somente os métodos relevantes para ele, sem ser forçado a implementar operações que não fazem sentido.

Crie interfaces específicas para as funcionalidades que um documento pode oferecer:

Crie classes que representam diferentes tipos de documentos, implementando as interfaces relevantes:

Demonstrar o funcionamento do sistema criando uma classe GerenciadorDeDocumentos que simula operações de upload, download, exibição, edição e impressão.

As classes devem seguir boas práticas de design e garantir que nenhuma classe implemente métodos desnecessários, respeitando o ISP.