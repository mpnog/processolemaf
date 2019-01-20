# processolemaf

Atividade de automação de um sistema de RH

Processo seletivo LEMAF

Avaliação Técnica - Automação Web

Dados utilizados no exercício:

Site: http://gerir.teste.ti.lemaf.ufla.br/#/inicio

Cenários de teste:

Realizar o processo de login considerando:

1 - Preenchimento correto dos campos com dados previamente cadastrados 2 - Preenchimento dos campos com dados diferentes dos cadastrados anteriormente

Organização estrutural do projeto Os testes automatizados deste projeto foram feitos utilizando o framework IntelliJ IDEA para execução dos cenários de testes propostos, seguindo a estrutura abaixo:

src > test > java > classes --> Contém o pacotes de classes com os testes funcionais.

                UserAuthenticatorTeste --> Contém os testes de autenticação do usuário.
src > teste > hava > common --> Contém o pacote de classes no nível de implementação dos testes.

               BrowsersDrivers --> Classe com os drivers dos navegadores e a configuração.
               
               TestsConfigurator --> Classe com configurações do driver
Execução dos testes

Pré-requisitos: Ter instalado: - Navegadores Chrome e/ou Firefox; - Maven (ferramenta de automação de compilação e gestão de dependências);

Execução:

Os testes foram desenvolvidos para execução tanto no navegador Chrome, quanto no navegador Firefox. Os drivers foram disponibilizados no projeto, na pasta drivers, organizado por sistema operacional.

Utilize o maven para execução, conforme os exemplos abaixo:

Para execucao com browser Chrome:
export browserName=CHROME ; mvn test

para execucao com browser Firefox:
export browserName=FIREFOX ; mvn test
