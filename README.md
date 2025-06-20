# AssetTrueValue

AssetTrueValue é um sistema Java desenvolvido para calcular o valor justo de ativos imobilizados, utilizando boas práticas de Clean Code, princípios SOLID e padrões de projeto GoF (Strategy, Factory, Adapter, Observer).

## 🧩 Objetivo
Oferecer uma solução confiável e extensível para empresas que precisam reavaliar ativos patrimoniais segundo critérios contábeis e de mercado.

## 🚀 Tecnologias Utilizadas
- Java 8+
- Apache NetBeans (Java with Ant)
- MySQL
- Arquitetura em camadas (MVC)
- Padrões GoF
- Princípios SOLID

## 📁 Estrutura do Projeto
- `controller/`: coordena chamadas entre view, service e dao
- `model/`: define entidades como `Asset` e `User`
- `dao/`: camada de persistência (SQL)
- `service/`: lógica de negócio, como cálculo do valor justo
- `strategy/`: estratégias de depreciação
- `adapter/`: integração com fontes externas
- `observer/`: gerenciamento de eventos e notificações
- `view/`: interface gráfica Swing (caso implementada)

## 🛠️ Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/ClaudioCavalcante-BR/AssetTrueValue.git
   ```
2. Abra o projeto no **NetBeans**
3. Compile e execute a classe `AssetController`
4. (Opcional) Configure a conexão com o banco de dados MySQL via `ConnectionFactory`

## 👨‍💻 Autor
Claudio Cavalcante de Almeida

---
Projeto acadêmico com fins educacionais.
