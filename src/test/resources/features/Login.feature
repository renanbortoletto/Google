#language: pt
  Funcionalidade: Login Gmail
    Cenario: Login com sucesso
      Dado que acesso o site Gmail e estou deslogado
      Quando clico em Iniciar Sessao
      Entao exibe a pagina de fazer Login pedindo o meu email
      Quando digito o meu email
      E clico no botao Proxima
      Entao exibe a pagina de Ola pedindo a senha
      Quando digito a senha
      E clico no botao Proxima
      Entao exibe a pagina da caixa de entrada com a minha foto e o meu email
