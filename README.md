# AssetTrueValue

AssetTrueValue é um sistema Java desenvolvido para calcular o valor justo de ativos imobilizados, utilizando boas práticas de Clean Code, princípios SOLID e padrões de projeto GoF (Strategy, Factory, Adapter, Observer).

##  Objetivo
Oferecer uma solução confiável e extensível para empresas que precisam reavaliar ativos patrimoniais segundo critérios contábeis e de mercado.

## Tecnologias Utilizadas
- Java 8+
- Apache NetBeans (Java with Ant)
- MySQL
- Arquitetura em camadas (MVC)
- Clean Code
- Padrões GoF
- Princípios SOLID

## Estrutura do Projeto

-- SRC
- `controller/`: coordena chamadas entre view, service e dao;
- `model/`: define entidades como `Asset` e `User`;
- `dao/`: camada de persistência (SQL);
- `dto/`: transporte de dados e ajuda a encapsular o que seria um excesso de parâmetros;
- `service/`: lógica de negócio, como cálculo do valor justo;
- `strategy/`: estratégias de depreciação;
- `adapter/`: integração com fontes externas;
- `observer/`: gerenciamento de eventos e notificações;
- `view/`: interface gráfica Swing (caso implementada);
- `factory/`: instância da estratégia de depreciação com base em um tipo informado;
- `util/`: funções auxiliares para validação e formatação de dados;
- `main/`: classe principal de inicialização da aplicação;
- `resourses/`: criado para a manutenção e evolução do sistema;
  
-- Test Packages
- `test/`: Teste Junit 5 implementado para garantir que as estratégias de depreciação estejam funcionando corretamente;

##  Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/ClaudioCavalcante-BR/AssetTrueValue.git
   ```
2. Abra o projeto no **NetBeans**
3. Compile e execute a classe `AssetController`
4. (Opcional) Configure a conexão com o banco de dados MySQL via `ConnectionFactory`

## Este projeto está disponível sob **duas licenças**:

- MIT (./licencas/LICENSE_MIT): Licença permissiva, que permite uso, modificação e redistribuição, inclusive para fins comerciais, sem a obrigação de tornar o código derivado open source.
- GPLv3 (./licencas/LICENSE_GPLv3): Licença copyleft, que exige que qualquer modificação e redistribuição também estejam sob GPLv3, mantendo o código aberto.

## Autor
Claudio Cavalcante de Almeida

---
Projeto acadêmico com fins educacionais.
